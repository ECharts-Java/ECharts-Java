package org.icepear.echarts.origin.util;

import java.util.Map;

import org.icepear.echarts.origin.export.SeriesInjectedOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1587
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L181
 */
public interface SeriesOption extends ComponentOption, AnimationOptionMixin, ColorPaletteOptionMixin, StatesOptionMixin,
        SeriesInjectedOption {

    SeriesOption setMainType(String mainType);

    SeriesOption setSilent(Boolean silent);

    SeriesOption setBlendMode(String blendMode);

    SeriesOption setCursor(String cursor);

    SeriesOption setDataGroupId(Number dataGroupId);

    SeriesOption setDataGroupId(String dataGroupId);

    SeriesOption setData(Object data);

    SeriesOption setColorBy(String colorBy);

    SeriesOption setLegendHoverLink(Boolean legendHoverLink);

    SeriesOption setProgressive(Boolean progressive);

    SeriesOption setProgressive(Number progressive);

    SeriesOption setProgressiveThreshold(Number progressiveThreshold);

    SeriesOption setProgressiveChunkMode(String progressiveChunkMode);

    SeriesOption setCoordinateSystem(String coordinateSystem);

    SeriesOption setHoverLayerThreshold(Number hoverLayerThreshold);

    SeriesOption setSeriesLayoutBy(String seriesLayoutBy);

    SeriesOption setLabelLine(LabelLineOption labelLine);

    SeriesOption setLabelLayout(LabelLayoutOption labelLayout);

    SeriesOption setStateAnimation(Object stateAnimation);

    SeriesOption setUniversalTransition(Boolean universalTransition);

    SeriesOption setUniversalTransition(Object universalTransition);

    SeriesOption setSelectedMap(Map<String, Boolean> selectedMap);

    SeriesOption setSelectedMode(Boolean selectedMode);

    SeriesOption setSelectedMode(String selectedMode);
}
