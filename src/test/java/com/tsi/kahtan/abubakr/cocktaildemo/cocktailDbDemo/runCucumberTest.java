package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
                features = "src/test/resources/Cucumber",
                glue = "src/test/java/com/tsi/kahtan/abubakr/cocktaildemo/cocktailDbDemo/menuCucumberStepsDef.java")
public class runCucumberTest {
}
