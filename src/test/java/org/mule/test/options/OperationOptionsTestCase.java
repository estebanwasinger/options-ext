/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.options;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import org.mule.runtime.api.options.Option;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Set;

public class OperationOptionsTestCase extends AbstractOptionsTestCase {

  @Override
  protected String getConfigFile() {
    return "operation-options.xml";
  }

  @Test
  public void singleOptions() throws Exception {
    Set<Option> channels = getOptions("single-options-enabled-parameter", "channels");
    assertThat(channels, hasSize(3));
    assertThat(channels, hasOption("channel1", "channel2", "channel3"));
  }

  @Test
  public void singleOptionsEnabledParameterWithConnection() throws Exception {
    Set<Option> channels = getOptions("singleOptionsEnabledParameterWithConnection", "channels");
    assertThat(channels, hasSize(3));
    assertThat(channels, hasOption("connection1", "connection2", "connection3"));
  }

  @Test
  public void singleOptionsEnabledParameterWithConfiguration() throws Exception {
    Set<Option> channels = getOptions("singleOptionsEnabledParameterWithConfiguration", "channels");
    assertThat(channels, hasSize(3));
    assertThat(channels, hasOption("config1", "config2", "config3"));
  }

  @Test
  public void singleOptionsEnabledParameterWithRequiredParameters() throws Exception {
    Set<Option> channels = getOptions("singleOptionsEnabledParameterWithRequiredParameters", "channels");
    assertThat(channels, hasSize(4));
    assertThat(channels, hasOption("requiredInteger:2", "requiredBoolean:false", "strings:[1, 2]", "requiredString:aString"));
  }

  @Test
  public void singleOptionsEnabledParameterInsideParameterGroup() throws Exception {
    Set<Option> channels = getOptions("singleOptionsEnabledParameterInsideParameterGroup", "channels");
    assertThat(channels, hasSize(3));
    assertThat(channels, hasOption("channel1", "channel2", "channel3"));
  }

  @Test
  public void singleOptionsEnabledParameterRequiresValuesOfParameterGroup() throws Exception {
    Set<Option> channels = getOptions("singleOptionsEnabledParameterRequiresValuesOfParameterGroup", "values");
    assertThat(channels, hasSize(1));
    assertThat(channels, hasOption("anyParameter:aParam"));
  }

  @Test
  public void multiLevelOption() throws Exception {
    Set<Option> options = getGroupOptions("multiLevelOption", "options");
    Option option = options.iterator().next();
    assertThat(option.getDisplayName(), is("America"));
    assertThat(option.getId(), is("America"));
    assertThat(option.getPartName(), is("continent"));

    Option countryChild = option.getChilds().iterator().next();
    assertThat(countryChild.getDisplayName(), is("Argentina"));
    assertThat(countryChild.getId(), is("Argentina"));
    assertThat(countryChild.getPartName(), is("country"));
  }

  @Test
  public void singleOptionsWithRequiredParameterWithAlias() throws Exception {
    Set<Option> channels = getOptions("singleOptionsWithRequiredParameterWithAlias", "channels");
    assertThat(channels, hasSize(1));
    assertThat(channels, hasOption("requiredString:dummyValue"));
  }

  @Test
  public void resolverGetsMuleContextInjection() throws Exception {
    Set<Option> options = getOptions("resolverGetsMuleContextInjection", "channel");
    assertThat(options, hasSize(1));
    assertThat(options, hasOption("INJECTED!!!"));
  }

  @Test
  @Ignore("Error in org.mule.runtime.module.extension.internal.runtime.operation.OperationParameterValueResolver")
  public void optionsInsideShowInDslGroup() throws Exception {
    Set<Option> options = getOptions("optionsInsideShowInDslGroup", "values");
  }
}
