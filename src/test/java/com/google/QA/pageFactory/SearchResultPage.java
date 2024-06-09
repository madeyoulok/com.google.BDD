package com.google.QA.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.google.QA.main.BaseClass;

public class SearchResultPage extends BaseClass{
	
	@FindBy(xpath="//*[text()='No results containing all your search terms were found.']")
	WebElement noResultErrorMsg;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String returnActualSearchResultPageTitle() {
		return driver.getTitle();
	}
	
	public String returnActualSearchResultPageURL() {
		return driver.getCurrentUrl();
	}
	
	public String returnSearchResultKeywordForValidation(String desiredItem) {
		return driver.findElement(By.xpath("//input[@value='"+desiredItem+"']")).getAttribute("value");
	}
	
	public String returnNoResultErrorMsg() {
		return noResultErrorMsg.getText();
	}

}
