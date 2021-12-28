package org.icepear.echarts.origin.component.title;

import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/title/install.ts#L42
 */
public interface TitleOption extends ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {

    TitleOption setMainType(String mainType);

    TitleOption setShow(Boolean show);

    TitleOption setText(String text);

    TitleOption setLink(String link);

    TitleOption setTarget(String target);

    TitleOption setSubtext(String subtext);

    TitleOption setSublink(String sublink);

    TitleOption setSubtarget(String subtarget);

    TitleOption setTextAlign(String textAlign);

    TitleOption setTextVerticalAlign(String textVerticalAlign);

    TitleOption setTextBaseline(String textBaseline);

    TitleOption setBackgroundColor(String backgroundColor);

    TitleOption setPadding(Number padding);

    TitleOption setPadding(Number[] padding);

    TitleOption setItemGap(Number itemGap);

    TitleOption setTextStyle(LabelOption textStyle);

    TitleOption setSubtextStyle(LabelOption subtextStyle);

    TitleOption setTriggerEvent(Boolean triggerEvent);

    TitleOption setBorderRadius(Number borderRadius);

    TitleOption setBorderRadius(Number[] borderRadius);
}
