package org.icepear.echarts.serializer;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;

import org.icepear.echarts.components.marker.MarkArea2DDataItem;

public class MarkArea2DDataItemAdapter implements EChartsTypeAdapter<MarkArea2DDataItem> {
    public JsonElement serialize(MarkArea2DDataItem src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray obj = new JsonArray();
        obj.add(context.serialize(src.getStartPoint()));
        obj.add(context.serialize(src.getEndPoint()));
        return obj;
    }

    public Type getType() {
        return MarkArea2DDataItem.class;
    }
}
