package com.ZeroBank2.step_definitions;

import com.ZeroBank2.pages.AccountSummaryPage;
import com.ZeroBank2.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryStepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        loginPage.Login();
    }


    @Then("the user should see the following account types")
    public void the_user_should_see_the_following_account_types(List<String>expectedAccountTypes) {

        Assert.assertEquals(expectedAccountTypes, accountSummaryPage.getAccountText());


    }
}
