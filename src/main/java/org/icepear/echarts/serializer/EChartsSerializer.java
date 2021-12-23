package org.icepear.echarts.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import org.icepear.echarts.components.marker.MarkArea2DDataItem;
import org.icepear.echarts.components.marker.MarkLine2DDataItem;

public class EChartsSerializer {
    private static final Gson gson = new GsonBuilder()
            .registerTypeAdapter(MarkArea2DDataItem.class, new MarkArea2DDataItemSerializer())
            .registerTypeAdapter(MarkLine2DDataItem.class, new MarkLine2DDataItemSerializer())
            .disableHtmlEscaping()
            .create();

    public static String toJson(Object src) {
        return gson.toJson(src);
    }

    public static JsonElement toJsonTree(Object src) {
        return gson.toJsonTree(src);
    }
}
