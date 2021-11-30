package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L764
 */
public interface ColorPaletteOptionMixin {
    ColorPaletteOptionMixin setColor(List<String> color);

    ColorPaletteOptionMixin setColorLayer(List<List<String>> colorLayer);
}
