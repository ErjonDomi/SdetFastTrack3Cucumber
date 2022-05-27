package com.sdet_fast_track.pages;

import com.sdet_fast_track.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataTableLibrary {

    public DataTableLibrary(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "month")
    public WebElement monthDropdown;



    /**
     *https:https://library2.cydeo.com/login.html
     * C#27: Library Login
     * Scenario: User should be able to login with
     * correct credentials
     *  Given User is on the login page of Library App
     *  When User enters below info
     *  |username|student1@library|
     *  |password|d5fv9BtX|
     *  Then User should see dashboard
     */

    /**
     * TC##0020  https://practice.cydeo.com/dropdown
     * Feature: Simple examples of how dataTables work
     *erjon
     *   @dataTable
     *   Scenario: User should be able to see all 12 months in months dropdown
     *     Given User is on the dropdowns page of practice tool
     *     Then User should see below info in month dropdown
     *       | January   |
     *       | February  |
     *       | March     |
     *       | April     |
     *       | May       |
     *       | June      |
     *       | July      |
     *       | August    |
     *       | September |
     *       | October   |
     *       | November  |
     *       | December  |
     */

    /**
     * TC#4: Data tables task
     * Task summary:
     * -> Create a new feature file named ShowRecords.feature
     * -> Create a new scenario.
     * -> Login as a librarian
     * -> Click on Users link
     * -> Show records dropdown value should be 10 by default.
     * -> And show records should have following options: 5, 10, 15, 50, 100, 200, 500
     *
     *
     * TC#5: Data tables task
     * Task summary:
     * -> Create a new feature file named SearchResults.feature
     * -> As a user, I should be able to login as librarian. When I go to Users page, table
     * should have following columns:
     * • Actions
     * • UserID
     * • Full Name
     * • Email
     * • Group
     * • Status
     */
}
