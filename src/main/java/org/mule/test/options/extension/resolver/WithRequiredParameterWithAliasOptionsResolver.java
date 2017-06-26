package org.mule.test.options.extension.resolver;

import org.mule.runtime.api.options.Option;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.options.OptionsResolver;

import java.util.Set;

public class WithRequiredParameterWithAliasOptionsResolver implements OptionsResolver {

    @Parameter
    String requiredString;

    @Override
    public Set<Option> resolve() {
        return getOptionsFor("requiredString:" + requiredString);
    }
}
