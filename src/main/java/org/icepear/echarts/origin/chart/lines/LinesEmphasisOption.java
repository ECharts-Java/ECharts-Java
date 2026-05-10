package org.icepear.echarts.origin.chart.lines;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://echarts.apache.org/en/option.html#series-lines.emphasis
 */
public interface LinesEmphasisOption extends LinesStateOption, EmphasisOption {

    LinesEmphasisOption setFocus(String focus);

    LinesEmphasisOption setDisabled(Boolean disabled);
}
