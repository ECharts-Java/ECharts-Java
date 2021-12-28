package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L237
 */
public interface SplitLineOption {

    SplitLineOption setShow(Boolean show);

    SplitLineOption setInterval(Number interval);

    SplitLineOption setInterval(String interval);

    SplitLineOption setLineStyle(LineStyleOption lineStyle);
}
