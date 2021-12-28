package org.icepear.echarts.origin.export;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L173
 */
public interface SeriesInjectedOption {

    SeriesInjectedOption setMarkArea(Object markArea);

    SeriesInjectedOption setMarkLine(Object markLine);

    SeriesInjectedOption setMarkPoint(Object markPoint);

    SeriesInjectedOption setTooltip(Object tooltip);
}
