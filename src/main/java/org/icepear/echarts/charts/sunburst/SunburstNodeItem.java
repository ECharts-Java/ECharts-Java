package org.icepear.echarts.charts.sunburst;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sunburst.SunburstItemStyleOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstLabelOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstNodeItemOption;

@Accessors(chain = true)
@Data
public class SunburstNodeItem implements SunburstNodeItemOption {

    private SunburstItemStyleOption itemStyle;

    private SunburstLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public SunburstNodeItem setId(Number id) {
        this.id = id;
        return this;
    }

    public SunburstNodeItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public SunburstNodeItem setName(Number name) {
        this.name = name;
        return this;
    }

    public SunburstNodeItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public SunburstNodeItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public SunburstNodeItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public SunburstNodeItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public SunburstNodeItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public SunburstNodeItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public SunburstNodeItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public SunburstNodeItem setValue(String value) {
        this.value = value;
        return this;
    }

    public SunburstNodeItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    private String nodeClick;

    private String link;

    private String target;

    private SunburstNodeItemOption[] children;

    private Boolean collapsed;

    private String cursor;
}
