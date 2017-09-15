package com.cucumber_trainging.checkout.StepDefinitions;

import cucumber.api.java.en.*;

import static org.junit.Assert.*;

import com.cucumber_training.checkout_test.Checkout;

public class CheckoutSteps {
    Checkout checkout;
    int bananaPrice = 0;
    int applePrice = 0;
    String itemName;

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        bananaPrice = price;
    }

    @And("^the price of an \"(.*?)\" is (\\d+)c$")
    public void applePrice(String name, int price) throws Throwable {
       applePrice = price;
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @And("^I extra checkout (\\d+) \"(.*?)\"$")
    public void moreCheckouts(int itemCount, String itemName) throws Throwable {
        if (itemName.equals("banana")) {
           checkout.add(itemCount, bananaPrice);
        } else if (itemName.equals("apple")) {
           checkout.add(itemCount, applePrice);
        }
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}

