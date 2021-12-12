import json

typescript_dir = "typescript"
config_dir = "config"

type_ts_to_java = {
    "number": "Number",
    "string": "String",
    "boolean": "Boolean",
    "ZRColor": "String",
    "ColorString": "String",
    "unknown": "Object",
}


def convert_single_type(ts_type):
    if ts_type in type_ts_to_java:
        java_type = type_ts_to_java[ts_type]
    elif "'" in ts_type:
        java_type = "String"
    elif ts_type in ["true", "false"]:
        java_type = "Boolean"
    else:
        java_type = ts_type
    return java_type


def convert(file):
    lines = open(file).readlines()
    i = 0
    definition = ""
    while "{" not in lines[i]:
        definition += lines[i]
        i += 1
    definition += lines[i]
    i += 1
    definition = definition.replace("export", " ")
    definition = definition.replace("extends", " ")
    definition = definition.replace(",", " ")
    definition = definition.replace("{", " ")
    type, name, *extends = definition.split()
    fields = []
    while i < len(lines):
        line = lines[i]
        i += 1
        if "//" in line or "}" == line.strip() or "};" == line.strip() or "*" in line or line.strip() == "":
            continue
        line = line.replace("?:", " ")
        line = line.replace(";", " ")
        line = line.replace("|", " ")
        line = line.replace(",", " ")
        field_name, *field_types = line.split()
        field_java_types = set()
        j = 0
        while j < len(field_types):
            field_type = field_types[j]
            if "[]" in field_type:
                field_java_types.add("{}[]".format(
                    convert_single_type(field_type.replace("(", "").replace(")", "").replace("[]", ""))))
            elif "(" in field_type:
                multitypes = set()
                while ")[]" not in field_types[j]:
                    field_type = field_types[j].replace("(", "")
                    multitypes.add(convert_single_type(field_type))
                    j += 1
                field_type = field_types[j].replace(")[]", "")
                multitypes.add(convert_single_type(field_type))
                for singletype in multitypes:
                    field_java_types.add("{}[]".format(singletype))
            elif "[" in field_type:
                field_java_types.add("{}[]".format(
                    convert_single_type(field_type.replace("[", ""))))
                while "]" not in field_types[j]:
                    j += 1
            elif "{" in field_type:
                field_java_types.add("Object")
                while "}" not in lines[i]:
                    i += 1
                i += 1
                break
            else:
                field_java_types.add(convert_single_type(field_type))
            j += 1
        fields.append({
            "name": field_name,
            "types": list(field_java_types)
        })
    obj = {
        "name": name,
        "type": type,
        "extends": extends,
        "fields": fields
    }
    json.dump(obj, open("config-out.json", "w"))


if __name__ == "__main__":
    convert("ts-in.ts")
