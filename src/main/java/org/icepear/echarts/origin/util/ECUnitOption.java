package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L519
 */
public interface ECUnitOption extends AnimationOptionMixin, ColorPaletteOptionMixin {

    ECUnitOption setBaseOption(Object baseOption);

    ECUnitOption setOptions(Object options);

    ECUnitOption setMedia(Object media);

    ECUnitOption setTimeline(ComponentOption timeline);

    ECUnitOption setTimeline(ComponentOption[] timeline);

    ECUnitOption setBackgroundColor(String backgroundColor);

    ECUnitOption setDarkMode(Boolean darkMode);

    ECUnitOption setDarkMode(String darkMode);

    ECUnitOption setTextStyle(Object textStyle);

    ECUnitOption setUseUTC(Boolean useUTC);

    ECUnitOption setStateAnimation(Object stateAnimation);
}
