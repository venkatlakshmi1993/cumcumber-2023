package org.adactin;

import java.util.concurrent.TimeUnit;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelectHotel extends BaseClass {
	public SelectHotel(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getContinue() {
		return Continue;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}


	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(name="continue")
	private WebElement Continue;
	
	@FindBy(name="cancel")
	private WebElement cancel;
	
	
	

		
	
}

