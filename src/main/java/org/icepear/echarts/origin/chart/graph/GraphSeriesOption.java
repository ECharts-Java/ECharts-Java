package org.icepear.echarts.origin.chart.graph;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.RoamOptionMixin;
import org.icepear.echarts.origin.util.SeriesLabelOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;
import org.icepear.echarts.origin.util.SeriesOnCalendarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnGeoOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnSingleOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L139
 */
public interface GraphSeriesOption
        extends SeriesOption, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin, SeriesOnCalendarOptionMixin,
        SeriesOnGeoOptionMixin, SeriesOnSingleOptionMixin, SymbolOptionMixin, RoamOptionMixin, BoxLayoutOptionMixin {

    GraphSeriesOption setType(String type);

    GraphSeriesOption setCoordinateSystem(String coordinateSystem);

    GraphSeriesOption setLegendHoverLink(Boolean legendHoverLink);

    GraphSeriesOption setLayout(String layout);

    GraphSeriesOption setData(GraphNodeItemOption[] data);

    GraphSeriesOption setData(Number[] data);

    GraphSeriesOption setData(Number[][] data);

    GraphSeriesOption setData(Object[] data);

    GraphSeriesOption setData(Object[][] data);

    GraphSeriesOption setData(String[] data);

    GraphSeriesOption setData(String[][] data);

    GraphSeriesOption setNodes(GraphNodeItemOption[] nodes);

    GraphSeriesOption setNodes(Number[] nodes);

    GraphSeriesOption setNodes(Number[][] nodes);

    GraphSeriesOption setNodes(Object[] nodes);

    GraphSeriesOption setNodes(Object[][] nodes);

    GraphSeriesOption setNodes(String[] nodes);

    GraphSeriesOption setNodes(String[][] nodes);

    GraphSeriesOption setEdges(GraphEdgeItemOption[] edges);

    GraphSeriesOption setLinks(GraphEdgeItemOption[] links);

    GraphSeriesOption setCategories(GraphCategoryItemOption[] categories);

    GraphSeriesOption setFocusNodeAdjacency(Boolean focusNodeAdjacency);

    GraphSeriesOption setNodeScaleRatio(Number nodeScaleRatio);

    GraphSeriesOption setDraggable(Boolean draggable);

    GraphSeriesOption setEdgeSymbol(String edgeSymbol);

    GraphSeriesOption setEdgeSymbol(String[] edgeSymbol);

    GraphSeriesOption setEdgeSymbolSize(Number edgeSymbolSize);

    GraphSeriesOption setEdgeSymbolSize(Number[] edgeSymbolSize);

    GraphSeriesOption setEdgeLabel(SeriesLineLabelOption edgeLabel);

    GraphSeriesOption setLabel(SeriesLabelOption label);

    GraphSeriesOption setItemStyle(ItemStyleOption itemStyle);

    GraphSeriesOption setLineStyle(GraphEdgeLineStyleOption lineStyle);

    GraphSeriesOption setEmphasis(GraphEmphasisOption emphasis);

    GraphSeriesOption setBlur(GraphBlurOption blur);

    GraphSeriesOption setSelect(GraphSelectOption select);

    GraphSeriesOption setCircular(GraphCircularOption circular);

    GraphSeriesOption setForce(GraphForceOption force);
}
