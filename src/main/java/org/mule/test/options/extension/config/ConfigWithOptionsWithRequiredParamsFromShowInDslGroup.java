package org.mule.test.options.extension.config;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.test.options.extension.GroupWithOptionsParameter;
import org.mule.test.options.extension.OptionsConnectionProvider;
import org.mule.test.options.extension.resolver.WithRequiredParameterFromGroupOptionsResolver;

@Configuration(name = "OptionsWithRequiredParamsFromShowInDslGroup")
@ConnectionProviders(OptionsConnectionProvider.class)
public class ConfigWithOptionsWithRequiredParamsFromShowInDslGroup {

    @Parameter
    @DynamicOptions(WithRequiredParameterFromGroupOptionsResolver.class)
    String optionParam;

    @ParameterGroup(name = "someGroup", showInDsl = true)
    GroupWithOptionsParameter paramGroup;
}
