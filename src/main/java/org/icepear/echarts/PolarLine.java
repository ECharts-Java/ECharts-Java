package org.icepear.echarts;

import org.icepear.echarts.charts.line.LineSeries;

public class PolarLine extends PolarCoordChart<PolarLine, LineSeries> {
    public PolarLine() {
        super(PolarLine.class, LineSeries.class);
    }

    @Override
    protected LineSeries createSeries() {
        return new LineSeries().setType("line").setCoordinateSystem("polar");
    }
}
