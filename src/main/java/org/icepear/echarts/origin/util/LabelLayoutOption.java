package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1189
 */
public interface LabelLayoutOption {

    LabelLayoutOption setMoveOverlap(String moveOverlap);

    LabelLayoutOption setHideOverlap(Boolean hideOverlap);

    LabelLayoutOption setDraggable(Boolean draggable);

    LabelLayoutOption setX(Number x);

    LabelLayoutOption setX(String x);

    LabelLayoutOption setY(Number y);

    LabelLayoutOption setY(String y);

    LabelLayoutOption setDx(Number dx);

    LabelLayoutOption setDy(Number dy);

    LabelLayoutOption setRotate(Number rotate);

    LabelLayoutOption setAlign(String align);

    LabelLayoutOption setVerticalAlign(String verticalAlign);

    LabelLayoutOption setWidth(Number width);

    LabelLayoutOption setHeight(Number height);

    LabelLayoutOption setFontSize(Number fontSize);

    LabelLayoutOption setLabelLinePoints(Number[] labelLinePoints);
}
