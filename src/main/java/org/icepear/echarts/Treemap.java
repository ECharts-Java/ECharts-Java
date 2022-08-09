package org.icepear.echarts;

import org.icepear.echarts.charts.treemap.TreemapSeries;

public class Treemap extends Chart<Treemap, TreemapSeries> {
    public Treemap() {
        super(Treemap.class, TreemapSeries.class);
    }

    @Override
    public TreemapSeries createSeries() {
        return new TreemapSeries().setType("treemap");
    }
    
}
