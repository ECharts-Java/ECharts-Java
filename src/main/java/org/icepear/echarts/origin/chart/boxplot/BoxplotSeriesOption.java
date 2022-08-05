package org.icepear.echarts.origin.chart.boxplot;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/boxplot/BoxplotSeries.ts#L58
 */
public interface BoxplotSeriesOption
        extends SeriesOption, BoxplotStateOption, SeriesOnCartesianOptionMixin, SeriesEncodeOptionMixin {

    BoxplotSeriesOption setType(String type);

    BoxplotSeriesOption setCoordinateSystem(String coordinateSystem);

    BoxplotSeriesOption setLayout(String layout);

    BoxplotSeriesOption setBoxWidth(Number[] boxWidth);

    BoxplotSeriesOption setBoxWidth(String[] boxWidth);

    BoxplotSeriesOption setData(BoxplotDataItemOption[] data);

    BoxplotSeriesOption setData(Number[][] data);

    BoxplotSeriesOption setEmphasis(BoxplotEmphasisOption emphasis);
}
