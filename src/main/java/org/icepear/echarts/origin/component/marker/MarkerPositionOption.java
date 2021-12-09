package org.icepear.echarts.origin.component.marker;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkerModel.ts#L48
 */
public interface MarkerPositionOption {

	MarkerPositionOption setX(String x);

	MarkerPositionOption setX(Number x);

	MarkerPositionOption setY(String y);

	MarkerPositionOption setY(Number y);

	MarkerPositionOption setCoord(Object[] coord);

	MarkerPositionOption setXAxis(Object xAxis);

	MarkerPositionOption setYAxis(Object yAxis);

	MarkerPositionOption setRadiusAxis(Object radiusAxis);

	MarkerPositionOption setAngleAxis(Object angleAxis);

	MarkerPositionOption setType(Object type);

	MarkerPositionOption setValueIndex(Number valueIndex);

	MarkerPositionOption setValueDim(String valueDim);

	MarkerPositionOption setValue(String value);

	MarkerPositionOption setValue(Number value);
}
