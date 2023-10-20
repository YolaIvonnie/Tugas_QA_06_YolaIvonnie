package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features",
        glue= {"src/test/java/StepDef"},
        plugin ={"html:target/HTML_report.html"}
)
public class TestRunner {
}
