package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1044
 */
public interface TextCommonOption extends ShadowOptionMixin {

    TextCommonOption setColor(String color);

    TextCommonOption setFontStyle(String fontStyle);

    TextCommonOption setFontWeight(String fontWeight);

    TextCommonOption setFontFamily(String fontFamily);

    TextCommonOption setFontSize(Number fontSize);

    TextCommonOption setFontSize(String fontSize);

    TextCommonOption setAlign(String align);

    TextCommonOption setVerticalAlign(String verticalAlign);

    TextCommonOption setBaseline(String baseline);

    TextCommonOption setOpacity(Number opacity);

    TextCommonOption setLineHeight(Number lineHeight);

    TextCommonOption setBackgroundColor(Object backgroundColor);

    TextCommonOption setBackgroundColor(String backgroundColor);

    TextCommonOption setBorderColor(String borderColor);

    TextCommonOption setBorderWidth(Number borderWidth);

    TextCommonOption setBorderType(String borderType);

    TextCommonOption setBorderDashOffset(Number borderDashOffset);

    TextCommonOption setBorderRadius(Number borderRadius);

    TextCommonOption setBorderRadius(Number[] borderRadius);

    TextCommonOption setPadding(Number padding);

    TextCommonOption setPadding(Number[] padding);

    TextCommonOption setWidth(Number width);

    TextCommonOption setWidth(String width);

    TextCommonOption setHeight(Number height);

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
