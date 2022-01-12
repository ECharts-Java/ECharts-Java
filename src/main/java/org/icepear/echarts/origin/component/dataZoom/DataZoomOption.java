package org.icepear.echarts.origin.component.dataZoom;

import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/4569dc1d8b712dafb80b16e31c4fed0118e3acbd/src/component/dataZoom/DataZoomModel.ts#L38
 */
public interface DataZoomOption extends ComponentOption {

    DataZoomOption setMainType(String mainType);

    DataZoomOption setOrient(String orient);

    DataZoomOption setXAxisIndex(Number xAxisIndex);

    DataZoomOption setXAxisIndex(Number[] xAxisIndex);

    DataZoomOption setXAxisId(String xAxisId);

    DataZoomOption setXAxisId(String[] xAxisId);

    DataZoomOption setYAxisIndex(Number yAxisIndex);

    DataZoomOption setYAxisIndex(Number[] yAxisIndex);

    DataZoomOption setYAxisId(String yAxisId);

    DataZoomOption setYAxisId(String[] yAxisId);

    DataZoomOption setRadiusAxisIndex(Number radiusAxisIndex);

    DataZoomOption setRadiusAxisIndex(Number[] radiusAxisIndex);

    DataZoomOption setRadiusAxisId(String radiusAxisId);

    DataZoomOption setRadiusAxisId(String[] radiusAxisId);

    DataZoomOption setAngleAxisIndex(Number angleAxisIndex);

    DataZoomOption setAngleAxisIndex(Number[] angleAxisIndex);

    DataZoomOption setAngleAxisId(String angleAxisId);

    DataZoomOption setAngleAxisId(String[] angleAxisId);

    DataZoomOption setSingleAxisIndex(Number singleAxisIndex);

    DataZoomOption setSingleAxisIndex(Number[] singleAxisIndex);

    DataZoomOption setSingleAxisId(String singleAxisId);

    DataZoomOption setSingleAxisId(String[] singleAxisId);

    DataZoomOption setFilterMode(String filterMode);

    DataZoomOption setThrottle(Number throttle);

    DataZoomOption setThrottle(Object throttle);

    DataZoomOption setStart(Number start);

    DataZoomOption setEnd(Number end);

    DataZoomOption setStartValue(Number startValue);

    DataZoomOption setStartValue(Object startValue);

    DataZoomOption setStartValue(String startValue);

    DataZoomOption setEndValue(Number endValue);

    DataZoomOption setEndValue(Object endValue);

    DataZoomOption setEndValue(String endValue);

    DataZoomOption setMinSpan(Number minSpan);

    DataZoomOption setMaxSpan(Number maxSpan);

    DataZoomOption setMinValueSpan(Number minValueSpan);

    DataZoomOption setMaxValueSpan(Number maxValueSpan);

    DataZoomOption setRangeMode(String[] rangeMode);

    DataZoomOption setRealtime(Boolean realtime);

    DataZoomOption setTextStyle(LabelOption textStyle);
}
