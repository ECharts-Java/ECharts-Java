package org.icepear.echarts.simple.polarLine;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.PolarLine;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.polar.ValueRadiusAxis;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.tooltip.TooltipAxisPointer;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicPolarLineTest {
    @Test
    public void testBasicPolarLine() {
        Number[][] data = new Number[361][2];
        for (int i = 0; i <= 360; i++) {
            Double t = (i / 180.0) * Math.PI;
            Double r = Math.sin(2 * t) * Math.cos(2 * t);
            data[i][0] = r;
            data[i][1] = i;
        }

        PolarLine polarLine = new PolarLine()
                .setTooltip(new Tooltip().setType("axis")
                        .setAxisPointer(new TooltipAxisPointer().setType("cross")))
                .setPolarAxis()
                .setAngleAxis()
                .setRadiusAxis(new ValueRadiusAxis().setMin(0))
                .addSeries(new LineSeries().setCoordinateSystem("polar")
                        .setShowSymbol(false).setData(data));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/polar-line/basic-polar-line.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(polarLine.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(polarLine.getOption()));
    }
}
