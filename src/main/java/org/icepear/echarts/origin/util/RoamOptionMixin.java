package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/util/types.ts#L921
 */
public interface RoamOptionMixin {

    RoamOptionMixin setRoam(Boolean roam);

    RoamOptionMixin setRoam(String roam);

    RoamOptionMixin setCenter(Number[] center);

    RoamOptionMixin setZoom(Number zoom);

    RoamOptionMixin setScaleLimit(Object scaleLimit);
}
