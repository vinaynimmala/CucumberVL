package com.vl.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vl.qa.baseutils.Base;

public class MyAccounts_obj extends Base {

	@FindBy(how = How.XPATH, using = "//div[@id='cardheader']")
	private WebElement myAccountTitle;

	@FindBy(how = How.XPATH, using = "//input[@data-label='EditEmailAddressButton']")
	private WebElement editEmailAddress_btn;
	
	@FindBy(how = How.XPATH, using = "//input[@data-label='EditPhoneNumbersButton']")
	private WebElement editPhoneNumber_btn;

	@FindBy(how = How.XPATH, using = "//input[@data-label='AddAddressButton']")
	private WebElement editNewAddress;
	
	@FindBy(how = How.XPATH, using = "//input[@id='PHN1']")
	private WebElement homePhone;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Email']")
	private WebElement email_txtField;

	@FindBy(how = How.XPATH, using = "//input[@id='Save Email']")
	private WebElement saveEmail_btn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Save Phone Numbers']")
	private WebElement savePhoneumber_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='ui success message']")
	private WebElement successMessage;

	@FindBy(how = How.XPATH, using = "//input[@name='Desc']")
	private WebElement nickname_field;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Phone']")
	private WebElement phone_field;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Name1']")
	private WebElement firstName_field;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Name2']")
	private WebElement lasttName_field;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Address1']")
	private WebElement Address1_field;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Address2']")
	private WebElement Address2_field;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@value, 'Save New Address')]")
	private WebElement saveNewAddress_btn;
	
	
	public MyAccounts_obj() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTitle() {
		myAccountTitle.isDisplayed();

	}

	public void editEmailAddres() {
		editEmailAddress_btn.click();

	}

	public void enterEmailAddress() {
		WebDriverWait wait = new WebDriverWait(driver, 45);
		WebElement eml_Field = wait.until(ExpectedConditions
				.elementToBeClickable(email_txtField));
		eml_Field.clear();
		eml_Field.sendKeys("info@test.com");

	}

	public void saveEmail() {
		saveEmail_btn.click();

	}

	public void successMessage() {
		successMessage.isDisplayed();

	}
	
	public void editPhoneNumber() {
		editPhoneNumber_btn.click();

	}
	
	public void enterPhoneNumber() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement phnNumber = wait.until(ExpectedConditions
				.elementToBeClickable(homePhone));
		phnNumber.clear();
		phnNumber.sendKeys("8745967485");

	}
	
	public void savePhoneNumber() {
		savePhoneumber_btn.click();

	}

	public void editNewAddress() {
		
		editNewAddress.click();
	}

	public void enterAddressFields() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement nicknm_field = wait.until(ExpectedConditions
				.elementToBeClickable(nickname_field));
		nicknm_field.clear();
		nicknm_field.sendKeys("nickel");
		
		phone_field.sendKeys("6214758945");
		
		firstName_field.sendKeys("Joe");
		
		lasttName_field.sendKeys("Hoe");
		
		Address1_field.sendKeys("1875 South Street");
		
		Address2_field.sendKeys("Orem, UT 84097");
		
		
		
	}

	public void saveNewAddress() {
		// TODO Auto-generated method stub
		saveNewAddress_btn.click();
	}

	
}
