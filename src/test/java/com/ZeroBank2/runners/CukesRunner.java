package com.ZeroBank2.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(



        plugin = {"pretty", "html:target/default-cucumber-reports" ,"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/ZeroBank2/step_definitions",
        dryRun = false,
        tags =


        /*



        plugin = {"pretty", "html:target/default-cucumber-reports" ,"json:target/cucumber.json"},
        features = "src/test/resources/features",

        glue = "com/ZeroBank2/step_definitions",



        dryRun = false,
        tags = "@account_types"*/

)

public class CukesRunner {
}
