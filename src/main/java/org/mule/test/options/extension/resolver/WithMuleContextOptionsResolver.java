package org.mule.test.options.extension.resolver;

import org.mule.runtime.api.options.Option;
import org.mule.runtime.core.api.MuleContext;
import org.mule.runtime.core.api.context.MuleContextAware;
import org.mule.runtime.extension.api.options.OptionsResolver;

import java.util.Set;

public class WithMuleContextOptionsResolver implements OptionsResolver, MuleContextAware {
    private MuleContext context;

    @Override
    public Set<Option> resolve() {
        if(context != null){
            return getOptionsFor("INJECTED!!!");
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void setMuleContext(MuleContext context) {
        this.context = context;
    }
}
