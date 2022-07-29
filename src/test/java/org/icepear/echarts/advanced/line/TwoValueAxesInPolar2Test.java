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

public class TwoValueAxesInPolar2Test {
    @Test
    public void testTwoValueAxesInPolar2() {
        Number[][] data = new Number[361][2];
        for (int i = 0; i <= 360; i++) {
            Double t = (i / 180.0) * Math.PI;
            Double r = Math.sin(2 * t) * Math.cos(2 * t);
            data[i][0] = r;
            data[i][1] = i;
        }

        Title title = new Title().setText("Two Value-Axes in Polar");

        Legend legend = new Legend().setData(new String[] { "line" });

        PolarAxis polar = new PolarAxis()
                .setCenter(new String[] { "50%", "54%" });

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new TooltipAxisPointer().setType("cross"));

        ValueAngleAxis angleAxis = new ValueAngleAxis()
                .setType("value")
                .setStartAngle(0);

        ValueRadiusAxis radiusAxis = new ValueRadiusAxis()
                .setType(null)
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
                .setSeries(new SeriesOption[] { series })
                .setAnimationDuration(2000);

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/line/two-value-axes-in-polar-2.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
