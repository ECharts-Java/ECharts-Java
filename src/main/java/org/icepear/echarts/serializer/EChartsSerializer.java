package org.icepear.echarts.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class EChartsSerializer {
    private final EChartsTypeAdapter<?> markArea2DDataItemAdapter = new MarkArea2DDataItemAdapter();
    private final EChartsTypeAdapter<?> markLine2DDataItemAdapter = new MarkLine2DDataItemAdapter();
    private final Gson gson;

    public EChartsSerializer(EChartsTypeAdapter<?> ... typeAdapters) {
        GsonBuilder gsonBuilder = new GsonBuilder().disableHtmlEscaping()
                .registerTypeAdapter(markArea2DDataItemAdapter.getType(), markArea2DDataItemAdapter)
                .registerTypeAdapter(markLine2DDataItemAdapter.getType(), markLine2DDataItemAdapter);
        for (EChartsTypeAdapter<?> typeAdapter : typeAdapters) {
            gsonBuilder.registerTypeAdapter(typeAdapter.getType(), typeAdapter);
        }
        gson = gsonBuilder.create();
    }

    public String toJson(Object src) {
        return gson.toJson(src);
    }

    public JsonElement toJsonTree(Object src) {
        return gson.toJsonTree(src);
    }
}
