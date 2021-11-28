package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.chart.bar.BackgroundStyleOption;
import org.icepear.echarts.origin.chart.bar.BarSeriesOption;
import org.icepear.echarts.origin.util.EmphasisOption;

import lombok.Data;

@Data
public class BarSeries implements BarSeriesOption {
    private Boolean clip;

    private Boolean roundCap;

    private Boolean showBackground;

    private BackgroundStyleOption backgroundStyle;

    private Boolean realtimeSort;

    private Number barMinHeight;

    private Number barMinAngle;

    private Number barMaxWidth;

    private Number barMinWidth;

    private Number barWidth;

    private Number barGap;

    private Number barCategoryGap;

    private Boolean large;
    
    private Number largeThreshold;

    private Boolean silent;

    private String blendMode;

    private String cursor;

    private String dataGroupId;

    private List<Object> data;

    private String colorBy;

    private Boolean legendHoverLink;

    private Number progressive;

    private Number progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Number hoverLayerThreshold;

    private String seriesLayoutBy;

    private Object labelLine;

    private Object labelLayout;

    private Object stateAnimation;

    private Object universalTransition;

    private Map<String, Boolean> selectedMap;

    private String selectedMode;

    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

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

    private EmphasisOption emphasis;

    private Object select;

    private Object blur;

    private Number xAxisIndex;

    private Number yAxisIndex;

    private String xAxisId;

    private String yAxisId;

    private Number polarIndex;

    private String polarId;

    private Object itemStyle;
    
    private Object label;

    private String stack;

    private String sampling;

    private Number datasetIndex;

    private String datasetId;

    private String sourceHeader;

    private List<Object> dimensions;

    private String encode;
}
