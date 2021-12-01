package org.icepear.echarts.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import org.icepear.echarts.type.BoxLength;

public class EChartSerializer {
    private static final Gson gson = new GsonBuilder()
            .registerTypeAdapter(BoxLength.class, new BoxLengthSerializer())
            .create();

    public static String toJson(Object src) {
        return gson.toJson(src);
    }

    public static JsonElement toJsonTree(Object src) {
        return gson.toJsonTree(src);
    }
}
