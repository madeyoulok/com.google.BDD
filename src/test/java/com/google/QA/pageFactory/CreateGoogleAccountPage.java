package com.google.QA.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class CreateGoogleAccountPage extends BaseClass{
	
	@FindBy(name="firstName")
	WebElement firstNameTxtField;
	
	@FindBy(name="lastName")
	WebElement lastNameTxtField;
	
	public CreateGoogleAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName(String firstName) {
		firstNameTxtField.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		lastNameTxtField.sendKeys(lastName);
	}

}
