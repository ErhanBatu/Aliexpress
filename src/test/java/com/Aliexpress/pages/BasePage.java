package com.Aliexpress.pages;


import com.Aliexpress.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {



    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }



}
