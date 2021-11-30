package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/f3471f0a7080e68f8819f7b000d32d73fb0820fb/src/util/types.ts#L501
 */
public interface ECUnitOption extends AnimationOptionMixin, ColorPaletteOptionMixin {
    ECUnitOption setBaseOption(Object baseOption);

    ECUnitOption setOptions(Object options);

    ECUnitOption setMedia(Object media);

    ECUnitOption setTimeline(List<ComponentOption> timeline);

    ECUnitOption setBackgroundColor(String backgroundColor);

    ECUnitOption setDarkMode(String darkMode);

    ECUnitOption setTextStyle(Object textStyle);

    ECUnitOption setUseUTC(Boolean useUTC);

    ECUnitOption setStateAnimation(AnimationOption stateAnimation);
}
