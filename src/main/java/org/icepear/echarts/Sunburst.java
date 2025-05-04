package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.sunburst.SunburstSeries;

public class Sunburst extends Chart<Sunburst, SunburstSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Sunburst() {
        super(Sunburst.class, SunburstSeries.class);
    }

    @Override
    public SunburstSeries createSeries() {
        return new SunburstSeries().setType("sunburst");
    }
}
