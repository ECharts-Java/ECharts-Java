package org.icepear.echarts.simple.lines;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Lines;
import org.icepear.echarts.charts.lines.LinesDataItem;
import org.icepear.echarts.charts.lines.LinesEffect;
import org.icepear.echarts.charts.lines.LinesSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicLinesTest {

    @Test
    public void testBasicLines() {
        LinesDataItem[] data = new LinesDataItem[] {
                new LinesDataItem().setCoords(new Number[][] { { 0, 0 }, { 50, 80 } }),
                new LinesDataItem().setCoords(new Number[][] { { 50, 80 }, { 120, 30 } }),
                new LinesDataItem().setCoords(new Number[][] { { 120, 30 }, { 200, 90 } })
        };

        Lines chart = new Lines()
                .addSeries(new LinesSeries()
                        .setCoordinateSystem("cartesian2d")
                        .setPolyline(false)
                        .setEffect(new LinesEffect().setShow(true).setSymbol("arrow").setTrailLength(0.7))
                        .setData(data));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/lines/basic-lines.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(chart.getOption());
        assertEquals(expected, actual);
    }
}
