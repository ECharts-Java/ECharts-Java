package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1491
 */
public interface ComponentOption {

	ComponentOption setMainType(String mainType);

	ComponentOption setType(String type);

	ComponentOption setId(String id);

	ComponentOption setId(Number id);

	ComponentOption setName(String name);

	ComponentOption setName(Number name);

	ComponentOption setZ(Number z);

	ComponentOption setZlevel(Number zlevel);
}
