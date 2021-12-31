package org.icepear.echarts.render;

import lombok.Data;

@Data
public class ChartMeta {
    private String height;
    private String width;
    private String option;

    public ChartMeta(String height, String width, String option) {
        this.height = height;
        this.width = width;
        this.option = option;
    }
}
