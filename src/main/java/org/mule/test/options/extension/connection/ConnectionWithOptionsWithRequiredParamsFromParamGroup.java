package org.mule.test.options.extension.connection;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.test.options.extension.GroupWithOptionsParameter;
import org.mule.test.options.extension.resolver.WithRequiredParameterFromGroupOptionsResolver;

@Alias("WithOptionsWithRequiredParamsFromParamGroup")
public class ConnectionWithOptionsWithRequiredParamsFromParamGroup extends AbstractConnectionProvider {

    @Parameter
    @DynamicOptions(WithRequiredParameterFromGroupOptionsResolver.class)
    String optionParam;

    @ParameterGroup(name = "someGroup")
    GroupWithOptionsParameter paramGroup;
}
