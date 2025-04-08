package org.icepear.echarts;

import org.icepear.echarts.charts.radar.RadarSeries;

import java.io.Serial;
import java.io.Serializable;

public class Radar extends RadarCoordChart<Radar, RadarSeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Radar() {
        super(Radar.class, RadarSeries.class);
    }

    public RadarSeries createSeries() {
        return new RadarSeries().setType("radar");
    }
}
