package org.icepear.echarts.util;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/f3471f0a7080e68f8819f7b000d32d73fb0820fb/src/util/types.ts#L501
 */
@Getter
@Setter
public class ECUnitOption {
    private AnimationOptionMixin animationOptionMixin;

    private ColorPaletteOptionMixin colorPaletteOptionMixin;

    private Object baseOption;

    private Object options;

    private Object media;

    private List<ComponentOption> timeline;

    private String backgroundColor;

    private String darkMode;

    private Object textStyle;

    private Boolean useUTC;

    private AnimationOption stateAnimation;
}
