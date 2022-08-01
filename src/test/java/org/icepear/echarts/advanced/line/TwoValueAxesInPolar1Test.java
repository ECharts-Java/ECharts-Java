package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.polar.PolarAxis;
import org.icepear.echarts.components.coord.polar.ValueAngleAxis;
import org.icepear.echarts.components.coord.polar.ValueRadiusAxis;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.tooltip.TooltipAxisPointer;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class TwoValueAxesInPolar1Test {
    @Test
    public void testTwoValueAxesInPolar1() {
        Number[][] data = new Number[101][2];
        for (int i = 0; i <= 100; i++) {
            Double theta = (i / 100.0) * 360;
            Double r = 5 * (1 + Math.sin((theta / 180) * Math.PI));
            data[i][0] = r;
            data[i][1] = theta;
        }

        Title title = new Title().setText("Two Value-Axes in Polar");

        Legend legend = new Legend().setData(new String[] { "line" });

        PolarAxis polar = new PolarAxis();

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new TooltipAxisPointer().setType("cross"));

        ValueAngleAxis angleAxis = new ValueAngleAxis()
                .setType("value")
                .setStartAngle(0);

        ValueRadiusAxis radiusAxis = new ValueRadiusAxis().setType(null);

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
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/line/two-value-axes-in-polar-1.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
