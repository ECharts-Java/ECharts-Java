package org.icepear.echarts.advanced.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieEmphasis;
import org.icepear.echarts.charts.pie.PieItemStyle;
import org.icepear.echarts.charts.pie.PieLabel;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.toolbox.Toolbox;
import org.icepear.echarts.components.toolbox.ToolboxDataViewFeature;
import org.icepear.echarts.components.toolbox.ToolboxDefaultFeature;
import org.icepear.echarts.components.toolbox.ToolboxRestoreFeature;
import org.icepear.echarts.components.toolbox.ToolboxSaveAsImageFeature;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class NightingaleChartTest {
    @Test
    public void testNightingaleChart() {
        Title title = new Title()
                .setText("Nightingale Chart")
                .setSubtext("Fake Data")
                .setLeft("center");

        Tooltip tooltip = new Tooltip()
                .setTrigger("item")
                .setFormatter("{a} <br/>{b} : {c} ({d}%)");

        Legend legend = new Legend()
                .setLeft("center")
                .setTop("bottom")
                .setData(new String[] {
                        "rose1",
                        "rose2",
                        "rose3",
                        "rose4",
                        "rose5",
                        "rose6",
                        "rose7",
                        "rose8" });

        Toolbox toolbox = new Toolbox()
                .setShow(true)
                .setFeature(new HashMap<String, ToolboxFeatureOption>() {
                    {
                        put("mark", new ToolboxDefaultFeature().setShow(true));
                        put("dataView", new ToolboxDataViewFeature().setShow(true).setReadOnly(false));
                        put("restore", new ToolboxRestoreFeature().setShow(true));
                        put("saveAsImage", new ToolboxSaveAsImageFeature().setShow(true));
                    }
                });

        PieSeries series1 = new PieSeries()
                .setName("Radius Mode")
                .setType("pie")
                .setRadius(new Number[] { 20, 140 })
                .setCenter(new String[] { "25%", "50%" })
                .setRoseType("radius")
                .setItemStyle(new PieItemStyle().setBorderRadius(5))
                .setLabel(new PieLabel().setShow(false))
                .setEmphasis(new PieEmphasis()
                        .setLabel(new PieLabel().setShow(true)))
                .setData(new PieDataItem[] {
                        new PieDataItem().setValue(40).setName("rose 1"),
                        new PieDataItem().setValue(33).setName("rose 2"),
                        new PieDataItem().setValue(28).setName("rose 3"),
                        new PieDataItem().setValue(22).setName("rose 4"),
                        new PieDataItem().setValue(20).setName("rose 5"),
                        new PieDataItem().setValue(15).setName("rose 6"),
                        new PieDataItem().setValue(12).setName("rose 7"),
                        new PieDataItem().setValue(10).setName("rose 8")
                });

        PieSeries series2 = new PieSeries()
                .setName("Area Mode")
                .setType("pie")
                .setRadius(new Number[] { 20, 140 })
                .setCenter(new String[] { "75%", "50%" })
                .setRoseType("area")
                .setItemStyle(new PieItemStyle().setBorderRadius(5))
                .setData(new PieDataItem[] {
                        new PieDataItem().setValue(30).setName("rose 1"),
                        new PieDataItem().setValue(28).setName("rose 2"),
                        new PieDataItem().setValue(26).setName("rose 3"),
                        new PieDataItem().setValue(24).setName("rose 4"),
                        new PieDataItem().setValue(22).setName("rose 5"),
                        new PieDataItem().setValue(20).setName("rose 6"),
                        new PieDataItem().setValue(18).setName("rose 7"),
                        new PieDataItem().setValue(16).setName("rose 8")
                });

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setToolbox(toolbox)
                .setSeries(new SeriesOption[] { series1, series2 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/pie/nightingale-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
