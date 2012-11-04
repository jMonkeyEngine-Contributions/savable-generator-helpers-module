package com.wivlaro.jme3.export;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Currently unused.
 * 
 * @author bill
 */

@Retention(RetentionPolicy.SOURCE)
public @interface HookMethodConfig {
	enum Type {
		BEFORE_READ,
		AFTER_READ,
		BEFORE_WRITE,
		AFTER_WRITE
	};
	Type type();
}
