package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxSaveAsImageFeatureOption;

import lombok.Data;

@Data
public class ToolboxSaveAsImageFeature implements ToolboxSaveAsImageFeatureOption {
    private String type = null;

    private String backgroundColor = null;

    private String connectedBackgroundColor = null;

    private String name = null;

    private List<String> excludeComponents = null;

    private Number pixelRatio = null;

    private List<String> lang = null;

    private Boolean show = null;

    private String title = null;

    private String icon = null;

    private Object iconStyle = null;

    private Object emphasis = null;

    private Object iconStatus = null;

    private Object onclick = null;
}
