package com.sdet_fast_track.step_definitions;

import com.sdet_fast_track.pages.DataTableLibrary;
import com.sdet_fast_track.pages.LoginPage;
import com.sdet_fast_track.utilities.ConfigurationReader;
import com.sdet_fast_track.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class DataTableStepDefinitions {
    LoginPage loginPage = new LoginPage();
    DataTableLibrary dataTablePage=new DataTableLibrary();

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

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        Select select=new Select(dataTablePage.monthDropdown);
        List<WebElement> list=select.getOptions();
        List<String> actualMonths=list.stream().map(WebElement::getText).collect(Collectors.toList());
        //for (WebElement each: list) {
         //   actualMonths.add(each.getText());
        //}

        for (int i = 0; i <=expectedMonths.size()-1 ; i++) {
            System.out.println("actualMonths = " + actualMonths.get(i));
            System.out.println("expectedMonths = " + expectedMonths.get(i));
            assertEquals("Month did not match.",expectedMonths.get(i),actualMonths.get(i));
        }

    }

    @Given("librarian is on the login page of the app")
    public void librarian_is_on_the_login_page_of_the_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryURL"));
    }
    @When("librarian enters username and password and clicks login button")
    public void librarian_enters_username_and_password_and_clicks_login_button() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        loginPage.loginButton.click();

    }
    @When("librarian clicks user link")
    public void librarian_clicks_user_link() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.usersLink));
        loginPage.usersLink.click();

    }
    @Then("librarian should see page dropdown numbers")
    public void librarian_should_see_page_dropdown_numbers(List<Integer> numberPerPage) {
        Select select=new Select(loginPage.numbersPerPage);
        List<WebElement>list=select.getOptions();
        List<Integer>actualNumberPerPage=new ArrayList<>();
        for (WebElement each : list) {
            actualNumberPerPage.add(Integer.parseInt(each.getText().trim()));
        }

        assertEquals("Size of the lists did not match. ",numberPerPage.size(),actualNumberPerPage.size());

        for (int i = 0; i <=numberPerPage.size()-1 ; i++) {
            System.out.println("actualNumberPerPage = " + actualNumberPerPage.get(i));
            System.out.println("numberPerPage = " + numberPerPage.get(i));
            assertEquals("Numbers did not match.",numberPerPage.get(i),actualNumberPerPage.get(i));
        }
    }


}
