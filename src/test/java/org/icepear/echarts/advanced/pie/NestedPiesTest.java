package org.icepear.echarts.advanced.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieLabel;
import org.icepear.echarts.charts.pie.PieLabelLine;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.text.Text;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.origin.util.TextCommonOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class NestedPiesTest {
    @Test
    public void testNestedPies() {
        Tooltip tooltip = new Tooltip()
                .setTrigger("item")
                .setFormatter("{a} <br/>{b}: {c} ({d}%)");

        Legend legend = new Legend().setData(new String[] {
                "Direct",
                "Marketing",
                "Search Engine",
                "Email",
                "Union Ads",
                "Video Ads",
                "Baidu",
                "Google",
                "Bing",
                "Others" });

        PieSeries series1 = new PieSeries()
                .setName("Access From")
                .setType("pie")
                .setSelectedMode("single")
                .setRadius(new Object[] { 0, "30%" })
                .setLabel(new PieLabel()
                        .setPosition("inner")
                        .setFontSize(14))
                .setLabelLine(new PieLabelLine().setShow(false))
                .setData(new PieDataItem[] {
                        new PieDataItem().setValue(1548).setName("Search Engine"),
                        new PieDataItem().setValue(775).setName("Direct"),
                        new PieDataItem().setValue(679).setName("Marketing").setSelected(true) });

        PieSeries series2 = new PieSeries()
                .setName("Access From")
                .setType("pie")
                .setRadius(new String[] { "45%", "60%" })
                .setLabelLine(new PieLabelLine().setLength(30))
                .setLabel(new PieLabel()
                        .setFormatter("{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ")
                        .setBackgroundColor("#F6F8FC")
                        .setBorderColor("#8C8D8E")
                        .setBorderWidth(1)
                        .setBorderRadius(4)
                        .setRich(new HashMap<String, TextCommonOption>() {
                            {
                                put("a", new Text()
                                        .setColor("#6E7079")
                                        .setLineHeight(22)
                                        .setAlign("center"));
                                put("hr", new Text()
                                        .setBorderColor("#8C8D8E")
                                        .setWidth("100%")
                                        .setBorderWidth(1)
                                        .setHeight(0));
                                put("b", new Text()
                                        .setColor("#4C5058")
                                        .setFontSize(14)
                                        .setFontWeight("bold")
                                        .setLineHeight(33));
                                put("per", new Text()
                                        .setColor("#fff")
                                        .setBackgroundColor("#4C5058")
                                        .setPadding(new Number[] { 3, 4 })
                                        .setBorderRadius(4));
                            }
                        }))
                .setData(new PieDataItem[] {
                        new PieDataItem().setValue(1048).setName("Baidu"),
                        new PieDataItem().setValue(335).setName("Direct"),
                        new PieDataItem().setValue(310).setName("Email"),
                        new PieDataItem().setValue(251).setName("Google"),
                        new PieDataItem().setValue(234).setName("Union Ads"),
                        new PieDataItem().setValue(147).setName("Bing"),
                        new PieDataItem().setValue(135).setName("Video Ads"),
                        new PieDataItem().setValue(102).setName("Others") });

        Option option = new Option()
                .setTooltip(tooltip)
                .setLegend(legend)
                .setSeries(new SeriesOption[] { series1, series2 });

        Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/advanced/pie/nested-pies.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
