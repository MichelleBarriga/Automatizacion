import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinition", "utility"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
)

public class Runner {
}
