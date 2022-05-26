package com.sdet_fast_track.step_definitions;

import com.sdet_fast_track.pages.LoginPage;
import com.sdet_fast_track.utilities.ConfigurationReader;
import com.sdet_fast_track.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDefinitions {
LoginPage loginPage =new LoginPage();

    @Given("user is in the login page of library application")
    public void user_is_in_the_login_page_of_library_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryURL"));
    }

    @When("librarian enters username {string} and password {string}")
    public void librarian_enters_username_and_password(String username, String password) {
       loginPage.emailInput.sendKeys(username);
       loginPage.passwordInput.sendKeys(password);

    }
    @When("librarian clicks login button")
    public void librarian_clicks_login_button() {
       loginPage.loginButton.click();
    }
    @Then("librarian should see his username {string} displayed in the page")
    public void librarian_should_see_his_username_displayed_in_the_page(String expectedUserName) {
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.userNameText));
        String actualUsername=loginPage.userNameText.getText();
        assertEquals("Usernames Did not match",expectedUserName,actualUsername);

    }

    @When("student enters username {string} and password {string}")
    public void student_enters_username_and_password(String username, String password) {
       loginPage.emailInput.sendKeys(username);
       loginPage.passwordInput.sendKeys(password);
    }
    @When("students clicks login button")
    public void students_clicks_login_button() {
        loginPage.loginButton.click();

    }
    @Then("student should see his username {string} displayed in the page")
    public void student_should_see_his_username_displayed_in_the_page(String expectedUserName) {
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.userNameText));
        String actualUsername=loginPage.userNameText.getText();
        assertEquals("Usernames Did not match",expectedUserName,actualUsername);
    }


}
