package org.icepear.echarts.serializer;

import java.lang.reflect.Type;

import com.google.gson.JsonSerializer;

public interface EChartsTypeAdapter<T> extends JsonSerializer<T> {
    public Type getType();
}
