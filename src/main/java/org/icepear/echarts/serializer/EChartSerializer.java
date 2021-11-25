package org.icepear.echarts.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import org.icepear.echarts.component.XAxis;
import org.icepear.echarts.component.YAxis;

public class EChartSerializer {
    private static final Gson gson = new GsonBuilder().registerTypeAdapter(XAxis.class, new XAxisSerializer())
            .registerTypeAdapter(YAxis.class, new YAxisSerializer()).create();

    public static String toJson(Object src) {
        return gson.toJson(src);
    }

    public static JsonElement toJsonTree(Object src) {
        return gson.toJsonTree(src);
    }
}
