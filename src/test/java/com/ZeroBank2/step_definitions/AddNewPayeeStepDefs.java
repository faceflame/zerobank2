package com.ZeroBank2.step_definitions;

import com.ZeroBank2.pages.AddNewPayeePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import java.util.Map;

public class AddNewPayeeStepDefs {

    @Given("the user is on Add New Payee tab")
    public void the_user_is_on_Add_New_Payee_tab() {
        AddNewPayeePage addNewPayeePage = new AddNewPayeePage();
        addNewPayeePage.payBillstab.click();
        addNewPayeePage.AddNewPayee.click();

    }

    @Given("the user creates new payee using following information")
    public void the_user_creates_new_payee_using_following_information(Map<String, String>payeeInfo) {
        AddNewPayeePage addNewPayeePage = new AddNewPayeePage();
        addNewPayeePage.PayeeNameBox.sendKeys(payeeInfo.get("Payee Name"));
        addNewPayeePage.PayeeAddressBox.sendKeys(payeeInfo.get("Payee Address"));
        addNewPayeePage.AccountBox.sendKeys(payeeInfo.get("Account"));
        addNewPayeePage.PayeeDetailsBox.sendKeys(payeeInfo.get("Payee details"));
        addNewPayeePage.AddButton.click();

    }

    @Then("the system should display {string} message")
    public void the_system_should_display_message(String expectedMessage) {

        AddNewPayeePage addNewPayeePage = new AddNewPayeePage();

        String actualMessage = addNewPayeePage.actualMessage.getText();

        Assert.assertEquals(expectedMessage, actualMessage);




    }




}
