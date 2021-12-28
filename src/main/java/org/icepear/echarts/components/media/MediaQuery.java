package org.icepear.echarts.components.media;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.MediaQueryOption;

@Accessors(chain = true)
@Data
public class MediaQuery implements MediaQueryOption {

    private Number minWidth;

    private Number maxWidth;

    private Number minHeight;

    private Number maxHeight;

    private Number minAspectRatio;

    private Number maxAspectRatio;
}
