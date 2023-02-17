package com.Base;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;
	static Logger logger = Logger.getLogger(Base_Class.class);


	public static void launch_Browser(String value) {

		if (value.equalsIgnoreCase("chrome")) {
			ChromeOptions chrome = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			DOMConfigurator.configure("log4j.xml");
			driver = new ChromeDriver(chrome);
			driver.manage().window().maximize();

		}else if (value.equalsIgnoreCase("firefox")) {
			FirefoxOptions firefox = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(firefox);
			driver.manage().window().maximize();
		}


	}

	public static void getUrl(String url) {
		driver.get(url);
	}


	public static void input_Values(WebElement element,String value) {
		element.sendKeys(value);
	}


	public static void quit() {
		driver.quit();
	}

	//	public static void screenshot(String name) throws IOException {
	//		TakesScreenshot ts =(TakesScreenshot) driver;
	//		File source = ts.getScreenshotAs(OutputType.FILE);
	//		File destination = new File("E:\\Project\\TestNgJan3PM\\Screenshot\\"+name+".png");
	//		FileUtils.copyFile(source, destination);
	//
	//	}

	public static void dropDown(WebElement element,String value,String input) {
		Select select = new Select(element);
		if (value.equalsIgnoreCase("text")) {
			select.selectByVisibleText(input);
		}else if (value.equalsIgnoreCase("value")) {
			select.selectByValue(input);
		}else if (value.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(input);
			select.selectByIndex(parseInt);
		}



	}

	public static void click_Webelement(WebElement element) {
		element.click();
	}



	public static Set<String> getWindowhandle() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

}
