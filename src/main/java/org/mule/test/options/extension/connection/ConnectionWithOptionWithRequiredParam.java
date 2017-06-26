package org.mule.test.options.extension.connection;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.test.options.extension.resolver.WithRequiredParametersFromConfigOptionsResolver;

@Alias("WithOptionWithRequiredParam")
public class ConnectionWithOptionWithRequiredParam extends AbstractConnectionProvider {

    @Parameter
    @DynamicOptions(WithRequiredParametersFromConfigOptionsResolver.class)
    String channel;

    @Parameter
    String required1;

    @Parameter
    String required2;
}
