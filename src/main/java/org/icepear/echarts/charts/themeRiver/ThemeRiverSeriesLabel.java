package org.icepear.echarts.charts.themeRiver;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.themeRiver.ThemeRiverSeriesLabelOption;
import org.icepear.echarts.origin.util.TextCommonOption;

@Accessors(chain=true)
@Data
public class ThemeRiverSeriesLabel implements ThemeRiverSeriesLabelOption {

	private Number shadowBlur;

	private String shadowColor;

	private Number shadowOffsetX;

	private Number shadowOffsetY;

	private String color;

	private String fontStyle;

	private String fontWeight;

	private String fontFamily;

	@Setter(AccessLevel.NONE)
	private Object fontSize;

	public ThemeRiverSeriesLabel setFontSize(Number fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	public ThemeRiverSeriesLabel setFontSize(String fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	private String align;

	private String verticalAlign;

	private String baseline;

	private Number opacity;

	private Number lineHeight;

	@Setter(AccessLevel.NONE)
	private Object backgroundColor;

	public ThemeRiverSeriesLabel setBackgroundColor(Object backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public ThemeRiverSeriesLabel setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	private String borderColor;

	private Number borderWidth;

	private String borderType;

	private Number borderDashOffset;

	@Setter(AccessLevel.NONE)
	private Object borderRadius;

	public ThemeRiverSeriesLabel setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	public ThemeRiverSeriesLabel setBorderRadius(Number[] borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object padding;

	public ThemeRiverSeriesLabel setPadding(Number padding) {
		this.padding = padding;
		return this;
	}

	public ThemeRiverSeriesLabel setPadding(Number[] padding) {
		this.padding = padding;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object width;

	public ThemeRiverSeriesLabel setWidth(Number width) {
		this.width = width;
		return this;
	}

	public ThemeRiverSeriesLabel setWidth(String width) {
		this.width = width;
		return this;
	}

	private Number height;

	private String textBorderColor;

	private Number textBorderWidth;

	private String textBorderType;

	private Number textBorderDashOffset;

	private Number textShadowBlur;

	private String textShadowColor;

	private Number textShadowOffsetX;

	private Number textShadowOffsetY;

	private String tag;

	private Boolean show;

	private Object position;

	private Number distance;

	private Number rotate;

	private Number[] offset;

	private Number minMargin;

	private Object overflow;

	private Boolean silent;

	@Setter(AccessLevel.NONE)
	private Object precision;

	public ThemeRiverSeriesLabel setPrecision(Number precision) {
		this.precision = precision;
		return this;
	}

	public ThemeRiverSeriesLabel setPrecision(String precision) {
		this.precision = precision;
		return this;
	}

	private Boolean valueAnimation;

	private Map<String, TextCommonOption> rich;

	private String formatter;

	private Number margin;
}
