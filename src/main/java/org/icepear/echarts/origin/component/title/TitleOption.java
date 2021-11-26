package org.icepear.echarts.origin.component.title;

import java.util.List;

import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/title/install.ts#L42
 */
public interface TitleOption extends ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {
    @Getter
    @Setter
    public Boolean show = null;

    @Getter
    @Setter
    public String text = null;

    @Getter
    @Setter
    public String link = null;

    @Getter
    @Setter
    public String target = null;

    @Getter
    @Setter
    public String subtext = null;

    @Getter
    @Setter
    public String sublink = null;

    @Getter
    @Setter
    public String subtarget = null;

    @Getter
    @Setter
    public Object textAlign = null;

    @Getter
    @Setter
    public Object textVerticalAlign = null;

    @Getter
    @Setter
    public Object textBaseline = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public List<Number> padding = null;

    @Getter
    @Setter
    public Number itemGap = null;

    @Getter
    @Setter
    public Object textStyle = null;

    @Getter
    @Setter
    public Object subtextStyle = null;

    @Getter
    @Setter
    public Boolean triggerEvent = null;

    @Getter
    @Setter
    public List<Number> borderRadius = null;
}
