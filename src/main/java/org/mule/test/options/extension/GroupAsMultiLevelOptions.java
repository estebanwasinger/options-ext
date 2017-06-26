package org.mule.test.options.extension;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.options.OptionsPart;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

public class GroupAsMultiLevelOptions {

    @Parameter
    @Optional(defaultValue = "some value")
    @Alias("required")
    private String requiredParam;

    @Optional(defaultValue = "AMERICA")
    @OptionsPart(order = 1)
    @Parameter
    private String continent;

    @Optional(defaultValue = "USA")
    @OptionsPart(order = 2)
    @Parameter
    private String country;

    @Optional(defaultValue = "SFO")
    @DisplayName("State | City")
    @OptionsPart(order = 3)
    @Parameter
    private String city;

}
