package org.icepear.echarts.origin.util;

import java.util.List;
import java.util.Map;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1587
 */
public interface SeriesOption
        extends ComponentOption, AnimationOptionMixin, ColorPaletteOptionMixin, StatesOptionMixin {
    SeriesOption setSilent(Boolean silent);

    SeriesOption setBlendMode(String blendMode);

    SeriesOption setCursor(String cursor);

    SeriesOption setDataGroupId(String dataGroupId);

    SeriesOption setData(List<?> data);

    SeriesOption setColorBy(String colorBy);

    SeriesOption setLegendHoverLink(Boolean legendHoverLink);

    SeriesOption setProgressive(Number progressive);

    SeriesOption setProgressiveThreshold(Number progressiveThreshold);

    SeriesOption setProgressiveChunkMode(String progressiveChunkMode);

    SeriesOption setCoordinateSystem(String coordinateSystem);

    SeriesOption setHoverLayerThreshold(Number hoverLayerThreshold);

    SeriesOption setSeriesLayoutBy(String seriesLayoutBy);

    SeriesOption setLabelLine(Object labelLine);

    SeriesOption setLabelLayout(Object labelLayout);

    SeriesOption setStateAnimation(Object stateAnimation);

    SeriesOption setUniversalTransition(Object universalTransition);

    SeriesOption setSelectedMap(Map<String, Boolean> selectedMap);

    SeriesOption setSelectedMode(String selectedMode);
}
