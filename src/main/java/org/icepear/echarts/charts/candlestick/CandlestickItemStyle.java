package org.icepear.echarts.charts.candlestick;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.candlestick.CandlestickItemStyleOption;
import org.icepear.echarts.origin.util.DecalObject;

@Accessors(chain = true)
@Data
public class CandlestickItemStyle implements CandlestickItemStyleOption {

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Object borderCap;

    private Object borderJoin;

    private Number borderDashOffset;

    private Number borderMiterLimit;

    private String color;

    private Number opacity;

    @Setter(AccessLevel.NONE)
    private Object decal;

    public CandlestickItemStyle setDecal(DecalObject decal) {
        this.decal = decal;
        return this;
    }

    public CandlestickItemStyle setDecal(String decal) {
        this.decal = decal;
        return this;
    }

    private Object color0;

    private Object borderColor0;
}
