package step_definitionsPkg;

import org.testng.Assert;

import com.google.QA.main.BaseClass;
import com.google.QA.pageFactory.CommonUtilities;
import com.google.QA.pageFactory.HomePage;
import com.google.QA.pageFactory.SearchResultPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFunctionalityFeatureTest extends BaseClass{
	HomePage hp;
	SearchResultPage srp;
	CommonUtilities cu;
	String desiredItem = "apple";
	String invalidDesiredItem = "(&%^$&$&$^&sdkflsdkhfd";
	
	@Given("customer is in homepage")
	public void customer_is_in_homepage() {
		initialization();
		hp = new HomePage();
		srp = new SearchResultPage();
		cu = new CommonUtilities();
	}

	@When("customer enters desired keywords in search textfield")
	public void customer_enters_desired_keywords_in_search_textfield() {
	    hp.enterValueSearchTxtBox(desiredItem);
	}

	@And("clicks Google Search button")
	public void clicks_google_search_button() {
	    hp.clickSearchBtn();
	}

	@Then("customer should land in search result page for desired keyword searched")
	public void customer_should_land_in_search_result_page_for_desired_keyword_searched() {
	    Assert.assertTrue(srp.returnActualSearchResultPageTitle().contains(desiredItem));
	    Assert.assertTrue(srp.returnActualSearchResultPageURL().contains(desiredItem));
	}

	@And("search result page should show results related to desired keyword searched")
	public void search_result_page_should_show_results_related_to_desired_keyword_searched() {
	   Assert.assertEquals(srp.returnSearchResultKeywordForValidation(desiredItem), desiredItem);
	   tearDown();
	}
	
	@When("customer hits enter key")
	public void customer_hits_enter_key() {
	    cu.hitEnterKey();
	}
	
	@When("customer enters desired invalid keywords in search textfield")
	public void customer_enters_desired_invalid_keywords_in_search_textfield() {
		 hp.enterValueSearchTxtBox(invalidDesiredItem);
	}

	@Then("customer should land in search result page for desired invalid keyword searched")
	public void customer_should_land_in_search_result_page_for_desired_invalid_keyword_searched() {
		 Assert.assertTrue(srp.returnActualSearchResultPageTitle().contains(invalidDesiredItem));
	}

	@And("search result page should show error message {string}")
	public void search_result_page_should_show_error_message(String noResultErrorMsg) {
	    Assert.assertEquals(srp.returnNoResultErrorMsg(), prop.getProperty("expectedNoSearchResultErrorMsg"));
	    tearDown();
	}

}
