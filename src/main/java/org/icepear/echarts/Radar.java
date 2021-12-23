package org.icepear.echarts;

import org.icepear.echarts.charts.radar.RadarSeries;

public class Radar extends RadarChart<Radar, RadarSeries> {
    public Radar() {
        super(Radar.class, RadarSeries.class);
    }

    public RadarSeries createSeries() {
        return new RadarSeries().setType("radar");
    }
}
