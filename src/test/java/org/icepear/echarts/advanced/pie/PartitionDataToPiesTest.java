package org.icepear.echarts.advanced.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.dataset.DataTransform;
import org.icepear.echarts.components.dataset.DataTransformConfig;
import org.icepear.echarts.components.dataset.Dataset;
import org.icepear.echarts.components.media.MediaQuery;
import org.icepear.echarts.components.media.MediaUnit;
import org.icepear.echarts.origin.component.dataset.DatasetOption;
import org.icepear.echarts.origin.util.MediaUnitOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class PartitionDataToPiesTest {
    @Test
    public void testPartitionDataToPies() {
        Dataset dataset1 = new Dataset().setSource(new Object[][] {
                { "Product", "Sales", "Price", "Year" },
                { "Cake", 123, 32, 2011 },
                { "Cereal", 231, 14, 2011 },
                { "Tofu", 235, 5, 2011 },
                { "Dumpling", 341, 25, 2011 },
                { "Biscuit", 122, 29, 2011 },
                { "Cake", 143, 30, 2012 },
                { "Cereal", 201, 19, 2012 },
                { "Tofu", 255, 7, 2012 },
                { "Dumpling", 241, 27, 2012 },
                { "Biscuit", 102, 34, 2012 },
                { "Cake", 153, 28, 2013 },
                { "Cereal", 181, 21, 2013 },
                { "Tofu", 395, 4, 2013 },
                { "Dumpling", 281, 31, 2013 },
                { "Biscuit", 92, 39, 2013 },
                { "Cake", 223, 29, 2014 },
                { "Cereal", 211, 17, 2014 },
                { "Tofu", 345, 3, 2014 },
                { "Dumpling", 211, 35, 2014 },
                { "Biscuit", 72, 24, 2014 } });

        Dataset dataset2 = new Dataset()
                .setTransform(new DataTransform()
                        .setType("filter")
                        .setConfig(new DataTransformConfig()
                                .setDimension("Year")
                                .setValue(2011)));

        Dataset dataset3 = new Dataset()
                .setTransform(new DataTransform()
                        .setType("filter")
                        .setConfig(new DataTransformConfig()
                                .setDimension("Year")
                                .setValue(2012)));

        Dataset dataset4 = new Dataset()
                .setTransform(new DataTransform()
                        .setType("filter")
                        .setConfig(new DataTransformConfig()
                                .setDimension("Year")
                                .setValue(2013)));

        PieSeries series1 = new PieSeries()
                .setType("pie")
                .setRadius(50)
                .setCenter(new String[] { "50%", "25%" })
                .setDatasetIndex(1);

        PieSeries series2 = new PieSeries()
                .setType("pie")
                .setRadius(50)
                .setCenter(new String[] { "50%", "50%" })
                .setDatasetIndex(2);

        PieSeries series3 = new PieSeries()
                .setType("pie")
                .setRadius(50)
                .setCenter(new String[] { "50%", "75%" })
                .setDatasetIndex(3);

        MediaUnit mediaUnit1 = new MediaUnit()
                .setQuery(new MediaQuery().setMinAspectRatio(1))
                .setOption(new Option().setSeries(new SeriesOption[] {
                        new PieSeries().setType(null).setCenter(new String[] { "25%", "50%" }),
                        new PieSeries().setType(null).setCenter(new String[] { "50%", "50%" }),
                        new PieSeries().setType(null).setCenter(new String[] { "75%", "50%" }) }));

        MediaUnit mediaUnit2 = new MediaUnit()
                .setOption(new Option().setSeries(new SeriesOption[] {
                        new PieSeries().setType(null).setCenter(new String[] { "50%", "25%" }),
                        new PieSeries().setType(null).setCenter(new String[] { "50%", "50%" }),
                        new PieSeries().setType(null).setCenter(new String[] { "50%", "75%" }) }));

        Option option = new Option()
                .setDataset(new DatasetOption[] { dataset1, dataset2, dataset3, dataset4 })
                .setSeries(new SeriesOption[] { series1, series2, series3 })
                .setMedia(new MediaUnitOption[] { mediaUnit1, mediaUnit2 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/pie/partition-data-to-pies.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
