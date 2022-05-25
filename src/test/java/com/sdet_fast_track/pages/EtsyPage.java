package com.sdet_fast_track.pages;

import com.sdet_fast_track.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {

    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")
    public WebElement searchButton;

    /**
     * TC#51: Etsy Title Verification
     * 1. User is on https://www.etsy.com
     * 2. User sees title is as expected.
     * Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
     * everyone
     * Note: Follow POM
     *
     * TC#52: Etsy Search Functionality Title Verification (without parameterization)
     * 1. User is on https://www.etsy.com
     * 2. User types Wooden Spoon in the search box
     * 3. User clicks search button
     * 4. User sees Wooden Spoon is in the title
     * Note: Follow POM
     *
     *
     * TC#53: Etsy Search Functionality Title Verification (with parameterization)
     * 1. User is on https://www.etsy.com
     * 2. User types Wooden Spoon in the search box
     * 3. User clicks search button
     * 4. User sees Wooden Spoon is in the title
     */
}
