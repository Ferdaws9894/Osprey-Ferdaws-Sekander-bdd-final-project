package bdd.finalProject.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "bdd.finalProject.StepDefinitions",
        dryRun = true,
        plugin = {"pretty", "html:target/html_report/index.html", "json:target/jsonReports/report.json"}

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
