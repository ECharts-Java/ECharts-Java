package org.icepear.echarts.components.animation;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.AnimationOptionMixin;

@Accessors(chain=true)
@Data
public class Animation implements AnimationOptionMixin {

	private Boolean animation;

	private Number animationThreshold;

	@Setter(AccessLevel.NONE)
	private Object animationDuration;

	public Animation setAnimationDuration(Number animationDuration) {
		this.animationDuration = animationDuration;
		return this;
	}

	public Animation setAnimationDuration(Object animationDuration) {
		this.animationDuration = animationDuration;
		return this;
	}

	private Object animationEasing;

	@Setter(AccessLevel.NONE)
	private Object animationDelay;

	public Animation setAnimationDelay(Number animationDelay) {
		this.animationDelay = animationDelay;
		return this;
	}

	public Animation setAnimationDelay(Object animationDelay) {
		this.animationDelay = animationDelay;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object animationDurationUpdate;

	public Animation setAnimationDurationUpdate(Number animationDurationUpdate) {
		this.animationDurationUpdate = animationDurationUpdate;
		return this;
	}

	public Animation setAnimationDurationUpdate(Object animationDurationUpdate) {
		this.animationDurationUpdate = animationDurationUpdate;
		return this;
	}

	private Object animationEasingUpdate;

	@Setter(AccessLevel.NONE)
	private Object animationDelayUpdate;

	public Animation setAnimationDelayUpdate(Number animationDelayUpdate) {
		this.animationDelayUpdate = animationDelayUpdate;
		return this;
	}

	public Animation setAnimationDelayUpdate(Object animationDelayUpdate) {
		this.animationDelayUpdate = animationDelayUpdate;
		return this;
	}
}
