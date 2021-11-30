package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.type.BoxLength;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class Title implements TitleOption {
    private Boolean show;

    private String text;

    private String link;

    private String target;

    private String subtext;

    private String sublink;

    private String subtarget;

    private Object textAlign;

    private Object textVerticalAlign;

    private Object textBaseline;

    private String backgroundColor;

    private List<Number> padding;

    private Number itemGap;

    private Object textStyle;

    private Object subtextStyle;

    private Boolean triggerEvent;

    private List<Number> borderRadius;

    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

    private BoxLength<?> width;

    private BoxLength<?> height;

    private BoxLength<?> top;

    private BoxLength<?> right;

    private BoxLength<?> bottom;

    private BoxLength<?> left;

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Object borderCap;

    private Object borderJoin;

    private Number borderDashOffset;

    private Number borderMiterLimit;
}
