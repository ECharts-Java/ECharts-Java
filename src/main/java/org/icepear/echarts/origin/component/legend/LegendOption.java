package org.icepear.echarts.origin.component.legend;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/legend/LegendModel.ts#L159
 */
public interface LegendOption extends ComponentOption, LegendStyleOption, BoxLayoutOptionMixin, BorderOptionMixin {
    @Getter
    @Setter
    public Boolean show = null;

    @Getter
    @Setter
    public Object orient = null;

    @Getter
    @Setter
    public String align = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public List<Number> borderRadius = null;

    @Getter
    @Setter
    public List<Number> padding = null;

    @Getter
    @Setter
    public Number itemGap = null;

    @Getter
    @Setter
    public Number itemWidth = null;

    @Getter
    @Setter
    public Number itemHeight = null;

    @Getter
    @Setter
    public String selectedMode = null;

    @Getter
    @Setter
    public Map<String, Boolean> selected = null;

    @Getter
    @Setter
    public Object selector = null;

    @Getter
    @Setter
    public Object selectorLabel = null;

    @Getter
    @Setter
    public Object emphasis = null;

    @Getter
    @Setter
    public String selectorPosition = null;

    @Getter
    @Setter
    public Number selectorItemGap = null;

    @Getter
    @Setter
    public Number selectorButtonGap = null;

    @Getter
    @Setter
    public List<Object> data = null;

    @Getter
    @Setter
    public TooltipOption tooltip = null;
}
