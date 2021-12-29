package org.icepear.echarts;

import org.icepear.echarts.charts.candlestick.CandlestickSeries;

public class Candlestick extends CartesianCoordChart<Candlestick, CandlestickSeries> {
    public Candlestick() {
        super(Candlestick.class, CandlestickSeries.class);
    }

    @Override
    public CandlestickSeries createSeries() {
        return new CandlestickSeries().setType("candlestick");
    }
}
