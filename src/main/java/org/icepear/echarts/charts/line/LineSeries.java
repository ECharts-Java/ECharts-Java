package org.icepear.echarts.charts.line;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.line.LineAreaStyleOption;
import org.icepear.echarts.origin.chart.line.LineDataItemOption;
import org.icepear.echarts.origin.chart.line.LineEmphasisOption;
import org.icepear.echarts.origin.chart.line.LineSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.OptionEncode;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class LineSeries implements LineSeriesOption {

    private String mainType;

    private String type = "line";

    @Setter(AccessLevel.NONE)
    private Object id;

    public LineSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public LineSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public LineSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public LineSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public LineSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public LineSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public LineSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public LineSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public LineSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public LineSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public LineSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public LineSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public LineSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public LineSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public LineSeries setEmphasis(LineEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public LineSeries setEmphasis(Object emphasis) {
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

    public LineSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public LineSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public LineSeries setData(LineDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public LineSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public LineSeries setData(Object[] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public LineSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public LineSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public LineSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public LineSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public LineSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public LineSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public LineSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public LineSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object endLabel;

    private Number xAxisIndex;

    private Number yAxisIndex;

    private String xAxisId;

    private String yAxisId;

    private Number polarIndex;

    private String polarId;

    private String stack;

    private String sampling;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public LineSeries setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public LineSeries setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public LineSeries setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public LineSeries setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public LineSeries setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public LineSeries setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public LineSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public LineSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private Boolean clip;

    private LineStyleOption lineStyle;

    private LineAreaStyleOption areaStyle;

    @Setter(AccessLevel.NONE)
    private Object step;

    public LineSeries setStep(Boolean step) {
        this.step = step;
        return this;
    }

    public LineSeries setStep(String step) {
        this.step = step;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object smooth;

    public LineSeries setSmooth(Boolean smooth) {
        this.smooth = smooth;
        return this;
    }

    public LineSeries setSmooth(Number smooth) {
        this.smooth = smooth;
        return this;
    }

    private String smoothMonotone;

    private Boolean connectNulls;

    private Boolean showSymbol;

    @Setter(AccessLevel.NONE)
    private Object showAllSymbol;

    public LineSeries setShowAllSymbol(Boolean showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
        return this;
    }

    public LineSeries setShowAllSymbol(String showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
        return this;
    }

    private Boolean triggerLineEvent;
}
