package org.icepear.echarts.line.beijingAQITest;

import lombok.Data;

@Data
class AQIData {
    private String date;
    private Number aqi;

    public AQIData(String date, Number aqi){
        this.date = date;
        this.aqi = aqi;
    }
}
