package org.icepear.echarts.charts.candlestick;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.candlestick.CandlestickDataItemOption;
import org.icepear.echarts.origin.chart.candlestick.CandlestickEmphasisOption;
import org.icepear.echarts.origin.chart.candlestick.CandlestickItemStyleOption;
import org.icepear.echarts.origin.chart.candlestick.CandlestickSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.OptionEncode;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class CandlestickSeries implements CandlestickSeriesOption {

    private String mainType;

    private String type = "candlestick";

    @Setter(AccessLevel.NONE)
    private Object id;

    public CandlestickSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public CandlestickSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public CandlestickSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public CandlestickSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public CandlestickSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public CandlestickSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public CandlestickSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public CandlestickSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public CandlestickSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public CandlestickSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public CandlestickSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public CandlestickSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public CandlestickSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public CandlestickSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public CandlestickSeries setEmphasis(CandlestickEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public CandlestickSeries setEmphasis(Object emphasis) {
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

    public CandlestickSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public CandlestickSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public CandlestickSeries setData(CandlestickDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public CandlestickSeries setData(Number[][] data) {
        this.data = data;
        return this;
    }

    public CandlestickSeries setData(Object data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public CandlestickSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public CandlestickSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public CandlestickSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public CandlestickSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public CandlestickSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public CandlestickSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public CandlestickSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public CandlestickSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private CandlestickItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Number xAxisIndex;

    private Number yAxisIndex;

    private String xAxisId;

    private String yAxisId;

    private Boolean large;

    private Number largeThreshold;

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public CandlestickSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public CandlestickSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private String layout;

    private Boolean clip;

    @Setter(AccessLevel.NONE)
    private Object barMaxWidth;

    public CandlestickSeries setBarMaxWidth(Number barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }

    public CandlestickSeries setBarMaxWidth(String barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object barMinWidth;

    public CandlestickSeries setBarMinWidth(Number barMinWidth) {
        this.barMinWidth = barMinWidth;
        return this;
    }

    public CandlestickSeries setBarMinWidth(String barMinWidth) {
        this.barMinWidth = barMinWidth;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object barWidth;

    public CandlestickSeries setBarWidth(Number barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    public CandlestickSeries setBarWidth(String barWidth) {
        this.barWidth = barWidth;
        return this;
    }
}
