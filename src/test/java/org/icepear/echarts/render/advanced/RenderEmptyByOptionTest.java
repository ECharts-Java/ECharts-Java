package org.icepear.echarts.render.advanced;

import java.io.IOException;

import org.icepear.echarts.Option;
import org.icepear.echarts.render.Engine;
import org.junit.Before;
import org.junit.Test;

public class RenderEmptyByOptionTest {
    private Option option;

    @Before
    public void constructOption() {
        this.option = null;
    }

    @Test
    public void testRenderEmpty() throws IOException {
        Engine engine = new Engine();
        engine.render("test.html", this.option);
    }
    
}
