package org.icepear.echarts.component;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureMapOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxBrushFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxDataViewFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxDataZoomFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxMagicTypeFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxRestoreFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxSaveAsImageFeatureOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class ToolboxFeatureMap implements ToolboxFeatureMapOption{
    private ToolboxBrushFeatureOption brush;

    private ToolboxDataViewFeatureOption dataView;
    
    private ToolboxDataZoomFeatureOption dataZoom;

    private ToolboxMagicTypeFeatureOption magicType;
    
    private ToolboxRestoreFeatureOption restore;
    
    private ToolboxSaveAsImageFeatureOption saveAsImage;
}
