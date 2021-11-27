package org.icepear.echarts.origin.component.title;

import java.util.List;

import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/title/install.ts#L42
 */
public interface TitleOption extends ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {
    void setShow(Boolean show);

    void setText(String text);

    void setLink(String link);

    void setTarget(String target);

    void setSubtext(String subtext);

    void setSublink(String sublink);

    void setSubtarget(String subtarget);

    void setTextAlign(Object textAlign);

    void setTextVerticalAlign(Object textVerticalAlign);

    void setTextBaseline(Object textBaseline);

    void setBackgroundColor(String backgroundColor);

    void setPadding(List<Number> padding);

    void setItemGap(Number itemGap);

    void setTextStyle(Object textStyle);

    void setSubtextStyle(Object subtextStyle);

    void setTriggerEvent(Boolean triggerEvent);

    void setBorderRadius(List<Number> borderRadius);
}
