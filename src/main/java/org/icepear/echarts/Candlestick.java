package org.icepear.echarts;

import org.icepear.echarts.charts.candlestick.CandlestickSeries;

import java.io.Serial;
import java.io.Serializable;

public class Candlestick extends CartesianCoordChart<Candlestick, CandlestickSeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Candlestick() {
        super(Candlestick.class, CandlestickSeries.class);
    }

    @Override
    public CandlestickSeries createSeries() {
        return new CandlestickSeries().setType("candlestick");
    }
}
