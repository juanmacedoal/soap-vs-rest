package soapvsrest.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Rest example: Represents the best practices of Restful and the example of this architecture
 * pattern.
 */
public interface Rest {

  /**
   * Get example.
   *
   * @return String
   */
  @GetMapping(path = "/example", produces = APPLICATION_JSON_UTF8_VALUE)
  ResponseEntity<String> getExample();

  /**
   * Post example.
   *
   * @return
   */
  @PostMapping(path = "/example/{example}", produces = APPLICATION_JSON_UTF8_VALUE)
  ResponseEntity<String> postExample(@PathVariable String example);
}
