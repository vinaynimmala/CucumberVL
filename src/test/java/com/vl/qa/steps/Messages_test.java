package com.vl.qa.steps;

import org.testng.asserts.SoftAssert;

import com.vl.qa.pageobjects.Homepage_obj;
import com.vl.qa.pageobjects.Messages_obj;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Messages_test {

	Homepage_obj homepage = new Homepage_obj();
	Messages_obj messages = new Messages_obj();
	Hook hook = new Hook();
	Scenario scenario;
	SoftAssert softAssert = new SoftAssert();
	
	@And("^click on My messages$")
	public void click_on_My_messages() throws Throwable {
		homepage.navigateToMyMessages();
		/*softAssert.assertTrue(false);
		softAssert.assertAll();*/
		
		
	}

	@Then("^verify user is navigated to MyMessages$")
	public void verify_user_is_navigated_to_MyMessages() throws Throwable {
		messages.verifyMyMessagesTitle();
		//hook.scenario.write("Test failed due to response time");
	    //scenario.write("Test failed due to response time");
	}
	
}
