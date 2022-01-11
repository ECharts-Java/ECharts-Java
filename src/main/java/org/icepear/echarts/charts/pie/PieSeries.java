package org.icepear.echarts.charts.pie;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.pie.PieDataItemOption;
import org.icepear.echarts.origin.chart.pie.PieEmphasisOption;
import org.icepear.echarts.origin.chart.pie.PieItemStyleOption;
import org.icepear.echarts.origin.chart.pie.PieLabelOption;
import org.icepear.echarts.origin.chart.pie.PieSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.OptionEncode;

@Accessors(chain = true)
@Data
public class PieSeries implements PieSeriesOption {

    private String mainType;

    private String type = "pie";

    @Setter(AccessLevel.NONE)
    private Object id;

    public PieSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public PieSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public PieSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public PieSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public PieSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public PieSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public PieSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public PieSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public PieSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public PieSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public PieSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public PieSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public PieSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public PieSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public PieSeries setEmphasis(Object emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public PieSeries setEmphasis(PieEmphasisOption emphasis) {
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

    public PieSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public PieSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public PieSeries setData(Number[] data) {
        this.data = data;
        return this;
    }

    public PieSeries setData(Number[][] data) {
        this.data = data;
        return this;
    }

    public PieSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public PieSeries setData(PieDataItemOption[] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public PieSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public PieSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public PieSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public PieSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public PieSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public PieSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public PieSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public PieSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private PieItemStyleOption itemStyle;

    private PieLabelOption label;

    @Setter(AccessLevel.NONE)
    private Object center;

    public PieSeries setCenter(Number[] center) {
        this.center = center;
        return this;
    }

    public PieSeries setCenter(String[] center) {
        this.center = center;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radius;

    public PieSeries setRadius(Number radius) {
        this.radius = radius;
        return this;
    }

    public PieSeries setRadius(Number[] radius) {
        this.radius = radius;
        return this;
    }

    public PieSeries setRadius(Object[] radius) {
        this.radius = radius;
        return this;
    }

    public PieSeries setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public PieSeries setRadius(String[] radius) {
        this.radius = radius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object width;

    public PieSeries setWidth(Number width) {
        this.width = width;
        return this;
    }

    public PieSeries setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public PieSeries setHeight(Number height) {
        this.height = height;
        return this;
    }

    public PieSeries setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public PieSeries setTop(Number top) {
        this.top = top;
        return this;
    }

    public PieSeries setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public PieSeries setRight(Number right) {
        this.right = right;
        return this;
    }

    public PieSeries setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public PieSeries setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public PieSeries setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public PieSeries setLeft(Number left) {
        this.left = left;
        return this;
    }

    public PieSeries setLeft(String left) {
        this.left = left;
        return this;
    }

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public PieSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public PieSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private String roseType;

    private Boolean clockwise;

    private Number startAngle;

    private Number minAngle;

    private Number minShowLabelAngle;

    private Number selectedOffset;

    private Boolean avoidLabelOverlap;

    private Number percentPrecision;

    private Boolean stillShowZeroSum;

    private String animationType;

    private String animationTypeUpdate;

    private Boolean showEmptyCircle;

    private PieItemStyleOption emptyCircleStyle;
}
