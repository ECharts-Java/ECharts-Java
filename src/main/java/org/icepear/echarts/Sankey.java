package org.icepear.echarts;

import org.icepear.echarts.charts.sankey.SankeySeries;

import java.io.Serial;
import java.io.Serializable;

public class Sankey extends Chart<Sankey, SankeySeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Sankey() {
        super(Sankey.class, SankeySeries.class);
    }

    @Override
    public SankeySeries createSeries() {
        return new SankeySeries().setType("sankey");
    }
}
