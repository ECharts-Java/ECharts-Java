package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L615
 */
public interface OptionDataItemObject {

	OptionDataItemObject setId(String id);

	OptionDataItemObject setId(Number id);

	OptionDataItemObject setName(String name);

	OptionDataItemObject setName(Number name);

	OptionDataItemObject setGroupId(String groupId);

	OptionDataItemObject setGroupId(Number groupId);

	OptionDataItemObject setSelected(Boolean selected);
}
