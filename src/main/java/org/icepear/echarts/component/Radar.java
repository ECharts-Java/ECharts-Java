package org.icepear.echarts.component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.AxisLabelBaseOption;
import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.SplitAreaOption;
import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.coord.radar.RadarIndicatorOption;
import org.icepear.echarts.origin.coord.radar.RadarOption;

@Accessors(chain=true)
@Data
public class Radar implements RadarOption {

	private String mainType;

	private String type;

	@Setter(AccessLevel.NONE)
	private Object id;

	public Radar setId(Number id) {
		this.id = id;
		return this;
	}

	public Radar setId(String id) {
		this.id = id;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object name;

	public Radar setName(Number name) {
		this.name = name;
		return this;
	}

	public Radar setName(String name) {
		this.name = name;
		return this;
	}

	private Number z;

	private Number zlevel;

	@Setter(AccessLevel.NONE)
	private Object center;

	public Radar setCenter(Number[] center) {
		this.center = center;
		return this;
	}

	public Radar setCenter(String[] center) {
		this.center = center;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object radius;

	public Radar setRadius(Number radius) {
		this.radius = radius;
		return this;
	}

	public Radar setRadius(Number[] radius) {
		this.radius = radius;
		return this;
	}

	public Radar setRadius(Object[] radius) {
		this.radius = radius;
		return this;
	}

	public Radar setRadius(String radius) {
		this.radius = radius;
		return this;
	}

	public Radar setRadius(String[] radius) {
		this.radius = radius;
		return this;
	}

	private Number startAngle;

	private String shape;

	private AxisLineOption axisLine;

	private AxisTickOption axisTick;

	private AxisLabelBaseOption axisLabel;

	private SplitLineOption splitLine;

	private SplitAreaOption splitArea;

	private Object axisName;

	private Number axisNameGap;

	private Boolean triggerEvent;

	private Boolean scale;

	private Number splitNumber;

	@Setter(AccessLevel.NONE)
	private Object boundaryGap;

	public Radar setBoundaryGap(Boolean boundaryGap) {
		this.boundaryGap = boundaryGap;
		return this;
	}

	public Radar setBoundaryGap(Number[] boundaryGap) {
		this.boundaryGap = boundaryGap;
		return this;
	}

	public Radar setBoundaryGap(String[] boundaryGap) {
		this.boundaryGap = boundaryGap;
		return this;
	}

	private RadarIndicatorOption[] indicator;
}
