package org.icepear.echarts.component;

import org.icepear.echarts.origin.chart.pie.PieDataItemOption;
import org.icepear.echarts.origin.chart.pie.PieItemStyleOption;
import org.icepear.echarts.origin.util.EmphasisOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain = true)
@Data
public class PieDataItem implements PieDataItemOption {
    private String cursor;

    private String id;

    private String name;

    private String groupId;

    private Object value;

    private Boolean selected;

    private PieItemStyleOption itemStyle;

    private Object label;

    private EmphasisOption emphasis;

    private Object select;

    private Object blur;
}
