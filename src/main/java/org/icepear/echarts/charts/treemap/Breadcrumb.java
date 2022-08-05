package org.icepear.echarts.charts.treemap;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.BreadcrumbEmphasisItemStyleOption;
import org.icepear.echarts.origin.chart.treemap.BreadcrumbItemStyleOption;
import org.icepear.echarts.origin.chart.treemap.BreadcrumbOption;

@Accessors(chain = true)
@Data
public class Breadcrumb implements BreadcrumbOption {

    @Setter(AccessLevel.NONE)
    private Object width;

    public Breadcrumb setWidth(Number width) {
        this.width = width;
        return this;
    }

    public Breadcrumb setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public Breadcrumb setHeight(Number height) {
        this.height = height;
        return this;
    }

    public Breadcrumb setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public Breadcrumb setTop(Number top) {
        this.top = top;
        return this;
    }

    public Breadcrumb setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public Breadcrumb setRight(Number right) {
        this.right = right;
        return this;
    }

    public Breadcrumb setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public Breadcrumb setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public Breadcrumb setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public Breadcrumb setLeft(Number left) {
        this.left = left;
        return this;
    }

    public Breadcrumb setLeft(String left) {
        this.left = left;
        return this;
    }

    private Boolean show;

    private Number emptyItemWidth;

    private BreadcrumbItemStyleOption itemStyle;

    private BreadcrumbEmphasisItemStyleOption emphasis;
}
