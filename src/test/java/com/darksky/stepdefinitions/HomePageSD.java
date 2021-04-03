package com.darksky.stepdefinitions;

import com.darksky.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD {
    @Given("I am on the Homepage")
    public void iAmOnTheHomepage() {
        String expectedTitle ="Dark Sky - 1 City Hall, New York, NY";
        Assert.assertEquals(expectedTitle, HomePage.verifyTitle());
    }

    @When("enter city name")
    public void enterCityName() {
        HomePage.enterCity();
    }

    @And("click on the search button")
    public void clickOnTheSearchButton() {
        HomePage.clickSearch();
    }

    @Then("see the temperature")
    public void seeTheTemperature() {
        String expectedlow = HomePage.getTemperatureHigh();
        String expectedhigh = HomePage.getTemperatureHigh();
        Assert.assertTrue(expectedhigh!="");
        Assert.assertTrue(expectedlow!="");
    }
}
