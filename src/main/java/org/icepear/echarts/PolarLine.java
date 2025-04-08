package org.icepear.echarts;

import org.icepear.echarts.charts.line.LineSeries;

import java.io.Serial;
import java.io.Serializable;

public class PolarLine extends PolarCoordChart<PolarLine, LineSeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public PolarLine() {
        super(PolarLine.class, LineSeries.class);
    }

    @Override
    protected LineSeries createSeries() {
        return new LineSeries().setType("line").setCoordinateSystem("polar");
    }
}
