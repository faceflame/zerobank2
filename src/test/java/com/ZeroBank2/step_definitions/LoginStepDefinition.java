package com.ZeroBank2.step_definitions;

import com.ZeroBank2.pages.LoginPage;
import com.ZeroBank2.utilities.BrowserUtils;
import com.ZeroBank2.utilities.ConfigurationReader;
import com.ZeroBank2.utilities.Driver;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String expectedTitle = "Zero - Log in";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("the user enters valid credentials and clicks on signin button")
    public void the_user_enters_valid_credentials_and_clicks_on_signin_button() {
        loginPage.Login();

    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(string, Driver.get().getTitle());

    }
}
