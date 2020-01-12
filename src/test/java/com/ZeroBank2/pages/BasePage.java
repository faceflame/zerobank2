package com.ZeroBank2.pages;

import com.ZeroBank2.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebDriver driver= new ChromeDriver();


    @FindBy(id = "account_summary_tab")
    public WebElement accountSummaryTab;

    @FindBy(id = "account_activity_tab")
    public WebElement accountActivityTab;

    @FindBy(id = "transfer_funds_tab")
    public WebElement transferFundsTab;

    @FindBy(id="pay_bills_tab")
   public WebElement payBillstab;

    @FindBy(id= "money_map_tab")
    public WebElement moneyMapTab;

    @FindBy(id="online_statements_tab")
    public WebElement onlineStatementsTab;


    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }
}
