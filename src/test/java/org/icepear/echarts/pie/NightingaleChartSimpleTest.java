package org.icepear.echarts.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.Legend;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.PieDataItem;
import org.icepear.echarts.component.PieItemStyle;
import org.icepear.echarts.component.PieSeries;
import org.icepear.echarts.component.Toolbox;
import org.icepear.echarts.component.ToolboxDataViewFeature;
import org.icepear.echarts.component.ToolboxDefaultFeature;
import org.icepear.echarts.component.ToolboxRestoreFeature;
import org.icepear.echarts.component.ToolboxSaveAsImageFeature;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class NightingaleChartSimpleTest {
    @Test
    public void testNightingaleChartSimple() {
        Legend legend = new Legend().setTop("bottom");
        
        Toolbox toolbox = new Toolbox()
                .setShow(true)
                .setFeature(new HashMap<>() {{
                    put("mark", new ToolboxDefaultFeature().setShow(true));
                    put("dataView", new ToolboxDataViewFeature().setShow(true).setReadOnly(false));
                    put("restore", new ToolboxRestoreFeature().setShow(true));
                    put("saveAsImage", new ToolboxSaveAsImageFeature().setShow(true));
                }});
        
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
                this.getClass().getResourceAsStream("/pie/nightingale-chart-simple.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
