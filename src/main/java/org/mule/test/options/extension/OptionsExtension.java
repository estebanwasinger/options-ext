/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.options.extension;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.test.options.extension.config.ConfigWithOptionAndRequiredParam;
import org.mule.test.options.extension.config.ConfigWithOptionParameter;
import org.mule.test.options.extension.config.ConfigWithOptionParameterAndConnection;
import org.mule.test.options.extension.config.ConfigWithOptionsWithRequiredParamsFromParamGroup;
import org.mule.test.options.extension.config.ConfigWithOptionsWithRequiredParamsFromShowInDslGroup;
import org.mule.test.options.extension.config.SimpleConfig;

@Extension(name = "Options")
@Configurations({SimpleConfig.class, ConfigWithOptionParameter.class, ConfigWithOptionParameterAndConnection.class, ConfigWithOptionAndRequiredParam.class, ConfigWithOptionsWithRequiredParamsFromParamGroup.class, ConfigWithOptionsWithRequiredParamsFromShowInDslGroup.class})
//@Sources({OptionsSource.class, OptionsSourceWithMultilevel.class})
@Xml(namespace = "http://www.mulesoft.org/schema/mule/options", prefix = "options")
public class OptionsExtension {

}
