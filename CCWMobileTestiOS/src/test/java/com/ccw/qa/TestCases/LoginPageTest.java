package com.ccw.qa.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ccw.qa.base.TestBase;
import com.ccw.qa.pages.LoginPage;
import com.ccw.qa.pages.LogoutPage;


public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	LogoutPage logoutpage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeClass
	public void LaunchApp() throws InterruptedException{
		installation();
	}
	
	@Test(priority = 1)
	public void LoginTest() throws InterruptedException{
		loginpage=new LoginPage();
		loginpage.invalidLogin();
		loginpage.validLogin();
	}
	
	@Test(priority = 2)
	public void LougoutTest() {
		logoutpage = new LogoutPage();
		logoutpage.logout();
	}
	
	
}