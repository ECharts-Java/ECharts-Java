package org.icepear.echarts.components.dataZoom;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.dataZoom.DataZoomOption;
import org.icepear.echarts.origin.util.LabelOption;

@Accessors(chain = true)
@Data
public class DataZoom implements DataZoomOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public DataZoom setId(Number id) {
        this.id = id;
        return this;
    }

    public DataZoom setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public DataZoom setName(Number name) {
        this.name = name;
        return this;
    }

    public DataZoom setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private String orient;

    @Setter(AccessLevel.NONE)
    private Object xAxisIndex;

    public DataZoom setXAxisIndex(Number xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    public DataZoom setXAxisIndex(Number[] xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object xAxisId;

    public DataZoom setXAxisId(String xAxisId) {
        this.xAxisId = xAxisId;
        return this;
    }

    public DataZoom setXAxisId(String[] xAxisId) {
        this.xAxisId = xAxisId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object yAxisIndex;

    public DataZoom setYAxisIndex(Number yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public DataZoom setYAxisIndex(Number[] yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object yAxisId;

    public DataZoom setYAxisId(String yAxisId) {
        this.yAxisId = yAxisId;
        return this;
    }

    public DataZoom setYAxisId(String[] yAxisId) {
        this.yAxisId = yAxisId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radiusAxisIndex;

    public DataZoom setRadiusAxisIndex(Number radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    public DataZoom setRadiusAxisIndex(Number[] radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radiusAxisId;

    public DataZoom setRadiusAxisId(String radiusAxisId) {
        this.radiusAxisId = radiusAxisId;
        return this;
    }

    public DataZoom setRadiusAxisId(String[] radiusAxisId) {
        this.radiusAxisId = radiusAxisId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object angleAxisIndex;

    public DataZoom setAngleAxisIndex(Number angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    public DataZoom setAngleAxisIndex(Number[] angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object angleAxisId;

    public DataZoom setAngleAxisId(String angleAxisId) {
        this.angleAxisId = angleAxisId;
        return this;
    }

    public DataZoom setAngleAxisId(String[] angleAxisId) {
        this.angleAxisId = angleAxisId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object singleAxisIndex;

    public DataZoom setSingleAxisIndex(Number singleAxisIndex) {
        this.singleAxisIndex = singleAxisIndex;
        return this;
    }

    public DataZoom setSingleAxisIndex(Number[] singleAxisIndex) {
        this.singleAxisIndex = singleAxisIndex;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object singleAxisId;

    public DataZoom setSingleAxisId(String singleAxisId) {
        this.singleAxisId = singleAxisId;
        return this;
    }

    public DataZoom setSingleAxisId(String[] singleAxisId) {
        this.singleAxisId = singleAxisId;
        return this;
    }

    private String filterMode;

    @Setter(AccessLevel.NONE)
    private Object throttle;

    public DataZoom setThrottle(Number throttle) {
        this.throttle = throttle;
        return this;
    }

    public DataZoom setThrottle(Object throttle) {
        this.throttle = throttle;
        return this;
    }

    private Number start;

    private Number end;

    @Setter(AccessLevel.NONE)
    private Object startValue;

    public DataZoom setStartValue(Number startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom setStartValue(Object startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom setStartValue(String startValue) {
        this.startValue = startValue;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object endValue;

    public DataZoom setEndValue(Number endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom setEndValue(Object endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom setEndValue(String endValue) {
        this.endValue = endValue;
        return this;
    }

    private Number minSpan;

    private Number maxSpan;

    private Number minValueSpan;

    private Number maxValueSpan;

    private String[] rangeMode;

    private Boolean realtime;

    private LabelOption textStyle;
}
