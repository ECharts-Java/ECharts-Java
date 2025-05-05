package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.sankey.SankeySeries;

public class Sankey extends Chart<Sankey, SankeySeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Sankey() {
        super(Sankey.class, SankeySeries.class);
    }

    @Override
    public SankeySeries createSeries() {
        return new SankeySeries().setType("sankey");
    }
}
