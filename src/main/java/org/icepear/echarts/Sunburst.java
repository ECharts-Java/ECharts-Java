package org.icepear.echarts;

import org.icepear.echarts.charts.sunburst.SunburstSeries;

public class Sunburst extends Chart<Sunburst, SunburstSeries> {
    public Sunburst() {
        super(Sunburst.class, SunburstSeries.class);
    }

    @Override
    public SunburstSeries createSeries() {
        return new SunburstSeries().setType("sunburst");
    }
}
