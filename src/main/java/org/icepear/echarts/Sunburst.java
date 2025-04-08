package org.icepear.echarts;

import org.icepear.echarts.charts.sunburst.SunburstSeries;

import java.io.Serial;
import java.io.Serializable;

public class Sunburst extends Chart<Sunburst, SunburstSeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Sunburst() {
        super(Sunburst.class, SunburstSeries.class);
    }

    @Override
    public SunburstSeries createSeries() {
        return new SunburstSeries().setType("sunburst");
    }
}
