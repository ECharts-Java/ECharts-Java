package org.icepear.echarts.origin.component.marker;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkAreaModel.ts#L52
 */
public interface MarkArea2DDataItemOption extends MarkAreaDataItemOption {

    MarkArea2DDataItemOption setStartPoint(MarkArea2DDataItemDimOption startPoint);

    MarkArea2DDataItemOption setEndPoint(MarkArea2DDataItemDimOption endPoint);
}
