package org.icepear.echarts.charts.sunburst;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sunburst.SunburstEmphasisOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstItemStyleOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstLabelOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstLevelOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstNodeItemOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;

@Accessors(chain = true)
@Data
public class SunburstSeries implements SunburstSeriesOption {

    private String mainType;

    private String type = "sunburst";

    @Setter(AccessLevel.NONE)
    private Object id;

    public SunburstSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public SunburstSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public SunburstSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public SunburstSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public SunburstSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public SunburstSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public SunburstSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public SunburstSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public SunburstSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public SunburstSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public SunburstSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public SunburstSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public SunburstSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public SunburstSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public SunburstSeries setEmphasis(Object emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public SunburstSeries setEmphasis(SunburstEmphasisOption emphasis) {
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

    public SunburstSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public SunburstSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public SunburstSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public SunburstSeries setData(SunburstNodeItemOption[] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public SunburstSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public SunburstSeries setProgressive(Number progressive) {
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

    public SunburstSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public SunburstSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public SunburstSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public SunburstSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private SunburstItemStyleOption itemStyle;

    private SunburstLabelOption label;

    @Setter(AccessLevel.NONE)
    private Object center;

    public SunburstSeries setCenter(Number[] center) {
        this.center = center;
        return this;
    }

    public SunburstSeries setCenter(String[] center) {
        this.center = center;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radius;

    public SunburstSeries setRadius(Number radius) {
        this.radius = radius;
        return this;
    }

    public SunburstSeries setRadius(Number[] radius) {
        this.radius = radius;
        return this;
    }

    public SunburstSeries setRadius(Object[] radius) {
        this.radius = radius;
        return this;
    }

    public SunburstSeries setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public SunburstSeries setRadius(String[] radius) {
        this.radius = radius;
        return this;
    }

    private Boolean clockwise;

    private Number startAngle;

    private Number minAngle;

    private Boolean stillShowZeroSum;

    private String nodeClick;

    private Boolean renderLabelForZeroData;

    private SunburstLevelOption[] levels;

    private String animationType;

    private String sort;
}
