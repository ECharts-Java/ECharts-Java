package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.AxisLine;
import org.icepear.echarts.components.coord.CategoryAxisLabel;
import org.icepear.echarts.components.coord.ValueAxisLabel;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.series.LineStyle;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
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
                this.getClass().getResourceAsStream("/advanced/line/line-y-category.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
