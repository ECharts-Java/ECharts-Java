package org.icepear.echarts.origin.util;

import java.util.List;

import org.icepear.echarts.type.BoxLength;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1044
 */
public interface TextCommonOption extends ShadowOptionMixin {
    void setColor(String color);

    void setFontStyle(Object fontStyle);

    void setFontWeight(Object fontWeight);

    void setFontFamily(String fontFamily);

    void setFontSize(Number fontSize);

    void setAlign(Object align);

    void setVerticalAlign(Object verticalAlign);

    @Deprecated
    void setBaseline(Object baseline);

    void setOpacity(Number opacity);

    void setLineHeight(Number lineHeight);

    void setBackgroundColor(String backgroundColor);

    void setBorderColor(String borderColor);

    void setBorderWidth(Number borderWidth);

    void setBorderType(String borderType);

    void setBorderDashOffset(Number borderDashOffset);

    void setBorderRadius(List<Number> borderRadius);    

    void setPadding(Number padding);

    void setWidth(BoxLength<?> width);

    void setHeight(BoxLength<?> height);

    void setTextBorderColor(String textBorderColor);

    void setTextBorderWidth(Number textBorderWidth);

    void setTextBorderType(String textBorderType);

    void setTextBorderDashOffset(Number textBorderDashOffset);

    void setTextShadowBlur(Number textShadowBlur);

    void setTextShadowColor(String textShadowColor);

    void setTextShadowOffsetX(Number textShadowOffsetX);

    void setTextShadowOffsetY(Number textShadowOffsetY);

    void setTag(String tag);
}
