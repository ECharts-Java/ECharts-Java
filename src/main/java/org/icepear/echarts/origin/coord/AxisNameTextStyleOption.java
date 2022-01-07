package org.icepear.echarts.origin.coord;

import java.util.Map;

import org.icepear.echarts.origin.util.TextCommonOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L157
 */
public interface AxisNameTextStyleOption extends TextCommonOption {

    AxisNameTextStyleOption setRich(Map<String, TextCommonOption> rich);
}
