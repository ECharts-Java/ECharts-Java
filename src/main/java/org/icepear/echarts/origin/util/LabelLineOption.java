package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1147
 */
public interface LabelLineOption {

    LabelLineOption setShow(Boolean show);

    LabelLineOption setShowAbove(Boolean showAbove);

    LabelLineOption setLength(Number length);

    LabelLineOption setLength2(Number length2);

    LabelLineOption setSmooth(Boolean smooth);

    LabelLineOption setSmooth(Number smooth);

    LabelLineOption setMinTurnAngle(Number minTurnAngle);

    LabelLineOption setLineStyle(LineStyleOption lineStyle);
}
