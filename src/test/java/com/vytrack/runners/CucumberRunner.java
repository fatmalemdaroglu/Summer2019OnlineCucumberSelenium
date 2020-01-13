package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/features",//path to features
        glue= "com/vytrack/step_definitions",//path to step definitions
        dryRun = false,
        tags = "@login_with_role_ddt",
        plugin = {"html:target/default-cucumber-reports",
                  "json:target/cucumber.json",
                  "rerun:target/rerun.txt"}
)
public class CucumberRunner {

}

