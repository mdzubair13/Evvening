package org.pojo;

import java.nio.file.WatchEvent;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends HelperClass {
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);

			}
	
	
	@FindBy(id="email")
	private WebElement  userloginName;
	
	
	@FindBy(id="pass")
	private WebElement userPassword;
	
	
	
	@FindBy(name="login")
	private WebElement loginButton;
//	
	
	
//	@FindBys({
//		@FindBy(id="email"),
//		@FindBy(xpath="//input[@type='text']"),
//		@FindBy(xpath="//input[@autofocus='1']")
//	})
//	private WebElement txtuser;
//	
//	
//	
//	@FindBys({
//		
//		@FindBy(id="pass"),
//		@FindBy(xpath="//input[@name='pass']")
//		
//		
//	})
//	private WebElement txtpass;
//	
//	
//	@FindAll({
//		
//		@FindBy(name="login"),
//		@FindBy(xpath="//button[@vale='1']")
//		
//	})
//	private WebElement btnClick; 
//	
//	
	
	
	
	
	
	
//	public WebElement getBtnClick() {
//		return btnClick;
//	}
//
//
//
//
//
//
//	public WebElement getTxtuser() {
//		return txtuser;
//	}
//
//
//
//	public WebElement getTxtpass() {
//		return txtpass;
//	}
	


	public WebElement getUserloginName() {
		return userloginName;
	}



	public WebElement getUserPassword() {
		return userPassword;
	}



	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	
	
	
}
