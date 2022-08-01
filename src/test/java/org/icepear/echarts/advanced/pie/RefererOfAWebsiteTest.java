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
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class RefererOfAWebsiteTest {
    @Test
    public void testRefererOfAWebsite() {
        Title title = new Title()
                .setText("Referer of a Website")
                .setSubtext("Fake Data")
                .setLeft("center");

        Tooltip tooltip = new Tooltip().setTrigger("item");

        Legend legend = new Legend()
                .setOrient("vertical")
                .setLeft("left");

        PieSeries series = new PieSeries()
                .setName("Access From")
                .setType("pie")
                .setRadius("50%")
                .setData(new PieDataItem[] {
                        new PieDataItem().setValue(1048).setName("Search Engine"),
                        new PieDataItem().setValue(735).setName("Direct"),
                        new PieDataItem().setValue(580).setName("Email"),
                        new PieDataItem().setValue(484).setName("Union Ads"),
                        new PieDataItem().setValue(300).setName("Video Ads") })
                .setEmphasis(new PieEmphasis()
                        .setItemStyle(new PieItemStyle()
                                .setShadowBlur(10)
                                .setShadowOffsetX(0)
                                .setShadowColor("rgba(0, 0, 0, 0.5)")));

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/pie/referer-of-a-website.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
