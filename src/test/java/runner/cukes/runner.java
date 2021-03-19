package runner.cukes;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/theNameOfProject/US_2_AddButton.feature",
        glue = "steps",
        tags = "@addFeature",
        dryRun = false


)
public class runner {


}
