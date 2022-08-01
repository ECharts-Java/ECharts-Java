package org.icepear.echarts.simple.polarBar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.PolarBar;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class RadialPolarBarTest {
    @Test
    public void testRadialPolarBar() {
        PolarBar polarBar = new PolarBar()
                .setTitle("Radial Polar Bar")
                .setPolarAxis(new String[] { "30", "80%" })
                .setRadiusAxis(4)
                .setAngleAxis(new String[] { "a", "b", "c", "d" })
                .setTooltip("item")
                .addSeries(new Number[] { 2, 1.2, 2.4, 3.6 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/polar-bar/radial-polar-bar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(polarBar.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(polarBar.getOption()));
    }
}
