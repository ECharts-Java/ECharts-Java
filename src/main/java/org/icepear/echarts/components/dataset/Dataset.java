package org.icepear.echarts.components.dataset;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.dataset.DatasetOption;
import org.icepear.echarts.origin.data.helper.DataTransformOption;
import org.icepear.echarts.origin.util.OptionDataItemObject;
import org.icepear.echarts.origin.util.OptionEncode;

@Accessors(chain = true)
@Data
public class Dataset implements DatasetOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public Dataset setId(Number id) {
        this.id = id;
        return this;
    }

    public Dataset setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public Dataset setName(Number name) {
        this.name = name;
        return this;
    }

    public Dataset setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Number datasetIndex;

    @Setter(AccessLevel.NONE)
    private Object datasetId;

    public Dataset setDatasetId(Number datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public Dataset setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    private Object seriesLayoutBy;

    private Object sourceHeader;

    private Object[] dimensions;

    private OptionEncode encode;

    @Setter(AccessLevel.NONE)
    private Object source;

    public Dataset setSource(Map<String, Object>[] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(Map<String, Object[]> source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(Number[] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(Number[][] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(Number[][][] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(Object source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(Object[] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(Object[][] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(Object[][][] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(OptionDataItemObject[] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(String[] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(String[][] source) {
        this.source = source;
        return this;
    }

    public Dataset setSource(String[][][] source) {
        this.source = source;
        return this;
    }

    private Number fromDatasetIndex;

    private String fromDatasetId;

    @Setter(AccessLevel.NONE)
    private Object transform;

    public Dataset setTransform(DataTransformOption transform) {
        this.transform = transform;
        return this;
    }

    public Dataset setTransform(DataTransformOption[] transform) {
        this.transform = transform;
        return this;
    }

    private Number fromTransformResult;
}
