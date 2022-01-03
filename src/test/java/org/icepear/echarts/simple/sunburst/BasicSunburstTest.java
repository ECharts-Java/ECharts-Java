package org.icepear.echarts.simple.sunburst;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Sunburst;
import org.icepear.echarts.charts.sunburst.SunburstLabel;
import org.icepear.echarts.charts.sunburst.SunburstSeries;
import org.icepear.echarts.charts.sunburst.SunburstSeriesNodeItem;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicSunburstTest {
    @Test
    public void testBasicSunburst() {
        Sunburst sunburst = new Sunburst()
                .addSeries(new SunburstSeries()
                        .setRadius(new String[] { "0", "90%" })
                        .setLabel(new SunburstLabel().setRotate("radial"))
                        .setData(new SunburstSeriesNodeItem[] {
                                new SunburstSeriesNodeItem().setName("Grandpa")
                                        .setChildren(new SunburstSeriesNodeItem[] {
                                                new SunburstSeriesNodeItem().setName("Uncle Leo").setValue(15)
                                                        .setChildren(new SunburstSeriesNodeItem[] {
                                                                new SunburstSeriesNodeItem().setName("Cousin Jack")
                                                                        .setValue(2),
                                                                new SunburstSeriesNodeItem().setName("Cousin Mary")
                                                                        .setValue(5)
                                                                        .setChildren(new SunburstSeriesNodeItem[] {
                                                                                new SunburstSeriesNodeItem()
                                                                                        .setName("Jackson").setValue(2)
                                                                        }),
                                                                new SunburstSeriesNodeItem().setName("Cousin Ben")
                                                                        .setValue(4)
                                                        }),
                                                new SunburstSeriesNodeItem().setName("Father").setValue(10)
                                                        .setChildren(new SunburstSeriesNodeItem[] {
                                                                new SunburstSeriesNodeItem().setName("Me").setValue(5),
                                                                new SunburstSeriesNodeItem().setName("Brother Peter")
                                                                        .setValue(1)
                                                        })
                                        }),
                                new SunburstSeriesNodeItem().setName("Nancy")
                                        .setChildren(new SunburstSeriesNodeItem[] {
                                                new SunburstSeriesNodeItem().setName("Uncle Nike")
                                                        .setChildren(new SunburstSeriesNodeItem[] {
                                                                new SunburstSeriesNodeItem().setName("Cousin Betty")
                                                                        .setValue(1),
                                                                new SunburstSeriesNodeItem().setName("Cousin Jenny")
                                                                        .setValue(2)
                                                        })
                                        })

                        }));

        Reader reader = new InputStreamReader(
        this.getClass().getResourceAsStream("/simple/sunburst/basic-sunburst.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartsSerializer.toJsonTree(sunburst.getOption());
        assertEquals(expected, actual);

        // System.out.println(EChartsSerializer.toJson(sunburst.getOption()));
    }
}
