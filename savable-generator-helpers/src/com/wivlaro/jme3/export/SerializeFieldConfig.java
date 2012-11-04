package com.wivlaro.jme3.export;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for fields in Savable implementation to configure jme-savable-generator.
 *
 * @author bill
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface SerializeFieldConfig {
	/** Set this to false to specify that this field should not be serialized. */
	boolean serialize() default true;
	/** Override the type suffix detection with this method. 
	 *  This is the part of the name after "read" on the methods in com.jme3.export.InputCapsule
	 * (and some of the "write" suffixes on OutputCapsule).  */
	String typeSuffix() default "";
	/** Override usage of the field name as the name string used for storing this field. */
	String storageLabel() default "";
	/** When reading this field on import, use this method to set the value. */
	String setMethod() default "";
	/** When writing this field on export, use this method to get the value. */
	String getMethod() default "";
}
