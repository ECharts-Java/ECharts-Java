package org.icepear.echarts.simple.line;

import org.icepear.echarts.Line;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicLineTest {
    @Test
    public void testBasicLine() {
        Line line = new Line()
                .addXAxis(new String[] {  "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"  })
                .addYAxis()
                .addSeries(new Number[] { 150, 230, 224, 218, 135, 147, 260 });

        System.out.println(EChartsSerializer.toJson(line.getOption()));
    }
}
