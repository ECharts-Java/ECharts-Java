package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L244
 */
public interface MinorSplitLineOption {

    MinorSplitLineOption setShow(Boolean show);

    MinorSplitLineOption setLineStyle(LineStyleOption lineStyle);
}
