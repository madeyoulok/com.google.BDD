package step_definitionsPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	//Defining Cucumber class to run
	@RunWith(Cucumber.class)
	
	// Calling out Cucumber options -> reporting/grouping/multiple feature file execution
	@CucumberOptions(	features = "C:\\Users\\rabin\\eclipse-workspace\\com.google.BDD\\src\\test\\java\\featuePkg",
						glue = "step_definitionsPkg")

public class RunnerClass {

}
