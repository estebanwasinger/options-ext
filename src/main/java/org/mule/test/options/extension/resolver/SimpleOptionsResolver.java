/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.options.extension.resolver;

import org.mule.runtime.api.options.Option;
import org.mule.runtime.extension.api.options.OptionsResolver;
import org.mule.runtime.extension.api.options.OptionsResolverContext;
import org.mule.test.options.extension.OptionsConnection;
import org.mule.test.options.extension.OptionsExtension;

import java.util.Set;

public class SimpleOptionsResolver implements OptionsResolver {

  @Override
  public Set<Option> resolve() {
    return getOptionsFor("channel1", "channel2", "channel3");
  }

}
