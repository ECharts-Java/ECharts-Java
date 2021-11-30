package org.icepear.echarts.serializer;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.icepear.echarts.component.Axis;

public class AxisSerializer implements JsonSerializer<Axis> {
    @Override
    public JsonElement serialize(Axis src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject obj = new Gson().toJsonTree(src).getAsJsonObject();
        obj.remove("axisBaseOption");
        JsonObject stateObj = context.serialize(src.getAxisBaseOption()).getAsJsonObject();
        for (Entry<String, JsonElement> e : stateObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        return obj;
    }
}