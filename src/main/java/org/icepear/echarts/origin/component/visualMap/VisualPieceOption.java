package org.icepear.echarts.origin.component.visualMap;

import org.icepear.echarts.origin.util.VisualOptionUnit;

/**
 * https://github.com/apache/echarts/blob/0114414eed6d0f9d1bb951459517e21ae557989f/src/component/visualMap/PiecewiseModel.ts#L31
 */
public interface VisualPieceOption extends VisualOptionUnit {

    VisualPieceOption setMin(Number min);

    VisualPieceOption setMax(Number max);

    VisualPieceOption setLt(Number lt);

    VisualPieceOption setGt(Number gt);

    VisualPieceOption setLte(Number lte);

    VisualPieceOption setGte(Number gte);

    VisualPieceOption setValue(Number value);

    VisualPieceOption setLabel(String label);
}
