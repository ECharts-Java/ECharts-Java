package org.icepear.echarts.charts.tree;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.tree.TreeSeriesNodeItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain=true)
@Data
public class TreeSeriesNodeItem implements TreeSeriesNodeItemOption {

	private String symbol;

	@Setter(AccessLevel.NONE)
	private Object symbolSize;

	public TreeSeriesNodeItem setSymbolSize(Number symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	public TreeSeriesNodeItem setSymbolSize(Number[] symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	private Number symbolRotate;

	private Boolean symbolKeepAspect;

	@Setter(AccessLevel.NONE)
	private Object symbolOffset;

	public TreeSeriesNodeItem setSymbolOffset(Number symbolOffset) {
		this.symbolOffset = symbolOffset;
		return this;
	}

	public TreeSeriesNodeItem setSymbolOffset(Number[] symbolOffset) {
		this.symbolOffset = symbolOffset;
		return this;
	}

	public TreeSeriesNodeItem setSymbolOffset(String symbolOffset) {
		this.symbolOffset = symbolOffset;
		return this;
	}

	public TreeSeriesNodeItem setSymbolOffset(String[] symbolOffset) {
		this.symbolOffset = symbolOffset;
		return this;
	}

	private ItemStyleOption itemStyle;

	private Object lineStyle;

	private SeriesLabelOption label;

	private Object emphasis;

	private Object select;

	private Object blur;

	@Setter(AccessLevel.NONE)
	private Object id;

	public TreeSeriesNodeItem setId(Number id) {
		this.id = id;
		return this;
	}

	public TreeSeriesNodeItem setId(String id) {
		this.id = id;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object name;

	public TreeSeriesNodeItem setName(Number name) {
		this.name = name;
		return this;
	}

	public TreeSeriesNodeItem setName(String name) {
		this.name = name;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object groupId;

	public TreeSeriesNodeItem setGroupId(Number groupId) {
		this.groupId = groupId;
		return this;
	}

	public TreeSeriesNodeItem setGroupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	private Boolean selected;

	@Setter(AccessLevel.NONE)
	private Object value;

	public TreeSeriesNodeItem setValue(Number value) {
		this.value = value;
		return this;
	}

	public TreeSeriesNodeItem setValue(Number[] value) {
		this.value = value;
		return this;
	}

	public TreeSeriesNodeItem setValue(Object value) {
		this.value = value;
		return this;
	}

	public TreeSeriesNodeItem setValue(Object[] value) {
		this.value = value;
		return this;
	}

	public TreeSeriesNodeItem setValue(String value) {
		this.value = value;
		return this;
	}

	public TreeSeriesNodeItem setValue(String[] value) {
		this.value = value;
		return this;
	}

	private TreeSeriesNodeItemOption[] children;

	private Boolean collapsed;

	private String link;

	private String target;
}
