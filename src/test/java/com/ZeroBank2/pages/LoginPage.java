package com.ZeroBank2.pages;

import com.ZeroBank2.utilities.BrowserUtils;
import com.ZeroBank2.utilities.ConfigurationReader;
import com.ZeroBank2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id="user_login")
    public WebElement usernameBox;

    @FindBy(id="user_password")
    public WebElement passwordBox;

    @FindBy(name = "submit")
    public WebElement signinButton;

public void Login (){
    BrowserUtils.waitForClickablility(signinButton, 6);
    usernameBox.sendKeys(ConfigurationReader.get("username"));
    passwordBox.sendKeys(ConfigurationReader.get("password"));
    signinButton.click();

}







    public LoginPage(){

    PageFactory.initElements(Driver.get(), this);
    }
}
