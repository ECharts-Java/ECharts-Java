package org.icepear.echarts.render;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.FileTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

import org.icepear.echarts.component.Option;
import org.icepear.echarts.serializer.EChartSerializer;

public class Engine {
    private Template template;

    public Engine() throws IOException {
        TemplateLoader cpLoader = new ClassPathTemplateLoader("/", ".hbs");
        TemplateLoader fsLoader = new FileTemplateLoader("src/main/java/org/icepear/echarts/render/templates", ".hbs");
        Handlebars handlebars = new Handlebars().with(cpLoader, fsLoader);
        this.template = handlebars.compile("page");
    }

    public String render(Option option) throws IOException {
        String jsonStr = EChartSerializer.toJson(option);
        String html = this.template.apply(jsonStr);
        return html;
    }

    public void writeHtml(String path, Option option) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(render(option));
        writer.close();
    }

}
