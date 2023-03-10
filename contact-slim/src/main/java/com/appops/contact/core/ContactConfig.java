package com.appops.contact.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.appops.core.annotation.Config;

@Config
@Contact
@Retention(RetentionPolicy.RUNTIME)
public @interface ContactConfig {
  /*
   * Add this annotation on top of configuration classes which you will create to provide
   * configurations.
   */
}
