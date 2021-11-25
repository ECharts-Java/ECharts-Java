package org.icepear.echarts.serializer;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.icepear.echarts.coord.cartesian.CartesianAxisOption;
import org.icepear.echarts.coord.cartesian.XAxisOption;

public class XAxisOptionSerializer implements JsonSerializer<XAxisOption> {
    @Override
    public JsonElement serialize(XAxisOption src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject obj = new Gson().toJsonTree(src).getAsJsonObject();
        obj.remove("cartesianAxisOption");
        JsonObject stateObj = context.serialize(src.getCartesianAxisOption(), CartesianAxisOption.class)
                .getAsJsonObject();
        for (Entry<String, JsonElement> e : stateObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        return obj;
    }
}
