package org.icepear.echarts.charts.bar;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.bar.BarDataItemOption;
import org.icepear.echarts.origin.chart.bar.BarItemStyleOption;
import org.icepear.echarts.origin.chart.bar.BarLabelOption;

@Accessors(chain = true)
@Data
public class BarDataItem implements BarDataItemOption {

    private BarItemStyleOption itemStyle;

    private BarLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public BarDataItem setId(Number id) {
        this.id = id;
        return this;
    }

    public BarDataItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public BarDataItem setName(Number name) {
        this.name = name;
        return this;
    }

    public BarDataItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public BarDataItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public BarDataItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public BarDataItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public BarDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public BarDataItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public BarDataItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public BarDataItem setValue(String value) {
        this.value = value;
        return this;
    }

    public BarDataItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    private String cursor;
}
