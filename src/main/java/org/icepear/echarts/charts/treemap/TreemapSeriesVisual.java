package org.icepear.echarts.charts.treemap;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.TreemapSeriesVisualOption;

@Accessors(chain = true)
@Data
public class TreemapSeriesVisual implements TreemapSeriesVisualOption {

    @Setter(AccessLevel.NONE)
    private Object visualDimension;

    public TreemapSeriesVisual setVisualDimension(Number visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    public TreemapSeriesVisual setVisualDimension(String visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    private String colorMappingBy;

    private Number visualMin;

    private Number visualMax;

    @Setter(AccessLevel.NONE)
    private Object colorAlpha;

    public TreemapSeriesVisual setColorAlpha(Number[] colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public TreemapSeriesVisual setColorAlpha(String colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object colorSaturation;

    public TreemapSeriesVisual setColorSaturation(Number[] colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public TreemapSeriesVisual setColorSaturation(String colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    private Number visibleMin;

    private Number childrenVisibleMin;
}
