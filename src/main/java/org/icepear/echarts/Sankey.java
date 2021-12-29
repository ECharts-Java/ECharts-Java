package org.icepear.echarts;

import org.icepear.echarts.charts.sankey.SankeySeries;

public class Sankey extends Chart<Sankey, SankeySeries> {
    public Sankey() {
        super(Sankey.class, SankeySeries.class);
    }

    @Override
    public SankeySeries createSeries() {
        return new SankeySeries().setType("sankey");
    }
}
