package org.mule.test.options.extension.config;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.test.options.extension.OptionsConnectionProvider;
import org.mule.test.options.extension.OptionsOperations;
import org.mule.test.options.extension.connection.ConnectionWithOptionParameter;
import org.mule.test.options.extension.connection.ConnectionWithOptionWithRequiredParam;
import org.mule.test.options.extension.connection.ConnectionWithOptionsWithRequiredParamsFromParamGroup;
import org.mule.test.options.extension.connection.ConnectionWithOptionsWithRequiredParamsFromShowInDslGroup;

import java.util.List;

@Configuration(name = "config")
@ConnectionProviders({OptionsConnectionProvider.class, ConnectionWithOptionParameter.class, ConnectionWithOptionWithRequiredParam.class, ConnectionWithOptionsWithRequiredParamsFromParamGroup.class, ConnectionWithOptionsWithRequiredParamsFromShowInDslGroup.class})
@Operations({OptionsOperations.class})
public class SimpleConfig {

    @Parameter
    @Optional(defaultValue = "noExpression")
    private String data;

    @Parameter
    @Optional
    private List<String> configValues;

    public String getData() {
        return data;
    }

    public List<String> getConfigValues() {
        return configValues;
    }
}
