package org.icepear.echarts.origin.component.title;

import java.util.List;

import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/title/install.ts#L42
 */
public interface TitleOption extends ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {
    TitleOption setShow(Boolean show);

    TitleOption setText(String text);

    TitleOption setLink(String link);

    TitleOption setTarget(String target);

    TitleOption setSubtext(String subtext);

    TitleOption setSublink(String sublink);

    TitleOption setSubtarget(String subtarget);

    TitleOption setTextAlign(Object textAlign);

    TitleOption setTextVerticalAlign(Object textVerticalAlign);

    TitleOption setTextBaseline(Object textBaseline);

    TitleOption setBackgroundColor(String backgroundColor);

    TitleOption setPadding(List<Number> padding);

    TitleOption setItemGap(Number itemGap);

    TitleOption setTextStyle(Object textStyle);

    TitleOption setSubtextStyle(Object subtextStyle);

    TitleOption setTriggerEvent(Boolean triggerEvent);

    TitleOption setBorderRadius(List<Number> borderRadius);
}
