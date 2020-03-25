package TestRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/tato.feature"
 ,glue="stepDefinitions"
 )
public class Runner {

}
