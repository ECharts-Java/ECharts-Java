package org.icepear.echarts.charts.tree;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.tree.TreeNodeItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class TreeNodeItem implements TreeNodeItemOption {

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public TreeNodeItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public TreeNodeItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public TreeNodeItem setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public TreeNodeItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public TreeNodeItem setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public TreeNodeItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private ItemStyleOption itemStyle;

    private Object lineStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public TreeNodeItem setId(Number id) {
        this.id = id;
        return this;
    }

    public TreeNodeItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public TreeNodeItem setName(Number name) {
        this.name = name;
        return this;
    }

    public TreeNodeItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public TreeNodeItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public TreeNodeItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public TreeNodeItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public TreeNodeItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public TreeNodeItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public TreeNodeItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public TreeNodeItem setValue(String value) {
        this.value = value;
        return this;
    }

    public TreeNodeItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    private TreeNodeItemOption[] children;

    private Boolean collapsed;

    private String link;

    private String target;
}
