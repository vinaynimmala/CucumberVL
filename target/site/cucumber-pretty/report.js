$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VerifyLogin.feature");
formatter.feature({
  "line": 2,
  "name": "LGN:Verify user is able to Login with valid credentials",
  "description": "",
  "id": "lgn:verify-user-is-able-to-login-with-valid-credentials",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    },
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.before({
  "duration": 15673958801,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user is able to Login with valid credentials",
  "description": "",
  "id": "lgn:verify-user-is-able-to-login-with-valid-credentials;verify-user-is-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter valid credentials and hit login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify user is logged into the site",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_test.loginpage()"
});
formatter.result({
  "duration": 101027352,
  "status": "passed"
});
formatter.match({
  "location": "Login_test.enter_valid_credentials()"
});
formatter.result({
  "duration": 10413181840,
  "status": "passed"
});
formatter.match({
  "location": "Login_test.verify_user_is_logged_into_the_site()"
});
formatter.result({
  "duration": 77701950,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\texpected [true] but found [false],\n\t\u003cb style\u003d\u0027background-Tomato;\u0027\u003eScenario failed due to the response time is greater than 10secs\u003c/b\u003e\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat com.vl.qa.baseutils.CustomAsserts.softAssert(CustomAsserts.java:18)\r\n\tat com.vl.qa.steps.Login_test.verify_user_is_logged_into_the_site(Login_test.java:43)\r\n\tat ✽.Then verify user is logged into the site(VerifyLogin.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 243149733,
  "status": "passed"
});
});