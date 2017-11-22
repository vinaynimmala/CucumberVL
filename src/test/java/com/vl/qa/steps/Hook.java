package com.vl.qa.steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vl.qa.baseutils.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Base {

	Base base = new Base();
    public Scenario scenario;
    public static String scenarioBooleanSetFail ;
	
	@Before
	public void initialize(Scenario scenario) throws IOException {
		this.scenario = scenario;
		String browserName = prop.getProperty("browser");
		System.out.println("Browser: " + browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Automation\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Automation\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		// driver.manage().window().maximize();

	}

	@After
	public void teardown() {
		
		if (scenarioBooleanSetFail=="true") {
			//scenario.write("Scenario failed due to the response time is more than 10secs");
			
		}
		
		
		if(scenario.isFailed())
		{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "img/png");
			try{
		 
			
			//String filename = scenario.getName();
		/*TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File file = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\Automation\\Projects\\Atomic\\Atomic\\screenshots\\"+filename+".png");
		FileUtils.copyFile(file, destFile);*/
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		driver.close();
        scenarioBooleanSetFail = "fail";
	}

}
