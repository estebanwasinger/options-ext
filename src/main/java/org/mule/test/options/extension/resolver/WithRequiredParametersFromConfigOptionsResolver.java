package org.mule.test.options.extension.resolver;

import org.mule.runtime.api.options.Option;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.options.OptionsResolver;

import java.util.Set;

public class WithRequiredParametersFromConfigOptionsResolver implements OptionsResolver {

    @Parameter
    String required1;

    @Parameter
    String required2;

    @Override
    public Set<Option> resolve() {
        return getOptionsFor("required1:" + required1, "required2:" + required2);
    }
}
