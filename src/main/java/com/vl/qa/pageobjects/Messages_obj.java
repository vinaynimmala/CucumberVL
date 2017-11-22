package com.vl.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vl.qa.baseutils.Base;

public class Messages_obj extends Base{

	
	@FindBy(how = How.XPATH, using ="//a[@data-label='NewMessage']")
	private WebElement newMessage;
	
	public Messages_obj()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyMyMessagesTitle()
	{
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement msgTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-label='NewMessage']")));
		msgTitle.isDisplayed();
	}
	
	
}
