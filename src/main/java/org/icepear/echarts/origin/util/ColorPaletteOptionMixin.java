package org.icepear.echarts.origin.util;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L764
 */
public interface ColorPaletteOptionMixin {
    @Getter
    @Setter
    public List<String> color = null;

    @Getter
    @Setter
    public List<List<String>> colorLayer = null;
}
