package org.icepear.echarts.origin.component.marker;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkLineModel.ts#L45
 */
public interface MarkLine1DDataItemOption extends MarkLineDataItemOptionBase, MarkLineDataItemOption {

    MarkLine1DDataItemOption setXAxis(Number xAxis);

    MarkLine1DDataItemOption setXAxis(String xAxis);

    MarkLine1DDataItemOption setYAxis(Number yAxis);

    MarkLine1DDataItemOption setYAxis(String yAxis);

    MarkLine1DDataItemOption setType(Object type);

    MarkLine1DDataItemOption setValueIndex(Number valueIndex);

    MarkLine1DDataItemOption setValueDim(String valueDim);

    MarkLine1DDataItemOption setSymbol(String symbol);

    MarkLine1DDataItemOption setSymbol(String[] symbol);

    MarkLine1DDataItemOption setSymbolSize(Number symbolSize);

    MarkLine1DDataItemOption setSymbolSize(Number[] symbolSize);

    MarkLine1DDataItemOption setSymbolRotate(Number symbolRotate);

    MarkLine1DDataItemOption setSymbolRotate(Number[] symbolRotate);

    MarkLine1DDataItemOption setSymbolOffset(Number symbolOffset);

    MarkLine1DDataItemOption setSymbolOffset(Number[] symbolOffset);

    MarkLine1DDataItemOption setSymbolOffset(String symbolOffset);

    MarkLine1DDataItemOption setSymbolOffset(String[] symbolOffset);
}
