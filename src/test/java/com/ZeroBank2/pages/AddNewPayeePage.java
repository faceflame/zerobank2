package com.ZeroBank2.pages;

import com.ZeroBank2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewPayeePage extends BasePage{

@FindBy(xpath = "//a[@href='#ui-tabs-2']")
    public WebElement AddNewPayee;

@FindBy(id = "np_new_payee_name")
public WebElement PayeeNameBox;

@FindBy (id= "np_new_payee_address")
public WebElement PayeeAddressBox;

@FindBy(id = "np_new_payee_account")
public WebElement AccountBox;

@FindBy(id = "np_new_payee_details")
public WebElement PayeeDetailsBox;

@FindBy(id = "add_new_payee")
public WebElement AddButton;

@FindBy(id = "alert_content")
public WebElement actualMessage;


    public AddNewPayeePage(){
        PageFactory.initElements(Driver.get(), this);
    }
}
