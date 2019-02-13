package com.ccw.qa.iOSPoc;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;



public class CCW_iOSPOC {
	IOSDriver<?> driver;
	 

	@SuppressWarnings("rawtypes")
	@BeforeClass
	public void LaunchApp() throws InterruptedException {
		
		
		
		File appDir = new File("/Users/macbookpro/Desktop/AppsToTest"); 
		DesiredCapabilities caps = new DesiredCapabilities();
		File iOSApp = new File (appDir ,"SmartTrack.app");
		caps.setCapability("app", iOSApp.getPath());
		caps.setCapability(CapabilityType.BROWSER_NAME, "");
		caps.setCapability("deviceName", "iPhone 6");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("automationName", "XCUItest");
		caps.setCapability("platformVersion","11.1");
		caps.setCapability("udid", "123920B4-9C20-4EBD-B928-908932807552");
		caps.setCapability("bundleId", "com.launchship.DevSTTest");
        
		//caps.setCapability("noResetValue","false"); 
		//caps.setCapability("autoGrantPermissions", true);
		//caps.setCapability("newCommandTimeout", 20000);
		//caps.setCapability("session-override","true");
        //cap.setCapability("connectHardwareKeyboard", false);

		try {
			driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		}

	}
	

//test commenting the code to launch iOS app.
	
	@Test(priority = 1)
	public void loginWithInValidData() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.EditText[@text='Username']"))
				.sendKeys("hotfix~richard_loecher@hcmondemand.net");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("QA$@123a");
		driver.hideKeyboard();
		WebElement elem = driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']"));
		Assert.assertTrue(elem.isEnabled());
		driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']")).click();
		Thread.sleep(6000);
		if (driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).isDisplayed()) {
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		}
	}
	/*
	@Test(priority = 2)
	public void LoginWithValidData() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("com.dcrworkforce.mobile:id/st_uname_edittext")).click();
		driver.findElement(By.id("com.dcrworkforce.mobile:id/st_uname_edittext")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Username']"))
				.sendKeys("hotfix~richard_loecher@hcmondemand.net");
		driver.findElement(By.id("com.dcrworkforce.mobile:id/st_pwd_editetext")).click();
		driver.findElement(By.id("com.dcrworkforce.mobile:id/st_pwd_editetext")).clear();
		driver.findElement(By.id("com.dcrworkforce.mobile:id/st_pwd_editetext")).sendKeys("QA$@123");
		driver.hideKeyboard();
		WebElement elem = driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']"));
		Assert.assertTrue(elem.isEnabled());
		driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']")).click();
		WebDriverWait driverWait = new WebDriverWait(driver, 10);
		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='GOT IT']")))
				.click();
		driver.findElement(By.xpath("//android.widget.Button[@text='GOT IT']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='GOT IT']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='GOT IT']")).click();
		//System.out.println(driver.getPageSource());

	}

	@Test(priority = 3)
	public void logoutTest() {
		//WebDriverWait driverWait = new WebDriverWait(driver, 100);
		//driverWait.until(ExpectedConditions.elementToBeClickable(
				//By.id("Open navigation drawer")));
		//driver.findElement(By.id("Open navigation drawer")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("com.dcrworkforce.mobile:id/todo_click")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='TimeSheet']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Approvals']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@text='YES']")).click();


		
		/*
		 * dr.findElement(By.id("com.dcrworkforce.mobile:id/floating_ll")).click();
		 * dr.findElement(By.id("com.dcrworkforce.mobile:id/btnAddTask")).click();
		 * dr.findElement(By.id("android:id/text1")).click(); Thread.sleep(2000);
		 * dr.findElement(By.xpath("//android.widget.CheckedTextView[@index=0]")).click(
		 * ); dr.findElement(By.name("Please Select ")).click();
		 * dr.findElement(By.xpath("//android.widget.CheckedTextView[@index=1]")).click(
		 * );
		 * dr.findElement(By.id("com.dcrworkforce.mobile:id/typeahedtxt")).sendKeys("4")
		 * ;
		 * dr.findElement(By.xpath("//android.widget.LinearLayout[@index=0]")).click();
		 * dr.findElement(By.name(" Add Task")).click();
		 */
	//}
}
