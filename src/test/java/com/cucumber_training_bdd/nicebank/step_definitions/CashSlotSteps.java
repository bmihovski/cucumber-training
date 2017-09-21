package com.cucumber_training_bdd.nicebank.step_definitions;
import static org.junit.Assert.assertEquals;

import com.cucumber_training_bdd.nicebank.support.KnowsTheDomain;

import cucumber.api.java.en.Then;

public class CashSlotSteps {
	KnowsTheDomain helper;
	public CashSlotSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}
	
	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) throws Throwable {
		assertEquals("Incorrect amount dispensed -",
				dollars, helper.getCashSlot().getContents());
	}
}
