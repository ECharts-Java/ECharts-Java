package org.icepear.echarts.origin.component.dataset;

import java.util.Map;

import org.icepear.echarts.origin.data.helper.DataTransformOption;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.OptionDataItemObject;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/dataset/install.ts#L42
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L583
 */
public interface DatasetOption extends ComponentOption, SeriesEncodeOptionMixin {

    DatasetOption setMainType(String mainType);

    DatasetOption setSeriesLayoutBy(Object seriesLayoutBy);

    DatasetOption setSourceHeader(Object sourceHeader);

    DatasetOption setSource(Map<String, Object>[] source);

    DatasetOption setSource(Map<String, Object[]> source);

    DatasetOption setSource(Number[] source);

    DatasetOption setSource(Number[][] source);

    DatasetOption setSource(Number[][][] source);

    DatasetOption setSource(Object source);

    DatasetOption setSource(Object[] source);

    DatasetOption setSource(Object[][] source);

    DatasetOption setSource(Object[][][] source);

    DatasetOption setSource(OptionDataItemObject[] source);

    DatasetOption setSource(String[] source);

    DatasetOption setSource(String[][] source);

    DatasetOption setSource(String[][][] source);

    DatasetOption setFromDatasetIndex(Number fromDatasetIndex);

    DatasetOption setFromDatasetId(String fromDatasetId);

    DatasetOption setTransform(DataTransformOption transform);

    DatasetOption setTransform(DataTransformOption[] transform);

    DatasetOption setFromTransformResult(Number fromTransformResult);
}
