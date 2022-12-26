package com.appops.contact.injection;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.appops.contact.impl.HelloServiceImpl;
import com.appops.contact.service.HelloService;
import org.appops.core.annotation.ImplModule;
import org.appops.service.injection.ServiceModule;
import org.hibernate.Session;
import com.appops.contact.core.Contact;

@ImplModule(serviceName = Contact.class)
public class ContactModule extends ServiceModule {

  @Override
  public void configureModule() {
    //TODO: Add bindings required for dependency injection within Contact.
    bind(HelloService.class).to(HelloServiceImpl.class);
  }
 
}
