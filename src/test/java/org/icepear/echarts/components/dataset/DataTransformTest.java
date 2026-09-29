package org.icepear.echarts.components.dataset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Direct unit tests of DataTransform and DataTransformConfig — the classes the
 * sort transform is built from. `order` arrived in #72 and the `value` union
 * overloads have never been pinned down.
 */
public class DataTransformTest {

    private static final EChartsSerializer SERIALIZER = new EChartsSerializer();

    private JsonObject serialize(Object src) {
        JsonElement json = SERIALIZER.toJsonTree(src);
        return json.getAsJsonObject();
    }

    @Test
    public void testSortTransformShape() {
        DataTransform transform = new DataTransform()
                .setType("sort")
                .setConfig(new DataTransformConfig()
                        .setDimension("score")
                        .setOrder("desc"));

        JsonObject json = serialize(transform);
        assertEquals("sort", json.get("type").getAsString());

        JsonObject config = json.getAsJsonObject("config");
        assertEquals("score", config.get("dimension").getAsString());
        assertEquals("desc", config.get("order").getAsString());
    }

    @Test
    public void testOrderAcceptsAsc() {
        DataTransformConfig config = new DataTransformConfig().setOrder("asc");
        assertEquals("asc", config.getOrder());
        assertEquals("asc", serialize(config).get("order").getAsString());
    }

    @Test
    public void testDimensionCanBeAName() {
        DataTransformConfig config = new DataTransformConfig().setDimension("score");
        assertEquals("score", config.getDimension());
        assertEquals("score", serialize(config).get("dimension").getAsString());
    }

    @Test
    public void testValueAcceptsNumberStringAndObject() {
        assertEquals(3, new DataTransformConfig().setValue(3).getValue());
        assertEquals("Teacher", new DataTransformConfig().setValue("Teacher").getValue());

        Object[] range = new Object[] { 1, 2 };
        assertEquals(range, new DataTransformConfig().setValue(range).getValue());
    }

    @Test
    public void testValueSerializesEachForm() {
        assertEquals(3, serialize(new DataTransformConfig().setValue(3)).get("value").getAsInt());
        assertEquals("Teacher",
                serialize(new DataTransformConfig().setValue("Teacher")).get("value").getAsString());
        assertEquals(2,
                serialize(new DataTransformConfig().setValue(new Object[] { 1, 2 }))
                        .getAsJsonArray("value").size());
    }

    @Test
    public void testPrintFlag() {
        DataTransform transform = new DataTransform().setType("sort").setPrint(true);
        assertTrue(serialize(transform).get("print").getAsBoolean());
    }

    @Test
    public void testUnsetFieldsAreOmitted() {
        JsonObject json = serialize(new DataTransform().setType("filter"));
        assertNull("config must not appear when unset", json.get("config"));
        assertNull("print must not appear when unset", json.get("print"));

        JsonObject config = serialize(new DataTransformConfig().setDimension("score"));
        assertNull("order must not appear when unset", config.get("order"));
        assertNull("value must not appear when unset", config.get("value"));
    }

    @Test
    public void testDatasetCarriesTransformWithoutSource() {
        Dataset derived = new Dataset()
                .setTransform(new DataTransform()
                        .setType("sort")
                        .setConfig(new DataTransformConfig().setDimension("score").setOrder("desc")));

        JsonObject json = serialize(derived);
        assertNull("a derived dataset carries no source of its own", json.get("source"));
        assertEquals("sort", json.getAsJsonObject("transform").get("type").getAsString());
    }
}
