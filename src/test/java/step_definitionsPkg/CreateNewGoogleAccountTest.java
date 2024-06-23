package step_definitionsPkg;

import com.google.QA.main.BaseClass;
import com.google.QA.pageFactory.CreateGoogleAccountPage;
import com.google.QA.pageFactory.HomePage;
import com.google.QA.pageFactory.SignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewGoogleAccountTest extends BaseClass{
	HomePage hp = new HomePage();
	SignInPage sip = new SignInPage();
	CreateGoogleAccountPage cgap = new CreateGoogleAccountPage(); 

	@And("customer clicks sign-in link")
	public void customer_clicks_sign_in_link() {
	    hp.clickSignInLink();
	}

	@And("customer clicks create account")
	public void customer_clicks_create_account() {
	    sip.clickCreateAccountLink();
	}

	@And("select for personal use option")
	public void select_for_personal_use_option() {
	    sip.clickForPersonalUseSelection();
	}

	@When("customer enters {string}")
	public void customer_enters(String firstName) {
		cgap.enterFirstName(firstName);
	}

	@And("customer enter {string}")
	public void customer_enter(String lastName) {
		cgap.enterLastName(lastName);   
	}
}
