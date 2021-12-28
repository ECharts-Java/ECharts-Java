package org.icepear.echarts.components.media;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.ECUnitOption;
import org.icepear.echarts.origin.util.MediaQueryOption;
import org.icepear.echarts.origin.util.MediaUnitOption;

@Accessors(chain = true)
@Data
public class MediaUnit implements MediaUnitOption {

    private MediaQueryOption query;

    private ECUnitOption option;
}
