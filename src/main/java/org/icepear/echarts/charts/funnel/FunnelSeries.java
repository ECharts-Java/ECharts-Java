package org.icepear.echarts.charts.funnel;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.funnel.FunnelDataItemOption;
import org.icepear.echarts.origin.chart.funnel.FunnelEmphasisOption;
import org.icepear.echarts.origin.chart.funnel.FunnelLabelOption;
import org.icepear.echarts.origin.chart.funnel.FunnelSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.OptionEncode;

@Accessors(chain = true)
@Data
public class FunnelSeries implements FunnelSeriesOption {

    private String mainType;

    private String type = "funnel";

    @Setter(AccessLevel.NONE)
    private Object id;

    public FunnelSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public FunnelSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public FunnelSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public FunnelSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public FunnelSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public FunnelSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public FunnelSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public FunnelSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public FunnelSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public FunnelSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public FunnelSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public FunnelSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public FunnelSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public FunnelSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public FunnelSeries setEmphasis(FunnelEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public FunnelSeries setEmphasis(Object emphasis) {
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

    public FunnelSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public FunnelSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public FunnelSeries setData(FunnelDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public FunnelSeries setData(Number[] data) {
        this.data = data;
        return this;
    }

    public FunnelSeries setData(Number[][] data) {
        this.data = data;
        return this;
    }

    public FunnelSeries setData(Object data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public FunnelSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public FunnelSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public FunnelSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public FunnelSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public FunnelSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public FunnelSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public FunnelSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public FunnelSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private ItemStyleOption itemStyle;

    private FunnelLabelOption label;

    @Setter(AccessLevel.NONE)
    private Object width;

    public FunnelSeries setWidth(Number width) {
        this.width = width;
        return this;
    }

    public FunnelSeries setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public FunnelSeries setHeight(Number height) {
        this.height = height;
        return this;
    }

    public FunnelSeries setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public FunnelSeries setTop(Number top) {
        this.top = top;
        return this;
    }

    public FunnelSeries setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public FunnelSeries setRight(Number right) {
        this.right = right;
        return this;
    }

    public FunnelSeries setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public FunnelSeries setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public FunnelSeries setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public FunnelSeries setLeft(Number left) {
        this.left = left;
        return this;
    }

    public FunnelSeries setLeft(String left) {
        this.left = left;
        return this;
    }

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public FunnelSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public FunnelSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private Number min;

    private Number max;

    @Setter(AccessLevel.NONE)
    private Object minSize;

    public FunnelSeries setMinSize(Number minSize) {
        this.minSize = minSize;
        return this;
    }

    public FunnelSeries setMinSize(String minSize) {
        this.minSize = minSize;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object maxSize;

    public FunnelSeries setMaxSize(Number maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public FunnelSeries setMaxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    private String sort;

    private String orient;

    private Number gap;

    private Object funnelAlign;
}
