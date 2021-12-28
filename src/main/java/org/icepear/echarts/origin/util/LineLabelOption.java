package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1126
 */
public interface LineLabelOption extends LabelOption {

    LineLabelOption setPosition(String position);

    LineLabelOption setDistance(Number distance);

    LineLabelOption setDistance(Number[] distance);
}
