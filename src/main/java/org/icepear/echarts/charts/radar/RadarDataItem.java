package org.icepear.echarts.charts.radar;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.radar.RadarDataItemOption;
import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class RadarDataItem implements RadarDataItemOption {

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public RadarDataItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public RadarDataItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public RadarDataItem setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public RadarDataItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public RadarDataItem setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public RadarDataItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private LineStyleOption lineStyle;

    private AreaStyleOption areaStyle;

    private SeriesLabelOption label;

    private ItemStyleOption itemStyle;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public RadarDataItem setId(Number id) {
        this.id = id;
        return this;
    }

    public RadarDataItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public RadarDataItem setName(Number name) {
        this.name = name;
        return this;
    }

    public RadarDataItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public RadarDataItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public RadarDataItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public RadarDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public RadarDataItem setValue(Number[][] value) {
        this.value = value;
        return this;
    }

    public RadarDataItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public RadarDataItem setValue(Object[][] value) {
        this.value = value;
        return this;
    }

    public RadarDataItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    public RadarDataItem setValue(String[][] value) {
        this.value = value;
        return this;
    }
}
