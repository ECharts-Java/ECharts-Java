package org.icepear.echarts.origin.component.legend;

import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/legend/LegendModel.ts#L86
 */
public interface LegendStyleOption {

	LegendStyleOption setIcon(String icon);

	LegendStyleOption setInactiveColor(String inactiveColor);

	LegendStyleOption setInactiveBorderColor(String inactiveBorderColor);

	LegendStyleOption setInactiveBorderWidth(String inactiveBorderWidth);

	LegendStyleOption setInactiveBorderWidth(Number inactiveBorderWidth);

	LegendStyleOption setFormatter(String formatter);

	LegendStyleOption setItemStyle(Object itemStyle);

	LegendStyleOption setLineStyle(Object lineStyle);

	LegendStyleOption setTextStyle(LabelOption textStyle);

	LegendStyleOption setSymbolRotate(String symbolRotate);

	LegendStyleOption setSymbolRotate(Number symbolRotate);

	LegendStyleOption setSymbolKeepAspect(Boolean symbolKeepAspect);
}
