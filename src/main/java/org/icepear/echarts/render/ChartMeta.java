package org.icepear.echarts.render;

import lombok.Data;

@Data
public class ChartMeta {
    private int height;
    private int width;
    private String option;

    public ChartMeta(int height, int width, String option) {
        this.height = height;
        this.width = width;
        this.option = option;
    }
}
