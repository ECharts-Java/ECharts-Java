package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.chart.line.LineSeriesOption;
import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;
import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.origin.util.LabelOption;
import org.icepear.echarts.origin.util.LineStyleOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class LineSeries implements LineSeriesOption {
    private Boolean clip;

    private LineStyleOption lineStyle;

    private AreaStyleOption areaStyle;

    private String step;

    private Boolean smooth;

    private String smoothMonotone;

    private Boolean connectNulls;

    private Boolean showSymbol;

    private Boolean showAllSymbol;

    private Boolean triggerLineEvent;

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

    private Object itemStyle;

    private LabelOption label;

    private LabelOption endLabel;

    private Number xAxisIndex;

    private Number yAxisIndex;

    private String xAxisId;

    private String yAxisId;

    private Number polarIndex;

    private String polarId;

    private String stack;

    private String sampling;

    private String symbol;

    private Number symbolSize;

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    private Number symbolOffset;

    private Number datasetIndex;

    private String datasetId;

    private String sourceHeader;

    private List<Object> dimensions;

    private String encode;

    private MarkAreaOption markArea;

    private MarkLineOption markLine;

    private MarkPointOption markPoint;

    private Object tooltip;
}
