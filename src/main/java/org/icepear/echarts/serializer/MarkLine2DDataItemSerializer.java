package org.icepear.echarts.serializer;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.icepear.echarts.components.marker.MarkLine2DDataItem;

public class MarkLine2DDataItemSerializer implements JsonSerializer<MarkLine2DDataItem> {
    public JsonElement serialize(MarkLine2DDataItem src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray obj = new JsonArray();
        obj.add(context.serialize(src.getStartPoint()));
        obj.add(context.serialize(src.getEndPoint()));
        return obj;
    }
}
