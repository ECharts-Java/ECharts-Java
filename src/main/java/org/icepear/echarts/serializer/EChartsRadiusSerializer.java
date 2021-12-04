package org.icepear.echarts.serializer;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.icepear.echarts.type.EChartsRadius;

public class EChartsRadiusSerializer implements JsonSerializer<EChartsRadius> {
    @Override
    public JsonElement serialize(EChartsRadius src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject obj = new Gson().toJsonTree(src).getAsJsonObject();
        return obj.get("value");
    }
}