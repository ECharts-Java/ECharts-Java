package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.type.BoxLength;

import lombok.Data;

@Data
public class Title implements TitleOption {
    private Boolean show = null;

    private String text = null;

    private String link = null;

    private String target = null;

    private String subtext = null;

    private String sublink = null;

    private String subtarget = null;

    private Object textAlign = null;

    private Object textVerticalAlign = null;

    private Object textBaseline = null;

    private String backgroundColor = null;

    private List<Number> padding = null;

    private Number itemGap = null;

    private Object textStyle = null;

    private Object subtextStyle = null;

    private Boolean triggerEvent = null;

    private List<Number> borderRadius = null;

    private String mainType = null;

    private String type = null;

    private String id = null;

    private String name = null;

    private Number z = null;

    private Number zlevel = null;

    private BoxLength<?> width = null;

    private BoxLength<?> height = null;

    private BoxLength<?> top = null;

    private BoxLength<?> right = null;

    private BoxLength<?> bottom = null;

    private BoxLength<?> left = null;

    private String borderColor = null;

    private Number borderWidth = null;

    private String borderType = null;

    private Object borderCap = null;

    private Object borderJoin = null;

    private Number borderDashOffset = null;

    private Number borderMiterLimit = null;
}
