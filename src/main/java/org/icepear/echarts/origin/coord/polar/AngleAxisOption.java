package org.icepear.echarts.origin.coord.polar;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/polar/AxisModel.ts#L30
 */
public interface AngleAxisOption {

    AngleAxisOption setPolarIndex(Number polarIndex);

    AngleAxisOption setPolarId(String polarId);

    AngleAxisOption setStartAngle(Number startAngle);

    AngleAxisOption setClockwise(Boolean clockwise);
}
