package org.icepear.echarts.origin.coord;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L110
 */
public interface CategoryAxisBaseOption extends AxisBaseOption, AxisBaseOptionCommon {
    @Getter
    @Setter
    public Boolean boundaryGap = null;

    @Getter
    @Setter
    public List<Object> data = null;

    @Getter
    @Setter
    public Boolean deduplication = null;
}
