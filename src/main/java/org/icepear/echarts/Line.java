package org.icepear.echarts;

import org.icepear.echarts.charts.line.LineSeries;

public class Line extends CartesianChart<Line, LineSeries> {
    public Line() {
        super(Line.class, LineSeries.class);
    }

    @Override
    protected LineSeries createSeries() {
        return new LineSeries().setType("line");
    }
}
