package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.coord.cartesian.XAxisOption;
import org.icepear.echarts.origin.coord.cartesian.YAxisOption;
import org.icepear.echarts.origin.export.EChartsOption;
import org.icepear.echarts.origin.util.AnimationOption;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.SeriesOption;

import lombok.Data;

@Data
public class Option implements EChartsOption {
    private List<Object> dataset = null;

    private Object aria = null;

    private List<TitleOption> title = null;

    private List<Grid> grid = null;

    private List<Object> radar = null;

    private List<Object> polar = null;

    private List<Object> geo = null;

    private List<Object> angleAxis = null;

    private List<Object> radiusAxis = null;

    private List<XAxisOption> xAxis = null;

    private List<YAxisOption> yAxis = null;

    private List<Object> singleAxis = null;

    private List<Object> parallel = null;

    private List<Object> parallelAxis = null;

    private List<Object> calendar = null;

    private List<Object> toolbox = null;

    private List<TooltipOption> tooltip = null;

    private List<Object> axisPointer = null;

    private List<Object> brush = null;

    private List<LegendOption> legend = null;

    private List<Object> dataZoom = null;

    private List<Object> visualMap = null;

    private List<Object> graphic = null;

    private List<SeriesOption> series = null;

    private Object baseOption = null;

    private Object options = null;

    private Object media = null;

    private List<ComponentOption> timeline = null;

    private String backgroundColor = null;

    private String darkMode = null;

    private Object textStyle = null;

    private Boolean useUTC = null;

    private AnimationOption stateAnimation = null;

    private String animation = null;

    private Number animationThreshold = null;

    private Number animationDuration = null;

    private String animationEasing = null;

    private Number animationDelay = null;

    private Number animationDurationUpdate = null;

    private String animationEasingUpdate = null;

    private Number animationDelayUpdate = null;

    private List<String> color = null;

    private List<List<String>> colorLayer = null;
}
