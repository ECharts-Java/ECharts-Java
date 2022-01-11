package org.icepear.echarts.charts.bar;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.bar.BarBackgroundStyleOption;
import org.icepear.echarts.origin.chart.bar.BarDataItemOption;
import org.icepear.echarts.origin.chart.bar.BarEmphasisOption;
import org.icepear.echarts.origin.chart.bar.BarItemStyleOption;
import org.icepear.echarts.origin.chart.bar.BarLabelOption;
import org.icepear.echarts.origin.chart.bar.BarSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.OptionEncode;

@Accessors(chain = true)
@Data
public class BarSeries implements BarSeriesOption {

    private String mainType;

    private String type = "bar";

    @Setter(AccessLevel.NONE)
    private Object id;

    public BarSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public BarSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public BarSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public BarSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public BarSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public BarSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public BarSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public BarSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public BarSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public BarSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public BarSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public BarSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public BarSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public BarSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public BarSeries setEmphasis(BarEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public BarSeries setEmphasis(Object emphasis) {
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

    public BarSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public BarSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public BarSeries setData(BarDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public BarSeries setData(Number[] data) {
        this.data = data;
        return this;
    }

    public BarSeries setData(Number[][] data) {
        this.data = data;
        return this;
    }

    public BarSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public BarSeries setData(Object[] data) {
        this.data = data;
        return this;
    }

    public BarSeries setData(Object[][] data) {
        this.data = data;
        return this;
    }

    public BarSeries setData(String[] data) {
        this.data = data;
        return this;
    }

    public BarSeries setData(String[][] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public BarSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public BarSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public BarSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public BarSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public BarSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public BarSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public BarSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public BarSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private Number xAxisIndex;

    private Number yAxisIndex;

    private String xAxisId;

    private String yAxisId;

    private Number polarIndex;

    private String polarId;

    private Number barMinHeight;

    private Number barMinAngle;

    private Number barMaxWidth;

    private Number barMinWidth;

    @Setter(AccessLevel.NONE)
    private Object barWidth;

    public BarSeries setBarWidth(Number barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    public BarSeries setBarWidth(String barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object barGap;

    public BarSeries setBarGap(Number barGap) {
        this.barGap = barGap;
        return this;
    }

    public BarSeries setBarGap(String barGap) {
        this.barGap = barGap;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object barCategoryGap;

    public BarSeries setBarCategoryGap(Number barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
        return this;
    }

    public BarSeries setBarCategoryGap(String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
        return this;
    }

    private Boolean large;

    private Number largeThreshold;

    private BarItemStyleOption itemStyle;

    private BarLabelOption label;

    private String stack;

    private String sampling;

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public BarSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public BarSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private Boolean clip;

    private Boolean roundCap;

    private Boolean showBackground;

    private BarBackgroundStyleOption backgroundStyle;

    private Boolean realtimeSort;
}
