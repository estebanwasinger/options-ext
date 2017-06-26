package org.mule.test.options;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import org.mule.runtime.api.options.Option;
import org.junit.Test;

import java.util.Set;

public class ConnectionProviderOptionsTestCase extends AbstractOptionsTestCase {

    @Override
    protected String getConfigFile() {
        return "connection-provider-options.xml";
    }


    @Test
    public void connectionWithOptions() throws Exception {
        Set<Option> channels = getOptionsFromConnection("with-option-parameter-connection", "channel");
        assertThat(channels, hasSize(3));
        assertThat(channels, hasOption("channel1", "channel2", "channel3"));
    }

    @Test
    public void connectionWithOptionsWithRequiredParameters() throws Exception{
        Set<Option> channels = getOptionsFromConnection("with-option-with-required-param-connection", "channel");
        assertThat(channels, hasSize(2));
        assertThat(channels, hasOption("required2:value2", "required1:value1"));
    }

    @Test
    public void connectionWithOptionsWithRequiredParamsFromParamGroup() throws Exception {
        Set<Option> channels = getOptionsFromConnection("options-with-required-params-from-param-group-connection", "optionParam");
        assertThat(channels, hasSize(1));
        assertThat(channels, hasOption("anyParameter:someValue"));
    }

    @Test
    public void connectionWithOptionsWithRequiredParamsFromShowInDslGroup() throws Exception {
        Set<Option> channels = getOptionsFromConnection("options-with-required-params-from-show-in-dsl-group-connection", "optionParam");
        assertThat(channels, hasSize(1));
        assertThat(channels, hasOption("anyParameter:someValue"));
    }
}
