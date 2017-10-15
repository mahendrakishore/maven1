package com.fbpompf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;
	HomePage(WebDriver driver){
		this.driver= driver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[text()='Mahen Kis']")
	WebElement profilename;

public String pname(){
	String pn = profilename.getText() ;
	return  pn;
}


}


