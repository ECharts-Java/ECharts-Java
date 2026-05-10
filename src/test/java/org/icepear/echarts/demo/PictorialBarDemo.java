package org.icepear.echarts.demo;

import java.io.FileWriter;
import java.io.Writer;

import org.icepear.echarts.PictorialBar;
import org.icepear.echarts.charts.bar.BarItemStyle;
import org.icepear.echarts.charts.pictorialBar.PictorialBarSeries;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Local-only demo: writes /tmp/pictorial-bar-demo.html.
 *
 * Run: mvn test -Dtest=PictorialBarDemo
 * Then: open /tmp/pictorial-bar-demo.html
 */
public class PictorialBarDemo {

    @Test
    public void writeDemoHtml() throws Exception {
        // Stack of "person" SVG icons whose count tracks daily-steps progress toward 10k goal.
        String personPath = "path://M19 11h-1V7c0-3.31-2.69-6-6-6S6 3.69 6 7v4H5c-1.1 0-2 .9-2 2v9c0 "
                + "1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9c0-1.1-.9-2-2-2zm-7-8c2.21 0 4 1.79 4 4v4h-8V7c0-2.21 1.79-4 4-4z";

        PictorialBar chart = new PictorialBar()
                .setTitle(new Title().setText("Daily Steps (icons = thousand steps)").setLeft("center"))
                .setTooltip(new Tooltip().setTrigger("axis"))
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .addYAxis(" ")
                .addSeries(new PictorialBarSeries()
                        .setName("Steps")
                        .setSymbol(personPath)
                        .setSymbolRepeat(true)
                        .setSymbolSize(new Number[] { 22, 22 })
                        .setSymbolMargin("10%")
                        .setSymbolBoundingData(20)
                        .setSymbolClip(false)
                        .setItemStyle(new BarItemStyle().setColor("#2f89cf"))
                        .setData(new Number[] { 8, 9, 12, 7, 14, 18, 15 }));

        String optionJson = new EChartsSerializer().toJson(chart.getOption());

        String html = "<!doctype html><html><head><meta charset='utf-8'><title>PictorialBar Demo</title>"
                + "<script src='https://cdnjs.cloudflare.com/ajax/libs/echarts/5.4.3/echarts.min.js'></script>"
                + "<style>html,body,#chart{margin:0;width:100%;height:100vh;background:#f4f6fb}</style>"
                + "</head><body><div id='chart'></div><script>"
                + "const chart = echarts.init(document.getElementById('chart'));"
                + "chart.setOption(" + optionJson + ");"
                + "window.addEventListener('resize', () => chart.resize());"
                + "</script></body></html>";

        try (Writer w = new FileWriter("/tmp/pictorial-bar-demo.html")) {
            w.write(html);
        }
        System.out.println("\n>>> Wrote /tmp/pictorial-bar-demo.html — open it in a browser.\n");
    }
}
