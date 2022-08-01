package org.icepear.echarts.serializer;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Type;

import org.icepear.echarts.components.marker.MarkArea2DDataItem;
import org.icepear.echarts.components.marker.MarkArea2DDataItemDim;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;

public class EChartsSerializerTest {
    @Test
    public void testDefaultEChartsSerializer() {
        EChartsSerializer serializer = new EChartsSerializer();
        Object object = new MarkArea2DDataItem()
                .setStartPoint(new MarkArea2DDataItemDim().setName("start"))
                .setEndPoint(new MarkArea2DDataItemDim().setName("end"));
        JsonElement actual = serializer.toJsonTree(object);
        JsonElement expected = JsonParser.parseString("[{'name': 'start'}, {'name': 'end'}]");
        assertEquals(expected, actual);
    }

    @Test
    public void testCustomEChartsSerializer() {
        EChartsSerializer serializer = new EChartsSerializer(new CustomObjectAdapter());
        Object object = new CustomObject("name");
        JsonElement actual = serializer.toJsonTree(object);
        JsonElement expected = JsonParser.parseString("'name'");
        assertEquals(expected, actual);
    }

    class CustomObject {
        private String name;

        public CustomObject(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    class CustomObjectAdapter implements EChartsTypeAdapter<CustomObject> {
        public JsonElement serialize(CustomObject src, Type typeOfSrc, JsonSerializationContext context) {
            return context.serialize(src.getName());
        }

        public Type getType() {
            return CustomObject.class;
        }
    }
}
