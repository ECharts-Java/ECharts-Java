package org.icepear.echarts.origin.chart.tree;

import org.icepear.echarts.origin.util.DefaultOptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/tree/TreeSeries.ts#L63
 */
public interface TreeNodeItemOption
        extends SymbolOptionMixin, TreeStateOption, StatesOptionMixin, DefaultOptionDataItemObject {

    TreeNodeItemOption setChildren(TreeNodeItemOption[] children);

    TreeNodeItemOption setCollapsed(Boolean collapsed);

    TreeNodeItemOption setLink(String link);

    TreeNodeItemOption setTarget(String target);
}
