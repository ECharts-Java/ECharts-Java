package org.icepear.echarts.demo;

import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.bar.BarSeries;
import org.icepear.echarts.components.coord.SplitArea;
import org.icepear.echarts.components.coord.SplitLine;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.dataZoom.DataZoom;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.toolbox.Toolbox;
import org.icepear.echarts.components.toolbox.ToolboxDataZoomFeature;
import org.icepear.echarts.components.toolbox.ToolboxSaveAsImageFeature;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.tooltip.TooltipAxisPointer;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Local-only demo: writes /tmp/large-scale-bar-demo.html.
 *
 * Reproduces https://echarts.apache.org/examples/en/editor.html?c=bar-large with
 * the same two-layer random walk the official example uses. Drag the dataZoom
 * slider at the bottom to scrub through the series.
 *
 * Run: mvn test -Dtest=LargeScaleBarDemo
 * Then: open /tmp/large-scale-bar-demo.html
 */
public class LargeScaleBarDemo {

    /** The official example uses 5e5; 50k keeps the page openable while still exercising `large`. */
    private static final int DATA_COUNT = 50000;

    @Test
    public void writeDemoHtml() throws Exception {
        // Same generator as the official example: a slow drift plus a fast walk
        // that resets every 30 points, lifted by a 3000 baseline.
        Random rnd = new Random();
        String[] categoryData = new String[DATA_COUNT];
        String[] valueData = new String[DATA_COUNT];

        double baseValue = rnd.nextDouble() * 1000;
        double smallBaseValue = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(2011, Calendar.JANUARY, 1, 0, 0, 0);
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd\nHH:mm:ss");

        for (int i = 0; i < DATA_COUNT; i++) {
            smallBaseValue = (i % 30 == 0)
                    ? rnd.nextDouble() * 700
                    : smallBaseValue + rnd.nextDouble() * 500 - 250;
            baseValue += rnd.nextDouble() * 20 - 10;

            categoryData[i] = fmt.format(cal.getTime());
            valueData[i] = String.format("%.2f",
                    (double) Math.max(0, Math.round(baseValue + smallBaseValue) + 3000));
            cal.add(Calendar.SECOND, 1);
        }

        Toolbox toolbox = new Toolbox().setFeature(new HashMap<String, ToolboxFeatureOption>() {
            {
                put("dataZoom", new ToolboxDataZoomFeature().setYAxisIndex(false));
                put("saveAsImage", new ToolboxSaveAsImageFeature().setPixelRatio(2));
            }
        });

        Option option = new Option()
                .setTitle(new Title().setText(DATA_COUNT + " Data").setLeft(10))
                .setToolbox(toolbox)
                .setTooltip(new Tooltip()
                        .setTrigger("axis")
                        .setAxisPointer(new TooltipAxisPointer().setType("shadow")))
                .setGrid(new Grid().setBottom(90))
                .setDataZoom(new DataZoom[] {
                        new DataZoom().setType("inside"),
                        new DataZoom().setType("slider")
                })
                .setXAxis(new CategoryAxis()
                        .setType(null)
                        .setData(categoryData)
                        .setSilent(false)
                        .setSplitLine(new SplitLine().setShow(false))
                        .setSplitArea(new SplitArea().setShow(false)))
                .setYAxis(new ValueAxis()
                        .setType(null)
                        .setSplitArea(new SplitArea().setShow(false)))
                .setSeries(new SeriesOption[] {
                        new BarSeries()
                                .setType("bar")
                                .setData(valueData)
                                .setLarge(true)
                });

        long t0 = System.currentTimeMillis();
        String optionJson = new EChartsSerializer().toJson(option);
        long serializeMs = System.currentTimeMillis() - t0;

        String html = "<!doctype html><html><head><meta charset='utf-8'><title>Large Scale Bar Demo</title>"
                + "<script src='https://cdnjs.cloudflare.com/ajax/libs/echarts/5.4.3/echarts.min.js'></script>"
                + "<style>html,body,#chart{margin:0;width:100%;height:100vh;background:#fff}</style>"
                + "</head><body><div id='chart'></div><script>"
                + "const chart = echarts.init(document.getElementById('chart'));"
                + "chart.setOption(" + optionJson + ");"
                + "window.addEventListener('resize', () => chart.resize());"
                + "</script></body></html>";

        try (Writer w = new FileWriter("/tmp/large-scale-bar-demo.html")) {
            w.write(html);
        }
        System.out.println("\n>>> Wrote /tmp/large-scale-bar-demo.html — open it in a browser.");
        System.out.println(">>> " + DATA_COUNT + " points, option JSON " + optionJson.length()
                + " chars, serialized in " + serializeMs + " ms\n");
    }
}
