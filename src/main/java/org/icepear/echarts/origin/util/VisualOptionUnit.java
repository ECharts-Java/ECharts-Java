package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1005
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1025
 */
public interface VisualOptionUnit {

    VisualOptionUnit setSymbol(String symbol);

    VisualOptionUnit setSymbolSize(Number symbolSize);

    VisualOptionUnit setColor(String color);

    VisualOptionUnit setColorAlpha(Number colorAlpha);

    VisualOptionUnit setOpacity(Number opacity);

    VisualOptionUnit setColorLightness(Number colorLightness);

    VisualOptionUnit setColorSaturation(Number colorSaturation);

    VisualOptionUnit setColorHue(Number colorHue);

    VisualOptionUnit setDecal(DecalObject decal);

    VisualOptionUnit setLiftZ(Number liftZ);
}
