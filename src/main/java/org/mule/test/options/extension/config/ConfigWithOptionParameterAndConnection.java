package org.mule.test.options.extension.config;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.test.options.extension.OptionsConnectionProvider;
import org.mule.test.options.extension.OptionsOperations;
import org.mule.test.options.extension.resolver.WithConnectionOptionsResolver;

@ConnectionProviders(OptionsConnectionProvider.class)
@Configuration(name = "options-with-connection")
@Operations(OptionsOperations.class)
public class ConfigWithOptionParameterAndConnection {

        @Parameter
        @DynamicOptions(WithConnectionOptionsResolver.class)
        String channels;
}
