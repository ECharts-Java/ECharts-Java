package org.icepear.echarts.advanced.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.bar.BarSeries;
import org.icepear.echarts.components.coord.SplitArea;
import org.icepear.echarts.components.coord.SplitLine;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.dataZoom.DataZoom;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.toolbox.Toolbox;
import org.icepear.echarts.components.toolbox.ToolboxDataZoomFeature;
import org.icepear.echarts.components.toolbox.ToolboxSaveAsImageFeature;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.tooltip.TooltipAxisPointer;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * https://echarts.apache.org/examples/en/editor.html?c=bar-large
 *
 * The official example generates 500,000 random points at runtime. A snapshot
 * test cannot assert against random data, so this keeps the full option shape —
 * including the `large` flag that the example exists to demonstrate — and uses a
 * handful of fixed points instead.
 */
public class LargeScaleBarChartTest {

    @Test
    public void testLargeScaleBarChart() {
        // 官方例子用 formatTime('yyyy-MM-dd\nhh:mm:ss', ...) 逐秒生成，值经过 toFixed(2) 成字符串
        String[] categoryData = new String[] {
                "2011-01-01\n00:00:00",
                "2011-01-01\n00:00:01",
                "2011-01-01\n00:00:02",
                "2011-01-01\n00:00:03",
                "2011-01-01\n00:00:04"
        };
        String[] valueData = new String[] { "3521.00", "3273.00", "3810.00", "3096.00", "3644.00" };

        Title title = new Title()
                .setText("5 Data")
                .setLeft(10);

        Toolbox toolbox = new Toolbox().setFeature(new HashMap<String, ToolboxFeatureOption>() {
            {
                put("dataZoom", new ToolboxDataZoomFeature().setYAxisIndex(false));
                put("saveAsImage", new ToolboxSaveAsImageFeature().setPixelRatio(2));
            }
        });

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new TooltipAxisPointer()
                        .setType("shadow"));

        Grid grid = new Grid()
                .setBottom(90);

        DataZoom dataZoom1 = new DataZoom().setType("inside");

        DataZoom dataZoom2 = new DataZoom().setType("slider");

        // 官方例子两个轴都没写 type，交给 ECharts 推断 —— 置 null 以保持一致
        CategoryAxis xAxis = new CategoryAxis()
                .setType(null)
                .setData(categoryData)
                .setSilent(false)
                .setSplitLine(new SplitLine().setShow(false))
                .setSplitArea(new SplitArea().setShow(false));

        ValueAxis yAxis = new ValueAxis()
                .setType(null)
                .setSplitArea(new SplitArea().setShow(false));

        BarSeries series = new BarSeries()
                .setType("bar")
                .setData(valueData)
                .setLarge(true);

        Option option = new Option()
                .setTitle(title)
                .setToolbox(toolbox)
                .setTooltip(tooltip)
                .setGrid(grid)
                .setDataZoom(new DataZoom[] { dataZoom1, dataZoom2 })
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/bar/large-scale-bar-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
