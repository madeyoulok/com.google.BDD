package com.google.QA.pageFactory;

import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class YouTubePage extends BaseClass{
	
	public YouTubePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String returnActualYouTubePageTitle() {
		return driver.getTitle();
	}
	
	public String returnActualYouTubePageURL() {
		return driver.getCurrentUrl();
	}

}
