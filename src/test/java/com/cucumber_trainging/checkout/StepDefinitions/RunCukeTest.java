package com.cucumber_trainging.checkout.StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/cucumber_trainging/checkout/features",
        glue = "com.cucumber_trainging.checkout.StepDefinitions",
        plugin = { 
                    "progress",
                    "html:target/cucumber_trainging",
                } 

        )

public class RunCukeTest {

}
