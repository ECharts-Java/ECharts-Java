package org.icepear.echarts.charts.graph;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphBlurOption;
import org.icepear.echarts.origin.chart.graph.GraphCategoryItemOption;
import org.icepear.echarts.origin.chart.graph.GraphCircularOption;
import org.icepear.echarts.origin.chart.graph.GraphEdgeItemOption;
import org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption;
import org.icepear.echarts.origin.chart.graph.GraphEmphasisOption;
import org.icepear.echarts.origin.chart.graph.GraphForceOption;
import org.icepear.echarts.origin.chart.graph.GraphNodeItemOption;
import org.icepear.echarts.origin.chart.graph.GraphSelectOption;
import org.icepear.echarts.origin.chart.graph.GraphSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;

@Accessors(chain = true)
@Data
public class GraphSeries implements GraphSeriesOption {

    private String mainType;

    private String type = "graph";

    @Setter(AccessLevel.NONE)
    private Object id;

    public GraphSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public GraphSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public GraphSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public GraphSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public GraphSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public GraphSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public GraphSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public GraphSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public GraphSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public GraphSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public GraphSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public GraphSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public GraphSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public GraphSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public GraphSeries setEmphasis(GraphEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public GraphSeries setEmphasis(Object emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object select;

    public GraphSeries setSelect(GraphSelectOption select) {
        this.select = select;
        return this;
    }

    public GraphSeries setSelect(Object select) {
        this.select = select;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object blur;

    public GraphSeries setBlur(GraphBlurOption blur) {
        this.blur = blur;
        return this;
    }

    public GraphSeries setBlur(Object blur) {
        this.blur = blur;
        return this;
    }

    private MarkAreaOption markArea;

    private MarkLineOption markLine;

    private MarkPointOption markPoint;

    private Object tooltip;

    private Boolean silent;

    private String blendMode;

    private String cursor;

    @Setter(AccessLevel.NONE)
    private Object dataGroupId;

    public GraphSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public GraphSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public GraphSeries setData(GraphNodeItemOption[] data) {
        this.data = data;
        return this;
    }

    public GraphSeries setData(Number[] data) {
        this.data = data;
        return this;
    }

    public GraphSeries setData(Number[][] data) {
        this.data = data;
        return this;
    }

    public GraphSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public GraphSeries setData(Object[] data) {
        this.data = data;
        return this;
    }

    public GraphSeries setData(Object[][] data) {
        this.data = data;
        return this;
    }

    public GraphSeries setData(String[] data) {
        this.data = data;
        return this;
    }

    public GraphSeries setData(String[][] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public GraphSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public GraphSeries setProgressive(Number progressive) {
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

    public GraphSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public GraphSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public GraphSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public GraphSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private Number xAxisIndex;

    private Number yAxisIndex;

    private String xAxisId;

    private String yAxisId;

    private Number polarIndex;

    private String polarId;

    private Number calendarIndex;

    private String calendarId;

    private Number geoIndex;

    private String geoId;

    private Number singleAxisIndex;

    private String singleAxisId;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public GraphSeries setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public GraphSeries setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public GraphSeries setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphSeries setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphSeries setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public GraphSeries setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object roam;

    public GraphSeries setRoam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public GraphSeries setRoam(String roam) {
        this.roam = roam;
        return this;
    }

    private Number[] center;

    private Number zoom;

    private Object scaleLimit;

    @Setter(AccessLevel.NONE)
    private Object width;

    public GraphSeries setWidth(Number width) {
        this.width = width;
        return this;
    }

    public GraphSeries setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public GraphSeries setHeight(Number height) {
        this.height = height;
        return this;
    }

    public GraphSeries setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public GraphSeries setTop(Number top) {
        this.top = top;
        return this;
    }

    public GraphSeries setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public GraphSeries setRight(Number right) {
        this.right = right;
        return this;
    }

    public GraphSeries setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public GraphSeries setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public GraphSeries setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public GraphSeries setLeft(Number left) {
        this.left = left;
        return this;
    }

    public GraphSeries setLeft(String left) {
        this.left = left;
        return this;
    }

    private String layout;

    @Setter(AccessLevel.NONE)
    private Object nodes;

    public GraphSeries setNodes(GraphNodeItemOption[] nodes) {
        this.nodes = nodes;
        return this;
    }

    public GraphSeries setNodes(Number[] nodes) {
        this.nodes = nodes;
        return this;
    }

    public GraphSeries setNodes(Number[][] nodes) {
        this.nodes = nodes;
        return this;
    }

    public GraphSeries setNodes(Object[] nodes) {
        this.nodes = nodes;
        return this;
    }

    public GraphSeries setNodes(Object[][] nodes) {
        this.nodes = nodes;
        return this;
    }

    public GraphSeries setNodes(String[] nodes) {
        this.nodes = nodes;
        return this;
    }

    public GraphSeries setNodes(String[][] nodes) {
        this.nodes = nodes;
        return this;
    }

    private GraphEdgeItemOption[] edges;

    private GraphEdgeItemOption[] links;

    private GraphCategoryItemOption[] categories;

    private Boolean focusNodeAdjacency;

    private Number nodeScaleRatio;

    private Boolean draggable;

    @Setter(AccessLevel.NONE)
    private Object edgeSymbol;

    public GraphSeries setEdgeSymbol(String edgeSymbol) {
        this.edgeSymbol = edgeSymbol;
        return this;
    }

    public GraphSeries setEdgeSymbol(String[] edgeSymbol) {
        this.edgeSymbol = edgeSymbol;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object edgeSymbolSize;

    public GraphSeries setEdgeSymbolSize(Number edgeSymbolSize) {
        this.edgeSymbolSize = edgeSymbolSize;
        return this;
    }

    public GraphSeries setEdgeSymbolSize(Number[] edgeSymbolSize) {
        this.edgeSymbolSize = edgeSymbolSize;
        return this;
    }

    private SeriesLineLabelOption edgeLabel;

    private SeriesLabelOption label;

    private ItemStyleOption itemStyle;

    private GraphEdgeLineStyleOption lineStyle;

    private GraphCircularOption circular;

    private GraphForceOption force;
}
