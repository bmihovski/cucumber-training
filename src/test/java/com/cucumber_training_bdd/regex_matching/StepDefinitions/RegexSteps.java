package com.cucumber_training_bdd.regex_matching.StepDefinitions;

import cucumber.api.java.en.Given;

public class RegexSteps {
  @Given("^(?:.*) flight (\\w+) is leaving today$")
  public void theFlightLeavingCheck(String flight) throws Throwable {
	  System.out.println("The leaving flight is " + flight);
  }

}
