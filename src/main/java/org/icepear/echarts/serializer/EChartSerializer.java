package org.icepear.echarts.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import org.icepear.echarts.type.AxisIndex;
import org.icepear.echarts.type.BoxLength;
import org.icepear.echarts.type.EChartsNumber;

public class EChartSerializer {
    private static final Gson gson = new GsonBuilder()
            .disableHtmlEscaping()
            .registerTypeAdapter(AxisIndex.class, new AxisIndexSerializer())
            .registerTypeAdapter(BoxLength.class, new BoxLengthSerializer())
            .registerTypeAdapter(EChartsNumber.class, new EChartsNumberSerializer())
            .create();

    public static String toJson(Object src) {
        return gson.toJson(src);
    }

    public static JsonElement toJsonTree(Object src) {
        return gson.toJsonTree(src);
    }
}
