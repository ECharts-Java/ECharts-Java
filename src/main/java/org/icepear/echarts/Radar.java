package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.radar.RadarSeries;

public class Radar extends RadarCoordChart<Radar, RadarSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Radar() {
        super(Radar.class, RadarSeries.class);
    }

    public RadarSeries createSeries() {
        return new RadarSeries().setType("radar");
    }
}
