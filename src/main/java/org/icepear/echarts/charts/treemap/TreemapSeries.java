package org.icepear.echarts.charts.treemap;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.BreadcrumbOption;
import org.icepear.echarts.origin.chart.treemap.TreemapEmphasisOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesItemStyleOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesLabelOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesLevelOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesNodeItemOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;

@Accessors(chain = true)
@Data
public class TreemapSeries implements TreemapSeriesOption {

    private String mainType;

    private String type = "treemap";

    @Setter(AccessLevel.NONE)
    private Object id;

    public TreemapSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public TreemapSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public TreemapSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public TreemapSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public TreemapSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public TreemapSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public TreemapSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public TreemapSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public TreemapSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public TreemapSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public TreemapSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public TreemapSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public TreemapSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public TreemapSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public TreemapSeries setEmphasis(Object emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public TreemapSeries setEmphasis(TreemapEmphasisOption emphasis) {
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

    public TreemapSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public TreemapSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public TreemapSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public TreemapSeries setData(TreemapSeriesNodeItemOption[] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public TreemapSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public TreemapSeries setProgressive(Number progressive) {
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

    public TreemapSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public TreemapSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public TreemapSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public TreemapSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private TreemapSeriesItemStyleOption itemStyle;

    private TreemapSeriesLabelOption label;

    private TreemapSeriesLabelOption upperLabel;

    @Setter(AccessLevel.NONE)
    private Object width;

    public TreemapSeries setWidth(Number width) {
        this.width = width;
        return this;
    }

    public TreemapSeries setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public TreemapSeries setHeight(Number height) {
        this.height = height;
        return this;
    }

    public TreemapSeries setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public TreemapSeries setTop(Number top) {
        this.top = top;
        return this;
    }

    public TreemapSeries setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public TreemapSeries setRight(Number right) {
        this.right = right;
        return this;
    }

    public TreemapSeries setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public TreemapSeries setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public TreemapSeries setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public TreemapSeries setLeft(Number left) {
        this.left = left;
        return this;
    }

    public TreemapSeries setLeft(String left) {
        this.left = left;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object roam;

    public TreemapSeries setRoam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public TreemapSeries setRoam(String roam) {
        this.roam = roam;
        return this;
    }

    private Number[] center;

    private Number zoom;

    private Object scaleLimit;

    @Setter(AccessLevel.NONE)
    private Object visualDimension;

    public TreemapSeries setVisualDimension(Number visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    public TreemapSeries setVisualDimension(String visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    private String colorMappingBy;

    private Number visualMin;

    private Number visualMax;

    @Setter(AccessLevel.NONE)
    private Object colorAlpha;

    public TreemapSeries setColorAlpha(Number[] colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public TreemapSeries setColorAlpha(String colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object colorSaturation;

    public TreemapSeries setColorSaturation(Number[] colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public TreemapSeries setColorSaturation(String colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    private Number visibleMin;

    private Number childrenVisibleMin;

    @Setter(AccessLevel.NONE)
    private Object size;

    public TreemapSeries setSize(Number[] size) {
        this.size = size;
        return this;
    }

    public TreemapSeries setSize(String[] size) {
        this.size = size;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object sort;

    public TreemapSeries setSort(Boolean sort) {
        this.sort = sort;
        return this;
    }

    public TreemapSeries setSort(String sort) {
        this.sort = sort;
        return this;
    }

    private String clipWindow;

    private Number squareRatio;

    private Number leafDepth;

    private String drillDownIcon;

    private Number zoomToNodeRatio;

    private String nodeClick;

    private BreadcrumbOption breadcrumb;

    private TreemapSeriesLevelOption[] levels;
}
