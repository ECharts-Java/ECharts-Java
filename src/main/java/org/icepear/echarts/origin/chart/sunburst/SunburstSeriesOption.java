package org.icepear.echarts.origin.chart.sunburst;

import org.icepear.echarts.origin.util.CircleLayoutOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sunburst/SunburstSeries.ts#L120
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/util/types.ts#L860
 */
public interface SunburstSeriesOption extends SeriesOption, SunburstStateOption, CircleLayoutOptionMixin {

    SunburstSeriesOption setType(String type);

    SunburstSeriesOption setClockwise(Boolean clockwise);

    SunburstSeriesOption setStartAngle(Number startAngle);

    SunburstSeriesOption setMinAngle(Number minAngle);

    SunburstSeriesOption setStillShowZeroSum(Boolean stillShowZeroSum);

    SunburstSeriesOption setNodeClick(String nodeClick);

    SunburstSeriesOption setRenderLabelForZeroData(Boolean renderLabelForZeroData);

    SunburstSeriesOption setLevels(SunburstLevelOption[] levels);

    SunburstSeriesOption setAnimationType(String animationType);

    SunburstSeriesOption setSort(String sort);

    SunburstSeriesOption setData(SunburstNodeItemOption[] data);

    SunburstSeriesOption setEmphasis(SunburstEmphasisOption emphasis);
}
