package org.teststore.run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.teststore.util.ConfigProperties;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        dryRun = false,
        tags = "@test",
        glue = "org.automation.test",
        plugin = {"json:target/cucumber.json", "pretty","html:target/cucumber-reports"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {

    @BeforeClass
    public static void BeforeClass(){
        ConfigProperties.initializePropertyFile();
    }

    @AfterClass
    public static void afterClass(){

    }
}

