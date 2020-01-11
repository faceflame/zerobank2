package com.ZeroBank2.step_definitions;

import com.ZeroBank2.utilities.BrowserUtils;
import com.ZeroBank2.utilities.ConfigurationReader;
import com.ZeroBank2.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

public class hooks {

    @Before
    public void setup(){

        String url = ConfigurationReader.get("url");
        Driver.get().manage().window().maximize();
        Driver.get().get(url);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().findElement(By.id("signin_button")).click();


    }

    @After
    public void shut(){
        BrowserUtils.waitFor(2);
        Driver.closeDriver();

    }



}
