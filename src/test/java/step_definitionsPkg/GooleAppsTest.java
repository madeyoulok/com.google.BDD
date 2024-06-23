package step_definitionsPkg;

import org.testng.Assert;

import com.google.QA.main.BaseClass;
import com.google.QA.pageFactory.GoogleMapsPage;
import com.google.QA.pageFactory.HomePage;
import com.google.QA.pageFactory.YouTubePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooleAppsTest extends BaseClass{
	HomePage hp = new HomePage();
	GoogleMapsPage gmp = new GoogleMapsPage();
	YouTubePage ytp = new YouTubePage();
	
	@When("customer clicks on Google App")
	public void customer_clicks_on_google_app() {
		hp.clickGoogleApps();
	}

	@And("customer clicks on Maps")
	public void customer_clicks_on_maps() {
	    hp.clickGoogleAppsDropDownOptions("Maps");
	}

	@Then("customer should be in Google Maps page")
	public void customer_should_be_in_google_maps_page() {
	    Assert.assertEquals(gmp.returnActualGoogleMapsPageTitle(), prop.getProperty("expectedGoogleMapsPageTitle"));
	    Assert.assertTrue(gmp.returnActualGoogleMapsPageURL().contains(prop.getProperty("expectedGoogleMapsPageUrl")));
	}
	
	@When ("customer clicks on YouTube from Google Apps down drop")
	public void customer_clicks_on_YouTube_from_Google_Apps_down_drop() {
		hp.clickYouTubeFromGooglAppsDropDown();
	}
	
	@Then ("customer should be in YouTube page")
	public void customer_should_be_in_YouTube_page() {
		Assert.assertEquals(ytp.returnActualYouTubePageTitle(), prop.getProperty("expectedYouTubePageTitle"));
	    Assert.assertTrue(ytp.returnActualYouTubePageURL().contains(prop.getProperty("expectedYouTubePageUrl")));
	}

}
