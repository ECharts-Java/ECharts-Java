package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.StatesOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkPointModel.ts#L40
 */
public interface MarkPointDataItemOption
        extends MarkPointStateOption, StatesOptionMixin, SymbolOptionMixin, MarkerPositionOption {

    MarkPointDataItemOption setName(String name);
}
