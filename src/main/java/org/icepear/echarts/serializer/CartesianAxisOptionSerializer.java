package org.icepear.echarts.serializer;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.icepear.echarts.coord.AxisBaseOption;
import org.icepear.echarts.coord.cartesian.CartesianAxisOption;

public class CartesianAxisOptionSerializer implements JsonSerializer<CartesianAxisOption> {
    @Override
    public JsonElement serialize(CartesianAxisOption src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject obj = new Gson().toJsonTree(src).getAsJsonObject();
        obj.remove("axisBaseOption");
        JsonObject stateObj = context.serialize(src.getAxisBaseOption(), AxisBaseOption.class)
                .getAsJsonObject();
        for (Entry<String, JsonElement> e : stateObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        return obj;
    }
}
