package org.icepear.echarts.origin.component.visualMap;

import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/4569dc1d8b712dafb80b16e31c4fed0118e3acbd/src/component/visualMap/VisualMapModel.ts#L56
 */
public interface VisualMapOption extends ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {

    VisualMapOption setMainType(String mainType);

    VisualMapOption setShow(Boolean show);

    VisualMapOption setAlign(String align);

    VisualMapOption setRealtime(Boolean realtime);

    VisualMapOption setSeriesIndex(Number seriesIndex);

    VisualMapOption setSeriesIndex(Number[] seriesIndex);

    VisualMapOption setSeriesIndex(String seriesIndex);

    VisualMapOption setMin(Number min);

    VisualMapOption setMax(Number max);

    VisualMapOption setDimension(Number dimension);

    VisualMapOption setController(Object controller);

    VisualMapOption setTarget(Object target);

    VisualMapOption setItemWidth(Number itemWidth);

    VisualMapOption setItemHeight(Number itemHeight);

    VisualMapOption setInverse(Boolean inverse);

    VisualMapOption setOrient(String orient);

    VisualMapOption setBackgroundColor(String backgroundColor);

    VisualMapOption setContentColor(String contentColor);

    VisualMapOption setInactiveColor(String inactiveColor);

    VisualMapOption setPadding(Number padding);

    VisualMapOption setPadding(Number[] padding);

    VisualMapOption setTextGap(Number textGap);

    VisualMapOption setPrecision(Number precision);

    VisualMapOption setColor(String[] color);

    VisualMapOption setFormatter(Object formatter);

    VisualMapOption setFormatter(String formatter);

    VisualMapOption setText(String[] text);

    VisualMapOption setTextStyle(LabelOption textStyle);

    VisualMapOption setCategories(Object categories);
}
