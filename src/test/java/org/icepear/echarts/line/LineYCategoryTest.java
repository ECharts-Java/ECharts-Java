package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.AxisLine;
import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.CategoryAxisLabel;
import org.icepear.echarts.component.Grid;
import org.icepear.echarts.component.Legend;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.LineStyle;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.ValueAxisLabel;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class LineYCategoryTest {
    @Test
    public void testLineYCategory() {
        Legend legend = new Legend()
                .setData(new String[] { "Altitude (km) vs. temperature (°C)" });

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setFormatter("Temperature : <br/>{b}km : {c}°C");

        Grid grid = new Grid()
                .setLeft("3%")
                .setRight("4%")
                .setBottom("3%")
                .setContainLabel(true);

        ValueAxis xAxis = new ValueAxis()
                .setType("value")
                .setAxisLabel(new ValueAxisLabel()
                        .setFormatter("{value} °C"));

        CategoryAxis yAxis = new CategoryAxis()
                .setType("category")
                .setAxisLine(new AxisLine().setOnZero(false))
                .setAxisLabel(new CategoryAxisLabel().setFormatter("{value} km"))
                .setBoundaryGap(false)
                .setData(new String[] { "0", "10", "20", "30", "40", "50", "60", "70", "80" });

        LineSeries series = new LineSeries()
                .setName("Altitude (km) vs. temperature (°C)")
                .setType("line")
                .setSymbolSize(10)
                .setSymbol("circle")
                .setSmooth(true)
                .setLineStyle(new LineStyle()
                    .setWidth(3)
                    .setShadowColor("rgba(0,0,0,0.3)")
                    .setShadowBlur(10)
                    .setShadowOffsetY(8))
                .setData(new Number[] { 15, -50, -56.5, -46.5, -22.1, -2.5, -27.7, -55.7, -76.5 });

        Option option = new Option()
                .setTooltip(tooltip)
                .setLegend(legend)
                .setGrid(grid)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/line-y-category.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
