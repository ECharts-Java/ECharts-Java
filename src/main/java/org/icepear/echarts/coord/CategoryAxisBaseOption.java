package org.icepear.echarts.coord;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L110
 */
@Getter
@Setter
public class CategoryAxisBaseOption implements AxisBaseOption {
    private AxisBaseOptionCommon axisBaseOptionCommon;

    private Boolean boundaryGap;

    private List<Object> data;

    private Boolean deduplication;

    public CategoryAxisBaseOption() {
        
    }
}
