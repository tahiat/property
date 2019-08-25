/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.property.api.strings;

import javax.inject.Named;

import net.sf.mmm.property.api.ReadableProperty;
import net.sf.mmm.property.api.WritableProperty;
import net.sf.mmm.property.api.factory.AbstractPropertyFactory;
import net.sf.mmm.property.api.factory.PropertyFactory;
import net.sf.mmm.util.validation.base.AbstractValidator;

/**
 * Implementation of {@link PropertyFactory} for {@link StringProperty}.
 *
 * @since 1.0.0
 */
@Named
public class PropertyFactoryString extends AbstractPropertyFactory<String, StringProperty> {

  @Override
  public Class<String> getValueClass() {

    return String.class;
  }

  @Override
  public Class<? extends ReadableProperty<String>> getReadableInterface() {

    return ReadableStringProperty.class;
  }

  @Override
  public Class<? extends WritableProperty<String>> getWritableInterface() {

    return WritableStringProperty.class;
  }

  @Override
  public Class<StringProperty> getImplementationClass() {

    return StringProperty.class;
  }

  @Override
  public StringProperty create(String name, Class<? extends String> valueType, Object bean,
      AbstractValidator<? super String> validator) {

    return new StringProperty(name, bean, validator);
  }

}
