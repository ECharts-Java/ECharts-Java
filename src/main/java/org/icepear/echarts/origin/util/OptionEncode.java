package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L669
 */
public interface OptionEncode extends OptionEncodeVisualDimensions {

	OptionEncode setValue(Number value);

	OptionEncode setValue(Number[] value);

	OptionEncode setValue(String value);

	OptionEncode setValue(String[] value);
}
