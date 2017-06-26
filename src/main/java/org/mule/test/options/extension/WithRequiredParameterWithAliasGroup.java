package org.mule.test.options.extension;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.test.options.extension.resolver.WithRequiredParameterWithAliasOptionsResolver;

public class WithRequiredParameterWithAliasGroup {

    @Parameter
    @Alias("superString")
    String requiredString;

    @Parameter
    @DynamicOptions(WithRequiredParameterWithAliasOptionsResolver.class)
    String channels;
}
