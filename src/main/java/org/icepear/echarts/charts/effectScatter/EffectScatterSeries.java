package org.icepear.echarts.charts.effectScatter;

import java.io.Serializable;
import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.effectScatter.EffectScatterDataItemOption;
import org.icepear.echarts.origin.chart.effectScatter.EffectScatterEmphasisOption;
import org.icepear.echarts.origin.chart.effectScatter.EffectScatterSeriesOption;
import org.icepear.echarts.origin.chart.effectScatter.RippleEffectOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.OptionEncode;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class EffectScatterSeries implements EffectScatterSeriesOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String mainType;

    private String type = "effectScatter";

    @Setter(AccessLevel.NONE)
    private Object id;

    public EffectScatterSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public EffectScatterSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public EffectScatterSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public EffectScatterSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public EffectScatterSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public EffectScatterSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public EffectScatterSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public EffectScatterSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public EffectScatterSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public EffectScatterSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public EffectScatterSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public EffectScatterSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public EffectScatterSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public EffectScatterSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public EffectScatterSeries setEmphasis(Object emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public EffectScatterSeries setEmphasis(EffectScatterEmphasisOption emphasis) {
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

    public EffectScatterSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public EffectScatterSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public EffectScatterSeries setData(Number[] data) {
        this.data = data;
        return this;
    }

    public EffectScatterSeries setData(Number[][] data) {
        this.data = data;
        return this;
    }

    public EffectScatterSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public EffectScatterSeries setData(Object[] data) {
        this.data = data;
        return this;
    }

    public EffectScatterSeries setData(Object[][] data) {
        this.data = data;
        return this;
    }

    public EffectScatterSeries setData(EffectScatterDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public EffectScatterSeries setData(String[] data) {
        this.data = data;
        return this;
    }

    public EffectScatterSeries setData(String[][] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public EffectScatterSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public EffectScatterSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public EffectScatterSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public EffectScatterSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public EffectScatterSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public EffectScatterSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public EffectScatterSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public EffectScatterSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

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

    public EffectScatterSeries setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public EffectScatterSeries setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public EffectScatterSeries setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public EffectScatterSeries setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public EffectScatterSeries setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public EffectScatterSeries setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public EffectScatterSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public EffectScatterSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private Boolean clip;

    private String effectType;

    private String showEffectOn;

    private RippleEffectOption rippleEffect;
}
