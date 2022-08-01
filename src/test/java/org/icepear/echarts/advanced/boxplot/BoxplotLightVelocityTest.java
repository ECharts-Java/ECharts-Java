package org.icepear.echarts.advanced.boxplot;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.boxplot.BoxplotSeries;
import org.icepear.echarts.charts.boxplot.BoxplotTransform;
import org.icepear.echarts.charts.boxplot.PrepareBoxplotData;
import org.icepear.echarts.components.coord.SplitArea;
import org.icepear.echarts.components.coord.SplitLine;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.dataset.Dataset;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.text.Label;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.tooltip.TooltipAxisPointer;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BoxplotLightVelocityTest {
    @Test
    public void testBoxplotLightVelocity() {
        Title title1 = new Title()
                .setText("Michelson-Morley Experiment")
                .setLeft("center");

        Title title2 = new Title()
                .setText("upper: Q3 + 1.5 * IQR \nlower: Q1 - 1.5 * IQR")
                .setBorderColor("#999")
                .setBorderWidth(1)
                .setTextStyle(new Label()
                        .setFontWeight("normal")
                        .setFontSize(14)
                        .setLineHeight(20))
                .setLeft("10%")
                .setTop("90%");

        Dataset dataset1 = new Dataset().setSource(new Number[][] {
                { 850, 740, 900, 1070, 930, 850, 950, 980, 980, 880, 1000, 980, 930, 650, 760, 810, 1000, 1000, 960,
                        960 },
                { 960, 940, 960, 940, 880, 800, 850, 880, 900, 840, 830, 790, 810, 880, 880, 830, 800, 790, 760, 800 },
                { 880, 880, 880, 860, 720, 720, 620, 860, 970, 950, 880, 910, 850, 870, 840, 840, 850, 840, 840, 840 },
                { 890, 810, 810, 820, 800, 770, 760, 740, 750, 760, 910, 920, 890, 860, 880, 720, 840, 850, 850, 780 },
                { 890, 840, 780, 810, 760, 810, 790, 810, 820, 850, 870, 870, 810, 740, 810, 940, 950, 800, 810,
                        870 } });

        Dataset dataset2 = new Dataset().setTransform(new BoxplotTransform()
                .setType("boxplot")
                .setConfig(new PrepareBoxplotData().setItemNameFormatter("expr {value}")));

        Dataset dataset3 = new Dataset()
                .setFromDatasetIndex(1)
                .setFromTransformResult(1);

        Tooltip tooltip = new Tooltip()
                .setTrigger("item")
                .setAxisPointer(new TooltipAxisPointer().setType("shadow"));

        Grid grid = new Grid()
                .setLeft("10%")
                .setRight("10%")
                .setBottom("15%");

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setBoundaryGap(true)
                .setNameGap(30)
                .setSplitArea(new SplitArea().setShow(false))
                .setSplitLine(new SplitLine().setShow(false));

        ValueAxis yAxis = new ValueAxis()
                .setType("value")
                .setName("km/s minus 299,000")
                .setSplitArea(new SplitArea().setShow(true));

        BoxplotSeries series1 = new BoxplotSeries()
                .setName("boxplot")
                .setType("boxplot")
                .setDatasetIndex(1);

        BoxplotSeries series2 = new BoxplotSeries()
                .setName("outlier")
                .setType("scatter")
                .setDatasetIndex(2);

        Option option = new Option()
                .setTitle(new Title[] { title1, title2 })
                .setDataset(new Dataset[] { dataset1, dataset2, dataset3 })
                .setTooltip(tooltip)
                .setGrid(grid)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series1, series2 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/boxplot/boxplot-light-velocity.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
