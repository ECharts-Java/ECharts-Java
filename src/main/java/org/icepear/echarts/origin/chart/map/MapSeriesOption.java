package org.icepear.echarts.origin.chart.map;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.RoamOptionMixin;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://echarts.apache.org/en/option.html#series-map
 */
public interface MapSeriesOption
        extends SeriesOption, MapStateOption, BoxLayoutOptionMixin, RoamOptionMixin, SeriesEncodeOptionMixin {

    MapSeriesOption setType(String type);

    MapSeriesOption setMap(String map);

    MapSeriesOption setAspectScale(Number aspectScale);

    MapSeriesOption setBoundingCoords(Number[][] boundingCoords);

    MapSeriesOption setLayoutCenter(String[] layoutCenter);

    MapSeriesOption setLayoutSize(Number layoutSize);

    MapSeriesOption setLayoutSize(String layoutSize);

    MapSeriesOption setGeoIndex(Number geoIndex);

    MapSeriesOption setMapValueCalculation(String mapValueCalculation);

    MapSeriesOption setShowLegendSymbol(Boolean showLegendSymbol);

    MapSeriesOption setProjection(Object projection);

    MapSeriesOption setNameMap(Object nameMap);

    MapSeriesOption setNameProperty(String nameProperty);

    MapSeriesOption setData(MapDataItemOption[] data);

    MapSeriesOption setEmphasis(MapEmphasisOption emphasis);
}
