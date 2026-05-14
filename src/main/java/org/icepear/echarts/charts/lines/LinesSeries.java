package org.icepear.echarts.charts.lines;

import java.io.Serializable;
import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.lines.LinesDataItemOption;
import org.icepear.echarts.origin.chart.lines.LinesEffectOption;
import org.icepear.echarts.origin.chart.lines.LinesEmphasisOption;
import org.icepear.echarts.origin.chart.lines.LinesSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class LinesSeries implements LinesSeriesOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String mainType;

    private String type = "lines";

    @Setter(AccessLevel.NONE)
    private Object id;

    public LinesSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public LinesSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public LinesSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public LinesSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public LinesSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public LinesSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public LinesSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public LinesSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public LinesSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public LinesSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public LinesSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public LinesSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public LinesSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public LinesSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public LinesSeries setEmphasis(LinesEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public LinesSeries setEmphasis(Object emphasis) {
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

    public LinesSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public LinesSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public LinesSeries setData(LinesDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public LinesSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public LinesSeries setData(Object[] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public LinesSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public LinesSeries setProgressive(Number progressive) {
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

    public LinesSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public LinesSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public LinesSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public LinesSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private LineStyleOption lineStyle;

    private SeriesLabelOption label;

    private Number geoIndex;

    private String geoId;

    private Number xAxisIndex;

    private Number yAxisIndex;

    private Number polarIndex;

    private Boolean polyline;

    private LinesEffectOption effect;

    private Boolean large;

    private Number largeThreshold;

    @Setter(AccessLevel.NONE)
    private Object symbol;

    public LinesSeries setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public LinesSeries setSymbol(String[] symbol) {
        this.symbol = symbol;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public LinesSeries setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public LinesSeries setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }
}
