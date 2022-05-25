package com.sdet_fast_track.pages;


import com.sdet_fast_track.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement userNameText;

    /**
     * TC#1:
     * Task summary:
     * -> Create a new feature file named Login.feature
     * -> Create 2 scenarios for different user logins for: librarian, student.
     * -> Create new step definition named Login_StepDefinitions class and implement these
     * 2 scenarios.
     */

    /**
     * TC#2:
     * Task summary:
     * -> Create new feature file named LoginWithParameters.feature
     * -> Create 2 scenarios for different user logins for: librarian, student, with
     * parameterization.
     * -> Create new snippets and implement them in Login_StepDefinitions class and
     * implement these 2 scenarios
     */

    /**
     * TC#6: Scenario Outlines/Scenario Templates
     * Task summary: Data driven testing with different user accounts
     * -> Create a new feature file named LoginWithDifferentUsers.feature
     * -> As a user, I should be able to login with different users using their correct emails and
     * passwords. When I login, I should be able to see username in the account username
     * section.
     */

}
