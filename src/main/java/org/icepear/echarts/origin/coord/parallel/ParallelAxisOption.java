package org.icepear.echarts.origin.coord.parallel;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/coord/parallel/AxisModel.ts#L43
 */
public interface ParallelAxisOption {

    ParallelAxisOption setDim(Number dim);

    ParallelAxisOption setDim(Number[] dim);

    ParallelAxisOption setParallelIndex(Number parallelIndex);

    ParallelAxisOption setAreaSelectStyle(Object areaSelectStyle);

    ParallelAxisOption setRealtime(Boolean realtime);
}
