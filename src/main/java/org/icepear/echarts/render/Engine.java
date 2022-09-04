package org.icepear.echarts.render;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

import org.icepear.echarts.Chart;
import org.icepear.echarts.Option;
import org.icepear.echarts.serializer.EChartsSerializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Engine {
    private Handlebars handlebars;

    public Engine() {
        this.handlebars = new Handlebars();
    }

    /**
     * Generate Html file according to the specified path
     * 
     * @param html     a String representing in html format
     * @param path     path to save the html file
     * @param willOpen whether allowing to open the html in browser automatically
     */
    private void writeHtml(String html, String path, Boolean willOpen) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(html);
            writer.close();
            if (willOpen) {
                File file = new File(path);
                Desktop.getDesktop().browse(file.toURI());
            }
        } catch (IOException e) {
            log.info("Write Html failed. Path error.");
        }
    }

    /**
     * Compile HandleBar template into HTML String
     * @param templateName name of the template selected
     * @param option the option used to init the chart
     * @param height   the height of the chart, ends with "px" or "%"
     * @param width    the width of the chart, ends with "px" or "%"
     * @return HTML in String. Empty string when an exception is occurred.
     */
    private String compileHandleBars(String templateName, Option option, String height, String width) {
        String jsonStr = new EChartsSerializer().toJson(option);
        ChartMeta chartMeta = new ChartMeta(height, width, jsonStr);
        String html = "";
        try {
            Template template = handlebars.compile(templateName);
            html = template.apply(chartMeta);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return html;
    }

    /**
     * Used in simple chart case, render the echarts in html file, in default width,
     * height and willOpen. The html file also provides download chart function.
     * 
     * @param path  path to save the html file
     * @param chart the chart to be rendered
     */
    public void render(String path, Chart<?, ?> chart) {
        render(path, chart.getOption());
    }

    /**
     * Used in advanced chart case, render the echarts in html file, in default
     * width, height and willOpen
     * 
     * @param path   path to save the html file
     * @param option the option used to init the chart
     */
    public void render(String path, Option option) {
        render(path, option, "600px", "600px", false);
    }

    /**
     * Used in simple chart cases, render the echarts in
     * customized width, height, and willOpen
     * 
     * @param path     path to save the html file
     * @param chart    the chart to be rendered
     * @param height   the height of the chart, ends with "px" or "%"
     * @param width    the width of the chart, ends with "px" or "%"
     * @param willOpen whether allowing to open the html in browser automatically
     */
    public void render(String path, Chart<?, ?> chart, String height, String width, Boolean willOpen) {
        render(path, chart.getOption(), height, width, willOpen);
    }

    /**
     * Used in both simple and advanced chart cases, render the echarts in
     * customized width, height, and willOpen
     * 
     * @param path     path to save the html file
     * @param option   the option used to init the chart
     * @param height   the height of the chart, ends with "px" or "%"
     * @param width    the width of the chart, ends with "px" or "%"
     * @param willOpen whether allowing to open the html in browser automatically
     */
    public void render(String path, Option option, String height, String width, Boolean willOpen) {
        String html = compileHandleBars("index", option, height, width);
        writeHtml(html, path, willOpen);
    }

    /**
     * Used in the simple case, render the echarts in default width and height,
     * without download button
     * 
     * @param chart the chart to be rendered
     * @return a string in html format
     */
    public String renderHtml(Chart<?, ?> chart) {
        return renderHtml(chart.getOption());
    }

    /**
     * Used in the advanced case, render the echarts in default width and height,
     * without download button
     * 
     * @param option the option to initiate the chart
     * @return the resulted string in html format
     */
    public String renderHtml(Option option) {
        return renderHtml(option, "100%", "100%");
    }

    /**
     * Used in the simple cases, render the echarts in customized
     * width and height, without download button
     * 
     * @param chart  the chart to be rendered
     * @param height the height of the chart, ends with "px" or "%"
     * @param width  the width of the chart, ends with "px" or "%"
     * @return the resulted string in html format
     */
    public String renderHtml(Chart<?, ?> chart, String height, String width) {
        return renderHtml(chart.getOption(), "100%", "100%");
    }

    /**
     * Used in both the simple and advanced cases, render the echarts in customized
     * width and height, without download button
     * 
     * @param option the option to initiate the chart
     * @param height the height of the chart
     * @param width  the width of the chart
     * @return the resulted string in html format
     */
    public String renderHtml(Option option, String height, String width) {
        return compileHandleBars("base", option, height, width);
    }

    /**
     * Render serialized json object of Option in Chart
     * 
     * @param chart the chart to be rendered
     * @return a string representation of a json object
     */
    public String renderJsonOption(Chart<?, ?> chart) {
        return renderJsonOption(chart.getOption());
    }

    /**
     * Render serialized json object of an Option
     * 
     * @param option the option to be serialized
     * @return a string representation of a json object
     */
    public String renderJsonOption(Option option) {
        return new EChartsSerializer().toJson(option);
    }

}
