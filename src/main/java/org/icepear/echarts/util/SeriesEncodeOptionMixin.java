package org.icepear.echarts.util;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1711
 */
@Getter
@Setter
public class SeriesEncodeOptionMixin {
    private Integer datasetIndex;
    
    private String datasetId;

    private String seriesLayoutBy;

    private String sourceHeader;

    private List<Object> dimensions;

    private String encode;
}
