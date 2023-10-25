package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/Feature/TC001_Login.feature",glue = "StepDefinition",publish = true,plugin = { "html:target/cucumber-reports.html","pretty"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
