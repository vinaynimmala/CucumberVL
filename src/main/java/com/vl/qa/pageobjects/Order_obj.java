package com.vl.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vl.qa.baseutils.Base;

public class Order_obj extends Base{

	@FindBy(how = How.XPATH, using = "//img[@title='Nutritional']")
	private WebElement categoryOne;
	
	@FindBy(how = How.XPATH, using = "//img[@title='Whey Protein']")
	private WebElement itemOne;
	
	@FindBy(how = How.XPATH, using ="//button[contains(@id, 'AddtoCartBtn')]")
	private WebElement addToCart;
	
	@FindBy(how = How.XPATH, using ="//i[@class='big shop icon shopcarticon']")
	private WebElement cartIcon;
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(), 'PROCEED TO CHECKOUT')]")
	private WebElement proceedToCheckout;
	
	@FindBy(how = How.XPATH, using ="//input[@value='COMPLETE PURCHASE']")
	private WebElement completePurchase;
	
	
	
	public Order_obj()
	{
		PageFactory.initElements(driver, this);
		System.out.println("");
	}
	
	public void selectCategoryOne()
	{
		categoryOne.click();
	}
	
	public void verifyCategoryOne()
	{
		itemOne.isDisplayed();
	}
	
	public void selectItemOne()
	{
		itemOne.click();
	}
	
	public void addToCart()
	{
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement addCart = wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		addCart.click();
	}
	
	public void clickOnCart()
	{
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement cartiCN = wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
		cartiCN.click();
		cartiCN.click();
	}
	
	public void proceedToCheckout()
	{
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout));
		element.click();
	}
	
	public void clickOnCompletePurchase()
	{
		completePurchase.isDisplayed();
	}
}
