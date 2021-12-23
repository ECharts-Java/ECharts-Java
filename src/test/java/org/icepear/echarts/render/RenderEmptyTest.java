package org.icepear.echarts.render;

import java.io.IOException;

import org.icepear.echarts.component.Option;
import org.junit.Before;
import org.junit.Test;

public class RenderEmptyTest {
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
