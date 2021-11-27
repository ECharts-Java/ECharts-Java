package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1491
 */
public interface ComponentOption {
    void setMainType(String mainType);

    void setType(String type);

    void setId(String id);

    void setName(String name);

    void setZ(Number z);

    void setZlevel(Number zlevel);
}
