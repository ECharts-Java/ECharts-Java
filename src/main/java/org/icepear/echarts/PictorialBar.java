package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.pictorialBar.PictorialBarSeries;

public class PictorialBar extends CartesianCoordChart<PictorialBar, PictorialBarSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public PictorialBar() {
        super(PictorialBar.class, PictorialBarSeries.class);
    }

    @Override
    protected PictorialBarSeries createSeries() {
        return new PictorialBarSeries().setType("pictorialBar");
    }
}
