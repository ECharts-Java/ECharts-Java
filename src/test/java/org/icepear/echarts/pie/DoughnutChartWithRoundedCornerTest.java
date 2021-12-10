package org.icepear.echarts.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.Legend;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.PieDataItem;
import org.icepear.echarts.component.PieEmphasis;
import org.icepear.echarts.component.PieItemStyle;
import org.icepear.echarts.component.PieLabel;
import org.icepear.echarts.component.PieLabelLine;
import org.icepear.echarts.component.PieSeries;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartSerializer;
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
                this.getClass().getResourceAsStream("/pie/doughnut-chart-with-rounded-corner.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
