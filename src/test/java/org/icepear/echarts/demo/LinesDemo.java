package org.icepear.echarts.demo;

import java.io.FileWriter;
import java.io.Writer;

import org.icepear.echarts.Lines;
import org.icepear.echarts.charts.lines.LinesDataItem;
import org.icepear.echarts.charts.lines.LinesEffect;
import org.icepear.echarts.charts.lines.LinesSeries;
import org.icepear.echarts.components.series.LineStyle;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Local-only demo: writes /tmp/lines-demo.html.
 *
 * Run: mvn test -Dtest=LinesDemo
 * Then: open /tmp/lines-demo.html
 */
public class LinesDemo {

    @Test
    public void writeDemoHtml() throws Exception {
        // 5 fictional "city" coordinates on a 2D plane (no real geo).
        Number[] sf  = { 10, 60 };
        Number[] la  = { 20, 30 };
        Number[] chi = { 60, 70 };
        Number[] ny  = { 90, 75 };
        Number[] mia = { 88, 15 };

        LinesDataItem[] data = new LinesDataItem[] {
                new LinesDataItem().setCoords(new Number[][] { sf, ny }),
                new LinesDataItem().setCoords(new Number[][] { la, chi }),
                new LinesDataItem().setCoords(new Number[][] { la, mia }),
                new LinesDataItem().setCoords(new Number[][] { chi, ny }),
                new LinesDataItem().setCoords(new Number[][] { sf, mia })
        };

        Lines chart = new Lines()
                .setTitle(new Title().setText("Animated Flight Paths").setLeft("center"))
                .setTooltip(new Tooltip().setTrigger("item"))
                .addSeries(new LinesSeries()
                        .setName("Routes")
                        .setCoordinateSystem("cartesian2d")
                        .setPolyline(false)
                        .setEffect(new LinesEffect()
                                .setShow(true)
                                .setSymbol("arrow")
                                .setSymbolSize(8)
                                .setTrailLength(0.7)
                                .setPeriod(6))
                        .setLineStyle(new LineStyle()
                                .setColor("#a6c8ff")
                                .setWidth(1)
                                .setOpacity(0.6)
                                .setType("solid"))
                        .setData(data));

        String optionJson = new EChartsSerializer().toJson(chart.getOption());

        // Lines extends base Chart, so axes aren't auto-emitted.  For the cartesian2d demo
        // we layer minimal axes onto the option after serialization via JS.
        String html = "<!doctype html><html><head><meta charset='utf-8'><title>Lines Demo</title>"
                + "<script src='https://cdnjs.cloudflare.com/ajax/libs/echarts/5.4.3/echarts.min.js'></script>"
                + "<style>html,body,#chart{margin:0;width:100%;height:100vh;background:#0b1220}</style>"
                + "</head><body><div id='chart'></div><script>"
                + "const chart = echarts.init(document.getElementById('chart'),'dark');"
                + "const opt = " + optionJson + ";"
                + "opt.xAxis = { type: 'value', min: 0, max: 100, show: false };"
                + "opt.yAxis = { type: 'value', min: 0, max: 100, show: false };"
                + "chart.setOption(opt);"
                + "window.addEventListener('resize', () => chart.resize());"
                + "</script></body></html>";

        try (Writer w = new FileWriter("/tmp/lines-demo.html")) {
            w.write(html);
        }
        System.out.println("\n>>> Wrote /tmp/lines-demo.html — open it in a browser.\n");
    }
}
