package org.icepear.echarts.simple.polarBar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.PolarBar;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class TangentialPolarBarTest {
    @Test
    public void testTangentialPolarBar() {
        PolarBar polarBar = new PolarBar()
                .setTitle("Tangential Polar Bar")
                .setPolarAxis(new String[] { "30", "80%" })
                .setRadiusAxis(new String[] { "a", "b", "c", "d" })
                .setAngleAxis(4)
                .setTooltip("item")
                .addSeries(new Number[] { 2, 1.2, 2.4, 3.6 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/polar-bar/tangential-polar-bar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(polarBar.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(polarBar.getOption()));
    }
}
