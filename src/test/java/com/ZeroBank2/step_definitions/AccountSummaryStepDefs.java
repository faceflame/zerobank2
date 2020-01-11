package com.ZeroBank2.step_definitions;

import com.ZeroBank2.pages.LoginPage;
import io.cucumber.java.en.Given;

public class AccountSummaryStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
    loginPage.Login();


          }


}
