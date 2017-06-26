package org.mule.test.options.extension.resolver;

import org.mule.runtime.api.options.Option;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.options.ConfigurationAware;
import org.mule.runtime.extension.api.options.ConnectionAware;
import org.mule.runtime.extension.api.options.OptionsResolver;
import org.mule.runtime.extension.api.options.OptionsResolverContext;
import org.mule.test.options.extension.OptionsConnection;
import org.mule.test.options.extension.config.SimpleConfig;

import java.util.Set;

public class WithConfigOptionsResolver implements OptionsResolver {

    @Config
    private SimpleConfig configuration;

    @Override
    public Set<Option> resolve() {
        return getOptionsFor(configuration.getConfigValues());
    }

}
