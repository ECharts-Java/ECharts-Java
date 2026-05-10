package org.icepear.echarts.charts.pictorialBar;

import java.io.Serializable;
import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.bar.BarItemStyleOption;
import org.icepear.echarts.origin.chart.bar.BarLabelOption;
import org.icepear.echarts.origin.chart.pictorialBar.PictorialBarDataItemOption;
import org.icepear.echarts.origin.chart.pictorialBar.PictorialBarEmphasisOption;
import org.icepear.echarts.origin.chart.pictorialBar.PictorialBarSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.OptionEncode;

@Accessors(chain = true)
@Data
public class PictorialBarSeries implements PictorialBarSeriesOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String mainType;

    private String type = "pictorialBar";

    @Setter(AccessLevel.NONE)
    private Object id;

    public PictorialBarSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public PictorialBarSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public PictorialBarSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public PictorialBarSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public PictorialBarSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public PictorialBarSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public PictorialBarSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public PictorialBarSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public PictorialBarSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public PictorialBarSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public PictorialBarSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public PictorialBarSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public PictorialBarSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public PictorialBarSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public PictorialBarSeries setEmphasis(PictorialBarEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public PictorialBarSeries setEmphasis(Object emphasis) {
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

    public PictorialBarSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public PictorialBarSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public PictorialBarSeries setData(PictorialBarDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public PictorialBarSeries setData(Number[] data) {
        this.data = data;
        return this;
    }

    public PictorialBarSeries setData(Number[][] data) {
        this.data = data;
        return this;
    }

    public PictorialBarSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public PictorialBarSeries setData(Object[] data) {
        this.data = data;
        return this;
    }

    public PictorialBarSeries setData(Object[][] data) {
        this.data = data;
        return this;
    }

    public PictorialBarSeries setData(String[] data) {
        this.data = data;
        return this;
    }

    public PictorialBarSeries setData(String[][] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public PictorialBarSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public PictorialBarSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public PictorialBarSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public PictorialBarSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public PictorialBarSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public PictorialBarSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public PictorialBarSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public PictorialBarSeries setSelectedMode(String selectedMode) {
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

    public PictorialBarSeries setBarWidth(Number barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    public PictorialBarSeries setBarWidth(String barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object barGap;

    public PictorialBarSeries setBarGap(Number barGap) {
        this.barGap = barGap;
        return this;
    }

    public PictorialBarSeries setBarGap(String barGap) {
        this.barGap = barGap;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object barCategoryGap;

    public PictorialBarSeries setBarCategoryGap(Number barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
        return this;
    }

    public PictorialBarSeries setBarCategoryGap(String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
        return this;
    }

    private Boolean large;

    private Number largeThreshold;

    private BarItemStyleOption itemStyle;

    private BarLabelOption label;

    private String stack;

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public PictorialBarSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public PictorialBarSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private Boolean clip;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public PictorialBarSeries setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public PictorialBarSeries setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public PictorialBarSeries setSymbolSize(String symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public PictorialBarSeries setSymbolSize(String[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private String symbolPosition;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public PictorialBarSeries setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public PictorialBarSeries setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private Number symbolRotate;

    @Setter(AccessLevel.NONE)
    private Object symbolRepeat;

    public PictorialBarSeries setSymbolRepeat(Boolean symbolRepeat) {
        this.symbolRepeat = symbolRepeat;
        return this;
    }

    public PictorialBarSeries setSymbolRepeat(Number symbolRepeat) {
        this.symbolRepeat = symbolRepeat;
        return this;
    }

    public PictorialBarSeries setSymbolRepeat(String symbolRepeat) {
        this.symbolRepeat = symbolRepeat;
        return this;
    }

    private String symbolRepeatDirection;

    @Setter(AccessLevel.NONE)
    private Object symbolMargin;

    public PictorialBarSeries setSymbolMargin(Number symbolMargin) {
        this.symbolMargin = symbolMargin;
        return this;
    }

    public PictorialBarSeries setSymbolMargin(String symbolMargin) {
        this.symbolMargin = symbolMargin;
        return this;
    }

    private Boolean symbolClip;

    @Setter(AccessLevel.NONE)
    private Object symbolBoundingData;

    public PictorialBarSeries setSymbolBoundingData(Number symbolBoundingData) {
        this.symbolBoundingData = symbolBoundingData;
        return this;
    }

    public PictorialBarSeries setSymbolBoundingData(Number[] symbolBoundingData) {
        this.symbolBoundingData = symbolBoundingData;
        return this;
    }

    private Number symbolPatternSize;

    private Boolean hoverAnimation;
}
