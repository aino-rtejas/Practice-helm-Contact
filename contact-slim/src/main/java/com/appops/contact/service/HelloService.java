package com.appops.contact.service;

import java.io.IOException;
import org.appops.core.service.RequestMethod;
import org.appops.core.service.annotation.ServiceOp;
import com.appops.contact.core.Contact;

@Contact
public interface HelloService {

  @ServiceOp(method = RequestMethod.GET, path = "sayHello")
  public String sayHello(String name);
}