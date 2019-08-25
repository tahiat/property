/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.property.api.containers.sets;

import java.util.Set;

import net.sf.mmm.property.api.containers.collections.ReadableCollectionProperty;
import net.sf.mmm.value.observable.containers.sets.ReadableSetValue;

/**
 * {@link ReadableCollectionProperty} with {@link Set} {@link #getValue() value}.
 *
 * @param <E> type of the {@link Set#contains(Object) contained elements}.
 *
 * @since 1.0.0
 */
public interface ReadableSetProperty<E> extends ReadableCollectionProperty<Set<E>, E>, ReadableSetValue<E> {

}
