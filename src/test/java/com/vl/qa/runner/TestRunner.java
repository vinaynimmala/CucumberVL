package com.vl.qa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"D:\\Automation\\Projects\\Atomic\\Atomic\\src\\test\\java\\LoginFeatures", "D:\\Automation\\Projects\\Atomic\\Atomic\\src\\test\\java\\OrderFeatures", "D:\\Automation\\Projects\\Atomic\\Atomic\\src\\test\\java\\MyAccountsFeatures", "D:\\Automation\\Projects\\Atomic\\Atomic\\src\\test\\java\\MessagesFeatures"}, glue="com.vl.qa.steps", format={"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
tags="@run")
public class TestRunner extends AbstractTestNGCucumberTests{

}
