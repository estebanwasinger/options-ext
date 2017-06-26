package org.mule.test.options.extension.resolver;

import org.mule.runtime.api.options.Option;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.options.OptionsResolver;
import org.mule.runtime.extension.api.options.OptionsResolverContext;
import org.mule.test.options.extension.OptionsConnection;
import org.mule.test.options.extension.config.SimpleConfig;

import java.util.List;
import java.util.Set;

public class WithRequiredParametersOptionsResolver implements OptionsResolver {

    @Parameter
    String requiredString;

    @Parameter
    int requiredInteger;

    @Parameter
    boolean requiredBoolean;

    @Parameter
    List<String> strings;

    @Override
    public Set<Option> resolve() {
        return getOptionsFor("requiredString:" + requiredString, "requiredInteger:" + requiredInteger, "requiredBoolean:" + requiredBoolean, "strings:" + strings);
    }
}
