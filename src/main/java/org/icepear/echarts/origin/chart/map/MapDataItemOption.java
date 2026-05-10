package org.icepear.echarts.origin.chart.map;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://echarts.apache.org/en/option.html#series-map.data
 */
public interface MapDataItemOption extends MapStateOption, StatesOptionMixin {

    MapDataItemOption setName(String name);

    MapDataItemOption setValue(Number value);

    MapDataItemOption setValue(Number[] value);

    MapDataItemOption setSelected(Boolean selected);
}
