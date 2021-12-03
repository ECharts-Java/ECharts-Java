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
import org.icepear.echarts.type.EChartsNumber;
import org.junit.Test;

public class TwoValueAxesInPolar2Test {
    @Test
    public void testTwoValueAxesInPolar2() {
        List<List<Number>> data = new ArrayList<>();
        for (int i = 0; i <= 360; i++) {
            Double t = (i / 180.0) * Math.PI;
            Double r = Math.sin(2 * t) * Math.cos(2 * t);
            data.add(Arrays.asList(r, i));
        }

        Title title = new Title().setText("Two Value-Axes in Polar");

        Legend legend = new Legend().setData(Arrays.asList("line"));

        Polar polar = new Polar()
                .setCenter(Arrays.asList(new EChartsNumber("50%"), new EChartsNumber("54%")));

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new AxisPointer().setType("cross"));

        ValueAngleAxis angleAxis = new ValueAngleAxis()
                .setType("value")
                .setStartAngle(0);

        ValueRadiusAxis radiusAxis = new ValueRadiusAxis()
                .setMin(0);

        LineSeries series = new LineSeries()
                .setCoordinateSystem("polar")
                .setName("line")
                .setType("line")
                .setShowSymbol(false)
                .setData(data);

        Option option = new Option()
                .setTitle(title)
                .setLegend(legend)
                .setPolar(polar)
                .setTooltip(tooltip)
                .setAngleAxis(angleAxis)
                .setRadiusAxis(radiusAxis)
                .setSeries(Arrays.asList(series))
                .setAnimationDuration(2000);

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/two-value-axes-in-polar-2.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
