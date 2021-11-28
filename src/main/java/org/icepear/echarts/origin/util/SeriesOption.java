package org.icepear.echarts.origin.util;

import java.util.List;
import java.util.Map;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1587
 */
public interface SeriesOption
        extends ComponentOption, AnimationOptionMixin, ColorPaletteOptionMixin, StatesOptionMixin {
    void setSilent(Boolean silent);

    void setBlendMode(String blendMode);

    void setCursor(String cursor);

    void setDataGroupId(String dataGroupId);

    void setData(List<Object> data);

    void setColorBy(String colorBy);

    void setLegendHoverLink(Boolean legendHoverLink);

    void setProgressive(Number progressive);

    void setProgressiveThreshold(Number progressiveThreshold);

    void setProgressiveChunkMode(String progressiveChunkMode);

    void setCoordinateSystem(String coordinateSystem);

    void setHoverLayerThreshold(Number hoverLayerThreshold);

    void setSeriesLayoutBy(String seriesLayoutBy);

    void setLabelLine(Object labelLine);

    void setLabelLayout(Object labelLayout);

    void setStateAnimation(Object stateAnimation);

    void setUniversalTransition(Object universalTransition);

    void setSelectedMap(Map<String, Boolean> selectedMap);

    void setSelectedMode(String selectedMode);
}
