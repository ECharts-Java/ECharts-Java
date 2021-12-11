package org.icepear.echarts.component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.polar.PolarOption;

@Accessors(chain=true)
@Data
public class Polar implements PolarOption {

	private String mainType;

	private String type;

	@Setter(AccessLevel.NONE)
	private Object id;

	public Polar setId(Number id) {
		this.id = id;
		return this;
	}

	public Polar setId(String id) {
		this.id = id;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object name;

	public Polar setName(Number name) {
		this.name = name;
		return this;
	}

	public Polar setName(String name) {
		this.name = name;
		return this;
	}

	private Number z;

	private Number zlevel;

	@Setter(AccessLevel.NONE)
	private Object center;

	public Polar setCenter(Number[] center) {
		this.center = center;
		return this;
	}

	public Polar setCenter(String[] center) {
		this.center = center;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object radius;

	public Polar setRadius(Number radius) {
		this.radius = radius;
		return this;
	}

	public Polar setRadius(Number[] radius) {
		this.radius = radius;
		return this;
	}

	public Polar setRadius(Object[] radius) {
		this.radius = radius;
		return this;
	}

	public Polar setRadius(String radius) {
		this.radius = radius;
		return this;
	}

	public Polar setRadius(String[] radius) {
		this.radius = radius;
		return this;
	}
}
