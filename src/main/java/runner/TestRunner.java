package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\2023\\selenium\\Sel@5.30PM(EST)\\workspace\\CucumberBDD\\src\\main\\java\\features"
		,glue={"stepDefinitions"}
		
		
		)
public class TestRunner {

}
