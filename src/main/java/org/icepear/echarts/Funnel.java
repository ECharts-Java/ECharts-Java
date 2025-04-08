package org.icepear.echarts;

import org.icepear.echarts.charts.funnel.FunnelSeries;

import java.io.Serial;
import java.io.Serializable;

public class Funnel extends Chart<Funnel, FunnelSeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Funnel() {
        super(Funnel.class, FunnelSeries.class);
    }

    @Override
    public FunnelSeries createSeries() {
        return new FunnelSeries().setType("funnel");
    }
}
