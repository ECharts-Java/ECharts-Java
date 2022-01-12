package org.icepear.echarts.origin.chart.sankey;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sankey/SankeySeries.ts#L94
 */
public interface SankeySeriesOption extends SeriesOption, SankeyBothStateOption, BoxLayoutOptionMixin {

    SankeySeriesOption setType(String type);

    SankeySeriesOption setColor(String[] color);

    SankeySeriesOption setCoordinateSystem(String coordinateSystem);

    SankeySeriesOption setOrient(String orient);

    SankeySeriesOption setNodeWidth(Number nodeWidth);

    SankeySeriesOption setNodeGap(Number nodeGap);

    SankeySeriesOption setDraggable(Boolean draggable);

    SankeySeriesOption setFocusNodeAdjacency(Boolean focusNodeAdjacency);

    SankeySeriesOption setFocusNodeAdjacency(String focusNodeAdjacency);

    SankeySeriesOption setLayoutIterations(Number layoutIterations);

    SankeySeriesOption setData(SankeyNodeItemOption[] data);

    SankeySeriesOption setNodes(SankeyNodeItemOption[] nodes);

    SankeySeriesOption setEdges(SankeyEdgeItemOption[] edges);

    SankeySeriesOption setLinks(SankeyEdgeItemOption[] links);

    SankeySeriesOption setLevels(SankeyLevelOption[] levels);

    SankeySeriesOption setEmphasis(SankeyEmphasisOption emphasis);
}
