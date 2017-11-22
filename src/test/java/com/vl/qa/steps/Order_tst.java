package com.vl.qa.steps;

import org.testng.asserts.SoftAssert;

import com.vl.qa.baseutils.Base;
import com.vl.qa.pageobjects.Homepage_obj;
import com.vl.qa.pageobjects.Login_obj;
import com.vl.qa.pageobjects.Order_obj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Order_tst extends Base{

	Login_obj login = new Login_obj();
	Homepage_obj homepage = new Homepage_obj();
	Order_obj order = new Order_obj();
	SoftAssert softAssert = new SoftAssert();
	
	@Given("^Homepage$")
	public void homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.verifyTitle();
	}

	@And("^naviagte to order department$")
	public void naviagte_to_order_department() throws Throwable {
	   
	    //homepage.navigateToMyEvo();
	   // homepage.navigateToShop();
		System.out.println("In order dept");
	}

	@And("^select the category$")
	public void select_the_category() throws Throwable {
	   order.selectCategoryOne();
	}

	@Then("^verify the specific category page is displayed$")
	public void verify_the_specific_category_page_is_displayed() throws Throwable {
	   // order.verifyCategoryOne();
		 order.selectItemOne();
	}

	@And("^add an item to the cart$")
	public void add_an_item_to_the_cart() throws Throwable {
	  
	   order.addToCart();
	}

	@And("^navigate to the cart page$")
	public void navigate_to_the_cart_page() throws Throwable {
	    order.clickOnCart();
	}

	@And("^click on process order now$")
	public void click_on_process_order_now() throws Throwable {
	    order.proceedToCheckout();
	}

	@Then("^verify order is created$")
	public void verify_order_is_created() throws Throwable {
	    order.clickOnCompletePurchase();
	}
	
}
