package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;


public class PageObjectManager extends Base_Class{


	public PageObjectManager(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(localDriver, this);
	}

	private Login_PageObject_Model lpo;
	private SignUp_PageObjectModel spo;



	public Login_PageObject_Model getLpo() {
		lpo=new Login_PageObject_Model(driver);
		return lpo;
	}
	public SignUp_PageObjectModel getSpo() {
		spo=new SignUp_PageObjectModel(driver);
		return spo;
	}



}
