package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Login_PageObject_Model extends Base_Class {

	public Login_PageObject_Model(WebDriver lodriver) {
		this.driver=lodriver;
		PageFactory.initElements(lodriver, this);
	}


	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id="pass")
	private WebElement password;

	@FindBy(name="login")
	private WebElement loginButton;


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}

