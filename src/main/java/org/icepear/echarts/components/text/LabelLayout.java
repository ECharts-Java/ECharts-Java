package org.icepear.echarts.components.text;

import java.io.Serial;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.LabelLayoutOption;

@Accessors(chain = true)
@Data
public class LabelLayout implements LabelLayoutOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String moveOverlap;

    private Boolean hideOverlap;

    private Boolean draggable;

    @Setter(AccessLevel.NONE)
    private Object x;

    public LabelLayout setX(Number x) {
        this.x = x;
        return this;
    }

    public LabelLayout setX(String x) {
        this.x = x;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object y;

    public LabelLayout setY(Number y) {
        this.y = y;
        return this;
    }

    public LabelLayout setY(String y) {
        this.y = y;
        return this;
    }

    private Number dx;

    private Number dy;

    private Number rotate;

    private String align;

    private String verticalAlign;

    private Number width;

    private Number height;

    private Number fontSize;

    private Number[] labelLinePoints;
}
