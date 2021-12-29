package org.icepear.echarts.origin.coord.single;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/coord/single/AxisModel.ts#L32
 */
public interface SingleAxisOption extends BoxLayoutOptionMixin {

    SingleAxisOption setPosition(String position);

    SingleAxisOption setOrient(String orient);
}
