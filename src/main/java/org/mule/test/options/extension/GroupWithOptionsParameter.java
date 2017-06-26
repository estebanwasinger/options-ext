/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.options.extension;

import org.mule.runtime.extension.api.annotation.options.DynamicOptions;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.test.options.extension.resolver.SimpleOptionsResolver;

public class GroupWithOptionsParameter {

  @DynamicOptions(SimpleOptionsResolver.class)
  @Parameter
  String channels;

  @Optional
  @Parameter
  String anyParameter;

}
