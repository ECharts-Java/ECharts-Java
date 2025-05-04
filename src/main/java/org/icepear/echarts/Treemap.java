package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.treemap.TreemapSeries;

public class Treemap extends Chart<Treemap, TreemapSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Treemap() {
        super(Treemap.class, TreemapSeries.class);
    }

    @Override
    public TreemapSeries createSeries() {
        return new TreemapSeries().setType("treemap");
    }

}
