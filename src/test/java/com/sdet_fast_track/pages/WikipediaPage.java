package com.sdet_fast_track.pages;


import com.sdet_fast_track.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@id='searchButton']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    public WebElement headerText;

    @FindBy(xpath = "//th[@class='infobox-above']/div")
    public WebElement imageText;



    /**
     * TC#25: Wikipedia Search Functionality Title Verification
     * 1. User is on Wikipedia home page
     * 2. User types Steve Jobs in the wiki search box
     * 3. User clicks wiki search button
     * 4. User sees Steve Jobs is in the wiki title
     *
     * Note: Follow POM
     * TC#26: Wikipedia Search Functionality Header Verification
     * 1. User is on Wikipedia home page
     * 2. User types Steve Jobs in the wiki search box
     * 3. User clicks wiki search button
     * 4. User sees Steve Jobs is in the main header
     *
     * Note: Follow POM
     * TC#27: Wikipedia Search Functionality Image Header Verification
     * 1. User is on Wikipedia home page
     * 2. User types Steve Jobs in the wiki search box
     * 3. User clicks wiki search button
     * 4. User sees Steve Jobs is in the image header
     *
     *
     * Note: Use parameterization
     * Scenario: Wikipedia Search header verification
     *     Given user is on the wikipedia main page
     *     When user searches for "Steve Jobs"
     *     And user clicks search button
     *     Then user should see "Steve Jobs" on the main header
     *
     *   Scenario: Wikipedia Search image verification
     *     Given user is on the wikipedia main page
     *     When user searches for "Steve Jobs"
     *     And user clicks search button
     *     Then user should see "Steve Jobs" on the image
     *
     *
     *  Note:Use Scenario Outline
     *   Scenario Outline: Wekipedia Search for the above examples.
     *
     */
}
