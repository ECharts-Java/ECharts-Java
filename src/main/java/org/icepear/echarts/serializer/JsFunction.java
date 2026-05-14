package org.icepear.echarts.serializer;

import java.io.Serializable;
import java.util.Objects;

/**
 * Wraps a JavaScript function literal so it can be embedded into the option
 * JSON unquoted — i.e. as a real function, not a string.
 *
 * <p>ECharts accepts either a string template ({@code "{b}: {c}"}) <em>or</em> a
 * JS function for fields like {@code tooltip.formatter}, {@code label.formatter},
 * {@code axisLabel.formatter}, {@code visualMap.formatter}, etc. The string form
 * already works through any {@code setFormatter(String)} setter; this class
 * unlocks the function form.
 *
 * <p>Pass it through any setter that accepts {@code Object}:
 * <pre>{@code
 * tooltip.setFormatter(new JsFunction(
 *     "function (params) {"
 *   + "  return '<b>' + params.name + '</b>: ' + params.value + ' (' + params.percent + '%)';"
 *   + "}"));
 * }</pre>
 *
 * <p><strong>Important:</strong> a {@code JsFunction} is meant to be embedded in
 * an HTML/JS context (e.g. through {@link org.icepear.echarts.render.Engine}).
 * The serialized output is valid JavaScript but <em>not</em> strictly valid
 * JSON, so don't feed it into a JSON parser. The body is emitted verbatim — the
 * caller is responsible for its JS syntax.
 */
public final class JsFunction implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String body;

    public JsFunction(String body) {
        if (body == null) {
            throw new IllegalArgumentException("JsFunction body must not be null");
        }
        this.body = body;
    }

    public static JsFunction of(String body) {
        return new JsFunction(body);
    }

    public String getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsFunction)) {
            return false;
        }
        return Objects.equals(body, ((JsFunction) o).body);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(body);
    }

    @Override
    public String toString() {
        return "JsFunction{" + body + "}";
    }
}
