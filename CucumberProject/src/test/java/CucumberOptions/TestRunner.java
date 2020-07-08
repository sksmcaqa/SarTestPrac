package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", strict = true, glue="StepDefination",plugin={"pretty","html:target/cucumber",
		"json:target/cucumber.json","junit:target/cuces.xml"},monochrome=true,tags="(@regressionTest or @webTest or @smokeTest or @mobileTest) and not @mobileTest")
//,dryRun=true,tags="@webTest")
public class TestRunner {

}
