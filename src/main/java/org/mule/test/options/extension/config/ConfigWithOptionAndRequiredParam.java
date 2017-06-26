package org.mule.test.options.extension.config;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.test.options.extension.OptionsConnectionProvider;
import org.mule.test.options.extension.resolver.WithRequiredParametersFromConfigOptionsResolver;

@Configuration(name = "OptionWithRequiredParam")
@ConnectionProviders(OptionsConnectionProvider.class)
public class ConfigWithOptionAndRequiredParam {

    @Parameter
    @DynamicOptions(WithRequiredParametersFromConfigOptionsResolver.class)
    String channel;

    @Parameter
    String required1;

    @Parameter
    String required2;
}
