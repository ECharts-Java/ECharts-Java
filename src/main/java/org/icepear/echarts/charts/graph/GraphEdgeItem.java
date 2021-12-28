package org.icepear.echarts.charts.graph;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphEdgeItemOption;
import org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;

@Accessors(chain = true)
@Data
public class GraphEdgeItem implements GraphEdgeItemOption {

    private GraphEdgeLineStyleOption lineStyle;

    private SeriesLineLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public GraphEdgeItem setId(Number id) {
        this.id = id;
        return this;
    }

    public GraphEdgeItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public GraphEdgeItem setName(Number name) {
        this.name = name;
        return this;
    }

    public GraphEdgeItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public GraphEdgeItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public GraphEdgeItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public GraphEdgeItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public GraphEdgeItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public GraphEdgeItem setValue(String value) {
        this.value = value;
        return this;
    }

    public GraphEdgeItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object source;

    public GraphEdgeItem setSource(Number source) {
        this.source = source;
        return this;
    }

    public GraphEdgeItem setSource(String source) {
        this.source = source;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object target;

    public GraphEdgeItem setTarget(Number target) {
        this.target = target;
        return this;
    }

    public GraphEdgeItem setTarget(String target) {
        this.target = target;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbol;

    public GraphEdgeItem setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public GraphEdgeItem setSymbol(String[] symbol) {
        this.symbol = symbol;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public GraphEdgeItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public GraphEdgeItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Boolean ignoreForceLayout;
}
