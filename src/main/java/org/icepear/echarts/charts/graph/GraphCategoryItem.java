package org.icepear.echarts.charts.graph;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphCategoryItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class GraphCategoryItem implements GraphCategoryItemOption {

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public GraphCategoryItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public GraphCategoryItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public GraphCategoryItem setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphCategoryItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphCategoryItem setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphCategoryItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    @Setter(AccessLevel.NONE)
    private Object value;

    public GraphCategoryItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public GraphCategoryItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public GraphCategoryItem setValue(String value) {
        this.value = value;
        return this;
    }
}
