package com.ccw.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ccw.qa.base.TestBase;

import io.appium.java_client.ios.IOSDriver;

public class LoginPage extends TestBase{
	//public static WebDriver wddriver;
	public static IOSDriver<?> wddriver;


	public LoginPage() {
		wddriver=driver;
		PageFactory.initElements(wddriver, this);
	
	}
	
	//Page Factory - OR:
	@FindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
	WebElement Username;
	
	@FindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name='LOG IN']")
	WebElement LOGINbtn;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	WebElement Ok;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@value='hotfix~richard_loecher@hcmondemand.net']")
	WebElement Username1;
	
	@FindBy(xpath = "//XCUIElementTypeSecureTextField[@value='••••••••']")
	WebElement Password1;

	
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Got It']")
	WebElement GOTITbtn;
	
	
	//Initializing the Page Objects:
	//public LoginPage() {
		//PageFactory.initElements(driver, this);
	//}
	
	//Actions:
	public void invalidLogin() throws InterruptedException{
		wddriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Username.sendKeys("hotfix~richard_loecher@hcmondemand.net");
		Password.sendKeys("QA$@123a");
		LOGINbtn.click();
		Ok.click();
	}
		
	public void validLogin() throws InterruptedException{
		wddriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Username1.click();
		Username1.clear();
		Username.sendKeys("hotfix~mikeffrye@hcmondemand.net");

		Password1.click();
		Password1.clear();
		Password.sendKeys("QA$@123");
		LOGINbtn.click();
		
		/*WebDriverWait driverWait = new WebDriverWait(driver, 10);
		driverWait.until(ExpectedConditions.elementToBeClickable(GOTITbtn));
		GOTITbtn.click();
		GOTITbtn.click();*/
	}
}