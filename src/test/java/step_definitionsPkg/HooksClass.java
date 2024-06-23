package step_definitionsPkg;

import com.google.QA.main.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	// Annotations -> @Before: pre-requisite | @After: post-requisite
	
	@Before
	public void openApp() {
		initialization();
	}
	
	@After
	public void clossApp() {
		tearDown();
	}

}
