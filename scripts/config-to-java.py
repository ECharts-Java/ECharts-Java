import json
import os
from collections import defaultdict

config_dir = "config"
java_dir = "java"

symbol_table = {
    "?": {
        "path": None,
        "import": None,
        "builtin": True,
        "obj": None
    },
    "Object": {
        "path": None,
        "import": None,
        "builtin": True,
        "obj": None
    },
    "String": {
        "path": None,
        "import": None,
        "builtin": True,
        "obj": None
    },
    "Number": {
        "path": None,
        "import": None,
        "builtin": True,
        "obj": None
    },
    "Boolean": {
        "path": None,
        "import": None,
        "builtin": True,
        "obj": None
    },
    "List": {
        "path": None,
        "import": "java.util.List",
        "builtin": True,
        "obj": None
    },
    "Map": {
        "path": None,
        "import": "java.util.Map",
        "builtin": True,
        "obj": None
    },
    "Accessors": {
        "path": None,
        "import": "lombok.experimental.Accessors",
        "builtin": True,
        "obj": None
    },
    "Data": {
        "path": None,
        "import": "lombok.Data",
        "builtin": True,
        "obj": None
    },
    "AccessLevel": {
        "path": None,
        "import": "lombok.AccessLevel",
        "builtin": True,
        "obj": None
    },
    "Setter": {
        "path": None,
        "import": "lombok.Setter",
        "builtin": True,
        "obj": None
    }
}


def build_symbol_table():
    for root, _, files in os.walk(config_dir):
        for file in files:
            path = os.path.join(root, file)
            obj = json.load(open(path))
            name = obj["name"].split("<")[0]
            symbol_table[name] = {
                "path": os.path.join(root.replace(config_dir, java_dir), "{}.java".format(name)),
                "import": "{}.{}".format(".".join(root.replace(config_dir + "/", "").split("/")), name),
                "builtin": False,
                "obj": obj
            }


def get_symbols(type):
    type = type.replace("<", " ")
    type = type.replace(">", " ")
    type = type.replace("[]", " ")
    type = type.replace(",", " ")
    return set(type.split())


def get_all_symbols(obj, include_inheritance=True):
    symbols = set()
    if obj["type"] == "class":
        if include_inheritance:
            for implement in obj["implements"]:
                symbols |= get_symbols(implement)
    elif obj["type"] == "interface":
        if include_inheritance:
            for extend in obj["extends"]:
                symbols |= get_symbols(extend)
        for field in obj["fields"]:
            if "ignore" not in field or field["ignore"] == False:
                for type in field["types"]:
                    symbols |= get_symbols(type)
    return symbols


def get_symbols_dfs(obj):
    symbols = set()
    if obj["type"] == "class":
        symbols = get_all_symbols(obj)
        for implement in obj["implements"]:
            implement = implement.split("<")[0]
            symbols |= get_symbols_dfs(symbol_table[implement]["obj"])
    elif obj["type"] == "interface":
        symbols =  get_all_symbols(obj, include_inheritance=False)
        for extend in obj["extends"]:
            extend = extend.split("<")[0]
            symbols |= get_symbols_dfs(symbol_table[extend]["obj"])
    return symbols


def generate_package_line(info, lines):
    name = info["obj"]["name"].split("<")[0]
    lines.append("package {};\n".format(
        info["import"].replace(".{}".format(name), "")))


def generate_import_lines(info, symbols, fields, lines):
    symbol_links = []
    for types in fields.values():
        if len(types) > 1:
            symbol_links.append(symbol_table["AccessLevel"]["import"])
            symbol_links.append(symbol_table["Setter"]["import"])
            break
    for symbol in symbols:
        if symbol in symbol_table:
            if symbol_table[symbol]["import"] != None:
                if symbol_table[symbol]["import"].split(".")[:-1] != info["import"].split(".")[:-1]:
                    symbol_links.append(symbol_table[symbol]["import"])
        else:
            print("Warning: symbol {} not defined".format(symbol))
    symbol_links.sort()

    last_symbol_link_prefix = ""
    for symbol_link in symbol_links:
        symbol_link_prefix = symbol_link.split(".")[0]
        if symbol_link_prefix != last_symbol_link_prefix:
            lines.append("\n")
        lines.append("import {};\n".format(symbol_link))
        last_symbol_link_prefix = symbol_link_prefix

    lines.append("\n")


def generate_comment_lines(obj, lines):
    if obj["comments"]:
        lines.append("/**\n")
        for comment in obj["comments"]:
            lines.append(" * {}\n".format(comment))
        lines.append(" */\n")


def generate_annotation_lines(lines):
    lines.append("@Accessors(chain=true)\n")
    lines.append("@Data\n")


def generate_class_start_line(obj, lines):
    if len(obj["implements"]) == 0:
        lines.append("public class {} {{\n".format(obj["name"]))
    else:
        lines.append("public class {} implements {} {{\n".format(
            obj["name"], ", ".join(obj["implements"])))


def generate_interface_start_line(obj, lines):
    if len(obj["extends"]) == 0:
        lines.append("public interface {} {{\n".format(obj["name"]))
    else:
        lines.append("public interface {} extends {} {{\n".format(
            obj["name"], ", ".join(obj["extends"])))


def merge_fields(src, dst, override=False):
    for field in src:
        if override:
            dst[field] = src[field]
        else:
            dst[field] |= src[field]


def get_all_fields(obj):
    fields = defaultdict(set)
    for field in obj["fields"]:
        if "ignore" not in field or field["ignore"] == False:
            fields[field["name"]] |= set(field["types"])
    return fields


def get_fields_dfs(obj):
    fields = defaultdict(set)
    if obj["type"] == "class":
        for implement in obj["implements"]:
            merge_fields(get_fields_dfs(
                symbol_table[implement]["obj"]), fields)
    elif obj["type"] == "interface":
        for extend in obj["extends"]:
            extend = extend.split("<")[0]
            merge_fields(get_fields_dfs(symbol_table[extend]["obj"]), fields)
        merge_fields(get_all_fields(obj), fields)
    return fields


def eliminate_fields_conflicts(fields):
    for name, types in fields.items():
        # Unknown Class -> Object
        new_types = set()
        for type in types:
            for symbol in get_symbols(type):
                if symbol not in symbol_table:
                    type = type.replace(symbol, "Object")
            new_types.add(type)
        fields[name] = new_types


def generate_class_body_lines(obj, fields, lines):
    if len(fields) == 0:
        lines.append("\n")
    for name, types in fields.items():
        if len(types) == 1:
            lines.append("\n\tprivate {} {};\n".format(list(types)[0], name))
        else:
            lines.append("\n\t@Setter(AccessLevel.NONE)\n")
            lines.append("\tprivate Object {};\n".format(name))
            for type in types:
                lines.append("\n\tpublic {} set{}({} {}) {{\n".format(
                    obj["name"], name[0].upper() + name[1:], type, name))
                lines.append("\t\tthis.{} = {};\n".format(name, name))
                lines.append("\t\treturn this;\n")
                lines.append("\t}\n")


def generate_interface_body_lines(obj, fields, lines):
    if len(fields) == 0:
        lines.append("\n")
    for name, types in fields.items():
        for type in types:
            lines.append("\n\t{} set{}({} {});\n".format(
                obj["name"], name[0].upper() + name[1:], type, name))


def generate_end_line(lines):
    lines.append("}\n")


def generate_file(info, lines):
    os.makedirs(os.path.dirname(info["path"]), exist_ok=True)
    outfile = open(info["path"], "w")
    outfile.writelines(lines)
    outfile.close()


def generate_class(info):
    obj = info["obj"]
    symbols = get_symbols_dfs(obj)
    fields = get_fields_dfs(obj)
    eliminate_fields_conflicts(fields)
    symbols |= {"Accessors", "Data"}
    lines = []
    generate_package_line(info, lines)
    generate_import_lines(info, symbols, fields, lines)
    generate_annotation_lines(lines)
    generate_class_start_line(obj, lines)
    generate_class_body_lines(obj, fields, lines)
    generate_end_line(lines)
    generate_file(info, lines)


def generate_interface(info):
    obj = info["obj"]
    symbols = get_all_symbols(obj)
    fields = get_all_fields(obj)
    eliminate_fields_conflicts(fields)
    lines = []
    generate_package_line(info, lines)
    generate_import_lines(info, symbols, {}, lines)
    generate_comment_lines(obj, lines)
    generate_interface_start_line(obj, lines)
    generate_interface_body_lines(obj, fields, lines)
    generate_end_line(lines)
    generate_file(info, lines)


if __name__ == "__main__":
    build_symbol_table()
    for symbol, info in symbol_table.items():
        if info["builtin"] == False:
            if info["obj"]["type"] == "class":
                generate_class(info)
            elif info["obj"]["type"] == "interface":
                generate_interface(info)
