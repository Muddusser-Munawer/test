package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
monochrome = true,

plugin = {"pretty", "html:target/HtmlReports"})
//plugin = { "pretty", "json:target/reports/cucumber.json"},
//plugin = { "pretty",  "junit:target/reports/cucumber.xml"},
//tags="@smoketest"

public class TestRunner {

}