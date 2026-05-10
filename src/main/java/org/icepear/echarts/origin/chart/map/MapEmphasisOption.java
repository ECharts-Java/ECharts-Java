package org.icepear.echarts.origin.chart.map;

import org.icepear.echarts.origin.util.DefaultStatesMixinEmpasis;
import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://echarts.apache.org/en/option.html#series-map.emphasis
 */
public interface MapEmphasisOption extends DefaultStatesMixinEmpasis, MapStateOption, EmphasisOption {

    MapEmphasisOption setDisabled(Boolean disabled);
}
