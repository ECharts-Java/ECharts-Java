package org.icepear.echarts.charts.map;

import java.io.Serializable;
import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.map.MapDataItemOption;
import org.icepear.echarts.origin.chart.map.MapEmphasisOption;
import org.icepear.echarts.origin.chart.map.MapItemStyleOption;
import org.icepear.echarts.origin.chart.map.MapSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.LabelLayoutOption;
import org.icepear.echarts.origin.util.LabelLineOption;
import org.icepear.echarts.origin.util.OptionEncode;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class MapSeries implements MapSeriesOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String mainType;

    private String type = "map";

    @Setter(AccessLevel.NONE)
    private Object id;

    public MapSeries setId(Number id) {
        this.id = id;
        return this;
    }

    public MapSeries setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public MapSeries setName(Number name) {
        this.name = name;
        return this;
    }

    public MapSeries setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public MapSeries setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public MapSeries setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public MapSeries setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public MapSeries setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public MapSeries setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public MapSeries setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public MapSeries setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public MapSeries setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public MapSeries setColor(String color) {
        this.color = color;
        return this;
    }

    public MapSeries setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object emphasis;

    public MapSeries setEmphasis(MapEmphasisOption emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public MapSeries setEmphasis(Object emphasis) {
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

    public MapSeries setDataGroupId(Number dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    public MapSeries setDataGroupId(String dataGroupId) {
        this.dataGroupId = dataGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object data;

    public MapSeries setData(MapDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public MapSeries setData(Object data) {
        this.data = data;
        return this;
    }

    private String colorBy;

    private Boolean legendHoverLink;

    @Setter(AccessLevel.NONE)
    private Object progressive;

    public MapSeries setProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

    public MapSeries setProgressive(Number progressive) {
        this.progressive = progressive;
        return this;
    }

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    @Setter(AccessLevel.NONE)
    private Object seriesLayoutBy;

    public MapSeries setSeriesLayoutBy(Object seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public MapSeries setSeriesLayoutBy(String seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    private LabelLineOption labelLine;

    private LabelLayoutOption labelLayout;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object universalTransition;

    public MapSeries setUniversalTransition(Boolean universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    public MapSeries setUniversalTransition(Object universalTransition) {
        this.universalTransition = universalTransition;
        return this;
    }

    private Map<String, Boolean> selectedMap;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public MapSeries setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public MapSeries setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private MapItemStyleOption itemStyle;

    private SeriesLabelOption label;

    @Setter(AccessLevel.NONE)
    private Object width;

    public MapSeries setWidth(Number width) {
        this.width = width;
        return this;
    }

    public MapSeries setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public MapSeries setHeight(Number height) {
        this.height = height;
        return this;
    }

    public MapSeries setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public MapSeries setTop(Number top) {
        this.top = top;
        return this;
    }

    public MapSeries setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public MapSeries setRight(Number right) {
        this.right = right;
        return this;
    }

    public MapSeries setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public MapSeries setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public MapSeries setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public MapSeries setLeft(Number left) {
        this.left = left;
        return this;
    }

    public MapSeries setLeft(String left) {
        this.left = left;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object roam;

    public MapSeries setRoam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public MapSeries setRoam(String roam) {
        this.roam = roam;
        return this;
    }

    private Number[] center;

    private Number zoom;

    private Object scaleLimit;

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public MapSeries setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public MapSeries setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    private String map;

    private Number aspectScale;

    private Number[][] boundingCoords;

    private String[] layoutCenter;

    @Setter(AccessLevel.NONE)
    private Object layoutSize;

    public MapSeries setLayoutSize(Number layoutSize) {
        this.layoutSize = layoutSize;
        return this;
    }

    public MapSeries setLayoutSize(String layoutSize) {
        this.layoutSize = layoutSize;
        return this;
    }

    private Number geoIndex;

    private String mapValueCalculation;

    private Boolean showLegendSymbol;

    private Object projection;

    private Object nameMap;

    private String nameProperty;
}
