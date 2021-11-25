package org.icepear.echarts.export;

import java.util.List;

import org.icepear.echarts.coord.cartesian.XAxisOption;
import org.icepear.echarts.coord.cartesian.YAxisOption;
import org.icepear.echarts.util.ECBasicOption;
import org.icepear.echarts.util.SeriesOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L246
 */
@Getter
@Setter
public class EChartsOption  {
    private ECBasicOption ecBasicOption;

    private List<Object> dataset;

    private Object aria;

    private List<Object> title;

    private List<Object> grid;

    private List<Object> radar;

    private List<Object> polar;

    private List<Object> geo;

    private List<Object> angleAxis;

    private List<Object> radiusAxis;

    private List<XAxisOption> xAxis;

    private List<YAxisOption> yAxis;

    private List<Object> singleAxis;

    private List<Object> parallel;

    private List<Object> parallelAxis;

    private List<Object> calendar;

    private List<Object> toolbox;

    private List<Object> tooltip;

    private List<Object> axisPointer;

    private List<Object> brush;

    private List<Object> timeline;

    private List<Object>  legend;

    private List<Object>  dataZoom;

    private List<Object> visualMap;

    private List<Object> graphic;

    private List<SeriesOption> series;
}
