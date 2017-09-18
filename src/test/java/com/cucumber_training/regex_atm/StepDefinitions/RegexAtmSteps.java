package com.cucumber_training.regex_atm.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegexAtmSteps {
  @Given("I have deposited \\$(\\d+) in my (\\w+) Account")
  public void iHaveDeposited$InMyAccount(int amount, String accountType) {
    System.out.printf("The ammount is %d and account type %s", amount, accountType);
    System.out.println();
  }
  
  @When("^I transfer \\$(\\d+) from my (\\w+) Account into my (\\w+) Account$")
  public void iTransfer$FromMyAccount(int amount, String from_account, String to_account) {
	  System.out.printf("The amount of $%d, being transferred from %s to %s", amount, from_account, to_account);
	  System.out.println();
  }

}
