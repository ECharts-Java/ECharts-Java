package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.chart.pie.PieSeriesOption;
import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.type.BoxLength;
import org.icepear.echarts.type.EChartsNumber;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class PieSeries implements PieSeriesOption {
    private String roseType;

    private Boolean clockwise;

    private Number startAngle;

    private Number minAngle;

    private Number minShowLabelAngle;

    private Number selectedOffset;

    private Boolean avoidLabelOverlap;

    private Number percentPrecision;

    private Boolean stillShowZeroSum;

    private String animationType;

    private String animationTypeUpdate;

    private Boolean showEmptyCircle;

    private Object emptyCircleStyle;

    private Boolean silent;

    private String blendMode;

    private String cursor;

    private String dataGroupId;

    private List<?> data;

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
    
    private Object label;

    private List<EChartsNumber> center;

    private List<EChartsNumber>  radius;

    private BoxLength width;

    private BoxLength height;

    private BoxLength top;

    private BoxLength right;

    private BoxLength bottom;

    private BoxLength left;

    private Number datasetIndex;

    private String datasetId;

    private String sourceHeader;

    private List<Object> dimensions;

    private String encode;
}
