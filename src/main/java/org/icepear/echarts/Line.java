package org.icepear.echarts;

import org.icepear.echarts.charts.line.LineSeries;

import java.io.Serial;
import java.io.Serializable;

public class Line extends CartesianCoordChart<Line, LineSeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Line() {
        super(Line.class, LineSeries.class);
    }

    @Override
    protected LineSeries createSeries() {
        return new LineSeries().setType("line");
    }
}
