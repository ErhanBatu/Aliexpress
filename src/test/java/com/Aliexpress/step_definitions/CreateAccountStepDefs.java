package com.Aliexpress.step_definitions;

import com.Aliexpress.pages.CreateAccountPage;
import com.Aliexpress.pages.HomePage;
import com.Aliexpress.utilities.BrowserUtils;
import com.Aliexpress.utilities.ConfigurationReader;
import com.Aliexpress.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class CreateAccountStepDefs {

    CreateAccountPage createAccountPage = new CreateAccountPage();

    @When("the user clicks on Account button")
    public void the_user_clicks_on_Account_button() {
        HomePage homePage = new HomePage();
        BrowserUtils.waitForClickablility(homePage.adv,3);
        homePage.adv.click();
        BrowserUtils.waitForVisibility(homePage.account,2);
        homePage.account.click();
    }

    @Then("the user clicks on Join button")
    public void the_user_clicks_on_Join_button() {
        HomePage homePage = new HomePage();
        BrowserUtils.waitForVisibility(homePage.join,2);
        homePage.join.click();
    }

    @Then("the user should be able to click on View more sign-in options button")
    public void the_user_should_be_able_to_click_on_View_more_sign_in_options_button() {

        HomePage homePage = new HomePage();
        BrowserUtils.waitForVisibility(homePage.viewMoreOptions,2);
        homePage.viewMoreOptions.click();
    }

    @Then("the user clicks on Register with Email section")
    public void the_user_clicks_on_Register_with_Email_section() {

        CreateAccountPage createAccountPage = new CreateAccountPage();
        BrowserUtils.waitForVisibility(createAccountPage.registerWithEmail,2);
        createAccountPage.registerWithEmail.click();
    }

    @Then("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String email, String password) {

        CreateAccountPage createAccountPage = new CreateAccountPage();
        createAccountPage.getEmail.sendKeys(email);
        createAccountPage.getPassword.sendKeys(password);
    }

    @Then("the user should be able to click on Create Account button")
    public void the_user_should_be_able_to_click_on_Create_Account_button() {

        CreateAccountPage createAccountPage = new CreateAccountPage();
        createAccountPage.submit.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user should be able to see {string} address under Account button")
    public void the_user_should_be_able_to_see_address_under_Account_button(String email) {

        HomePage homePage = new HomePage();
        BrowserUtils.waitFor(5);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(homePage.account).perform();
        BrowserUtils.waitFor(2);
        System.out.println(homePage.welcomeName.getText());
        Assert.assertTrue(email.contains(homePage.welcomeName.getText()));
    }

    @Then("Error message {string} is displayed")
    public void error_message_is_displayed(String message) {

        CreateAccountPage createAccountPage = new CreateAccountPage();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(createAccountPage.getError.getText().contains(message));
    }

    @Then("the user clicks on Sigin button")
    public void the_user_clicks_on_Sigin_button() {
        createAccountPage.siginButton.click();
    }

    @Then("the user logs in {string} and {string}")
    public void the_user_logs_in_and(String email, String password) {
        BrowserUtils.waitFor(2);
        createAccountPage.signinEmail.sendKeys(email);
        createAccountPage.signinPassword.sendKeys(password);
    }

}
