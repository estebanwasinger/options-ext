package org.mule.extension.some.api;

import org.mule.runtime.extension.api.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Export;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connector.ConnectionProviders;

@Extension(name = "Test Extension", vendor = "MuleSoft Inc.", category = Category.SELECT)
@Configurations({ConfigOne.class})
@ConnectionProviders(ConnProviderOne.class)
@Export(classes = ConfigOne.class)
public class TestExtension {
}