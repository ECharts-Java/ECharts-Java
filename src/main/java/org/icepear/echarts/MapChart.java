package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.map.MapSeries;

public class MapChart extends Chart<MapChart, MapSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public MapChart() {
        super(MapChart.class, MapSeries.class);
    }

    @Override
    public MapSeries createSeries() {
        return new MapSeries().setType("map");
    }
}
