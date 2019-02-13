package com.ccw.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.ccw.qa.util.TestUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class TestBase {
	public static WebDriver webdriver;
	public static IOSDriver driver;
	//public static Properties prop;

	public TestBase() {

	/*try {
		prop = new Properties();

			FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\vasudha\\Desktop\\EclipseWorkspace\\CCWMobileTest\\src\\main\\java\\com\\ccw\\qa\\config\\config.properties"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}*/
	}
	
	@SuppressWarnings("rawtypes")
	public void installation() throws InterruptedException{
		

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
			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		}

	}
}