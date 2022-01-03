package org.icepear.echarts.charts.sunburst;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sunburst.SunburstItemStyleOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstLabelOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstSeriesNodeItemOption;

@Accessors(chain = true)
@Data
public class SunburstSeriesNodeItem implements SunburstSeriesNodeItemOption {

    private SunburstItemStyleOption itemStyle;

    private SunburstLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public SunburstSeriesNodeItem setId(Number id) {
        this.id = id;
        return this;
    }

    public SunburstSeriesNodeItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public SunburstSeriesNodeItem setName(Number name) {
        this.name = name;
        return this;
    }

    public SunburstSeriesNodeItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public SunburstSeriesNodeItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public SunburstSeriesNodeItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public SunburstSeriesNodeItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public SunburstSeriesNodeItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public SunburstSeriesNodeItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public SunburstSeriesNodeItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public SunburstSeriesNodeItem setValue(String value) {
        this.value = value;
        return this;
    }

    public SunburstSeriesNodeItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    private String nodeClick;

    private String link;

    private String target;

    private SunburstSeriesNodeItemOption[] children;

    private Boolean collapsed;

    private String cursor;
}
