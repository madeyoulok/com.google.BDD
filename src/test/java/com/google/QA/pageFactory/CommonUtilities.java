package com.google.QA.pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class CommonUtilities extends BaseClass{
	Actions action;

	public CommonUtilities() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public void hitEnterKey() {
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void triggerContextClick() {
		action.contextClick().build().perform();
	}
	
	public void triggerClick() {
		action.click().build().perform();
	}
	
	
}
