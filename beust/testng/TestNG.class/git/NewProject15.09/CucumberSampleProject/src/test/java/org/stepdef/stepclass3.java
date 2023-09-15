package org.stepdef;

import org.Baseclass.BaseClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class stepclass3 extends BaseClass  {
	
	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String string, String string2) {
		

		WebElement u = driver.findElement(By.id("email"));
	    u.sendKeys(string);
		WebElement p = driver.findElement(By.id("pass"));
	    p.sendKeys(string2);
		WebElement l = driver.findElement(By.name("login"));
		clickBtnJs(l);


	   
	}

	



}
