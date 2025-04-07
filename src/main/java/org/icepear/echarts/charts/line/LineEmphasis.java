package org.icepear.echarts.charts.line;

import java.io.Serial;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.line.LineEmphasisOption;
import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class LineEmphasis implements LineEmphasisOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object endLabel;

    private Object blurScope;

    @Setter(AccessLevel.NONE)
    private Object lineStyle;

    public LineEmphasis setLineStyle(LineStyleOption lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public LineEmphasis setLineStyle(Object lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    private AreaStyleOption areaStyle;

    private String focus;

    private Boolean scale;
}
