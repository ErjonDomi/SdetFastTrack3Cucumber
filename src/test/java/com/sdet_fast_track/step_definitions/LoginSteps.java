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

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        String url = ConfigurationReader.getProperty("libraryURL");
        Driver.getDriver().get(url);

    }


    @When("student enters username")
    public void student_enters_username() {

        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("studentUsername"));
    }

    @When("student enters password")
    public void student_enters_password() {
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("studentPassword"));

    }

    @When("student clicks login button")
    public void student_clicks_login_button() {

        loginPage.loginButton.click();

    }

    @Then("student should see dashboard")
    public void student_should_see_dashboard() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 20);
        webDriverWait.until(ExpectedConditions.titleIs("Library"));
        webDriverWait.until(ExpectedConditions.visibilityOf(loginPage.userNameText));
        String expected = "Test Student 1";
        String actual = loginPage.userNameText.getText();
        assertEquals("Did not see dashboard", expected, actual);


    }

    @When("librarian enters username")
    public void librarian_enters_username() {

        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("librarianUsername"));

    }

    @When("librarian enters password")
    public void librarian_enters_password() {

        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("librarianPassword"));

    }

    @When("librarian click login button")
    public void librarian_click_login_button() {

        loginPage.loginButton.click();

    }

    @Then("librarian should see his username displayed.")
    public void librarian_should_see_his_username_displayed() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 20);
        //webDriverWait.until(ExpectedConditions.titleIs("Library"));
        webDriverWait.until(ExpectedConditions.visibilityOf(loginPage.userNameText));
        String expectedName = "Test Librarian 1";
        String actualName = loginPage.userNameText.getText();
        assertEquals("Librarian names did not match", expectedName, actualName);

    }
}
