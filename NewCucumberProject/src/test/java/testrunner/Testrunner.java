package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Praveena\\NewCucumber\\NewCucumberProject\\src\\test\\java\\feature\\country.feature", glue = {
		"stepdef" }, plugin = { "pretty", "html:target/html",
				"json:taget/report.json" }, monochrome = true, dryRun = true, strict = true)
public class Testrunner {

}
