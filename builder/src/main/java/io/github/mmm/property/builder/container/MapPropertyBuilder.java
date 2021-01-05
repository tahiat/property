/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.property.builder.container;

import java.util.Map;

import io.github.mmm.property.Property;
import io.github.mmm.property.PropertyMetadata;
import io.github.mmm.property.builder.PropertyBuilders;
import io.github.mmm.property.builder.PropertyBuilder;
import io.github.mmm.property.container.map.MapProperty;
import io.github.mmm.property.object.SimpleProperty;
import io.github.mmm.validation.collection.ValidatorBuilderMap;

/**
 * {@link ProcessBuilder} for {@link MapProperty}.
 *
 * @param <K> type of the {@link Map#containsKey(Object) keys}.
 * @param <V> type of the {@link Map#containsValue(Object) values}.
 * @since 1.0.0
 * @see PropertyBuilder#asMap()
 */
public class MapPropertyBuilder<K, V> extends
    PropertyBuilder<Map<K, V>, MapProperty<K, V>, ValidatorBuilderMap<K, V, MapPropertyBuilder<K, V>>, MapPropertyBuilder<K, V>> {

  private SimpleProperty<K> keyProperty;

  private Property<V> valueProperty;

  /**
   * The constructor.
   *
   * @param parent the {@link PropertyBuilders}.
   */
  public MapPropertyBuilder(PropertyBuilders parent) {

    this(parent, null, null);
  }

  /**
   * The constructor.
   *
   * @param parent the {@link PropertyBuilders}.
   * @param valueProperty the {@link MapProperty#getValueProperty() value property}.
   */
  public MapPropertyBuilder(PropertyBuilders parent, Property<V> valueProperty) {

    this(parent, null, valueProperty);
  }

  /**
   * The constructor.
   *
   * @param parent the {@link PropertyBuilders}.
   * @param keyProperty the {@link MapProperty#getKeyProperty() key property}.
   * @param valueProperty the {@link MapProperty#getValueProperty() value property}.
   */
  public MapPropertyBuilder(PropertyBuilders parent, SimpleProperty<K> keyProperty, Property<V> valueProperty) {

    super(parent);
    this.keyProperty = keyProperty;
    this.valueProperty = valueProperty;
  }

  /**
   * @param property the {@link MapProperty#getKeyProperty() key property}.
   * @return this builder itself ({@code this}) for fluent API calls.
   */
  public MapPropertyBuilder<K, V> keyProperty(SimpleProperty<K> property) {

    this.keyProperty = property;
    return this;
  }

  /**
   * @param property the {@link MapProperty#getValueProperty() value property}.
   * @return this builder itself ({@code this}) for fluent API calls.
   */
  public MapPropertyBuilder<K, V> valueProperty(Property<V> property) {

    this.valueProperty = property;
    return this;
  }

  @Override
  protected ValidatorBuilderMap<K, V, MapPropertyBuilder<K, V>> createValidatorBuilder() {

    return new ValidatorBuilderMap<>(this);
  }

  @Override
  protected MapProperty<K, V> build(String name, PropertyMetadata<Map<K, V>> metadata) {

    return new MapProperty<>(name, this.keyProperty, this.valueProperty, metadata);
  }

}
