package com.appops.contact.injection;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.appops.core.annotation.SlimModule;
import org.appops.slim.base.injection.ServiceSlimModule;
import com.appops.contact.core.Contact;
import com.appops.contact.service.HelloService;

@SlimModule(serviceName = Contact.class)
public class ContactSlimModule extends ServiceSlimModule {

  @Override
  public void configureModule() {
    //TODO: Add bindings required for dependency injection within Contact.
    bindServiceApi(HelloService.class);
  }
 
}
