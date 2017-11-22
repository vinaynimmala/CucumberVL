package com.vl.qa.baseutils;

import org.testng.asserts.SoftAssert;

import com.vl.qa.steps.Hook;

public class CustomAsserts {

	
	public static void softAssert(long time)
	{
		if (time>5000) {
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(false);
			softAssert.fail("<b style='background-Tomato;'>Scenario failed due to the response time is greater than 10secs</b>");
			System.out.println("Assert failed");
			Hook.scenarioBooleanSetFail = "true";
			softAssert.assertAll();
			
		}
		
	}
	
}
