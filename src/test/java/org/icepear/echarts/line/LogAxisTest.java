package org.icepear.echarts.line;

import org.icepear.echarts.component.Legend;
import org.icepear.echarts.component.Title;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.type.BoxLength;
import org.junit.Test;

public class LogAxisTest {
    @Test
    public void testLogAxis() {
        Title title = new Title()
                .setText("Log Axis")
                .setLeft(new BoxLength("center"));
        
        Tooltip tooltip = new Tooltip()
                .setTrigger("item")
                .setFormatter("{a} <br/>{b} : {c}");
        
        Legend legend = new Legend().setLeft(new BoxLength("left"));

        // CategoryAxis xAxis = new CategoryAxis()
        //         .setType("category")
        //         .setBoundaryGap(false)
        //         .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

        // ValueAxis yAxis = new ValueAxis().setType("value");
    }
}
