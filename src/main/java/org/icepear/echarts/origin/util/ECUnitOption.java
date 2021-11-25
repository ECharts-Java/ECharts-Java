package org.icepear.echarts.origin.util;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/f3471f0a7080e68f8819f7b000d32d73fb0820fb/src/util/types.ts#L501
 */
public interface ECUnitOption extends AnimationOptionMixin, ColorPaletteOptionMixin {
    @Getter
    @Setter
    public Object baseOption = null;

    @Getter
    @Setter
    public Object options = null;

    @Getter
    @Setter
    public Object media = null;

    @Getter
    @Setter
    public List<ComponentOption> timeline = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public String darkMode = null;

    @Getter
    @Setter
    public Object textStyle = null;

    @Getter
    @Setter
    public Boolean useUTC = null;

    @Getter
    @Setter
    public AnimationOption stateAnimation = null;
}
