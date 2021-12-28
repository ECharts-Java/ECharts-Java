package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L743
 */
public interface MediaQueryOption {

    MediaQueryOption setMinWidth(Number minWidth);

    MediaQueryOption setMaxWidth(Number maxWidth);

    MediaQueryOption setMinHeight(Number minHeight);

    MediaQueryOption setMaxHeight(Number maxHeight);

    MediaQueryOption setMinAspectRatio(Number minAspectRatio);

    MediaQueryOption setMaxAspectRatio(Number maxAspectRatio);
}
