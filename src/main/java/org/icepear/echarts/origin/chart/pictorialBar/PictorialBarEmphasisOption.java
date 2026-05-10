package org.icepear.echarts.origin.chart.pictorialBar;

import org.icepear.echarts.origin.util.DefaultStatesMixinEmpasis;
import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://echarts.apache.org/en/option.html#series-pictorialBar.emphasis
 */
public interface PictorialBarEmphasisOption extends DefaultStatesMixinEmpasis, PictorialBarStateOption, EmphasisOption {

    PictorialBarEmphasisOption setDisabled(Boolean disabled);
}
