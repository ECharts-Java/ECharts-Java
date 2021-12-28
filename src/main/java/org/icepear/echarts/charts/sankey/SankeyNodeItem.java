package org.icepear.echarts.charts.sankey;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sankey.SankeyNodeItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class SankeyNodeItem implements SankeyNodeItemOption {

    private SeriesLabelOption label;

    private ItemStyleOption itemStyle;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public SankeyNodeItem setId(Number id) {
        this.id = id;
        return this;
    }

    public SankeyNodeItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public SankeyNodeItem setName(Number name) {
        this.name = name;
        return this;
    }

    public SankeyNodeItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public SankeyNodeItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public SankeyNodeItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public SankeyNodeItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public SankeyNodeItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public SankeyNodeItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public SankeyNodeItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public SankeyNodeItem setValue(String value) {
        this.value = value;
        return this;
    }

    public SankeyNodeItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    private Number localX;

    private Number localY;

    private Number depth;

    private Boolean draggable;

    @Setter(AccessLevel.NONE)
    private Object focusNodeAdjacency;

    public SankeyNodeItem setFocusNodeAdjacency(Boolean focusNodeAdjacency) {
        this.focusNodeAdjacency = focusNodeAdjacency;
        return this;
    }

    public SankeyNodeItem setFocusNodeAdjacency(String focusNodeAdjacency) {
        this.focusNodeAdjacency = focusNodeAdjacency;
        return this;
    }
}
