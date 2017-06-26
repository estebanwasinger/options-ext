package org.mule.test.options;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.api.options.Option;
import org.mule.runtime.api.options.OptionBuilder;
import org.mule.runtime.core.api.construct.Flow;
import org.mule.runtime.module.extension.internal.runtime.ExtensionComponent;
import org.mule.runtime.module.extension.internal.runtime.config.ConfigurationProviderMetadataAdapter;
import org.mule.tck.junit4.matcher.OptionsMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsCollectionContaining;

import java.util.Set;

public class AbstractOptionsTestCase extends MuleArtifactFunctionalTestCase {

    @Override
    protected boolean isDisposeContextPerClass() {
        return true;
    }

    protected Matcher<Iterable<Option>> hasOption(String... optionsId) {
        Set<OptionsMatcher> options = stream(optionsId)
                .map(OptionsMatcher::optionWithId)
                .collect(toSet());
        return IsCollectionContaining.hasItems(options.toArray(new OptionsMatcher[]{}));
    }

    private ExtensionComponent<?> getComponentFromFlow(String flowName) throws Exception {
        Flow flow = (Flow) getFlowConstruct(flowName);
        return (ExtensionComponent) flow.getProcessors().get(0);
    }

    protected Set<Option> getOptions(String flowName, String parameterName) throws Exception {
        return getComponentFromFlow(flowName).getOptions(parameterName);
    }

    protected Set<Option> getOptionsFromConfig(String configName, String parameterName) throws Exception {
        ConfigurationProviderMetadataAdapter config = muleContext.getRegistry().get(configName);
        return config.getOptions(parameterName);
    }
    protected Set<Option> getOptionsFromConnection(String configName, String parameterName) throws Exception {
        ConfigurationProviderMetadataAdapter config = muleContext.getRegistry().get(configName);
        return config.getConnectionOptions(parameterName);
    }

    protected Set<Option> getGroupOptions(String flowName, String parameterName) throws Exception {
        return getComponentFromFlow(flowName).getGroupOptions(parameterName);
    }
}
