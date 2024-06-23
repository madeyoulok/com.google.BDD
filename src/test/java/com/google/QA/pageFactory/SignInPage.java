package com.google.QA.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class SignInPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='Create account']")
	WebElement createAccountLink;
	
	@FindBy(xpath="//span[text()='For my personal use']")
	WebElement forPersonalUseSelection;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateAccountLink() {
		createAccountLink.click();
	}
	
	public void clickForPersonalUseSelection() {
		forPersonalUseSelection.click();
	}
	
	

}
