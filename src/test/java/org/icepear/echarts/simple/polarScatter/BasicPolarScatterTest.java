package org.icepear.echarts.simple.polarScatter;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.icepear.echarts.PolarScatter;
import org.icepear.echarts.charts.scatter.ScatterDataItem;
import org.icepear.echarts.components.coord.AxisLine;
import org.icepear.echarts.components.coord.CategoryAxisLabel;
import org.icepear.echarts.components.coord.SplitLine;
import org.icepear.echarts.components.coord.polar.CategoryAngleAxis;
import org.icepear.echarts.components.coord.polar.CategoryRadiusAxis;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Before;
import org.junit.Test;

public class BasicPolarScatterTest {
    private List<String> hours;
    private List<String> days;
    private List<ScatterDataItem> items;

    @Before
    public void loadData() {
        Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/mock/punch-card.json"));
        JsonObject data = JsonParser.parseReader(reader).getAsJsonObject();
        hours = new ArrayList<>();
        for (JsonElement hour : data.get("hours").getAsJsonArray()) {
            hours.add(hour.getAsString());
        }
        days = new ArrayList<>();
        for (JsonElement day : data.get("days").getAsJsonArray()) {
            days.add(day.getAsString());
        }
        items = new ArrayList<>();
        for (JsonElement item : data.get("data").getAsJsonArray()) {
            int item0 = item.getAsJsonArray().get(0).getAsInt();
            int item1 = item.getAsJsonArray().get(1).getAsInt();
            int item2 = item.getAsJsonArray().get(2).getAsInt();
            items.add(new ScatterDataItem().setValue(new Number[] { item0, item1, item2 }).setSymbolSize(item2 * 2));
        }
    }

    @Test
    public void testBasicPolarScatter() {
        PolarScatter polarScatter = new PolarScatter()
                .setLegend()
                .setTooltip("item")
                .setPolarAxis()
                .setAngleAxis(new CategoryAngleAxis()
                        .setData(hours.toArray())
                        .setBoundaryGap(false)
                        .setSplitLine(new SplitLine().setShow(true))
                        .setAxisLine(new AxisLine().setShow(false)))
                .setRadiusAxis(new CategoryRadiusAxis()
                        .setData(days.toArray())
                        .setAxisLine(new AxisLine().setShow(false))
                        .setAxisLabel(new CategoryAxisLabel().setRotate(45)))
                .addSeries(items.toArray());

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/polar-scatter/basic-polar-scatter.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(polarScatter.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(polarScatter.getOption()));
    }
}
