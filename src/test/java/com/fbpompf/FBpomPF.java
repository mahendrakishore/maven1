package com.fbpompf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class FBpomPF {
	
	WebDriver driver;
	
	@Test
	public void demoAuto() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		LoginPage lp = new LoginPage(driver);
		
		HomePage hp = lp.login("mahenkis2@gmail.com", "face@book1");
		
		//Assert.assertTrue(hp.pname().contains("mahen"));
		System.out.println("POM worked");
		
}
}