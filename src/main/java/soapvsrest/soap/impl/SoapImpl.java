package soapvsrest.soap.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import soapvsrest.GetExampleSoapRequest;
import soapvsrest.GetExampleSoapResponse;

/**
 * WebService that implements JAX-WS annotations (Java API for XML-Base Web Services). The JAX-WS
 * programming standard introduces support for annotating Java classes with metadata that is used to
 * define a service endpoint application as a web service.
 */
@Endpoint
public class SoapImpl {

  private static final String NAMESPACE_URI = "http://soapvsrest";

  @Autowired
  public SoapImpl() {}

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExampleSoapRequest")
  public @ResponsePayload GetExampleSoapResponse getExampleSoap(
      @RequestPayload GetExampleSoapRequest text) {
    GetExampleSoapResponse response = new GetExampleSoapResponse();
    response.setExample(text.getText());

    return response;
  }
}
