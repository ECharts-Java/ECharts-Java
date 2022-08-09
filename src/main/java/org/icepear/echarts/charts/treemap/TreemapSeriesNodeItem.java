package org.icepear.echarts.charts.treemap;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.TreemapSeriesItemStyleOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesLabelOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesNodeItemOption;
import org.icepear.echarts.origin.util.DecalObject;

@Accessors(chain = true)
@Data
public class TreemapSeriesNodeItem implements TreemapSeriesNodeItemOption {

    @Setter(AccessLevel.NONE)
    private Object visualDimension;

    public TreemapSeriesNodeItem setVisualDimension(Number visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    public TreemapSeriesNodeItem setVisualDimension(String visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    private String colorMappingBy;

    private Number visualMin;

    private Number visualMax;

    @Setter(AccessLevel.NONE)
    private Object colorAlpha;

    public TreemapSeriesNodeItem setColorAlpha(Number[] colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public TreemapSeriesNodeItem setColorAlpha(String colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object colorSaturation;

    public TreemapSeriesNodeItem setColorSaturation(Number[] colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public TreemapSeriesNodeItem setColorSaturation(String colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    private Number visibleMin;

    private Number childrenVisibleMin;

    private TreemapSeriesItemStyleOption itemStyle;

    private TreemapSeriesLabelOption label;

    private TreemapSeriesLabelOption upperLabel;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public TreemapSeriesNodeItem setId(Number id) {
        this.id = id;
        return this;
    }

    public TreemapSeriesNodeItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public TreemapSeriesNodeItem setName(Number name) {
        this.name = name;
        return this;
    }

    public TreemapSeriesNodeItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object value;

    public TreemapSeriesNodeItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public TreemapSeriesNodeItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    private TreemapSeriesNodeItemOption[] children;

    @Setter(AccessLevel.NONE)
    private Object color;

    public TreemapSeriesNodeItem setColor(String color) {
        this.color = color;
        return this;
    }

    public TreemapSeriesNodeItem setColor(String[] color) {
        this.color = color;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object decal;

    public TreemapSeriesNodeItem setDecal(DecalObject[] decal) {
        this.decal = decal;
        return this;
    }

    public TreemapSeriesNodeItem setDecal(String decal) {
        this.decal = decal;
        return this;
    }
}
