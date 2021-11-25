package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.coord.cartesian.XAxisOption;
import org.icepear.echarts.origin.coord.cartesian.YAxisOption;
import org.icepear.echarts.origin.export.EChartsOption;
import org.icepear.echarts.origin.util.AnimationOption;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.SeriesOption;

import lombok.Getter;
import lombok.Setter;

public class Option implements EChartsOption {
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

    @Getter
    @Setter
    public Object baseOption = null;

    @Getter
    @Setter
    public Object options = null;

    @Getter
    @Setter
    public Object media = null;

    @Getter
    @Setter
    public List<ComponentOption> timeline = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public String darkMode = null;

    @Getter
    @Setter
    public Object textStyle = null;

    @Getter
    @Setter
    public Boolean useUTC = null;

    @Getter
    @Setter
    public AnimationOption stateAnimation = null;

    @Getter
    @Setter
    public String animation = null;

    @Getter
    @Setter
    public Integer animationThreshold = null;

    @Getter
    @Setter
    public Integer animationDuration = null;

    @Getter
    @Setter
    public String animationEasing = null;

    @Getter
    @Setter
    public Integer animationDelay = null;

    @Getter
    @Setter
    public Integer animationDurationUpdate = null;

    @Getter
    @Setter
    public String animationEasingUpdate = null;

    @Getter
    @Setter
    public Integer animationDelayUpdate = null;

    @Getter
    @Setter
    public List<String> color = null;

    @Getter
    @Setter
    public List<List<String>> colorLayer = null;
}
