package org.icepear.echarts.origin.component.marker;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkAreaModel.ts#L36
 */
public interface MarkArea1DDataItemOption extends MarkAreaDataItemOptionBase, MarkAreaDataItemOption {

    MarkArea1DDataItemOption setXAxis(Number xAxis);

    MarkArea1DDataItemOption setYAxis(Number yAxis);

    MarkArea1DDataItemOption setType(Object type);

    MarkArea1DDataItemOption setValueIndex(Number valueIndex);

    MarkArea1DDataItemOption setValueDim(String valueDim);
}
