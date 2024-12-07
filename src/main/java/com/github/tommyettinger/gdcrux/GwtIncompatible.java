package com.github.tommyettinger.gdcrux;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for the GWT compiler that makes a piece of code ignored on GWT only.
 * This isn't actually used here, currently, but it may be used by dependencies.
 * Importantly, any methods declared by Externalizable should be marked with this when implemented.
 *
 * @author smelC
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface GwtIncompatible {

}
