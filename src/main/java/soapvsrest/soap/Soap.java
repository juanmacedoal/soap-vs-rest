package soapvsrest.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import soapvsrest.GetExampleSoapResponse;

/**
 * SOAP Simple Object Access Protocol. Is an standar protocol that is defined for exchanging
 * structured information in the implementation of web services. It uses XML information.
 */
public interface Soap {

  public GetExampleSoapResponse getExampleSoap();
}
