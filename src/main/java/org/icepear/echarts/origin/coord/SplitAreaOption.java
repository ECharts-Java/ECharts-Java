package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.AreaStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L249
 */
public interface SplitAreaOption {

    SplitAreaOption setShow(Boolean show);

    SplitAreaOption setInterval(Number interval);

    SplitAreaOption setInterval(String interval);

    SplitAreaOption setAreaStyle(AreaStyleOption areaStyle);
}
