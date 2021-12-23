package org.icepear.echarts.render;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

import org.icepear.echarts.component.Option;
import org.icepear.echarts.serializer.EChartSerializer;

public class Engine {
    private Handlebars handlebars;

    public Engine() throws IOException {
        this.handlebars = new Handlebars();
    }

    public void writeHtml(String html, String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(html);
        writer.close();
        File file = new File(path);
        Desktop.getDesktop().browse(file.toURI());
    }

    public String render(String path, Option option) throws IOException {
        Template template = handlebars.compile("index");
        String jsonStr = EChartSerializer.toJson(option);
        String html = template.apply(jsonStr);
        writeHtml(html, path);
        return html;
    }


}
