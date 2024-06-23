package com.google.QA.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class HomePage extends BaseClass{
	// Page Factory definition:
		// 1. Create WebElement -> @FindBy
		// 2. Initialize webElement in constructor
		// 3. Defining methods to handle element or define actions
	
	Actions action;
	
	@FindBy(id="APjFqb")
	WebElement searchTxtBox;
	
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	@FindBy(xpath="//a[text()='Gmail']")
	WebElement gmailLink;
	
	@FindBy(xpath="//a[text()='Images']")
	WebElement imagesLink;
	
	@FindBy(css="[aria-label='Google apps']")
	WebElement googleApps;
	
	@FindBy(css="[aria-label='Sign in']")
	WebElement signInLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public void enterValueSearchTxtBox(String valueToSearch) {
		searchTxtBox.sendKeys(valueToSearch);
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public void clickGmailLink() {
		gmailLink.click();
	}
	
	public void clickImagesLink() {
		imagesLink.click();
	}
	
	public void clickGoogleApps() {
		action.moveToElement(googleApps).click().build().perform();
	}
	
	public void clickGoogleAppsDropDownOptions(String linkOptions) {
		action.moveToElement(driver.findElement(By.linkText(linkOptions))).click().build().perform();
	}
	
	public void clickYouTubeFromGooglAppsDropDown() {
		action.moveToElement(googleApps).click().build().perform();
		action.moveToElement(driver.findElement(By.linkText("YouTube"))).click().build().perform();
	}
	
	public void clickSignInLink() {
		signInLink.click();
	}
	

}
