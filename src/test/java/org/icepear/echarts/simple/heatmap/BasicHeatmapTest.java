package org.icepear.echarts.simple.heatmap;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.icepear.echarts.Heatmap;
import org.icepear.echarts.charts.heatmap.HeatmapSeries;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Before;
import org.junit.Test;

public class BasicHeatmapTest {
    private List<String> hours;
    private List<String> days;
    private List<Number[]> punchcard;

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
        punchcard = new ArrayList<>();
        for (JsonElement item : data.get("data").getAsJsonArray()) {
            int item0 = item.getAsJsonArray().get(0).getAsInt();
            int item1 = item.getAsJsonArray().get(1).getAsInt();
            int item2 = item.getAsJsonArray().get(2).getAsInt();
            punchcard.add(new Number[] { item1, item0, item2 == 0 ? null : item2 });
        }
    }

    @Test
    public void testBasicHeatmap() {
        Heatmap heatmap = new Heatmap()
                .addXAxis(hours.toArray(new String[0]))
                .addYAxis(days.toArray(new String[0]))
                .setVisualMap(0, 10)
                .addSeries(new HeatmapSeries().setName("Punch Card")
                        .setData(punchcard.toArray())
                        .setLabel(new SeriesLabel().setShow(true)));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/heatmap/basic-heatmap.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(heatmap.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(heatmap.getOption()));
    }
}
