package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemotest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import java.net.*;

public class menuCucumberStepsDef {


    @Given("That a menu exists")
    public void that_a_menu_exists() {
        try {
            URL url = new URL("http://107.22.134.109:8080/CocktailsDB/allCocktails");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            Assertions.assertEquals(HttpURLConnection.HTTP_OK, con.getResponseCode(), "A connection has not been made");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @When("A customer requests to see the menu")
    public void a_customer_requests_to_see_the_menu() {
        try {
            URL url = new URL("http://107.22.134.109:8080/CocktailsDB/allCocktails");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            Assertions.assertEquals(HttpURLConnection.HTTP_OK, con.getResponseCode(), "A connection has not been made");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Then("The list of cocktails is then shown to the customer")
    public void the_list_of_cocktails_is_then_shown_to_the_customer() {
        try {
            URL url = new URL("http://107.22.134.109:8080/CocktailsDB/allCocktails");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}