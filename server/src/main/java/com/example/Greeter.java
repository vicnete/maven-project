package com.example;


/**
 * Domain classes used to produce the JSON and XML output for the RESTful services. 
 * <p>
 * These classes contain the JAXB annotations.
 *
 * @since 1.0
 * @author jwhite
 * @version 1.1
 */

public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  public String greet( final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
