package com.ccw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ccw.qa.base.TestBase;

import io.appium.java_client.ios.IOSDriver;

public class LogoutPage extends TestBase {
	public static IOSDriver<?> wddriver;

	
	public LogoutPage() {
		wddriver=driver;
		PageFactory.initElements(wddriver, this);
	
	}
	//XCUIElementTypeButton[@name="Slide Menu"]
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Slide Menu']")
	WebElement Menubtn;
		
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Logout']")
	WebElement Logoutbtn;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name='YES']")
	WebElement Yes;


	public void logout(){
		
		WebDriverWait driverWait = new WebDriverWait(driver, 10);
		driverWait.until(ExpectedConditions.elementToBeClickable(Menubtn));
		Menubtn.click();
		Logoutbtn.click();
		Yes.click();
		
	}
}
