package org.icepear.echarts.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.AxisPointer;
import org.icepear.echarts.component.BarSeries;
import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.CategoryAxisTick;
import org.icepear.echarts.component.Grid;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.Axis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.icepear.echarts.type.BoxLength;
import org.junit.Test;

public class AxisAlignWithTickTest {
    @Test
    public void testAxisAlignWithTick() {
        AxisPointer axisPointer = new AxisPointer();
        axisPointer.setType("shadow");
        Tooltip tooltip = new Tooltip();
        tooltip.setTrigger("axis");
        tooltip.setAxisPointer(axisPointer);

        Grid grid = new Grid();
        grid.setLeft(new BoxLength<String>("3%"));
        grid.setRight(new BoxLength<String>("4%"));
        grid.setBottom(new BoxLength<String>("3%"));
        grid.setContainLabel(true);

        CategoryAxisTick axisTick = new CategoryAxisTick();
        axisTick.setAlignWithLabel(true);
        CategoryAxis xCategoryAxis = new CategoryAxis();
        xCategoryAxis.setType("category");
        xCategoryAxis.setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        xCategoryAxis.setAxisTick(axisTick);
        Axis xAxis = new Axis();
        xAxis.setAxisBaseOption(xCategoryAxis);

        ValueAxis yValueAxis = new ValueAxis();
        yValueAxis.setType("value");
        Axis yAxis = new Axis();
        yAxis.setAxisBaseOption(yValueAxis);

        BarSeries series = new BarSeries();
        series.setName("Direct");
        series.setType("bar");
        series.setBarWidth(new BoxLength<String>("60%"));
        series.setData(Arrays.asList(10, 52, 200, 334, 390, 330, 220));
        

        Option option = new Option();
        option.setTooltip(Arrays.asList(tooltip));
        option.setGrid(Arrays.asList(grid));
        option.setXAxis(Arrays.asList(xAxis));
        option.setYAxis(Arrays.asList(yAxis));
        option.setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/bar/axis-align-with-tick.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
