package org.icepear.echarts.serializer;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.icepear.echarts.type.AxisIndex;

public class AxisIndexSerializer implements JsonSerializer<AxisIndex> {
    @Override
    public JsonElement serialize(AxisIndex src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject obj = new Gson().toJsonTree(src).getAsJsonObject();
        return obj.get("value");
    }
}