package org.icepear.echarts.util;

import java.util.Map;

// import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Delegate;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1587
 */
@Getter
@Setter
public class SeriesOption {
    @Delegate(types=ComponentOption.class)
    private ComponentOption componentOption;

    @Delegate(types=AnimationOptionMixin.class)
    private AnimationOptionMixin animationOptionMixin;

    @Delegate(types=ColorPaletteOptionMixin.class)
    private ColorPaletteOptionMixin colorPaletteOptionMixin;

    @Delegate(types=StatesOptionMixin.class)
    private StatesOptionMixin statesOptionMixin;

    private Boolean silent;

    private String blendMode;

    private String cursor;

    private String dataGroupId;

    private Object data;

    private String colorBy;

    private Boolean legendHoverLink;

    private Integer progressive;

    private Integer progressiveThreshold;

    private String progressiveChunkMode;

    private String coordinateSystem;

    private Integer hoverLayerThreshold;

    private String seriesLayoutBy;

    private Object labelLine;

    private Object labelLayout;

    private Object stateAnimation;

    private Object universalTransition;

    private Map<String, Boolean> selectedMap;

    private String selectedMode;

    // private String darkMode;

    // private List<String> backgroundColor;

    // private List<String> gradientColor;

    // private Aria aria;

    // private TextStyle textStyle;

    // private Boolean useUTC;

    // private List<Title> title;

    // private List<RadiusAxis> radiusAxis;

    // private List<AngleAxis> angleAxis;

    // private List<Polar> polar;

    // private List<Toolbox> toolbox;

    // private List<Dataset> dataset;

    // private List<Graphic> graphic;

    // private List<AxisPointer> axisPointer;

    // private List<Tooltip> tooltip;

    // private List<Axis> yAxis;

    // private List<Axis> xAxis;

    // private List<Grid> grid;

    // private List<Series> series;

    // private List<Legend> legend;

    // private List<VisualMap> visualMap;

    // private List<MarkArea> markArea;

    // private List<MarkLine> markLine;

    // private List<MarkPoint> markPoint;

    // private List<DataZoom> dataZoom;
    
    public SeriesOption() {
        this.componentOption = new ComponentOption();
        this.animationOptionMixin = new AnimationOptionMixin();
    }
}
