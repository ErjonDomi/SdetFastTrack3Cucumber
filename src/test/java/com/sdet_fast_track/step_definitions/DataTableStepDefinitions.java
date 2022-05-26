package com.sdet_fast_track.step_definitions;

import com.sdet_fast_track.pages.LoginPage;
import com.sdet_fast_track.utilities.ConfigurationReader;
import com.sdet_fast_track.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DataTableStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page of Library App")
    public void user_is_on_the_login_page_of_library_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryURL"));
    }

    @When("user enters username and password and clicks login button")
    public void user_enters_username_and_password_and_clicks_login_button(Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");
        loginPage.emailInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.userNameText));
        String expected = "Test Student 1";
        String actual = loginPage.userNameText.getText();
        assertEquals("Username did not match. ",expected,actual);
    }

}
