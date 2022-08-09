package org.icepear.echarts.charts.treemap;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.TreemapSeriesItemStyleOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesLabelOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesLevelOption;
import org.icepear.echarts.origin.util.DecalObject;

@Accessors(chain = true)
@Data
public class TreemapSeriesLevel implements TreemapSeriesLevelOption {

    @Setter(AccessLevel.NONE)
    private Object visualDimension;

    public TreemapSeriesLevel setVisualDimension(Number visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    public TreemapSeriesLevel setVisualDimension(String visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    private String colorMappingBy;

    private Number visualMin;

    private Number visualMax;

    @Setter(AccessLevel.NONE)
    private Object colorAlpha;

    public TreemapSeriesLevel setColorAlpha(Number[] colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public TreemapSeriesLevel setColorAlpha(String colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object colorSaturation;

    public TreemapSeriesLevel setColorSaturation(Number[] colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public TreemapSeriesLevel setColorSaturation(String colorSaturation) {
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
    private Object color;

    public TreemapSeriesLevel setColor(String color) {
        this.color = color;
        return this;
    }

    public TreemapSeriesLevel setColor(String[] color) {
        this.color = color;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object decal;

    public TreemapSeriesLevel setDecal(DecalObject[] decal) {
        this.decal = decal;
        return this;
    }

    public TreemapSeriesLevel setDecal(String decal) {
        this.decal = decal;
        return this;
    }
}
