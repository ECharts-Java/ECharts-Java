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
public interface EChartsOption extends ECBasicOption {
    @Getter
    @Setter
    public List<Object> dataset = null;

    @Getter
    @Setter
    public Object aria = null;

    @Getter
    @Setter
    public List<Object> title = null;

    @Getter
    @Setter
    public List<Object> grid = null;

    @Getter
    @Setter
    public List<Object> radar = null;

    @Getter
    @Setter
    public List<Object> polar = null;

    @Getter
    @Setter
    public List<Object> geo = null;

    @Getter
    @Setter
    public List<Object> angleAxis = null;

    @Getter
    @Setter
    public List<Object> radiusAxis = null;

    @Getter
    @Setter
    public List<XAxisOption> xAxis = null;

    @Getter
    @Setter
    public List<YAxisOption> yAxis = null;

    @Getter
    @Setter
    public List<Object> singleAxis = null;

    @Getter
    @Setter
    public List<Object> parallel = null;

    @Getter
    @Setter
    public List<Object> parallelAxis = null;

    @Getter
    @Setter
    public List<Object> calendar = null;

    @Getter
    @Setter
    public List<Object> toolbox = null;

    @Getter
    @Setter
    public List<Object> tooltip = null;

    @Getter
    @Setter
    public List<Object> axisPointer = null;

    @Getter
    @Setter
    public List<Object> brush = null;

    @Getter
    @Setter
    public List<Object> legend = null;

    @Getter
    @Setter
    public List<Object> dataZoom = null;

    @Getter
    @Setter
    public List<Object> visualMap = null;

    @Getter
    @Setter
    public List<Object> graphic = null;

    @Getter
    @Setter
    public List<SeriesOption> series = null;
}
