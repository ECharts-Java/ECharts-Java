package org.icepear.echarts.serializer;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.icepear.echarts.util.AnimationOptionMixin;
import org.icepear.echarts.util.ColorPaletteOptionMixin;
import org.icepear.echarts.util.ComponentOption;
import org.icepear.echarts.util.SeriesOption;
import org.icepear.echarts.util.StatesOptionMixin;

public class SeriesOptionSerializer implements JsonSerializer<SeriesOption> {
    @Override
    public JsonElement serialize(SeriesOption src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject obj = new Gson().toJsonTree(src).getAsJsonObject();
        obj.remove("componentOption");
        JsonObject compObj = context.serialize(src.getComponentOption(), ComponentOption.class)
                .getAsJsonObject();
        for (Entry<String, JsonElement> e : compObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        obj.remove("animationOptionMixin");
        JsonObject animObj = context.serialize(src.getAnimationOptionMixin(), AnimationOptionMixin.class)
                .getAsJsonObject();
        for (Entry<String, JsonElement> e : animObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        obj.remove("colorPaletteOptionMixin");
        JsonObject colorObj = context.serialize(src.getColorPaletteOptionMixin(), ColorPaletteOptionMixin.class)
                .getAsJsonObject();
        for (Entry<String, JsonElement> e : colorObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        obj.remove("statesOptionMixin");
        JsonObject statObj = context.serialize(src.getStatesOptionMixin(), StatesOptionMixin.class)
                .getAsJsonObject();
        for (Entry<String, JsonElement> e : statObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        return obj;
    }
}
