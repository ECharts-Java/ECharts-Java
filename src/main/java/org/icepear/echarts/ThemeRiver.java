package org.icepear.echarts;

import org.icepear.echarts.charts.themeRiver.ThemeRiverSeries;

import java.io.Serializable;

public class ThemeRiver extends SingleCoordChart<ThemeRiver, ThemeRiverSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public ThemeRiver() {
        super(ThemeRiver.class, ThemeRiverSeries.class);
    }

    @Override
    public ThemeRiverSeries createSeries() {
        return new ThemeRiverSeries().setType("themeRiver");
    }
}