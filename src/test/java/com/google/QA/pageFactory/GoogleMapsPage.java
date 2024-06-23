package com.google.QA.pageFactory;

import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class GoogleMapsPage extends BaseClass{
	
	public GoogleMapsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String returnActualGoogleMapsPageTitle() {
		return driver.getTitle();
	}
	
	public String returnActualGoogleMapsPageURL() {
		return driver.getCurrentUrl();
	}

}
