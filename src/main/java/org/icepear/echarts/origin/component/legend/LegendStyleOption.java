package org.icepear.echarts.origin.component.legend;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/legend/LegendModel.ts#L86
 */
public interface LegendStyleOption {
    @Getter
    @Setter
    public String icon = null;

    @Getter
    @Setter
    public String inactiveColor = null;

    @Getter
    @Setter
    public String inactiveBorderColor = null;

    @Getter
    @Setter
    public Number inactiveBorderWidth = null;

    @Getter
    @Setter
    public String formatter = null;

    @Getter
    @Setter
    public Object itemStyle = null;

    @Getter
    @Setter
    public Object lineStyle = null;

    @Getter
    @Setter
    public Object textStyle = null;

    @Getter
    @Setter
    public String symbolRotate = null;

    @Deprecated
    @Getter
    @Setter
    public Boolean symbolKeepAspect = null;
}
