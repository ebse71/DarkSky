package com.darksky.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/darksky/stepdefinitions"}, //Source Root'dan alacağız Adresi
        tags = "@temperature"
)
public class TestRunner {

}
