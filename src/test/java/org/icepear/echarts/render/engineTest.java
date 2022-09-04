package org.icepear.echarts.render;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.bar.BarSeries;
import org.icepear.echarts.components.coord.CategoryAxisTick;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.tooltip.TooltipAxisPointer;
import org.icepear.echarts.origin.util.SeriesOption;
import org.junit.Before;
import org.junit.Test;

public class engineTest {
    private Option option;
    private Engine engine = new Engine();

    @Before
    public void buildOption() {
        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new TooltipAxisPointer()
                        .setType("shadow"));

        Grid grid = new Grid()
                .setLeft("3%")
                .setRight("4%")
                .setBottom("3%")
                .setContainLabel(true);

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .setAxisTick(new CategoryAxisTick()
                        .setAlignWithLabel(true));

        ValueAxis yAxis = new ValueAxis().setType("value");

        BarSeries series = new BarSeries()
                .setName("Direct")
                .setType("bar")
                .setBarWidth("60%")
                .setData(new Number[] { 10, 52, 200, 334, 390, 330, 220 });

        Option option = new Option()
                .setTooltip(tooltip)
                .setGrid(grid)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series });

        this.option = option;
    }

    @Test
    public void testRenderFileExists() {
        String childPath = "test.html";
        engine.render(childPath, option);
        String parentPath = System.getProperty("user.dir") + "/";
        File file = new File(parentPath+childPath);
        assertTrue(file.exists());
    }

    @Test
    public void testRenderFileContentCorrect() {
        String childPath = "test.html";
        engine.render(childPath, option);
        String completePath = System.getProperty("user.dir") + "/" + childPath;
        
        try {
            BufferedReader renderedFileReader = new BufferedReader(new FileReader(completePath));
            String renderedContent = renderedFileReader.lines().collect(Collectors.joining());
    
            BufferedReader expectedFileReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/render/sampleIndex.html")));
            String expectedContent = expectedFileReader.lines().collect(Collectors.joining());
            renderedFileReader.close();
            expectedFileReader.close();
            
            assertEquals(expectedContent, renderedContent);    

        } catch (Exception e) {
            System.out.println("engineTest: testRenderFileContentCorrect exception found: " + e.getMessage());
        }

    }

    @Test
    public void testRenderHtml() {
        String acutalHTML = engine.renderHtml(option);
        try {
            BufferedReader expectedFileReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/render/sampleBase.html")));
            String expectedContent = expectedFileReader.lines().collect(Collectors.joining(System.lineSeparator()));
            expectedFileReader.close();

            assertEquals(expectedContent, acutalHTML);
        } catch (Exception e) {
            System.out.println("engineTest: testRenderHtml exception found: " + e.getMessage());
        }
        
    }

    @Test
    public void testRenderJsonOption() {
        String acutalJsonOption = engine.renderJsonOption(option);
        try {
            BufferedReader expectedFileReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/render/sampleOption.json")));
            String expectedContent = expectedFileReader.lines().collect(Collectors.joining(System.lineSeparator()));
            expectedFileReader.close();

            assertEquals(expectedContent, acutalJsonOption);
        } catch (Exception e) {
            System.out.println("engineTest: testRenderJsonOption exception found: " + e.getMessage());
        }
    }
}
