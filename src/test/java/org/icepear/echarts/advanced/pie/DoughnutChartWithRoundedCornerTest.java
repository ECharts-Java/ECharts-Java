package org.icepear.echarts.advanced.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieEmphasis;
import org.icepear.echarts.charts.pie.PieItemStyle;
import org.icepear.echarts.charts.pie.PieLabel;
import org.icepear.echarts.charts.pie.PieLabelLine;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class DoughnutChartWithRoundedCornerTest {
    @Test
    public void testDoughnutChartWithRoundedCorner() {
        Tooltip tooltip = new Tooltip().setTrigger("item");

        Legend legend = new Legend().setTop("5%").setLeft("center");

        PieSeries series = new PieSeries()
                .setName("Access From")
                .setType("pie")
                .setRadius(new String[] { "40%", "70%" })
                .setAvoidLabelOverlap(false)
                .setItemStyle(new PieItemStyle()
                        .setBorderRadius(10)
                        .setBorderColor("#fff")
                        .setBorderWidth(2))
                .setLabel(new PieLabel()
                        .setShow(false)
                        .setPosition("center"))
                .setEmphasis(new PieEmphasis()
                        .setLabel(new PieLabel()
                                .setShow(true)
                                .setFontSize("40")
                                .setFontWeight("bold")))
                .setLabelLine(new PieLabelLine().setShow(false))
                .setData(new PieDataItem[] {
                        new PieDataItem().setValue(1048).setName("Search Engine"),
                        new PieDataItem().setValue(735).setName("Direct"),
                        new PieDataItem().setValue(580).setName("Email"),
                        new PieDataItem().setValue(484).setName("Union Ads"),
                        new PieDataItem().setValue(300).setName("Video Ads") });

        Option option = new Option()
                .setTooltip(tooltip)
                .setLegend(legend)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/pie/doughnut-chart-with-rounded-corner.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
