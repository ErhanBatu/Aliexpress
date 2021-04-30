package com.Aliexpress.step_definitions;

import com.Aliexpress.pages.HomePage;
import com.Aliexpress.pages.SearchPage;
import com.Aliexpress.utilities.BrowserUtils;
import com.Aliexpress.utilities.ConfigurationReader;
import com.Aliexpress.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    String targetTitle = "Apple iPhone 5 Used (90%New) Mobile Phone GSM 3G 16GB 32GB 64GB ROM Wifi 8MP 4.0\" IOS Cellphone Unlocked Original|mobile phone|used mobile phoneapple iphone 5 - AliExpress";

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter {string} in search box")
    public void the_user_enter_in_search_box(String itemName) {

        homePage.searchBox.sendKeys(itemName);
        homePage.searchBox.sendKeys(Keys.ENTER);
        homePage.sendAnyway.click();
    }

    @And("the user selects an item")
    public void theUserSelectsAnItem() {

        BrowserUtils.waitFor(2);
        searchPage.chosenItem.click();


    }

    @When("the user click on Buy Now button")
    public void the_user_click_on_Buy_Now_button() {

        BrowserUtils.waitFor(3);
        searchPage.buyButton.click();
    }

    @When("the user choose {string} {string}")
    public void the_user_choose(String ftr1, String ftr2) {
        BrowserUtils.switchToWindow(targetTitle);
        searchPage.features(ftr1).click();
        searchPage.features(ftr2).click();

    }

    @And("the user clicks on proceed button")
    public void the_user_clicks_on_proceed_button() {

        searchPage.proceedButton.click();
    }

    @Then("the user should be able to see {string} screen")
    public void the_user_should_be_able_to_see_screen(String str) {

        BrowserUtils.waitForVisibility(searchPage.updateAddressBtn,3);
        Assert.assertEquals(searchPage.updateAddressBtn.getText(),str);

    }




}