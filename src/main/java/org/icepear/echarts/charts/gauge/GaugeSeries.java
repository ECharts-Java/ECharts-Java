package org.icepear.echarts.charts.gauge;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeAnchorOption;
import org.icepear.echarts.origin.chart.gauge.GaugeDataItemOption;
import org.icepear.echarts.origin.chart.gauge.GaugeDetailOption;
import org.icepear.echarts.origin.chart.gauge.GaugeEmphasisOption;
import org.icepear.echarts.origin.chart.gauge.GaugePointerOption;
import org.icepear.echarts.origin.chart.gauge.GaugeProgressOption;
import org.icepear.echarts.origin.chart.gauge.GaugeSeriesOption;
import org.icepear.echarts.origin.chart.gauge.GaugeTitleOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.OptionEncode;

@Accessors(chain = true)
@Data
public class GaugeSeries implements GaugeSeriesOption {

    private String mainType;

    private String type = "gauge";

    @Setter(AccessLevel.NONE)
    private Object id;

    public GaugeSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public GaugeSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public GaugeSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public GaugeSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public GaugeSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public GaugeSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public GaugeSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public GaugeSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public GaugeSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public GaugeSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public GaugeSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public GaugeSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public GaugeSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public GaugeSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public GaugeSeries setEmphasis(GaugeEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public GaugeSeries setEmphasis(Object emphasis) {
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

    public GaugeSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public GaugeSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public GaugeSeries setData(GaugeDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public GaugeSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public GaugeSeries setData(Object[] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public GaugeSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public GaugeSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public GaugeSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public GaugeSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public GaugeSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public GaugeSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public GaugeSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public GaugeSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private ItemStyleOption itemStyle;

    @Setter(AccessLevel.NONE)
    private Object center;

    public GaugeSeries setCenter(Number[] center) {
        this.center = center;
        return this;
    }

    public GaugeSeries setCenter(String[] center) {
        this.center = center;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radius;

    public GaugeSeries setRadius(Number radius) {
        this.radius = radius;
        return this;
    }

    public GaugeSeries setRadius(Number[] radius) {
        this.radius = radius;
        return this;
    }

    public GaugeSeries setRadius(Object[] radius) {
        this.radius = radius;
        return this;
    }

    public GaugeSeries setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public GaugeSeries setRadius(String[] radius) {
        this.radius = radius;
        return this;
    }

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public GaugeSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public GaugeSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private Number startAngle;

    private Number endAngle;

    private Boolean clockwise;

    private Number min;

    private Number max;

    private Number splitNumber;

    private Object axisLine;

    private GaugeProgressOption progress;

    private Object splitLine;

    private Object axisTick;

    private Object axisLabel;

    private GaugePointerOption pointer;

    private GaugeAnchorOption anchor;

    private GaugeTitleOption title;

    private GaugeDetailOption detail;
}
