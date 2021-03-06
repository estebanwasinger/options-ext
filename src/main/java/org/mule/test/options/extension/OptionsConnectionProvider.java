/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.options.extension;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class OptionsConnectionProvider implements ConnectionProvider<OptionsConnection> {

  @Parameter
          @Optional
  String someParameter;

  @Override
  public OptionsConnection connect() throws ConnectionException {
    return new OptionsConnection();
  }

  @Override
  public void disconnect(OptionsConnection optionsConnection) {

  }

  @Override
  public ConnectionValidationResult validate(OptionsConnection optionsConnection) {
    return ConnectionValidationResult.success();
  }
}
