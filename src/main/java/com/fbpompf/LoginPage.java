package com.fbpompf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
public 	LoginPage(WebDriver driver){
		this.driver = driver;
	}

@FindBy(how=How.ID,using="email")
private WebElement uname;
 
@FindBy(how=How.ID,using="pass")
private WebElement pass;

@FindBy(how=How.ID,using="u_0_z")
WebElement login;

public void username(String u ){
	uname.sendKeys(u);
}
	
public void password(String p){
	pass.sendKeys(p);
}

public HomePage submit(){
	login.click();
	return new HomePage(driver);
}

public HomePage login(String lu, String lp){
	username(lu);
	password(lp);
	return submit();
}

}
