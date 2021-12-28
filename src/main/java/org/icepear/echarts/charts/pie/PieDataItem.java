package org.icepear.echarts.charts.pie;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.pie.PieDataItemOption;
import org.icepear.echarts.origin.chart.pie.PieItemStyleOption;
import org.icepear.echarts.origin.chart.pie.PieLabelOption;

@Accessors(chain = true)
@Data
public class PieDataItem implements PieDataItemOption {

    @Setter(AccessLevel.NONE)
    private Object id;

    public PieDataItem setId(Number id) {
        this.id = id;
        return this;
    }

    public PieDataItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public PieDataItem setName(Number name) {
        this.name = name;
        return this;
    }

    public PieDataItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public PieDataItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public PieDataItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public PieDataItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public PieDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public PieDataItem setValue(String value) {
        this.value = value;
        return this;
    }

    public PieDataItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    private PieItemStyleOption itemStyle;

    private PieLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String cursor;
}
