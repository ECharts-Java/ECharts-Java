package org.icepear.echarts.origin.chart.effectScatter;

/**
 * https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect
 */
public interface RippleEffectOption {

    RippleEffectOption setColor(String color);

    RippleEffectOption setNumber(Number number);

    RippleEffectOption setPeriod(Number period);

    RippleEffectOption setScale(Number scale);

    RippleEffectOption setBrushType(String brushType);
}
