package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.AxisPointer;
import org.icepear.echarts.component.Legend;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.Polar;
import org.icepear.echarts.component.Title;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.ValueAngleAxis;
import org.icepear.echarts.component.ValueRadiusAxis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class TwoValueAxesInPolar1Test {
    @Test
    public void testTwoValueAxesInPolar1() {
        List<List<Double>> data = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            Double theta = (i / 100.0) * 360;
            Double r = 5 * (1 + Math.sin((theta / 180) * Math.PI));
            data.add(Arrays.asList(r, theta));
        }

        Title title = new Title().setText("Two Value-Axes in Polar");

        Legend legend = new Legend().setData(Arrays.asList("line"));

        Polar polar = new Polar();

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new AxisPointer().setType("cross"));

        ValueAngleAxis angleAxis = new ValueAngleAxis()
                .setType("value")
                .setStartAngle(0);

        ValueRadiusAxis radiusAxis = new ValueRadiusAxis();

        LineSeries series = new LineSeries()
                .setCoordinateSystem("polar")
                .setName("line")
                .setType("line")
                .setData(data);

        Option option = new Option()
                .setTitle(title)
                .setLegend(legend)
                .setPolar(polar)
                .setTooltip(tooltip)
                .setAngleAxis(angleAxis)
                .setRadiusAxis(radiusAxis)
                .setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/two-value-axes-in-polar-1.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
