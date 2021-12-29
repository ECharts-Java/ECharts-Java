package org.icepear.echarts;

import org.icepear.echarts.charts.themeRiver.ThemeRiverSeries;

public class ThemeRiver extends SingleCoordChart<ThemeRiver, ThemeRiverSeries> {
    public ThemeRiver() {
        super(ThemeRiver.class, ThemeRiverSeries.class);
    }

    @Override
    public ThemeRiverSeries createSeries() {
        return new ThemeRiverSeries().setType("themeRiver");
    }
}