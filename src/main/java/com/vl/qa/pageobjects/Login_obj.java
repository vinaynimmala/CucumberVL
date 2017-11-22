package com.vl.qa.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.vl.qa.baseutils.Base;

public class Login_obj extends Base{



	@FindBy(how  = How.ID, using="Username")
	private WebElement username;
	
	@FindBy(how  = How.ID, using="Password")
	private WebElement password;
	
	@FindBy(how  = How.ID, using="Login")
	private WebElement Submit_btn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ui error message']")
	private WebElement errorMessage;
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='ui error message']")
	private WebElement logoutMessage;
	
	public Login_obj()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname, String pwd)
	{
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		Submit_btn.click();
	
	}
	
	public void verifyInvalidCredentialsMessage()
	{
		errorMessage.isDisplayed();
	}
	
	
	
	
}
