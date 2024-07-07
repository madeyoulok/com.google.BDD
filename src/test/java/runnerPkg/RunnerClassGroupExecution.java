package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	//Defining Cucumber class to run
	@RunWith(Cucumber.class)
	
	// Calling out Cucumber options -> reporting/grouping/multiple feature file execution
	@CucumberOptions(	features = "C:\\Users\\rabin\\eclipse-workspace\\com.google.BDD\\src\\test\\java\\featuePkg",
						glue = "step_definitionsPkg",
						plugin = {	"pretty", 
									"html:target/Reports/HTML_reports/report.html", 
									"json:target/Reports/JSON_reports/jsonReport.json"},
//						tags = "@Smoke" // (single tag)
//						tags = "@Positive and @E2E" // (multiple tags)
//						tags = "@Negative and not @Regression" // (scenario with 1st tag and not having 2nd)
						tags = "@Search or @NewAccount" // (either or)
					)

public class RunnerClassGroupExecution {

}
