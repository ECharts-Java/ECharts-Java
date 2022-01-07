package org.icepear.echarts.origin.coord.radar;

import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/radar/RadarModel.ts#L71
 */
public interface RadarAxisNameOption extends LabelOption {

    RadarAxisNameOption setShow(Boolean show);

    RadarAxisNameOption setFormatter(String formatter);
}
