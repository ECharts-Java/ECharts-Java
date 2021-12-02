package org.icepear.echarts.origin.component.marker;

import java.util.List;

import org.icepear.echarts.type.EChartsNumber;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkerModel.ts#L48
 */
public interface MarkerPositionOption {
    MarkerPositionOption setX(EChartsNumber x);

    MarkerPositionOption setY(EChartsNumber y);

    MarkerPositionOption setCoord(List<Object> coord);

    MarkerPositionOption setXAxis(EChartsNumber xAxis);

    MarkerPositionOption setYAxis(EChartsNumber yAxis);

    MarkerPositionOption setRadiusAxis(Object radiusAxis);

    MarkerPositionOption setAngleAxis(Object angleAxis);

    MarkerPositionOption setType(String type);

    MarkerPositionOption setValueIndex(Number valueIndex);

    MarkerPositionOption setValueDim(String valueDim);

    MarkerPositionOption setValue(Number value);
}
