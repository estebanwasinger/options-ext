package org.mule.test.options.extension.resolver;

import org.mule.runtime.api.options.Option;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.options.OptionsResolver;
import org.mule.runtime.extension.api.options.OptionsResolverContext;
import org.mule.test.options.extension.OptionsConnection;
import org.mule.test.options.extension.config.SimpleConfig;

import java.util.Set;

public class WithConnectionOptionsResolver implements OptionsResolver {

    @Connection
    OptionsConnection connection;

    @Override
    public Set<Option> resolve() {
        return getOptionsFor(connection.getEntities());
    }
}
