package org.icepear.echarts.charts.tree;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.tree.TreeEmphasisOption;
import org.icepear.echarts.origin.chart.tree.TreeLeavesOption;
import org.icepear.echarts.origin.chart.tree.TreeNodeItemOption;
import org.icepear.echarts.origin.chart.tree.TreeSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class TreeSeries implements TreeSeriesOption {

    private String mainType;

    private String type = "tree";

    @Setter(AccessLevel.NONE)
    private Object id;

    public TreeSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public TreeSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public TreeSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public TreeSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public TreeSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public TreeSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public TreeSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public TreeSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public TreeSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public TreeSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public TreeSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public TreeSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public TreeSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public TreeSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public TreeSeries setEmphasis(Object emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public TreeSeries setEmphasis(TreeEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    private Object select;

    private Object blur;

    private MarkAreaOption markArea;

    private MarkLineOption markLine;

    private MarkPointOption markPoint;

    private Object tooltip;

    private Boolean silent;

    private String blendMode;

    private String cursor;

    @Setter(AccessLevel.NONE)
    private Object dataGroupId;

    public TreeSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public TreeSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public TreeSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public TreeSeries setData(TreeNodeItemOption[] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public TreeSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public TreeSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    private String seriesLayoutBy;

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public TreeSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public TreeSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public TreeSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public TreeSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private ItemStyleOption itemStyle;

    private Object lineStyle;

    private SeriesLabelOption label;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public TreeSeries setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public TreeSeries setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public TreeSeries setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public TreeSeries setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public TreeSeries setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public TreeSeries setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object width;

    public TreeSeries setWidth(Number width) {
        this.width = width;
        return this;
    }

    public TreeSeries setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public TreeSeries setHeight(Number height) {
        this.height = height;
        return this;
    }

    public TreeSeries setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public TreeSeries setTop(Number top) {
        this.top = top;
        return this;
    }

    public TreeSeries setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public TreeSeries setRight(Number right) {
        this.right = right;
        return this;
    }

    public TreeSeries setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public TreeSeries setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public TreeSeries setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public TreeSeries setLeft(Number left) {
        this.left = left;
        return this;
    }

    public TreeSeries setLeft(String left) {
        this.left = left;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object roam;

    public TreeSeries setRoam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public TreeSeries setRoam(String roam) {
        this.roam = roam;
        return this;
    }

    private Number[] center;

    private Number zoom;

    private Object scaleLimit;

    private String layout;

    private String edgeShape;

    @Setter(AccessLevel.NONE)
    private Object edgeForkPosition;

    public TreeSeries setEdgeForkPosition(Number edgeForkPosition) {
        this.edgeForkPosition = edgeForkPosition;
        return this;
    }

    public TreeSeries setEdgeForkPosition(String edgeForkPosition) {
        this.edgeForkPosition = edgeForkPosition;
        return this;
    }

    private Number nodeScaleRatio;

    private String orient;

    private Boolean expandAndCollapse;

    private Number initialTreeDepth;

    private TreeLeavesOption leaves;
}
