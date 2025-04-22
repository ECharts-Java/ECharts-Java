package org.icepear.echarts;

import org.icepear.echarts.charts.treemap.TreemapSeries;

import java.io.Serializable;

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
