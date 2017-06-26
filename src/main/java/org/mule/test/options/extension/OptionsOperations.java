/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.options.extension;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.test.options.extension.resolver.MultiLevelOptionsResolver;
import org.mule.test.options.extension.resolver.SimpleOptionsResolver;
import org.mule.test.options.extension.resolver.WithConfigOptionsResolver;
import org.mule.test.options.extension.resolver.WithConnectionOptionsResolver;
import org.mule.test.options.extension.resolver.WithMuleContextOptionsResolver;
import org.mule.test.options.extension.resolver.WithRequiredParameterFromGroupOptionsResolver;
import org.mule.test.options.extension.resolver.WithRequiredParametersOptionsResolver;

import java.util.List;

public class OptionsOperations {

  public void singleOptionsEnabledParameter(@DynamicOptions(SimpleOptionsResolver.class) String channels) {

  }

  public void singleOptionsEnabledParameterWithConnection(@DynamicOptions(WithConnectionOptionsResolver.class) String channels,
                                                          @Connection OptionsConnection connection) {

  }

  public void singleOptionsEnabledParameterWithConfiguration(@DynamicOptions(WithConfigOptionsResolver.class) String channels,
                                                                 @Connection OptionsConnection connection) {

  }

  public void singleOptionsEnabledParameterWithRequiredParameters(@DynamicOptions(WithRequiredParametersOptionsResolver.class) String channels,
                                                                  String requiredString,
                                                                  boolean requiredBoolean,
                                                                  int requiredInteger,
                                                                  List<String> strings) {
  }

  public void singleOptionsEnabledParameterInsideParameterGroup(@ParameterGroup(
      name = "OptionsGroup") GroupWithOptionsParameter optionsParameter) {
  }
  public void singleOptionsEnabledParameterRequiresValuesOfParameterGroup(@DynamicOptions(WithRequiredParameterFromGroupOptionsResolver.class) String values,
                                                                          @ParameterGroup(name = "OptionsGroup") GroupWithOptionsParameter optionsParameter) {
  }

  public void multiLevelOption(@DynamicOptions(MultiLevelOptionsResolver.class) @ParameterGroup(name = "options") GroupAsMultiLevelOptions optionsParameter){

  }

  public void singleOptionsWithRequiredParameterWithAlias(@ParameterGroup(name = "someGroup") WithRequiredParameterWithAliasGroup group) {
  }

  public void resolverGetsMuleContextInjection(@DynamicOptions(WithMuleContextOptionsResolver.class) String channel){

  }

  public void optionsInsideShowInDslGroup(@DynamicOptions(WithRequiredParameterFromGroupOptionsResolver.class) String values,
                                          @ParameterGroup(name = "OptionsGroup", showInDsl = true) GroupWithOptionsParameter optionsParameter){

  }
}
