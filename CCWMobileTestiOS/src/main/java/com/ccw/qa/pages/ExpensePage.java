package com.ccw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccw.qa.base.TestBase;

import io.appium.java_client.ios.IOSDriver;

public class ExpensePage extends TestBase{
	//public static WebDriver wddriver;
	public static IOSDriver<?> wddriver;


	public ExpensePage() {
		wddriver=driver;
		PageFactory.initElements(wddriver, this);
	
	}
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Expense']")
	WebElement Expensebtn;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Create Expense']")
	WebElement CreateExpense;
	
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Search']")
	WebElement Search;
	
}