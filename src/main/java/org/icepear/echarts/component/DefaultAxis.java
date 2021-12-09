package org.icepear.echarts.component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.AxisLabelBaseOption;
import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.MinorSplitLineOption;
import org.icepear.echarts.origin.coord.MinorTickOption;
import org.icepear.echarts.origin.coord.SplitAreaOption;
import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.coord.cartesian.DefaultAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain=true)
@Data
public class DefaultAxis implements DefaultAxisOption {

	private Number gridIndex;

	private String gridId;

	private String position;

	private Number offset;

	private Object categorySortInfo;

	private String mainType;

	private String type;

	@Setter(AccessLevel.NONE)
	private Object id;

	public DefaultAxis setId(String id) {
		this.id = id;
		return this;
	}

	public DefaultAxis setId(Number id) {
		this.id = id;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object name;

	public DefaultAxis setName(String name) {
		this.name = name;
		return this;
	}

	public DefaultAxis setName(Number name) {
		this.name = name;
		return this;
	}

	private Number z;

	private Number zlevel;

	private Boolean animation;

	private Number animationThreshold;

	@Setter(AccessLevel.NONE)
	private Object animationDuration;

	public DefaultAxis setAnimationDuration(Number animationDuration) {
		this.animationDuration = animationDuration;
		return this;
	}

	public DefaultAxis setAnimationDuration(Object animationDuration) {
		this.animationDuration = animationDuration;
		return this;
	}

	private Object animationEasing;

	@Setter(AccessLevel.NONE)
	private Object animationDelay;

	public DefaultAxis setAnimationDelay(Number animationDelay) {
		this.animationDelay = animationDelay;
		return this;
	}

	public DefaultAxis setAnimationDelay(Object animationDelay) {
		this.animationDelay = animationDelay;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object animationDurationUpdate;

	public DefaultAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
		this.animationDurationUpdate = animationDurationUpdate;
		return this;
	}

	public DefaultAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
		this.animationDurationUpdate = animationDurationUpdate;
		return this;
	}

	private Object animationEasingUpdate;

	@Setter(AccessLevel.NONE)
	private Object animationDelayUpdate;

	public DefaultAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
		this.animationDelayUpdate = animationDelayUpdate;
		return this;
	}

	public DefaultAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
		this.animationDelayUpdate = animationDelayUpdate;
		return this;
	}

	private Boolean show;

	private Boolean inverse;

	private String nameLocation;

	private Number nameRotate;

	private Object nameTruncate;

	private Object nameTextStyle;

	private Number nameGap;

	private Boolean silent;

	private Boolean triggerEvent;

	private Object tooltip;

	private AxisLabelBaseOption axisLabel;

	private CommonAxisPointerOption axisPointer;

	private AxisLineOption axisLine;

	private AxisTickOption axisTick;

	private MinorTickOption minorTick;

	private SplitLineOption splitLine;

	private MinorSplitLineOption minorSplitLine;

	private SplitAreaOption splitArea;

	@Setter(AccessLevel.NONE)
	private Object min;

	public DefaultAxis setMin(String min) {
		this.min = min;
		return this;
	}

	public DefaultAxis setMin(Number min) {
		this.min = min;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object max;

	public DefaultAxis setMax(String max) {
		this.max = max;
		return this;
	}

	public DefaultAxis setMax(Number max) {
		this.max = max;
		return this;
	}
}
