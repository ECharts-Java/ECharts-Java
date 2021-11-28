package org.icepear.echarts.origin.coord;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L172
 */
public interface AxisTickOption {
    void setShow(Boolean show);

    void setInside(Boolean inside);

    void setLength(Number length);

    void setLineStyle(Object lineStyle);
}
