package org.icepear.echarts.components.media;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.ECUnitOption;
import org.icepear.echarts.origin.util.MediaQueryOption;
import org.icepear.echarts.origin.util.MediaUnitOption;

@Accessors(chain = true)
@Data
public class MediaUnit implements MediaUnitOption, Serializable {

    private static final long serialVersionUID = 1L;

    private MediaQueryOption query;

    private ECUnitOption option;
}
