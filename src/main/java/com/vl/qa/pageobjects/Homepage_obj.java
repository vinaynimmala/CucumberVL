package com.vl.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.vl.qa.baseutils.Base;

public class Homepage_obj extends Base {

	@FindBy(how = How.XPATH, using = "//a[@data-label='MyEvo']")
	private WebElement Title;

	@FindBy(how = How.XPATH, using = "//a[@data-label='ShoppingCart']")
	private WebElement shop;
	
	@FindBy(how = How.XPATH,using = "//a[@data-label='MyEvo']")
	private WebElement MyEVO;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Not you?')]")
	private WebElement logout;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Welcome')]")
	private WebElement welcomeUsername;
	
	@FindBy(how = How.XPATH, using = "//div[text()='My Account']")
	private WebElement myAccounts;
	
	
	@FindBy(how = How.XPATH, using = "//a[@data-label='MyMessages']")
	private WebElement myMessages;
	
	public Homepage_obj() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTitle() {
		Title.isDisplayed();

	}

	public void navigateToShop()
	{
		shop.click();
	}
	
	public void navigateToMyEvo()
	{
		MyEVO.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
	public void navigateToMyAccounts()
	{
		welcomeUsername.click();
		myAccounts.click();
	}
	
	public void navigateToMyMessages()
	{
		myMessages.click();
	}
	
	int trCtch()
	{

		try{
			return 0;
		}catch(Exception e)
		{
			return 0;
		}			//return 0;
	}
	
}
