package org.icepear.echarts.origin.util;

import java.util.List;

import org.icepear.echarts.type.EChartsNumber;
import org.icepear.echarts.type.EChartsRadius;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L834
 */
public interface CircleLayoutOptionMixin {
    CircleLayoutOptionMixin setCenter(List<EChartsNumber> center);

    CircleLayoutOptionMixin setRadius(EChartsRadius radius);
}
