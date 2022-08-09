package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/util/types.ts#L707
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/util/types.ts#L708
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/util/types.ts#L709
 */
public interface DecalObject {

    DecalObject setSymbol(String symbol);

    DecalObject setSymbol(String[] symbol);

    DecalObject setSymbolSize(Number symbolSize);

    DecalObject setSymbolKeepAspect(Boolean symbolKeepAspect);

    DecalObject setColor(String color);

    DecalObject setBackgroundColor(String backgroundColor);

    DecalObject setDashArrayX(Number dashArrayX);

    DecalObject setDashArrayX(Number[] dashArrayX);

    DecalObject setDashArrayX(Number[][] dashArrayX);

    DecalObject setDashArrayY(Number dashArrayY);

    DecalObject setDashArrayY(Number[] dashArrayY);

    DecalObject setRotation(Number rotation);

    DecalObject setMaxTileWidth(Number maxTileWidth);

    DecalObject setMaxTileHeight(Number maxTileHeight);
}
