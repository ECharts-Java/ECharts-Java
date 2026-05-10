package org.icepear.echarts.origin.chart.lines;

/**
 * https://echarts.apache.org/en/option.html#series-lines.effect
 */
public interface LinesEffectOption {

    LinesEffectOption setShow(Boolean show);

    LinesEffectOption setPeriod(Number period);

    LinesEffectOption setDelay(Number delay);

    LinesEffectOption setConstantSpeed(Number constantSpeed);

    LinesEffectOption setSymbol(String symbol);

    LinesEffectOption setSymbolSize(Number symbolSize);

    LinesEffectOption setSymbolSize(Number[] symbolSize);

    LinesEffectOption setColor(String color);

    LinesEffectOption setTrailLength(Number trailLength);

    LinesEffectOption setLoop(Boolean loop);

    LinesEffectOption setRoundTrip(Boolean roundTrip);
}
