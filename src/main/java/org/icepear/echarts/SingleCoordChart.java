package org.icepear.echarts;

import org.icepear.echarts.origin.coord.single.SingleAxisOption;
import org.icepear.echarts.origin.util.SeriesOption;

import java.io.Serial;
import java.io.Serializable;

public abstract class SingleCoordChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public SingleCoordChart(final Class<T> clazz, final Class<E> seriesClazz) {
        super(clazz, seriesClazz);
    }

    public T setSingleAxis(SingleAxisOption singleAxis) {
        option.setSingleAxis(singleAxis);
        return self;
    }
}
