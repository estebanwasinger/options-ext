package org.mule.test.options;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import org.mule.runtime.api.options.Option;
import org.junit.Test;

import java.util.Set;

public class ConfigurationOptionsTestCase extends AbstractOptionsTestCase {

    @Override
    protected String getConfigFile() {
        return "configuration-options.xml";
    }

    @Test
    public void configWithOptions() throws Exception {
        Set<Option> channels = getOptionsFromConfig("config-with-option", "channel");
        assertThat(channels, hasSize(3));
        assertThat(channels, hasOption("channel1", "channel2", "channel3"));
    }

    @Test
    public void configWithOptionsWithRequiredParameters() throws Exception{
        Set<Option> channels = getOptionsFromConfig("option-with-required-param", "channel");
        assertThat(channels, hasSize(2));
        assertThat(channels, hasOption("required2:value2", "required1:value1"));
    }

    @Test
    public void configWithOptionsWithRequiredParamsFromParamGroup() throws Exception {
        Set<Option> channels = getOptionsFromConfig("options-with-required-params-from-param-group-config", "optionParam");
        assertThat(channels, hasSize(1));
        assertThat(channels, hasOption("anyParameter:someValue"));
    }

    @Test
    public void configWithOptionsWithRequiredParamsFromShowInDslGroup() throws Exception {
        Set<Option> channels = getOptionsFromConfig("options-with-required-params-from-show-in-dsl-group", "optionParam");
        assertThat(channels, hasSize(1));
        assertThat(channels, hasOption("anyParameter:someValue"));
    }

//
//    //TODO VALIDATOR THAT CHECKS THAT A CONNECTION ENABLED RESOLVER CANT DEPEND OF RE
//    @Test
//    public void optionsWithConnection() throws Exception {
//        Set<Option> channels = getOptionsFromConfig("options-with-connection", "channels");
//        System.out.println(channels);
//    }
}
