package com.sdet_fast_track.step_definitions;

import com.sdet_fast_track.pages.LoginPage;
import com.sdet_fast_track.utilities.ConfigurationReader;
import com.sdet_fast_track.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class ScenarioOutlineSteps {
LoginPage loginPage =new LoginPage();
    @Given("user is on the login page of the library app")
    public void user_is_on_the_login_page_of_the_library_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryURL"));

    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String email, String password) {
       loginPage.emailInput.sendKeys(email);
       loginPage.passwordInput.sendKeys(password);
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginButton.click();

    }


    @Then("user should see {string}")
    public void user_should_see(String expectedUsername) {

        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.userNameText));
        assertEquals("User name did not match",expectedUsername,loginPage.userNameText.getText());

    }
}
