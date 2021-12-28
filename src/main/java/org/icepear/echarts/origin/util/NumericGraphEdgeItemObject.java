package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/util/types.ts#L626
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/util/types.ts#L640
 */
public interface NumericGraphEdgeItemObject extends NumericOptionDataItemObject {

    NumericGraphEdgeItemObject setSource(Number source);

    NumericGraphEdgeItemObject setSource(String source);

    NumericGraphEdgeItemObject setTarget(Number target);

    NumericGraphEdgeItemObject setTarget(String target);
}
