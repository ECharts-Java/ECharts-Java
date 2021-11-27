package org.icepear.echarts.origin.component.legend;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/legend/LegendModel.ts#L86
 */
public interface LegendStyleOption {
    void setIcon(String icon);

    void setInactiveColor(String inactiveColor);

    void setInactiveBorderColor(String inactiveBorderColor);

    void setInactiveBorderWidth(Number inactiveBorderWidth);

    void setFormatter(String formatter);

    void setItemStyle(Object itemStyle);

    void setLineStyle(Object lineStyle);

    void setTextStyle(Object textStyle);

    void setSymbolRotate(String symbolRotate);

    @Deprecated
    void setSymbolKeepAspect(Boolean symbolKeepAspect);
}
