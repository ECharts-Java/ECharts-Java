package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.line.LineSeries;

public class PolarLine extends PolarCoordChart<PolarLine, LineSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public PolarLine() {
        super(PolarLine.class, LineSeries.class);
    }

    @Override
    protected LineSeries createSeries() {
        return new LineSeries().setType("line").setCoordinateSystem("polar");
    }
}
