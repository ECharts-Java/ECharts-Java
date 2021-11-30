package org.icepear.echarts.origin.export;

import java.util.List;

import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.origin.component.toolbox.ToolboxOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.coord.cartesian.AxisOption;
import org.icepear.echarts.origin.coord.cartesian.GridOption;
import org.icepear.echarts.origin.util.ECBasicOption;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L246
 */
public interface EChartsOption extends ECBasicOption {
    EChartsOption setDataset(List<Object> dataset);

    EChartsOption setAria(Object aria);

    EChartsOption setTitle(TitleOption title);

    EChartsOption setTitle(List<TitleOption> title);

    EChartsOption setGrid(GridOption grid);

    EChartsOption setGrid(List<GridOption> grid);

    EChartsOption setRadar(List<Object> radar);

    EChartsOption setPolar(List<Object> polar);

    EChartsOption setGeo(List<Object> geo);

    EChartsOption setAngleAxis(List<Object> angleAxis);

    EChartsOption setRadiusAxis(List<Object> radiusAxis);

    EChartsOption setXAxis(AxisOption xAxis);

    EChartsOption setXAxis(List<AxisOption> xAxis);

    EChartsOption setYAxis(AxisOption yAxis);

    EChartsOption setYAxis(List<AxisOption> yAxis);

    EChartsOption setSingleAxis(List<Object> singleAxis);

    EChartsOption setParallel(List<Object> parallel);

    EChartsOption setParallelAxis(List<Object> parallelAxis);

    EChartsOption setCalendar(List<Object> calendar);

    EChartsOption setToolbox(ToolboxOption toolbox);

    EChartsOption setToolbox(List<ToolboxOption> toolbox);

    EChartsOption setTooltip(TooltipOption tooltip);

    EChartsOption setTooltip(List<TooltipOption> tooltip);

    EChartsOption setAxisPointer(List<Object> axisPointer);

    EChartsOption setBrush(List<Object> brush);

    EChartsOption setLegend(LegendOption legend);

    EChartsOption setLegend(List<LegendOption> legend);

    EChartsOption setDataZoom(List<Object> dataZoom);

    EChartsOption setVisualMap(List<Object> visualMap);

    EChartsOption setGraphic(List<Object> graphic);

    EChartsOption setSeries(List<SeriesOption> series);
}
