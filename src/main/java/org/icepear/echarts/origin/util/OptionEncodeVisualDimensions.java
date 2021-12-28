package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L656
 */
public interface OptionEncodeVisualDimensions {

    OptionEncodeVisualDimensions setTooltip(Number tooltip);

    OptionEncodeVisualDimensions setTooltip(Number[] tooltip);

    OptionEncodeVisualDimensions setTooltip(String tooltip);

    OptionEncodeVisualDimensions setTooltip(String[] tooltip);

    OptionEncodeVisualDimensions setLabel(Number label);

    OptionEncodeVisualDimensions setLabel(Number[] label);

    OptionEncodeVisualDimensions setLabel(String label);

    OptionEncodeVisualDimensions setLabel(String[] label);

    OptionEncodeVisualDimensions setItemName(Number itemName);

    OptionEncodeVisualDimensions setItemName(Number[] itemName);

    OptionEncodeVisualDimensions setItemName(String itemName);

    OptionEncodeVisualDimensions setItemName(String[] itemName);

    OptionEncodeVisualDimensions setItemId(Number itemId);

    OptionEncodeVisualDimensions setItemId(Number[] itemId);

    OptionEncodeVisualDimensions setItemId(String itemId);

    OptionEncodeVisualDimensions setItemId(String[] itemId);

    OptionEncodeVisualDimensions setSeriesName(Number seriesName);

    OptionEncodeVisualDimensions setSeriesName(Number[] seriesName);

    OptionEncodeVisualDimensions setSeriesName(String seriesName);

    OptionEncodeVisualDimensions setSeriesName(String[] seriesName);

    OptionEncodeVisualDimensions setItemGroupId(Number itemGroupId);

    OptionEncodeVisualDimensions setItemGroupId(Number[] itemGroupId);

    OptionEncodeVisualDimensions setItemGroupId(String itemGroupId);

    OptionEncodeVisualDimensions setItemGroupId(String[] itemGroupId);
}
