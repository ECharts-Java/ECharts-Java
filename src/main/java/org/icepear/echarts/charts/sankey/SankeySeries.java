package org.icepear.echarts.charts.sankey;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sankey.SankeyEdgeItemOption;
import org.icepear.echarts.origin.chart.sankey.SankeyEdgeStyleOption;
import org.icepear.echarts.origin.chart.sankey.SankeyEmphasisOption;
import org.icepear.echarts.origin.chart.sankey.SankeyLevelOption;
import org.icepear.echarts.origin.chart.sankey.SankeyNodeItemOption;
import org.icepear.echarts.origin.chart.sankey.SankeySeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class SankeySeries implements SankeySeriesOption {

    private String mainType;

    private String type = "sankey";

    @Setter(AccessLevel.NONE)
    private Object id;

    public SankeySeries setId(Number id) {
        this.id = id;
        return this;
    }

    public SankeySeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public SankeySeries setName(Number name) {
        this.name = name;
        return this;
    }

    public SankeySeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public SankeySeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public SankeySeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public SankeySeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public SankeySeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public SankeySeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public SankeySeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public SankeySeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public SankeySeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public SankeySeries setColor(String color) {
        this.color = color;
        return this;
    }

    public SankeySeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public SankeySeries setEmphasis(Object emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public SankeySeries setEmphasis(SankeyEmphasisOption emphasis) {
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

    public SankeySeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public SankeySeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public SankeySeries setData(Object data) {
        this.data = data;
        return this;
    }

    public SankeySeries setData(SankeyNodeItemOption[] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public SankeySeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public SankeySeries setProgressive(Number progressive) {
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

    public SankeySeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public SankeySeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public SankeySeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public SankeySeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private SeriesLabelOption label;

    private ItemStyleOption itemStyle;

    private SankeyEdgeStyleOption lineStyle;

    @Setter(AccessLevel.NONE)
    private Object width;

    public SankeySeries setWidth(Number width) {
        this.width = width;
        return this;
    }

    public SankeySeries setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public SankeySeries setHeight(Number height) {
        this.height = height;
        return this;
    }

    public SankeySeries setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public SankeySeries setTop(Number top) {
        this.top = top;
        return this;
    }

    public SankeySeries setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public SankeySeries setRight(Number right) {
        this.right = right;
        return this;
    }

    public SankeySeries setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public SankeySeries setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public SankeySeries setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public SankeySeries setLeft(Number left) {
        this.left = left;
        return this;
    }

    public SankeySeries setLeft(String left) {
        this.left = left;
        return this;
    }

    private String orient;

    private Number nodeWidth;

    private Number nodeGap;

    private Boolean draggable;

    @Setter(AccessLevel.NONE)
    private Object focusNodeAdjacency;

    public SankeySeries setFocusNodeAdjacency(Boolean focusNodeAdjacency) {
        this.focusNodeAdjacency = focusNodeAdjacency;
        return this;
    }

    public SankeySeries setFocusNodeAdjacency(String focusNodeAdjacency) {
        this.focusNodeAdjacency = focusNodeAdjacency;
        return this;
    }

    private Number layoutIterations;

    private SankeyNodeItemOption[] nodes;

    private SankeyEdgeItemOption[] edges;

    private SankeyEdgeItemOption[] links;

    private SankeyLevelOption[] levels;
}
