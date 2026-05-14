package org.icepear.echarts.demo;

import java.io.FileWriter;
import java.io.Writer;

import org.icepear.echarts.Pie;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.icepear.echarts.serializer.JsFunction;
import org.junit.Test;

/**
 * Local-only demo: writes /tmp/js-function-tooltip-demo.html.
 *
 * Hover over a slice to see the rich tooltip rendered by the JS function
 * built in Java via {@link JsFunction}. This is the visual proof for issue #86.
 *
 * Run: mvn test -Dtest=JsFunctionTooltipDemo
 * Then: open /tmp/js-function-tooltip-demo.html
 */
public class JsFunctionTooltipDemo {

    @Test
    public void writeDemoHtml() throws Exception {
        // The exact JS shape the issue requested — multi-line HTML built from
        // params.marker / params.name / params.value / params.percent.
        JsFunction tooltipFormatter = new JsFunction(
                "function (params) {\n"
              + "  return ''\n"
              + "    + '<div class=\"tooltip-content\">'\n"
              + "    + '  ' + params.marker\n"
              + "    + '  <p class=\"tooltip-category\">' + params.name + '</p>'\n"
              + "    + '  <p class=\"tooltip-value\">' + params.value.toLocaleString() + '</p>'\n"
              + "    + '  <p class=\"tooltip-currency\">MDL</p>'\n"
              + "    + '  <div class=\"tooltip-percent\">' + params.percent + '%</div>'\n"
              + "    + '</div>';\n"
              + "}");

        Pie chart = new Pie()
                .setTitle(new Title()
                        .setText("Quarterly Revenue by Region")
                        .setLeft("center"))
                .setTooltip(new Tooltip()
                        .setTrigger("item")
                        .setBackgroundColor("rgba(20, 24, 32, 0.92)")
                        .setBorderColor("#3a4a66")
                        .setFormatter((Object) tooltipFormatter))
                .setLegend()
                .addSeries(new PieSeries()
                        .setName("Revenue")
                        .setRadius(new String[] { "40%", "65%" })
                        .setData(new PieDataItem[] {
                                new PieDataItem().setName("North").setValue(1248000),
                                new PieDataItem().setName("South").setValue(958500),
                                new PieDataItem().setName("East").setValue(742300),
                                new PieDataItem().setName("West").setValue(1102400),
                                new PieDataItem().setName("Central").setValue(615000)
                        }));

        String optionJson = new EChartsSerializer().toJson(chart.getOption());

        String html = "<!doctype html><html><head><meta charset='utf-8'>"
                + "<title>JsFunction Tooltip Demo (issue #86)</title>"
                + "<script src='https://cdnjs.cloudflare.com/ajax/libs/echarts/5.4.3/echarts.min.js'></script>"
                + "<style>"
                + "  html, body, #chart { margin: 0; width: 100%; height: 100vh; background: #0b1220; }"
                + "  .tooltip-content { color: #fff; font-family: -apple-system, sans-serif; min-width: 180px; }"
                + "  .tooltip-content p { margin: 4px 0; }"
                + "  .tooltip-category { font-size: 14px; font-weight: 600; color: #e8eef9; }"
                + "  .tooltip-value    { font-size: 22px; font-weight: 700; color: #ffd166; }"
                + "  .tooltip-currency { font-size: 11px; color: #8aa0c2; letter-spacing: .1em; }"
                + "  .tooltip-percent  { margin-top: 6px; padding: 3px 8px; background: #2a4a82;"
                + "                      border-radius: 12px; display: inline-block; font-size: 12px; }"
                + "</style></head><body><div id='chart'></div>"
                + "<script>"
                + "  const chart = echarts.init(document.getElementById('chart'), 'dark');"
                + "  chart.setOption(" + optionJson + ");"
                + "  window.addEventListener('resize', () => chart.resize());"
                + "</script></body></html>";

        try (Writer w = new FileWriter("/tmp/js-function-tooltip-demo.html")) {
            w.write(html);
        }
        System.out.println("\n>>> Wrote /tmp/js-function-tooltip-demo.html — open it and hover over a slice.\n");
    }
}
