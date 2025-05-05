package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.line.LineSeries;

public class Line extends CartesianCoordChart<Line, LineSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Line() {
        super(Line.class, LineSeries.class);
    }

    @Override
    protected LineSeries createSeries() {
        return new LineSeries().setType("line");
    }
}
