package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/56fbf07640a25bbd3e710094da824f5bed6c647d/src/util/types.ts#L615
 */
public interface OptionDataItemObject {
    OptionDataItemObject setId(String id);
    
    OptionDataItemObject setName(String name);
    
    OptionDataItemObject setGroupId(String groupId);
    
    OptionDataItemObject setValue(Object value);
    
    OptionDataItemObject setSelected(Boolean selected);
}
