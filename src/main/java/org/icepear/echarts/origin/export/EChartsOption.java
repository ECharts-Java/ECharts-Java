package org.icepear.echarts.origin.export;

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
import org.icepear.echarts.origin.util.ECBasicOption;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L246
 */
public interface EChartsOption extends ECBasicOption {

    EChartsOption setDataset(DatasetOption dataset);

    EChartsOption setDataset(DatasetOption[] dataset);

    EChartsOption setAria(Object aria);

    EChartsOption setTitle(TitleOption title);

    EChartsOption setTitle(TitleOption[] title);

    EChartsOption setGrid(GridOption grid);

    EChartsOption setGrid(GridOption[] grid);

    EChartsOption setRadar(RadarOption radar);

    EChartsOption setRadar(RadarOption[] radar);

    EChartsOption setPolar(PolarOption polar);

    EChartsOption setPolar(PolarOption[] polar);

    EChartsOption setGeo(Object geo);

    EChartsOption setGeo(Object[] geo);

    EChartsOption setAngleAxis(AngleAxisOption angleAxis);

    EChartsOption setAngleAxis(AngleAxisOption[] angleAxis);

    EChartsOption setRadiusAxis(RadiusAxisOption radiusAxis);

    EChartsOption setRadiusAxis(RadiusAxisOption[] radiusAxis);

    EChartsOption setXAxis(AxisOption xAxis);

    EChartsOption setXAxis(AxisOption[] xAxis);

    EChartsOption setYAxis(Object yAxis);

    EChartsOption setYAxis(Object[] yAxis);

    EChartsOption setSingleAxis(SingleAxisOption singleAxis);

    EChartsOption setSingleAxis(SingleAxisOption[] singleAxis);

    EChartsOption setParallel(Object parallel);

    EChartsOption setParallel(Object[] parallel);

    EChartsOption setParallelAxis(ParallelAxisOption parallelAxis);

    EChartsOption setParallelAxis(ParallelAxisOption[] parallelAxis);

    EChartsOption setCalendar(Object calendar);

    EChartsOption setCalendar(Object[] calendar);

    EChartsOption setToolbox(ToolboxOption toolbox);

    EChartsOption setToolbox(ToolboxOption[] toolbox);

    EChartsOption setTooltip(TooltipOption tooltip);

    EChartsOption setTooltip(TooltipOption[] tooltip);

    EChartsOption setAxisPointer(AxisPointerOption axisPointer);

    EChartsOption setAxisPointer(AxisPointerOption[] axisPointer);

    EChartsOption setBrush(Object brush);

    EChartsOption setBrush(Object[] brush);

    EChartsOption setTimeline(Object timeline);

    EChartsOption setLegend(LegendOption legend);

    EChartsOption setLegend(LegendOption[] legend);

    EChartsOption setDataZoom(DataZoomOption dataZoom);

    EChartsOption setDataZoom(DataZoomOption[] dataZoom);

    EChartsOption setVisualMap(VisualMapOption visualMap);

    EChartsOption setVisualMap(VisualMapOption[] visualMap);

    EChartsOption setGraphic(Object graphic);

    EChartsOption setGraphic(Object[] graphic);

    EChartsOption setSeries(SeriesOption series);

    EChartsOption setSeries(SeriesOption[] series);

    EChartsOption setOptions(EChartsOption[] options);

    EChartsOption setBaseOption(EChartsOption baseOption);
}
