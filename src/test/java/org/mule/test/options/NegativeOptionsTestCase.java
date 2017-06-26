package org.mule.test.options;

import org.mule.runtime.api.options.Option;
import org.junit.Test;

import java.util.Set;

public class NegativeOptionsTestCase extends AbstractOptionsTestCase {

    @Override
    protected String getConfigFile() {
        return "negative-options.xml";
    }

    @Test
    public void test() throws Exception {
        Set<Option> options = getOptions("singleOptionsEnabledParameterWithRequiredParameters", "channels");
        System.out.println(options);
    }
}
