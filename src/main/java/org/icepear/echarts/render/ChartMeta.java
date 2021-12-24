package org.icepear.echarts.render;

import lombok.Data;

@Data
public class ChartMeta {
    private int height;
    private int width;
    private String html;

    public ChartMeta(int height, int width, String html) {
        this.height = height;
        this.width = width;
        this.html = html;
    }
}
