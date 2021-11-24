package org.icepear.echarts.serializer;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.icepear.echarts.chart.line.LineSeriesOption;
import org.icepear.echarts.chart.line.LineStateOption;
import org.icepear.echarts.util.SeriesOption;

public class LineSeriesOptionSerializer implements JsonSerializer<LineSeriesOption> {
    @Override
    public JsonElement serialize(LineSeriesOption src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject obj = new Gson().toJsonTree(src).getAsJsonObject();
        obj.remove("seriesOption");
        JsonObject seriesObj = context.serialize(src.getSeriesOption(), SeriesOption.class)
                .getAsJsonObject();
        for (Entry<String, JsonElement> e : seriesObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        obj.remove("lineStateOption");
        JsonObject stateObj = context.serialize(src.getLineStateOption(), LineStateOption.class)
                .getAsJsonObject();
        for (Entry<String, JsonElement> e : stateObj.entrySet()) {
            obj.add(e.getKey(), e.getValue());
        }
        return obj;
    }
}
