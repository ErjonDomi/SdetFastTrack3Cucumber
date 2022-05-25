package com.sdet_fast_track.step_definitions;

import com.sdet_fast_track.pages.EtsyPage;
import com.sdet_fast_track.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EtsyStepDefinition {

    EtsyPage etsyPage = new EtsyPage();

    @Given("user is on etsy main page")
    public void user_is_on_etsy_main_page() {
        Driver.getDriver().get("https://www.etsy.com/");
    }


    @Then("user verifies that title is Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_verifies_that_title_is_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("Title did not match", expectedTitle, actualTitle);
    }


    @When("User searches for keyword")
    public void user_searches_for_keyword() {
        String keyword = "Guitar";
        etsyPage.searchBox.sendKeys(keyword);
        etsyPage.searchButton.click();

    }

    @Then("keyword displays in the title")
    public void keyword_displays_in_the_title() {
        String expectedTitle = "Guitar";
        String actualTitle = Driver.getDriver().getTitle();
        assertTrue("Title did not match",actualTitle.contains(expectedTitle));

    }
}
