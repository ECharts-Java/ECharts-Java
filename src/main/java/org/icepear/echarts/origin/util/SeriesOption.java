package org.icepear.echarts.origin.util;

import java.util.Map;

import org.icepear.echarts.origin.export.SeriesInjectedOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1587
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L181
 */
public interface SeriesOption extends ComponentOption, AnimationOptionMixin, ColorPaletteOptionMixin, StatesOptionMixin, SeriesInjectedOption {

	SeriesOption setMainType(String mainType);

	SeriesOption setSilent(Boolean silent);

	SeriesOption setBlendMode(String blendMode);

	SeriesOption setCursor(String cursor);

	SeriesOption setDataGroupId(String dataGroupId);

	SeriesOption setDataGroupId(Number dataGroupId);

	SeriesOption setData(Object data);

	SeriesOption setColorBy(Object colorBy);

	SeriesOption setLegendHoverLink(Boolean legendHoverLink);

	SeriesOption setProgressive(Number progressive);

	SeriesOption setProgressive(Boolean progressive);

	SeriesOption setProgressiveThreshold(Number progressiveThreshold);

	SeriesOption setProgressiveChunkMode(String progressiveChunkMode);

	SeriesOption setCoordinateSystem(String coordinateSystem);

	SeriesOption setHoverLayerThreshold(Number hoverLayerThreshold);

	SeriesOption setSeriesLayoutBy(String seriesLayoutBy);

	SeriesOption setLabelLine(Object labelLine);

	SeriesOption setLabelLayout(Object labelLayout);

	SeriesOption setStateAnimation(Object stateAnimation);

	SeriesOption setUniversalTransition(Boolean universalTransition);

	SeriesOption setUniversalTransition(Object universalTransition);

	SeriesOption setSelectedMap(Map<String, Boolean> selectedMap);

	SeriesOption setSelectedMode(String selectedMode);

	SeriesOption setSelectedMode(Boolean selectedMode);
}
