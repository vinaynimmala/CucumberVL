package com.vl.qa.steps;


import com.vl.qa.baseutils.Base;
import com.vl.qa.baseutils.CustomAsserts;
import com.vl.qa.baseutils.ReadExcel;
import com.vl.qa.pageobjects.Homepage_obj;
import com.vl.qa.pageobjects.Login_obj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_test extends Base{

	Login_obj login = new Login_obj();
	Homepage_obj homepage = new Homepage_obj();
	Hook hook = new Hook();
	
	long startTime;
	long endTime;
	
	
	@Given("^readdata$")
	public void readdata() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   String data = ReadExcel.getCellData("input.xlsx", "test", "name", 2);
	   System.out.println("INput data: "+ data);
	}
	
	@Given("^Loginpage$")
	public void loginpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("working");
	}
	
	@And("^Enter valid credentials and hit login$")
	public void enter_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		startTime = System.currentTimeMillis();
	    login.login(prop.getProperty("username"), prop.getProperty("password"));
	    System.out.println("Username: "+ prop.getProperty("username")+" Password: "+prop.getProperty("password"));
	}
	
	@Then("^verify user is logged into the site$")
	public void verify_user_is_logged_into_the_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   homepage.verifyTitle();
	   endTime   = System.currentTimeMillis();
	   long totalTime = endTime - startTime;
	   System.out.println("totaltime: "+ totalTime);
	   CustomAsserts.softAssert(totalTime);
	}
		
	
	@And("^Enter In-valid credentials and hit login$")
	public void enter_In_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.login(prop.getProperty("45"), prop.getProperty("password"));
	    
	    System.out.println("Username: 45 Password: "+prop.getProperty("password"));
	}
	
	@Then("^verify an appropriate message is displayed$")
	public void verify_an_appropriate_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.verifyInvalidCredentialsMessage();
	}
	
	@And("^logout from the site$")
	public void logout_from_the_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homepage.logout();
	}
	
	@Then("^verify user is navigated back to login page$")
	public void verify_user_is_navigated_back_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.verifyInvalidCredentialsMessage();

	}
}
