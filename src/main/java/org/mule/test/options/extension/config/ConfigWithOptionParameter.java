package org.mule.test.options.extension.config;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.test.options.extension.OptionsConnectionProvider;
import org.mule.test.options.extension.resolver.SimpleOptionsResolver;

@Configuration(name = "config-with-option")
@ConnectionProviders(OptionsConnectionProvider.class)
public class ConfigWithOptionParameter {

    @Parameter
    @DynamicOptions(SimpleOptionsResolver.class)
    String channel;
}
