package org.icepear.echarts.charts.line;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.line.LineDataItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class LineDataItem implements LineDataItemOption {

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public LineDataItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public LineDataItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public LineDataItem setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public LineDataItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public LineDataItem setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public LineDataItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object endLabel;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    private Object value;
}
