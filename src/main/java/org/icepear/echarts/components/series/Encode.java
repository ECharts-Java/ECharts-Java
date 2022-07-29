package org.icepear.echarts.components.series;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.OptionEncode;

@Accessors(chain = true)
@Data
public class Encode implements OptionEncode {

    @Setter(AccessLevel.NONE)
    private Object tooltip;

    public Encode setTooltip(Number tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Encode setTooltip(Number[] tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Encode setTooltip(String tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Encode setTooltip(String[] tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object label;

    public Encode setLabel(Number label) {
        this.label = label;
        return this;
    }

    public Encode setLabel(Number[] label) {
        this.label = label;
        return this;
    }

    public Encode setLabel(String label) {
        this.label = label;
        return this;
    }

    public Encode setLabel(String[] label) {
        this.label = label;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object itemName;

    public Encode setItemName(Number itemName) {
        this.itemName = itemName;
        return this;
    }

    public Encode setItemName(Number[] itemName) {
        this.itemName = itemName;
        return this;
    }

    public Encode setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public Encode setItemName(String[] itemName) {
        this.itemName = itemName;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object itemId;

    public Encode setItemId(Number itemId) {
        this.itemId = itemId;
        return this;
    }

    public Encode setItemId(Number[] itemId) {
        this.itemId = itemId;
        return this;
    }

    public Encode setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public Encode setItemId(String[] itemId) {
        this.itemId = itemId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object seriesName;

    public Encode setSeriesName(Number seriesName) {
        this.seriesName = seriesName;
        return this;
    }

    public Encode setSeriesName(Number[] seriesName) {
        this.seriesName = seriesName;
        return this;
    }

    public Encode setSeriesName(String seriesName) {
        this.seriesName = seriesName;
        return this;
    }

    public Encode setSeriesName(String[] seriesName) {
        this.seriesName = seriesName;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object itemGroupId;

    public Encode setItemGroupId(Number itemGroupId) {
        this.itemGroupId = itemGroupId;
        return this;
    }

    public Encode setItemGroupId(Number[] itemGroupId) {
        this.itemGroupId = itemGroupId;
        return this;
    }

    public Encode setItemGroupId(String itemGroupId) {
        this.itemGroupId = itemGroupId;
        return this;
    }

    public Encode setItemGroupId(String[] itemGroupId) {
        this.itemGroupId = itemGroupId;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object x;

    public Encode setX(Number x) {
        this.x = x;
        return this;
    }

    public Encode setX(Number[] x) {
        this.x = x;
        return this;
    }

    public Encode setX(String x) {
        this.x = x;
        return this;
    }

    public Encode setX(String[] x) {
        this.x = x;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object y;

    public Encode setY(Number y) {
        this.y = y;
        return this;
    }

    public Encode setY(Number[] y) {
        this.y = y;
        return this;
    }

    public Encode setY(String y) {
        this.y = y;
        return this;
    }

    public Encode setY(String[] y) {
        this.y = y;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radius;

    public Encode setRadius(Number radius) {
        this.radius = radius;
        return this;
    }

    public Encode setRadius(Number[] radius) {
        this.radius = radius;
        return this;
    }

    public Encode setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public Encode setRadius(String[] radius) {
        this.radius = radius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object angle;

    public Encode setAngle(Number angle) {
        this.angle = angle;
        return this;
    }

    public Encode setAngle(Number[] angle) {
        this.angle = angle;
        return this;
    }

    public Encode setAngle(String angle) {
        this.angle = angle;
        return this;
    }

    public Encode setAngle(String[] angle) {
        this.angle = angle;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object lng;

    public Encode setLng(Number lng) {
        this.lng = lng;
        return this;
    }

    public Encode setLng(Number[] lng) {
        this.lng = lng;
        return this;
    }

    public Encode setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public Encode setLng(String[] lng) {
        this.lng = lng;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object lat;

    public Encode setLat(Number lat) {
        this.lat = lat;
        return this;
    }

    public Encode setLat(Number[] lat) {
        this.lat = lat;
        return this;
    }

    public Encode setLat(String lat) {
        this.lat = lat;
        return this;
    }

    public Encode setLat(String[] lat) {
        this.lat = lat;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object value;

    public Encode setValue(Number value) {
        this.value = value;
        return this;
    }

    public Encode setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public Encode setValue(String value) {
        this.value = value;
        return this;
    }

    public Encode setValue(String[] value) {
        this.value = value;
        return this;
    }
}
