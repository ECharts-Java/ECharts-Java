package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.candlestick.CandlestickSeries;

public class Candlestick extends CartesianCoordChart<Candlestick, CandlestickSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Candlestick() {
        super(Candlestick.class, CandlestickSeries.class);
    }

    @Override
    public CandlestickSeries createSeries() {
        return new CandlestickSeries().setType("candlestick");
    }
}
