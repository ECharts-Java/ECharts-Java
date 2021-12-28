package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L615
 */
public interface OptionDataItemObject {

    OptionDataItemObject setId(Number id);

    OptionDataItemObject setId(String id);

    OptionDataItemObject setName(Number name);

    OptionDataItemObject setName(String name);

    OptionDataItemObject setGroupId(Number groupId);

    OptionDataItemObject setGroupId(String groupId);

    OptionDataItemObject setSelected(Boolean selected);
}
