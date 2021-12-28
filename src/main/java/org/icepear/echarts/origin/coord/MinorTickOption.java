package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L230
 */
public interface MinorTickOption {

    MinorTickOption setShow(Boolean show);

    MinorTickOption setSplitNumber(Number splitNumber);

    MinorTickOption setLength(Number length);

    MinorTickOption setLineStyle(LineStyleOption lineStyle);
}
