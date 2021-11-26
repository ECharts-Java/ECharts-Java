package org.icepear.echarts.origin.util;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1587
 */
public interface SeriesOption
        extends ComponentOption, AnimationOptionMixin, ColorPaletteOptionMixin, StatesOptionMixin {
    @Getter
    @Setter
    public Boolean silent = null;

    @Getter
    @Setter
    public String blendMode = null;

    @Getter
    @Setter
    public String cursor = null;

    @Getter
    @Setter
    public String dataGroupId = null;

    @Getter
    @Setter
    public Object data = null;

    @Getter
    @Setter
    public String colorBy = null;

    @Getter
    @Setter
    public Boolean legendHoverLink = null;

    @Getter
    @Setter
    public Number progressive = null;

    @Getter
    @Setter
    public Number progressiveThreshold = null;

    @Getter
    @Setter
    public String progressiveChunkMode = null;

    @Getter
    @Setter
    public String coordinateSystem = null;

    @Getter
    @Setter
    public Number hoverLayerThreshold = null;

    @Getter
    @Setter
    public String seriesLayoutBy = null;

    @Getter
    @Setter
    public Object labelLine = null;

    @Getter
    @Setter
    public Object labelLayout = null;

    @Getter
    @Setter
    public Object stateAnimation = null;

    @Getter
    @Setter
    public Object universalTransition = null;

    @Getter
    @Setter
    public Map<String, Boolean> selectedMap = null;

    @Getter
    @Setter
    public String selectedMode = null;
}
