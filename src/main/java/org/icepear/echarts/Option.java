package org.icepear.echarts;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.axisPointer.AxisPointerOption;
import org.icepear.echarts.origin.component.dataZoom.DataZoomOption;
import org.icepear.echarts.origin.component.dataset.DatasetOption;
import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.origin.component.toolbox.ToolboxOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.component.visualMap.VisualMapOption;
import org.icepear.echarts.origin.coord.cartesian.AxisOption;
import org.icepear.echarts.origin.coord.cartesian.GridOption;
import org.icepear.echarts.origin.coord.parallel.ParallelAxisOption;
import org.icepear.echarts.origin.coord.polar.AngleAxisOption;
import org.icepear.echarts.origin.coord.polar.PolarOption;
import org.icepear.echarts.origin.coord.polar.RadiusAxisOption;
import org.icepear.echarts.origin.coord.radar.RadarOption;
import org.icepear.echarts.origin.coord.single.SingleAxisOption;
import org.icepear.echarts.origin.export.EChartsOption;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.ECUnitOption;
import org.icepear.echarts.origin.util.MediaUnitOption;
import org.icepear.echarts.origin.util.SeriesOption;

@Accessors(chain = true)
@Data
public class Option implements EChartsOption {

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public Option setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public Option setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public Option setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public Option setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public Option setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public Option setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public Option setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public Option setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object color;

    public Option setColor(String color) {
        this.color = color;
        return this;
    }

    public Option setColor(String[] color) {
        this.color = color;
        return this;
    }

    private String[][] colorLayer;

    @Setter(AccessLevel.NONE)
    private Object baseOption;

    public Option setBaseOption(ECUnitOption baseOption) {
        this.baseOption = baseOption;
        return this;
    }

    public Option setBaseOption(EChartsOption baseOption) {
        this.baseOption = baseOption;
        return this;
    }

    public Option setBaseOption(Object baseOption) {
        this.baseOption = baseOption;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object options;

    public Option setOptions(ECUnitOption[] options) {
        this.options = options;
        return this;
    }

    public Option setOptions(EChartsOption[] options) {
        this.options = options;
        return this;
    }

    public Option setOptions(Object options) {
        this.options = options;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object media;

    public Option setMedia(MediaUnitOption[] media) {
        this.media = media;
        return this;
    }

    public Option setMedia(Object media) {
        this.media = media;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object timeline;

    public Option setTimeline(ComponentOption timeline) {
        this.timeline = timeline;
        return this;
    }

    public Option setTimeline(ComponentOption[] timeline) {
        this.timeline = timeline;
        return this;
    }

    public Option setTimeline(Object timeline) {
        this.timeline = timeline;
        return this;
    }

    private String backgroundColor;

    @Setter(AccessLevel.NONE)
    private Object darkMode;

    public Option setDarkMode(Boolean darkMode) {
        this.darkMode = darkMode;
        return this;
    }

    public Option setDarkMode(String darkMode) {
        this.darkMode = darkMode;
        return this;
    }

    private Object textStyle;

    private Boolean useUTC;

    private Object stateAnimation;

    @Setter(AccessLevel.NONE)
    private Object dataset;

    public Option setDataset(DatasetOption dataset) {
        this.dataset = dataset;
        return this;
    }

    public Option setDataset(DatasetOption[] dataset) {
        this.dataset = dataset;
        return this;
    }

    private Object aria;

    @Setter(AccessLevel.NONE)
    private Object title;

    public Option setTitle(TitleOption title) {
        this.title = title;
        return this;
    }

    public Option setTitle(TitleOption[] title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object grid;

    public Option setGrid(GridOption grid) {
        this.grid = grid;
        return this;
    }

    public Option setGrid(GridOption[] grid) {
        this.grid = grid;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radar;

    public Option setRadar(RadarOption radar) {
        this.radar = radar;
        return this;
    }

    public Option setRadar(RadarOption[] radar) {
        this.radar = radar;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object polar;

    public Option setPolar(PolarOption polar) {
        this.polar = polar;
        return this;
    }

    public Option setPolar(PolarOption[] polar) {
        this.polar = polar;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object geo;

    public Option setGeo(Object geo) {
        this.geo = geo;
        return this;
    }

    public Option setGeo(Object[] geo) {
        this.geo = geo;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object angleAxis;

    public Option setAngleAxis(AngleAxisOption angleAxis) {
        this.angleAxis = angleAxis;
        return this;
    }

    public Option setAngleAxis(AngleAxisOption[] angleAxis) {
        this.angleAxis = angleAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radiusAxis;

    public Option setRadiusAxis(RadiusAxisOption radiusAxis) {
        this.radiusAxis = radiusAxis;
        return this;
    }

    public Option setRadiusAxis(RadiusAxisOption[] radiusAxis) {
        this.radiusAxis = radiusAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object xAxis;

    public Option setXAxis(AxisOption xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public Option setXAxis(AxisOption[] xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object yAxis;

    public Option setYAxis(Object yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public Option setYAxis(Object[] yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object singleAxis;

    public Option setSingleAxis(SingleAxisOption singleAxis) {
        this.singleAxis = singleAxis;
        return this;
    }

    public Option setSingleAxis(SingleAxisOption[] singleAxis) {
        this.singleAxis = singleAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object parallel;

    public Option setParallel(Object parallel) {
        this.parallel = parallel;
        return this;
    }

    public Option setParallel(Object[] parallel) {
        this.parallel = parallel;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object parallelAxis;

    public Option setParallelAxis(ParallelAxisOption parallelAxis) {
        this.parallelAxis = parallelAxis;
        return this;
    }

    public Option setParallelAxis(ParallelAxisOption[] parallelAxis) {
        this.parallelAxis = parallelAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object calendar;

    public Option setCalendar(Object calendar) {
        this.calendar = calendar;
        return this;
    }

    public Option setCalendar(Object[] calendar) {
        this.calendar = calendar;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object toolbox;

    public Option setToolbox(ToolboxOption toolbox) {
        this.toolbox = toolbox;
        return this;
    }

    public Option setToolbox(ToolboxOption[] toolbox) {
        this.toolbox = toolbox;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object tooltip;

    public Option setTooltip(TooltipOption tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Option setTooltip(TooltipOption[] tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object axisPointer;

    public Option setAxisPointer(AxisPointerOption axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    public Option setAxisPointer(AxisPointerOption[] axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object brush;

    public Option setBrush(Object brush) {
        this.brush = brush;
        return this;
    }

    public Option setBrush(Object[] brush) {
        this.brush = brush;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object legend;

    public Option setLegend(LegendOption legend) {
        this.legend = legend;
        return this;
    }

    public Option setLegend(LegendOption[] legend) {
        this.legend = legend;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object dataZoom;

    public Option setDataZoom(DataZoomOption dataZoom) {
        this.dataZoom = dataZoom;
        return this;
    }

    public Option setDataZoom(DataZoomOption[] dataZoom) {
        this.dataZoom = dataZoom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object visualMap;

    public Option setVisualMap(VisualMapOption visualMap) {
        this.visualMap = visualMap;
        return this;
    }

    public Option setVisualMap(VisualMapOption[] visualMap) {
        this.visualMap = visualMap;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object graphic;

    public Option setGraphic(Object graphic) {
        this.graphic = graphic;
        return this;
    }

    public Option setGraphic(Object[] graphic) {
        this.graphic = graphic;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object series;

    public Option setSeries(SeriesOption series) {
        this.series = series;
        return this;
    }

    public Option setSeries(SeriesOption[] series) {
        this.series = series;
        return this;
    }
}
