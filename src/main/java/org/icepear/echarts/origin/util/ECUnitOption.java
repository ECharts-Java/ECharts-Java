package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/f3471f0a7080e68f8819f7b000d32d73fb0820fb/src/util/types.ts#L501
 */
public interface ECUnitOption extends AnimationOptionMixin, ColorPaletteOptionMixin {
    void setBaseOption(Object baseOption);

    void setOptions(Object options);

    void setMedia(Object media);

    void setTimeline(List<ComponentOption> timeline);

    void setBackgroundColor(String backgroundColor);

    void setDarkMode(String darkMode);

    void setTextStyle(Object textStyle);

    void setUseUTC(Boolean useUTC);

    void setStateAnimation(AnimationOption stateAnimation);
}
