package org.icepear.echarts.component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.pie.PieItemStyleOption;

@Accessors(chain=true)
@Data
public class PieItemStyle implements PieItemStyleOption {

	private Number shadowBlur;

	private String shadowColor;

	private Number shadowOffsetX;

	private Number shadowOffsetY;

	private String borderColor;

	private Number borderWidth;

	private String borderType;

	private Object borderCap;

	private Object borderJoin;

	private Number borderDashOffset;

	private Number borderMiterLimit;

	private String color;

	private Number opacity;

	@Setter(AccessLevel.NONE)
	private Object decal;

	public PieItemStyle setDecal(String decal) {
		this.decal = decal;
		return this;
	}

	public PieItemStyle setDecal(Object decal) {
		this.decal = decal;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object borderRadius;

	public PieItemStyle setBorderRadius(String[] borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	public PieItemStyle setBorderRadius(Number[] borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	public PieItemStyle setBorderRadius(String borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	public PieItemStyle setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}
}
