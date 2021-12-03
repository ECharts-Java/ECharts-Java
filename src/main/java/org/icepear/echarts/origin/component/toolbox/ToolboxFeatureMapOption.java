package org.icepear.echarts.origin.component.toolbox;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxBrushFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxDataViewFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxDataZoomFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxMagicTypeFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxRestoreFeatureOption;
import org.icepear.echarts.origin.component.toolbox.feature.ToolboxSaveAsImageFeatureOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/ToolboxModel.ts#L76
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L126
 */
public interface ToolboxFeatureMapOption {
    ToolboxFeatureMapOption setBrush(ToolboxBrushFeatureOption brush);
    
    ToolboxFeatureMapOption setDataView(ToolboxDataViewFeatureOption dataView);
    
    ToolboxFeatureMapOption setDataZoom(ToolboxDataZoomFeatureOption dataZoom);

    ToolboxFeatureMapOption setMagicType(ToolboxMagicTypeFeatureOption magicType);
    
    ToolboxFeatureMapOption setRestore(ToolboxRestoreFeatureOption restore);
    
    ToolboxFeatureMapOption setSaveAsImage(ToolboxSaveAsImageFeatureOption saveAsImage);
}
