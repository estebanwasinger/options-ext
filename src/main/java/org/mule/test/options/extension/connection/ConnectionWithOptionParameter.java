package org.mule.test.options.extension.connection;


import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.test.options.extension.resolver.SimpleOptionsResolver;

@Alias("with-option-parameter")
public class ConnectionWithOptionParameter extends AbstractConnectionProvider {

    @Parameter
    @DynamicOptions(SimpleOptionsResolver.class)
    String channel;

}
