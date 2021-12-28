package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L751
 */
public interface MediaUnitOption {

    MediaUnitOption setQuery(MediaQueryOption query);

    MediaUnitOption setOption(ECUnitOption option);
}
