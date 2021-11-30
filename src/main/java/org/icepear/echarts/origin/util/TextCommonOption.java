package org.icepear.echarts.origin.util;

import java.util.List;

import org.icepear.echarts.type.BoxLength;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1044
 */
public interface TextCommonOption extends ShadowOptionMixin {
    TextCommonOption setColor(String color);

    TextCommonOption setFontStyle(Object fontStyle);

    TextCommonOption setFontWeight(Object fontWeight);

    TextCommonOption setFontFamily(String fontFamily);

    TextCommonOption setFontSize(Number fontSize);

    TextCommonOption setAlign(Object align);

    TextCommonOption setVerticalAlign(Object verticalAlign);

    @Deprecated
    TextCommonOption setBaseline(Object baseline);

    TextCommonOption setOpacity(Number opacity);

    TextCommonOption setLineHeight(Number lineHeight);

    TextCommonOption setBackgroundColor(String backgroundColor);

    TextCommonOption setBorderColor(String borderColor);

    TextCommonOption setBorderWidth(Number borderWidth);

    TextCommonOption setBorderType(String borderType);

    TextCommonOption setBorderDashOffset(Number borderDashOffset);

    TextCommonOption setBorderRadius(List<Number> borderRadius);    

    TextCommonOption setPadding(Number padding);

    TextCommonOption setWidth(BoxLength<?> width);

    TextCommonOption setHeight(BoxLength<?> height);

    TextCommonOption setTextBorderColor(String textBorderColor);

    TextCommonOption setTextBorderWidth(Number textBorderWidth);

    TextCommonOption setTextBorderType(String textBorderType);

    TextCommonOption setTextBorderDashOffset(Number textBorderDashOffset);

    TextCommonOption setTextShadowBlur(Number textShadowBlur);

    TextCommonOption setTextShadowColor(String textShadowColor);

    TextCommonOption setTextShadowOffsetX(Number textShadowOffsetX);

    TextCommonOption setTextShadowOffsetY(Number textShadowOffsetY);

    TextCommonOption setTag(String tag);
}
