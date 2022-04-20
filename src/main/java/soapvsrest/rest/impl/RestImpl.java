package soapvsrest.rest.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soapvsrest.rest.Rest;

@RestController
@RequestMapping(path = "restvssoap")
public class RestImpl implements Rest {

  /**
   * Get example.
   *
   * @return String
   */
  @Override
  public ResponseEntity<String> getExample() {
    return new ResponseEntity<>("Example of a get api rest", HttpStatus.ACCEPTED);
  }

  /**
   * Post example.
   *
   * @param example Example data
   * @return Response entity example string
   */
  @Override
  public ResponseEntity<String> postExample(@PathVariable String example) {
    System.out.println("Data that came from the client: " + example);
    return new ResponseEntity<>(example, HttpStatus.CREATED);
  }
}
