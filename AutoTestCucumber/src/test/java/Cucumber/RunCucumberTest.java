package Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports.html"},
        glue = "StepDefinitionEuroland",
        features = "src\\test\\resources\\Cucumber\\login.feature",
        monochrome = true

)

public class RunCucumberTest {

}
