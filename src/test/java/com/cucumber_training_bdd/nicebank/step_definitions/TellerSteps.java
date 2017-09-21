package com.cucumber_training_bdd.nicebank.step_definitions;
import com.cucumber_training_implementation.nicebank.support.KnowsTheDomain;

import cucumber.api.java.en.When;

public class TellerSteps {
	KnowsTheDomain helper;

	public TellerSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}
	@When("^I withdraw \\$(\\d+)$")
	public void iRequest$(int dollars) throws Throwable {
		helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
	}
}
