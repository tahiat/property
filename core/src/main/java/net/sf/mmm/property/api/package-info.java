/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
/**
 * Provides the API for generic and powerful properties. <a name="documentation"></a>
 * <h2>Property API</h2><br>
 * Unfortunately Java has no build in properties and will never have. For decades people had to waste their time writing
 * stupid Java beans with getters, setters and other boilerplate code. Writing generic code on top of this is extremely
 * complex and error prone and also results in relatively poor performance, access modifier violations, and many other
 * flaws. Hence, data-bindings in Java have been a nightmare and where never compiler safe.<br>
 * JavaFx wanted to cure this pain a little by introducing {@link javafx.beans.property.Property} a real property. This
 * already brings a lot of benefits especially for data-bindings, but writing Java beans manually based on such
 * {@link javafx.beans.property.Property properties} is causing even more boiler-plate code. Further
 * {@link javafx.beans.property.Property} still lacks a lot of build-in features such as generic value type support,
 * validation, read-only views, JSON mapping, etc.<br>
 * This API (and its implementation) comes with {@link net.sf.mmm.property.api.ReadableProperty} and
 * {@link net.sf.mmm.property.api.WritableProperty} as well as all the sub-interfaces and implementations to give
 * you full support for all your needs. It is based on and extends the JavaFx interfaces such as
 * {@link javafx.beans.property.Property} what makes it fully compatible so it can be used in JavaFx clients and many
 * other supporting places. Further, it adds all the missing features and comes with
 * {@link net.sf.mmm.util.bean.api.Bean} support that saves you from all the boilerplate code to give you the perfect
 * world you need. Stop wasting your time and use your time to actually implement real value.<br>
 * Note: You can also implement custom {@link net.sf.mmm.util.lang.api.Datatype}s as property just like
 * {@link net.sf.mmm.property.api.strings.StringListProperty} or
 * {@link net.sf.mmm.property.api.temporals.DurationInSecondsProperty}.
 *
 * @see net.sf.mmm.util.bean.api.Bean
 * @see net.sf.mmm.property.api.strings.StringProperty
 * @see net.sf.mmm.property.api.booleans.BooleanProperty
 * @see net.sf.mmm.property.api.numbers.integers.IntegerProperty
 * @see net.sf.mmm.property.api.numbers.longs.LongProperty
 * @see net.sf.mmm.property.api.numbers.bigdecimals.BigDecimalProperty
 * @see net.sf.mmm.property.api.temporals.instants.InstantProperty
 * @see net.sf.mmm.property.api.temporals.localdates.LocalDateProperty
 * @see net.sf.mmm.property.api.temporals.localdatetimes.LocalDateTimeProperty
 * @see net.sf.mmm.property.api.containers.lists.ListProperty
 * @see net.sf.mmm.property.api.containers.sets.SetProperty
 * @see net.sf.mmm.property.api.containers.maps.MapProperty
 * @see net.sf.mmm.property.api.links.LinkProperty
 * @see net.sf.mmm.property.api.links.LinkListProperty
 */
package net.sf.mmm.property.api;
