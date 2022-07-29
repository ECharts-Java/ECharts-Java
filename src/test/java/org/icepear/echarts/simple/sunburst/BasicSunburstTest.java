package org.icepear.echarts.simple.sunburst;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Sunburst;
import org.icepear.echarts.charts.sunburst.SunburstLabel;
import org.icepear.echarts.charts.sunburst.SunburstSeries;
import org.icepear.echarts.charts.sunburst.SunburstNodeItem;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicSunburstTest {
    @Test
    public void testBasicSunburst() {
        Sunburst sunburst = new Sunburst()
                .addSeries(new SunburstSeries()
                        .setRadius(new String[] { "0", "90%" })
                        .setLabel(new SunburstLabel().setRotate("radial"))
                        .setData(new SunburstNodeItem[] {
                                new SunburstNodeItem().setName("Grandpa")
                                        .setChildren(new SunburstNodeItem[] {
                                                new SunburstNodeItem().setName("Uncle Leo").setValue(15)
                                                        .setChildren(new SunburstNodeItem[] {
                                                                new SunburstNodeItem().setName("Cousin Jack")
                                                                        .setValue(2),
                                                                new SunburstNodeItem().setName("Cousin Mary")
                                                                        .setValue(5)
                                                                        .setChildren(new SunburstNodeItem[] {
                                                                                new SunburstNodeItem()
                                                                                        .setName("Jackson").setValue(2)
                                                                        }),
                                                                new SunburstNodeItem().setName("Cousin Ben")
                                                                        .setValue(4)
                                                        }),
                                                new SunburstNodeItem().setName("Father").setValue(10)
                                                        .setChildren(new SunburstNodeItem[] {
                                                                new SunburstNodeItem().setName("Me").setValue(5),
                                                                new SunburstNodeItem().setName("Brother Peter")
                                                                        .setValue(1)
                                                        })
                                        }),
                                new SunburstNodeItem().setName("Nancy")
                                        .setChildren(new SunburstNodeItem[] {
                                                new SunburstNodeItem().setName("Uncle Nike")
                                                        .setChildren(new SunburstNodeItem[] {
                                                                new SunburstNodeItem().setName("Cousin Betty")
                                                                        .setValue(1),
                                                                new SunburstNodeItem().setName("Cousin Jenny")
                                                                        .setValue(2)
                                                        })
                                        })

                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/sunburst/basic-sunburst.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(sunburst.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(sunburst.getOption()));
    }
}
