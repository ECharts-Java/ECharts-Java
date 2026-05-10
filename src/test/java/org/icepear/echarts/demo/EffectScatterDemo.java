package org.icepear.echarts.demo;

import java.io.FileWriter;
import java.io.Writer;

import org.icepear.echarts.EffectScatter;
import org.icepear.echarts.charts.effectScatter.EffectScatterDataItem;
import org.icepear.echarts.charts.effectScatter.EffectScatterSeries;
import org.icepear.echarts.charts.effectScatter.RippleEffect;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Local-only demo: writes /tmp/effect-scatter-demo.html.
 *
 * Run: mvn test -Dtest=EffectScatterDemo
 * Then: open /tmp/effect-scatter-demo.html
 */
public class EffectScatterDemo {

    @Test
    public void writeDemoHtml() throws Exception {
        EffectScatterDataItem[] data = new EffectScatterDataItem[] {
                new EffectScatterDataItem().setName("San Francisco").setValue(new Number[] { 12, 78 }).setSymbolSize(28),
                new EffectScatterDataItem().setName("Los Angeles").setValue(new Number[] { 22, 60 }).setSymbolSize(34),
                new EffectScatterDataItem().setName("Seattle").setValue(new Number[] { 14, 90 }).setSymbolSize(20),
                new EffectScatterDataItem().setName("Austin").setValue(new Number[] { 55, 50 }).setSymbolSize(26),
                new EffectScatterDataItem().setName("New York").setValue(new Number[] { 90, 80 }).setSymbolSize(40),
                new EffectScatterDataItem().setName("Miami").setValue(new Number[] { 88, 25 }).setSymbolSize(22),
                new EffectScatterDataItem().setName("Chicago").setValue(new Number[] { 70, 75 }).setSymbolSize(30),
                new EffectScatterDataItem().setName("Denver").setValue(new Number[] { 45, 70 }).setSymbolSize(24)
        };

        EffectScatter chart = new EffectScatter()
                .setTitle(new Title().setText("Active Incident Hotspots").setLeft("center"))
                .setTooltip(new Tooltip().setTrigger("item"))
                .addXAxis()
                .addYAxis()
                .addSeries(new EffectScatterSeries()
                        .setName("Live Reports")
                        .setShowEffectOn("render")
                        .setRippleEffect(new RippleEffect()
                                .setScale(3)
                                .setBrushType("stroke")
                                .setPeriod(4))
                        .setData(data));

        String optionJson = new EChartsSerializer().toJson(chart.getOption());

        String html = "<!doctype html><html><head><meta charset='utf-8'><title>EffectScatter Demo</title>"
                + "<script src='https://cdnjs.cloudflare.com/ajax/libs/echarts/5.4.3/echarts.min.js'></script>"
                + "<style>html,body,#chart{margin:0;width:100%;height:100vh;background:#0b1220;color:#fff}</style>"
                + "</head><body><div id='chart'></div><script>"
                + "const chart = echarts.init(document.getElementById('chart'),'dark');"
                + "chart.setOption(" + optionJson + ");"
                + "window.addEventListener('resize', () => chart.resize());"
                + "</script></body></html>";

        try (Writer w = new FileWriter("/tmp/effect-scatter-demo.html")) {
            w.write(html);
        }
        System.out.println("\n>>> Wrote /tmp/effect-scatter-demo.html — open it in a browser.\n");
    }
}
