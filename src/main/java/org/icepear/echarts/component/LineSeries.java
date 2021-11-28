package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.chart.line.LineSeriesOption;
import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.origin.util.LabelOption;

import lombok.Data;

@Data
public class LineSeries implements LineSeriesOption {
    private Boolean clip = null;

    private Object lineStyle = null;

    private AreaStyleOption areaStyle = null;

    private String step = null;

    private Boolean smooth = null;

    private String smoothMonotone = null;

    private Boolean connectNulls = null;

    private Boolean showSymbol = null;

    private Boolean showAllSymbol = null;

    private Boolean triggerLineEvent = null;

    private Boolean silent = null;

    private String blendMode = null;

    private String cursor = null;

    private String dataGroupId = null;

    private Object data = null;

    private String colorBy = null;

    private Boolean legendHoverLink = null;

    private Number progressive = null;

    private Number progressiveThreshold = null;

    private String progressiveChunkMode = null;

    private String coordinateSystem = null;

    private Number hoverLayerThreshold = null;

    private String seriesLayoutBy = null;

    private Object labelLine = null;

    private Object labelLayout = null;

    private Object stateAnimation = null;

    private Object universalTransition = null;

    private Map<String, Boolean> selectedMap = null;

    private String selectedMode = null;

    private String mainType = null;

    private String type = null;

    private String id = null;

    private String name = null;

    private Number z = null;

    private Number zlevel = null;

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

    private EmphasisOption emphasis = null;

    private Object select = null;

    private Object blur = null;

    private Object itemStyle = null;

    private LabelOption label = null;

    private LabelOption endLabel = null;

    private Number xAxisIndex = null;

    private Number yAxisIndex = null;

    private String xAxisId = null;

    private String yAxisId = null;

    private Number polarIndex = null;

    private String polarId = null;

    private String stack = null;

    private String sampling = null;

    private String symbol = null;

    private Number symbolSize = null;

    private Number symbolRotate = null;

    private Boolean symbolKeepAspect = null;

    private Number symbolOffset = null;

    private Number datasetIndex = null;

    private String datasetId = null;

    private String sourceHeader = null;

    private List<Object> dimensions = null;

    private String encode = null;
}
