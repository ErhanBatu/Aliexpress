package com.Aliexpress.pages;

import com.Aliexpress.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@data-role='myaliexpress-link']")
    public WebElement account;

    @FindBy(xpath = "//div[@class=\"poplayer-content\"]//img[2]")
    public WebElement adv;

    @FindBy(className = "join-btn")
    public WebElement join;

    @FindBy(className = "batman-channel-other")
    public WebElement viewMoreOptions;

    @FindBy(xpath = "//p[@data-role='flyout-welcome']//b")
    public WebElement welcomeName;

    public WebElement blockQuoteText(){
        try {
            return Driver.get().findElement(By.className("flyout-welcome-text"));
        }finally {

        }
    }

    @FindBy(id = "search-key")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement SearchSubmit;

    @FindBy(xpath = "//img[@alt='Apple A11 Bionic Original iPhone X 3GB-RAM 64gb GSM/WCDMA/CDMA/CDMA2000 Nfc Quick Charge 2.0']")
    public WebElement item;

    @FindBy(id = "proceed-button")
    public WebElement sendAnyway;










}
