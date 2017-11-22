package com.vl.qa.steps;

import com.vl.qa.pageobjects.Homepage_obj;
import com.vl.qa.pageobjects.MyAccounts_obj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MyAccounts_test {

	MyAccounts_obj myAc = new MyAccounts_obj();
	Homepage_obj homepage = new Homepage_obj();

	@And("^Navigate to MyAccounts$")
	public void navigate_to_MyAccounts() throws Throwable {
		homepage.navigateToMyAccounts();
	}

	@Then("^verify user is navigated to  MyAccounts screen$")
	public void verify_user_is_navigated_to_MyAccounts_screen()
			throws Throwable {
		myAc.verifyTitle();
	}

	@And("^click on edit email$")
	public void click_on_edit_email() throws Throwable {
		myAc.editPhoneNumber();
	}

	@And("^Edit the email address$")
	public void edit_the_email_address() throws Throwable {
		myAc.enterEmailAddress();
	}

	@And("^click on save$")
	public void click_on_save() throws Throwable {
		myAc.saveEmail();
	}

	@Then("^verify the edited email is saved$")
	public void verify_the_edited_email_is_saved() throws Throwable {
		myAc.successMessage();
	}
	
	@And("^click on edit phone number button$")
	public void click_on_edit_phone_number_button() throws Throwable {
		myAc.editPhoneNumber();
	}
	
	@And("^Edit the phone number$")
	public void Edit_the_phone_number() throws Throwable {
		myAc.enterPhoneNumber();
	}

	@And("^click on save phone number button$")
	public void click_on_save_phone_number_button() throws Throwable {
		myAc.savePhoneNumber();
	}
	
	@Then("^verify the edited phone number is saved$")
	public void verify_the_edited_phone_number_is_saved() throws Throwable {
		System.out.println("verified");
	}
	
	@And("^click on edit Add new address button$")
	public void click_on_edit_Add_new_address_button() throws Throwable {
		myAc.editNewAddress();
	}
	
	@And("^Enter the mandatory fields$")
	public void Enter_the_mandatory_fields() throws Throwable {
		myAc.enterAddressFields();
	}
	
	@And("^click on save new address$")
	public void click_on_save_new_address() throws Throwable {
		myAc.saveNewAddress();
	}
	
	@Then("^verify new address number is saved$")
	public void verify_new_address_number_is_saved() throws Throwable {
		System.out.println("verified");
	}
}
