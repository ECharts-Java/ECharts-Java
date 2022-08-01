package org.icepear.echarts.simple.funnel;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Funnel;
import org.icepear.echarts.charts.funnel.FunnelDataItem;
import org.icepear.echarts.charts.funnel.FunnelLabel;
import org.icepear.echarts.charts.funnel.FunnelSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicFunnelTest {
    @Test
    public void testBasicFunnel() {
        Funnel funnel = new Funnel()
                .setTitle("Funnel")
                .setTooltip("item")
                .setLegend()
                .addSeries(new FunnelSeries()
                        .setLabel(new FunnelLabel().setShow(true).setPosition("inside"))
                        .setData(new FunnelDataItem[] {
                                new FunnelDataItem().setValue(60).setName("Visit"),
                                new FunnelDataItem().setValue(40).setName("Inquiry"),
                                new FunnelDataItem().setValue(20).setName("Order"),
                                new FunnelDataItem().setValue(80).setName("Click"),
                                new FunnelDataItem().setValue(100).setName("Show")
                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/funnel/basic-funnel.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(funnel.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(funnel.getOption()));
    }
}
