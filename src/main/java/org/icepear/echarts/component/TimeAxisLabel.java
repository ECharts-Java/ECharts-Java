package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.coord.TimeAxisLabelOption;
import org.icepear.echarts.origin.util.TextCommonOption;
import org.icepear.echarts.type.BoxLength;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class TimeAxisLabel implements TimeAxisLabelOption {
    private String formatter;

    private Boolean show;

    private Boolean inside;

    private Number rotate;

    private Boolean showMinLabel;

    private Boolean showMaxLabel;

    private Number margin;

    private Map<String, TextCommonOption> rich;

    private Boolean hideOverlap;

    private String color;

    private Object fontStyle;

    private Object fontWeight;

    private String fontFamily;

    private Number fontSize;

    private Object align;

    private Object verticalAlign;

    @Deprecated
    private Object baseline;

    private Number opacity;

    private Number lineHeight;

    private String backgroundColor;

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Number borderDashOffset;

    private List<Number> borderRadius;    

    private Number padding;

    private BoxLength width;

    private BoxLength height;

    private String textBorderColor;

    private Number textBorderWidth;

    private String textBorderType;

    private Number textBorderDashOffset;

    private Number textShadowBlur;

    private String textShadowColor;

    private Number textShadowOffsetX;

    private Number textShadowOffsetY;

    private String tag;

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;
}
