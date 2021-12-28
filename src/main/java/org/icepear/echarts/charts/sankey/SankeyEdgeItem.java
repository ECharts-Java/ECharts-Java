package org.icepear.echarts.charts.sankey;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sankey.SankeyEdgeItemOption;
import org.icepear.echarts.origin.chart.sankey.SankeyEdgeStyleOption;

@Accessors(chain = true)
@Data
public class SankeyEdgeItem implements SankeyEdgeItemOption {

    private SankeyEdgeStyleOption lineStyle;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public SankeyEdgeItem setId(Number id) {
        this.id = id;
        return this;
    }

    public SankeyEdgeItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public SankeyEdgeItem setName(Number name) {
        this.name = name;
        return this;
    }

    public SankeyEdgeItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public SankeyEdgeItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public SankeyEdgeItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public SankeyEdgeItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public SankeyEdgeItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public SankeyEdgeItem setValue(String value) {
        this.value = value;
        return this;
    }

    public SankeyEdgeItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object source;

    public SankeyEdgeItem setSource(Number source) {
        this.source = source;
        return this;
    }

    public SankeyEdgeItem setSource(String source) {
        this.source = source;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object target;

    public SankeyEdgeItem setTarget(Number target) {
        this.target = target;
        return this;
    }

    public SankeyEdgeItem setTarget(String target) {
        this.target = target;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object focusNodeAdjacency;

    public SankeyEdgeItem setFocusNodeAdjacency(Boolean focusNodeAdjacency) {
        this.focusNodeAdjacency = focusNodeAdjacency;
        return this;
    }

    public SankeyEdgeItem setFocusNodeAdjacency(String focusNodeAdjacency) {
        this.focusNodeAdjacency = focusNodeAdjacency;
        return this;
    }
}
