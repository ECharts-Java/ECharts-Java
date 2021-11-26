package org.icepear.echarts.origin.component.toolbox;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/ToolboxModel.ts#L42
 */
public interface ToolboxOption extends ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {
    @Getter
    @Setter
    Boolean show = null;

    @Getter
    @Setter
    Object orient = null;

    @Getter
    @Setter
    String backgroundColor = null;

    @Getter
    @Setter
    Number borderRadius = null;

    @Getter
    @Setter
    List<Number> padding = null;

    @Getter
    @Setter
    Number itemSize = null;

    @Getter
    @Setter
    Number itemGap = null;

    @Getter
    @Setter
    Boolean showTitle = null;

    @Getter
    @Setter
    Object iconStyle = null;

    @Getter
    @Setter
    Object emphasis = null;

    @Getter
    @Setter
    Object textStyle = null;

    @Getter
    @Setter
    TooltipOption tooltip = null;

    @Getter
    @Setter
    Map<String, ToolboxFeatureOption> feature = null;
}
