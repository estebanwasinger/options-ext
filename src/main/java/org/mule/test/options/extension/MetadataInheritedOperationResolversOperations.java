/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.options.extension;

import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Optional;

public class MetadataInheritedOperationResolversOperations extends MetadataOperationsParent {

  public void shouldInheritOperationParentResolvers(@Connection OptionsConnection connection, @MetadataKeyId String type,
                                                    @Optional @Content Object content) {}

  public Object shouldInheritOperationResolvers(@Connection OptionsConnection connection, @MetadataKeyId String type,
                                                @Optional @Content Object content) {
    return null;
  }

}
