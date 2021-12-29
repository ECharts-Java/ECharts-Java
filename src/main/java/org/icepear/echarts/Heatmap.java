package org.icepear.echarts;

import org.icepear.echarts.charts.heatmap.HeatmapSeries;
import org.icepear.echarts.components.coord.SplitArea;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;

public class Heatmap extends CartesianCoordChart<Heatmap, HeatmapSeries> {
    public Heatmap() {
        super(Heatmap.class, HeatmapSeries.class);
    }

    @Override
    protected CategoryAxis createCategoryAxis() {
        return super.createCategoryAxis().setSplitArea(new SplitArea().setShow(true));
    }

    @Override
    protected ValueAxis createValueAxis() {
        return super.createValueAxis().setSplitArea(new SplitArea().setShow(true));
    }

    @Override
    protected HeatmapSeries createSeries() {
        return new HeatmapSeries().setType("heatmap");
    }
}
