package com.Aliexpress.pages;

import com.Aliexpress.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//div[@data-product-id='32640963677']")
    public WebElement chosenItem;

    @FindBy(xpath = "(//button[text()='Buy Now'])[1]")
    public WebElement buyButton;

    @FindBy(id = "checkout-button")
    public WebElement proceedButton;

    @FindBy(className = "next-dialog-header")
    public WebElement updateAddressBtn;


    public WebElement features(String ftr){
            return Driver.get().findElement(By.xpath("//span[text()='"+ftr+"']"));


    }


}
