package com.sdet_fast_track.step_definitions;

import com.sdet_fast_track.pages.WikipediaPage;
import com.sdet_fast_track.utilities.ConfigurationReader;
import com.sdet_fast_track.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WikipediaStepDefinitions {

    WikipediaPage wikipediaPage =new WikipediaPage();

    @Given("user is in the wikipedia main page")
    public void user_is_in_the_wikipedia_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikiUrl"));
    }

    @When("user searches for Steve Job")
    public void user_searches_for_steve_job() {

        wikipediaPage.searchInput.sendKeys("Steve Jobs");
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {

        wikipediaPage.searchButton.click();

    }
    @Then("user should see Steve Jobs in title")
    public void user_should_see_steve_jobs_in_title() {

        String expectedTitle="Steve Jobs";
        String actualTitle=Driver.getDriver().getTitle();
        assertTrue("Title did not contain Steve Jobs",actualTitle.contains(expectedTitle));
    }

    @Then("user should see Steve Jobs on the header")
    public void user_should_see_steve_jobs_on_the_header() {
        String expectedHeaderText="Steve Jobs";
        String actualHeaderText=wikipediaPage.headerText.getText();
        assertEquals("Steve Jobs was not displayed in the header text",expectedHeaderText,actualHeaderText);
    }

    @Then("user should see Steve Jobs in Image header text")
    public void user_should_see_steve_jobs_in_image_header_text() {
       String expectedHeaderText="Steve Jobs";
       String actualHeaderText=wikipediaPage.imageText.getText();
       assertEquals("Steve Jobs was not displayed in the image header text",expectedHeaderText,actualHeaderText);
    }
}
