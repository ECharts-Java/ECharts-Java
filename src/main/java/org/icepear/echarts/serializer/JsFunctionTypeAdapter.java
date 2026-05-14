package org.icepear.echarts.serializer;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Low-level Gson adapter that writes a {@link JsFunction}'s body straight into
 * the output stream as raw JSON-text — i.e. unquoted. This is what makes the
 * function survive into the rendered HTML as a real JS callable instead of a
 * quoted string.
 *
 * <p>Implemented as a {@link TypeAdapter} (not a {@code JsonSerializer}) because
 * only the streaming API exposes {@link JsonWriter#jsonValue(String)}, which
 * permits raw text. {@code JsonSerializer} can only return a {@code JsonElement}
 * — and a string element would always come out quoted.
 *
 * <p>Read direction is best-effort: if anyone deserializes JS-function-bearing
 * JSON back into Java (uncommon), they get a {@code JsFunction} wrapping the
 * raw text. The library only round-trips for tests, so this is rarely exercised.
 */
final class JsFunctionTypeAdapter extends TypeAdapter<JsFunction> {

    @Override
    public void write(JsonWriter out, JsFunction value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        out.jsonValue(value.getBody());
    }

    @Override
    public JsFunction read(JsonReader in) throws IOException {
        return new JsFunction(in.nextString());
    }
}
