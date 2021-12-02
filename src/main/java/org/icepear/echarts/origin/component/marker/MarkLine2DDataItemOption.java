package org.icepear.echarts.origin.component.marker;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkLineModel.ts#L76
 */
public interface MarkLine2DDataItemOption {
    // TODO: In the original implementation, it is a List<MarkLine2DDataItemDimOption>
    MarkLine2DDataItemOption setStartPoint(MarkLine2DDataItemDimOption startPoint);

    MarkLine2DDataItemOption setEndPoint(MarkLine2DDataItemDimOption endPoint);
}
