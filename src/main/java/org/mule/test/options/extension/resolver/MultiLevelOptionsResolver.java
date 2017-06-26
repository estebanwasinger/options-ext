package org.mule.test.options.extension.resolver;

import static org.mule.runtime.api.options.OptionBuilder.newOption;
import org.mule.runtime.api.options.Option;
import org.mule.runtime.extension.api.options.OptionsResolver;
import org.mule.runtime.extension.api.options.OptionsResolverContext;
import org.mule.test.options.extension.OptionsConnection;
import org.mule.test.options.extension.OptionsExtension;

import java.util.Collections;
import java.util.Set;

public class MultiLevelOptionsResolver implements OptionsResolver {
    private static final String AMERICA = "America";
    private static final String ARGENTINA = "Argentina";
    private static final String BUENOS_AIRES = "Buenos Aires";
    private static final String LA_PLATA = "La Plata";
    private static final String USA = "USA";
    private static final String USA_DISPLAY_NAME = "United States Of America";
    private static final String SAN_FRANCISCO = "San Francisco";

    @Override
    public Set<Option> resolve() {
        return Collections.singleton(newOption(AMERICA).withDisplayName(AMERICA)
                .withChild(newOption(ARGENTINA).withChild(newOption(BUENOS_AIRES)).withChild(newOption(LA_PLATA)))
                .withChild(newOption(USA).withDisplayName(USA_DISPLAY_NAME).withChild(newOption(SAN_FRANCISCO))).build());
    }
}
