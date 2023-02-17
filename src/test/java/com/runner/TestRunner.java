package com.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utility.Login_PageObject_Model;
import org.utility.PageObjectManager;
import org.utility.SignUp_PageObjectModel;

import com.Base.Base_Class;

public class TestRunner extends Base_Class {

	public static	PageObjectManager pom = new PageObjectManager(driver);

	@Test
	public static void chromeTest() {
		launch_Browser("chrome");
		getUrl("https://www.facebook.com");

		input_Values(pom.getLpo().getUsername(), "muthu");
		input_Values(pom.getLpo().getPassword(), "J@1234");
		click_Webelement(pom.getLpo().getLoginButton());
		driver.quit();
	}

	public static void firefoxTest() {
		launch_Browser("firfox");
		getUrl("https://www.facebook.com");
		input_Values(pom.getLpo().getUsername(), "muthu");
		input_Values(pom.getLpo().getPassword(), "J@1234");
		click_Webelement(pom.getLpo().getLoginButton());
		driver.quit();
	}


	public static void main(String[] args) {
		System.out.println(10+20);
	}


}
