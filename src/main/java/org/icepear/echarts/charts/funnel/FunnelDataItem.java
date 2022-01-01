package org.icepear.echarts.charts.funnel;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.funnel.FunnelDataItemOption;
import org.icepear.echarts.origin.chart.funnel.FunnelLabelOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class FunnelDataItem implements FunnelDataItemOption {

    @Setter(AccessLevel.NONE)
    private Object itemStyle;

    public FunnelDataItem setItemStyle(ItemStyleOption itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public FunnelDataItem setItemStyle(Object itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    private FunnelLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public FunnelDataItem setId(Number id) {
        this.id = id;
        return this;
    }

    public FunnelDataItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public FunnelDataItem setName(Number name) {
        this.name = name;
        return this;
    }

    public FunnelDataItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public FunnelDataItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public FunnelDataItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public FunnelDataItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public FunnelDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public FunnelDataItem setValue(String value) {
        this.value = value;
        return this;
    }

    public FunnelDataItem setValue(String[] value) {
        this.value = value;
        return this;
    }
}
