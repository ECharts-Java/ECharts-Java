package org.icepear.echarts.advanced.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieItemStyle;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.toolbox.Toolbox;
import org.icepear.echarts.components.toolbox.ToolboxDataViewFeature;
import org.icepear.echarts.components.toolbox.ToolboxDefaultFeature;
import org.icepear.echarts.components.toolbox.ToolboxRestoreFeature;
import org.icepear.echarts.components.toolbox.ToolboxSaveAsImageFeature;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class NightingaleChartSimpleTest {
    @Test
    public void testNightingaleChartSimple() {
        Legend legend = new Legend().setTop("bottom");

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

        PieSeries series = new PieSeries()
                .setName("Nightingale Chart")
                .setType("pie")
                .setRadius(new Number[] { 50, 250 })
                .setCenter(new String[] { "50%", "50%" })
                .setRoseType("area")
                .setItemStyle(new PieItemStyle().setBorderRadius(8))
                .setData(new PieDataItem[] {
                        new PieDataItem().setValue(40).setName("rose 1"),
                        new PieDataItem().setValue(38).setName("rose 2"),
                        new PieDataItem().setValue(32).setName("rose 3"),
                        new PieDataItem().setValue(30).setName("rose 4"),
                        new PieDataItem().setValue(28).setName("rose 5"),
                        new PieDataItem().setValue(26).setName("rose 6"),
                        new PieDataItem().setValue(22).setName("rose 7"),
                        new PieDataItem().setValue(18).setName("rose 8")
                });

        Option option = new Option()
                .setLegend(legend)
                .setToolbox(toolbox)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/pie/nightingale-chart-simple.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
