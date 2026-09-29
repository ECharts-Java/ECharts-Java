package org.icepear.echarts.advanced.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.bar.BarSeries;
import org.icepear.echarts.components.coord.CategoryAxisLabel;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.dataset.DataTransform;
import org.icepear.echarts.components.dataset.DataTransformConfig;
import org.icepear.echarts.components.dataset.Dataset;
import org.icepear.echarts.components.series.Encode;
import org.icepear.echarts.origin.component.dataset.DatasetOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * https://echarts.apache.org/examples/en/editor.html?c=data-transform-sort-bar
 *
 * Covers the `order` field added in #72, which the review there asked for a test
 * of. The sort transform is what the whole example exists to demonstrate: the
 * second dataset carries no source of its own and derives from the first.
 */
public class SortDataInBarChartTest {

    @Test
    public void testSortDataInBarChart() {
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

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setAxisLabel(new CategoryAxisLabel().setRotate(30));

        // The example writes `yAxis: {}` and lets ECharts infer the type, so clear the
        // "value" default ValueAxis carries.
        ValueAxis yAxis = new ValueAxis().setType(null);

        BarSeries series = new BarSeries()
                .setType("bar")
                .setEncode(new Encode().setX("name").setY("score"))
                .setDatasetIndex(1);

        Option option = new Option()
                .setDataset(new DatasetOption[] { source, sorted })
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/bar/sort-data-in-bar-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);
    }
}
