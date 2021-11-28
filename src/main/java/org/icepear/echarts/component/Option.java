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
    private List<Object> dataset;

    private Object aria;

    private List<TitleOption> title;

    private List<Grid> grid;

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

    private List<TooltipOption> tooltip;

    private List<Object> axisPointer;

    private List<Object> brush;

    private List<LegendOption> legend;

    private List<Object> dataZoom;

    private List<Object> visualMap;

    private List<Object> graphic;

    private List<SeriesOption> series;

    private Object baseOption;

    private Object options;

    private Object media;

    private List<ComponentOption> timeline;

    private String backgroundColor;

    private String darkMode;

    private Object textStyle;

    private Boolean useUTC;

    private AnimationOption stateAnimation;

    private String animation;

    private Number animationThreshold;

    private Number animationDuration;

    private String animationEasing;

    private Number animationDelay;

    private Number animationDurationUpdate;

    private String animationEasingUpdate;

    private Number animationDelayUpdate;

    private List<String> color;

    private List<List<String>> colorLayer;
}
