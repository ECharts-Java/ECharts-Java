package org.icepear.echarts.demo;

import java.io.FileWriter;
import java.io.Writer;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.bar.BarSeries;
import org.icepear.echarts.components.coord.CategoryAxisLabel;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.dataset.DataTransform;
import org.icepear.echarts.components.dataset.DataTransformConfig;
import org.icepear.echarts.components.dataset.Dataset;
import org.icepear.echarts.components.series.Encode;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.component.dataset.DatasetOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Local-only demo: writes /tmp/sort-transform-demo.html.
 *
 * Reproduces https://echarts.apache.org/examples/en/editor.html?c=data-transform-sort-bar.
 * The source rows are in no particular order; the second dataset sorts them by
 * score descending through the transform, so the bars come out highest-first.
 *
 * Run: mvn test -Dtest=SortTransformDemo
 * Then: open /tmp/sort-transform-demo.html
 */
public class SortTransformDemo {

    @Test
    public void writeDemoHtml() throws Exception {
        Dataset source = new Dataset()
                .setDimensions(new String[] { "name", "age", "profession", "score", "date" })
                .setSource(new Object[][] {
                        { "Hannah Krause", 41, "Engineer", 314, "2011-02-12" },
                        { "Zhao Qian", 20, "Teacher", 351, "2011-03-01" },
                        { "Jasmin Krause ", 52, "Musician", 287, "2011-02-14" },
                        { "Li Lei", 37, "Teacher", 219, "2011-02-18" },
                        { "Karle Neumann", 25, "Engineer", 253, "2011-04-02" },
                        { "Adrian Groß", 19, "Teacher", "-", "2011-01-16" },
                        { "Mia Neumann", 71, "Engineer", 165, "2011-03-19" },
                        { "Böhm Fuchs", 36, "Musician", 318, "2011-02-24" },
                        { "Han Meimei", 67, "Engineer", 366, "2011-03-12" }
                });

        Dataset sorted = new Dataset()
                .setTransform(new DataTransform()
                        .setType("sort")
                        .setConfig(new DataTransformConfig()
                                .setDimension("score")
                                .setOrder("desc")));

        Option option = new Option()
                .setTitle(new Title().setText("Sorted by score, descending").setLeft("center"))
                .setTooltip(new Tooltip().setTrigger("item"))
                .setDataset(new DatasetOption[] { source, sorted })
                .setXAxis(new CategoryAxis()
                        .setType("category")
                        .setAxisLabel(new CategoryAxisLabel().setRotate(30)))
                .setYAxis(new ValueAxis().setType(null))
                .setSeries(new SeriesOption[] {
                        new BarSeries()
                                .setType("bar")
                                .setEncode(new Encode().setX("name").setY("score"))
                                .setDatasetIndex(1)
                });

        String optionJson = new EChartsSerializer().toJson(option);

        String html = "<!doctype html><html><head><meta charset='utf-8'><title>Sort Transform Demo</title>"
                + "<script src='https://cdnjs.cloudflare.com/ajax/libs/echarts/5.4.3/echarts.min.js'></script>"
                + "<style>html,body,#chart{margin:0;width:100%;height:100vh;background:#fff}</style>"
                + "</head><body><div id='chart'></div><script>"
                + "const chart = echarts.init(document.getElementById('chart'));"
                + "chart.setOption(" + optionJson + ");"
                + "window.addEventListener('resize', () => chart.resize());"
                + "</script></body></html>";

        try (Writer w = new FileWriter("/tmp/sort-transform-demo.html")) {
            w.write(html);
        }
        System.out.println("\n>>> Wrote /tmp/sort-transform-demo.html — open it in a browser.\n");
    }
}
