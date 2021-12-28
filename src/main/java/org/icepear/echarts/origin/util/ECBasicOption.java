package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L575
 */
public interface ECBasicOption extends ECUnitOption {

    ECBasicOption setBaseOption(ECUnitOption baseOption);

    ECBasicOption setTimeline(ComponentOption timeline);

    ECBasicOption setTimeline(ComponentOption[] timeline);

    ECBasicOption setOptions(ECUnitOption[] options);

    ECBasicOption setMedia(MediaUnitOption[] media);
}
