package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.type.BoxLength;

import lombok.Getter;
import lombok.Setter;

public class Title implements TitleOption {
    @Getter
    @Setter
    public Boolean show = null;

    @Getter
    @Setter
    public String text = null;

    @Getter
    @Setter
    public String link = null;

    @Getter
    @Setter
    public String target = null;

    @Getter
    @Setter
    public String subtext = null;

    @Getter
    @Setter
    public String sublink = null;

    @Getter
    @Setter
    public String subtarget = null;

    @Getter
    @Setter
    public Object textAlign = null;

    @Getter
    @Setter
    public Object textVerticalAlign = null;

    @Getter
    @Setter
    public Object textBaseline = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public List<Number> padding = null;

    @Getter
    @Setter
    public Number itemGap = null;

    @Getter
    @Setter
    public Object textStyle = null;

    @Getter
    @Setter
    public Object subtextStyle = null;

    @Getter
    @Setter
    public Boolean triggerEvent = null;

    @Getter
    @Setter
    public List<Number> borderRadius = null;

    @Getter
    @Setter
    public String mainType = null;

    @Getter
    @Setter
    public String type = null;

    @Getter
    @Setter
    public String id = null;

    @Getter
    @Setter
    public String name = null;

    @Getter
    @Setter
    public Number z = null;

    @Getter
    @Setter
    public Number zlevel = null;

    @Getter
    @Setter
    public BoxLength<?> width = null;

    @Getter
    @Setter
    public BoxLength<?> height = null;

    @Getter
    @Setter
    public BoxLength<?> top = null;

    @Getter
    @Setter
    public BoxLength<?> right = null;

    @Getter
    @Setter
    public BoxLength<?> bottom = null;

    @Getter
    @Setter
    public BoxLength<?> left = null;

    @Getter
    @Setter
    public String borderColor = null;

    @Getter
    @Setter
    public Number borderWidth = null;

    @Getter
    @Setter
    public String borderType = null;

    @Getter
    @Setter
    public Object borderCap = null;

    @Getter
    @Setter
    public Object borderJoin = null;

    @Getter
    @Setter
    public Number borderDashOffset = null;

    @Getter
    @Setter
    public Number borderMiterLimit = null;
}
