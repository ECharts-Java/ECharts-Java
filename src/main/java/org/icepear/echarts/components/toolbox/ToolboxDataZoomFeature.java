package org.icepear.echarts.components.toolbox;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxDataZoomFeatureOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class ToolboxDataZoomFeature implements ToolboxDataZoomFeatureOption {

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object title;

    public ToolboxDataZoomFeature setTitle(Map<String, String> title) {
        this.title = title;
        return this;
    }

    public ToolboxDataZoomFeature setTitle(String title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object icon;

    public ToolboxDataZoomFeature setIcon(Map<String, String> icon) {
        this.icon = icon;
        return this;
    }

    public ToolboxDataZoomFeature setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    private Object iconStyle;

    private Object emphasis;

    private Map<String, Object> iconStatus;

    private Object onclick;

    private Object[] type;

    private String filterMode;

    private Object xAxisIndex;

    private Object yAxisIndex;

    private Object xAxisId;

    private Object yAxisId;

    private ItemStyleOption brushStyle;
}
