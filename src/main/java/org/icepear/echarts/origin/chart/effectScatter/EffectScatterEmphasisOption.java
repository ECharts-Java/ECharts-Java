package org.icepear.echarts.origin.chart.effectScatter;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://echarts.apache.org/en/option.html#series-effectScatter.emphasis
 */
public interface EffectScatterEmphasisOption extends EffectScatterStateOption, EmphasisOption {

    EffectScatterEmphasisOption setFocus(String focus);

    EffectScatterEmphasisOption setScale(Boolean scale);

    EffectScatterEmphasisOption setDisabled(Boolean disabled);
}
