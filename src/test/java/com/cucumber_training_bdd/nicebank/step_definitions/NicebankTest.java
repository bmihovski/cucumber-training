package com.cucumber_training_bdd.nicebank.step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cucumber_training_bdd/nicebank/features/",
		plugin = {"pretty", "html:target/cucumber"},
		snippets=SnippetType.CAMELCASE, monochrome = true)

public class NicebankTest {

}
