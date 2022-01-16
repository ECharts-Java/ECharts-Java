package org.icepear.echarts.charts.themeRiver;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.themeRiver.ThemeRiverEmphasisOption;
import org.icepear.echarts.origin.chart.themeRiver.ThemeRiverLabelOption;
import org.icepear.echarts.origin.chart.themeRiver.ThemeRiverSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;

@Accessors(chain = true)
@Data
public class ThemeRiverSeries implements ThemeRiverSeriesOption {

    private String mainType;

    private String type = "themeRiver";

    @Setter(AccessLevel.NONE)
    private Object id;

    public ThemeRiverSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public ThemeRiverSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public ThemeRiverSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public ThemeRiverSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public ThemeRiverSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public ThemeRiverSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public ThemeRiverSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public ThemeRiverSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public ThemeRiverSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public ThemeRiverSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public ThemeRiverSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public ThemeRiverSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public ThemeRiverSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public ThemeRiverSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public ThemeRiverSeries setEmphasis(Object emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public ThemeRiverSeries setEmphasis(ThemeRiverEmphasisOption emphasis) {
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

    public ThemeRiverSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public ThemeRiverSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public ThemeRiverSeries setData(Object data) {
        this.data = data;
        return this;
    }

    public ThemeRiverSeries setData(Object[][] data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public ThemeRiverSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public ThemeRiverSeries setProgressive(Number progressive) {
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

    public ThemeRiverSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public ThemeRiverSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public ThemeRiverSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public ThemeRiverSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private ThemeRiverLabelOption label;

    private ItemStyleOption itemStyle;

    private Number singleAxisIndex;

    private String singleAxisId;

    @Setter(AccessLevel.NONE)
    private Object width;

    public ThemeRiverSeries setWidth(Number width) {
        this.width = width;
        return this;
    }

    public ThemeRiverSeries setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public ThemeRiverSeries setHeight(Number height) {
        this.height = height;
        return this;
    }

    public ThemeRiverSeries setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public ThemeRiverSeries setTop(Number top) {
        this.top = top;
        return this;
    }

    public ThemeRiverSeries setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public ThemeRiverSeries setRight(Number right) {
        this.right = right;
        return this;
    }

    public ThemeRiverSeries setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public ThemeRiverSeries setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public ThemeRiverSeries setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public ThemeRiverSeries setLeft(Number left) {
        this.left = left;
        return this;
    }

    public ThemeRiverSeries setLeft(String left) {
        this.left = left;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object boundaryGap;

    public ThemeRiverSeries setBoundaryGap(Number[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public ThemeRiverSeries setBoundaryGap(String[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }
}
