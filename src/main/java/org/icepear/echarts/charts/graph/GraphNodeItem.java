package org.icepear.echarts.charts.graph;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphNodeItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class GraphNodeItem implements GraphNodeItemOption {

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public GraphNodeItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public GraphNodeItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public GraphNodeItem setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphNodeItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphNodeItem setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphNodeItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String id;

    private String name;

    @Setter(AccessLevel.NONE)
    private Object value;

    public GraphNodeItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public GraphNodeItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public GraphNodeItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public GraphNodeItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public GraphNodeItem setValue(String value) {
        this.value = value;
        return this;
    }

    public GraphNodeItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    private Number x;

    private Number y;

    private Boolean fixed;

    @Setter(AccessLevel.NONE)
    private Object category;

    public GraphNodeItem setCategory(Number category) {
        this.category = category;
        return this;
    }

    public GraphNodeItem setCategory(String category) {
        this.category = category;
        return this;
    }

    private Boolean draggable;
}
