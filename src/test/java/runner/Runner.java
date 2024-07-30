package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failed_scenarios.txt",

        },
        monochrome = true,
        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        tags = "@ideasoft",
        dryRun = false

)
public class Runner {

}
