package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.lines.LinesSeries;

public class Lines extends Chart<Lines, LinesSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Lines() {
        super(Lines.class, LinesSeries.class);
    }

    @Override
    protected LinesSeries createSeries() {
        return new LinesSeries().setType("lines");
    }
}
