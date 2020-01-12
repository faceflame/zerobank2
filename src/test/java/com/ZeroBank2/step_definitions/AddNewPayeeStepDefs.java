package com.ZeroBank2.step_definitions;

import com.ZeroBank2.pages.AddNewPayeePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import java.util.Map;

public class AddNewPayeeStepDefs {
    AddNewPayeePage addNewPayeePage = new AddNewPayeePage();

    @Given("the user is on Add New Payee tab")
    public void the_user_is_on_Add_New_Payee_tab() {
        addNewPayeePage.GoToAddNewPayeeTab();

    }

    @Given("the user creates new payee using following information")
    public void the_user_creates_new_payee_using_following_information(Map<String, String> payeeInfo) {

        addNewPayeePage.CreateNewPayee(payeeInfo.get("Payee Name"), payeeInfo.get("Payee Address"), payeeInfo.get("Account"), payeeInfo.get("Payee details"));


    }

    @Then("the system should display {string} message")
    public void the_system_should_display_message(String expectedMessage) {
        Assert.assertTrue(addNewPayeePage.actualMessage.isDisplayed());
        Assert.assertEquals(expectedMessage, addNewPayeePage.PayeeCrtdMessage());


    }


}
