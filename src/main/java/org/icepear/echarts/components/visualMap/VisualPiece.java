package org.icepear.echarts.components.visualMap;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.visualMap.VisualPieceOption;
import org.icepear.echarts.origin.util.DecalObject;

@Accessors(chain = true)
@Data
public class VisualPiece implements VisualPieceOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String symbol;

    private Number symbolSize;

    private String color;

    private Number colorAlpha;

    private Number opacity;

    private Number colorLightness;

    private Number colorSaturation;

    private Number colorHue;

    private DecalObject decal;

    private Number liftZ;

    private Number min;

    private Number max;

    private Number lt;

    private Number gt;

    private Number lte;

    private Number gte;

    private Number value;

    private String label;
}
