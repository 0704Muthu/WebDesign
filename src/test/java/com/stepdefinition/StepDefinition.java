package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.PageObjectManager;

import com.Base.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("user can enter in the facebook homepage")
	public void user_can_enter_in_the_facebook_homepage() {
		launch_Browser("chrome");
		getUrl("https://www.facebook.com");

	}
	@When("User can enter the valid username and password in given field")
	public void user_can_enter_the_valid_username_and_password_in_given_field() {
		input_Values(pom.getLpo().getUsername(), "khan");
		input_Values(pom.getLpo().getPassword(), "L@13243");
	}

	@When("User can Click the loginbutton")
	public void user_can_click_the_loginbutton() {
		click_Webelement(pom.getLpo().getLoginButton());
	}
	@Then("User can successfully login")
	public void user_can_successfully_login() {
		WebElement element = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String actual = element.getText();
		String expected ="The password that you've entered is incorrect. ";
		Assert.assertEquals(actual, expected);
		driver.quit();
	}
	@When("User can enter the valid {string} and {string} in given field")
	public void user_can_enter_the_valid_and_in_given_field(String username, String password) {
		input_Values(pom.getLpo().getUsername(), username);
		input_Values(pom.getLpo().getPassword(), password);
	}













}
