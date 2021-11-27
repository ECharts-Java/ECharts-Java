package org.icepear.echarts.origin.export;

import java.util.List;

import org.icepear.echarts.component.Grid;
import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.coord.cartesian.XAxisOption;
import org.icepear.echarts.origin.coord.cartesian.YAxisOption;
import org.icepear.echarts.origin.util.ECBasicOption;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L246
 */
public interface EChartsOption extends ECBasicOption {
    void setDataset(List<Object> dataset);

    void setAria(Object aria);

    void setTitle(List<TitleOption> title);

    void setGrid(List<Grid> grid);

    void setRadar(List<Object> radar);

    void setPolar(List<Object> polar);

    void setGeo(List<Object> geo);

    void setAngleAxis(List<Object> angleAxis);

    void setRadiusAxis(List<Object> radiusAxis);

    void setXAxis(List<XAxisOption> xAxis);

    void setYAxis(List<YAxisOption> yAxis);

    void setSingleAxis(List<Object> singleAxis);

    void setParallel(List<Object> parallel);

    void setParallelAxis(List<Object> parallelAxis);

    void setCalendar(List<Object> calendar);

    void setToolbox(List<Object> toolbox);

    void setTooltip(List<TooltipOption> tooltip);

    void setAxisPointer(List<Object> axisPointer);

    void setBrush(List<Object> brush);

    void setLegend(List<LegendOption> legend);

    void setDataZoom(List<Object> dataZoom);

    void setVisualMap(List<Object> visualMap);

    void setGraphic(List<Object> graphic);

    void setSeries(List<SeriesOption> series);
}
