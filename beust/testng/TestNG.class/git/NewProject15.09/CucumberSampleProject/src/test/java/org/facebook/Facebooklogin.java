package org.facebook;

import org.Baseclass.BaseClass;
import org.adactin.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin extends BaseClass{
	
	public Facebooklogin()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


	@FindBy(id="email")	
	private WebElement username;
	
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private  WebElement login;
	
	
	public void loginFacebook(String user,String pass)
	{
		Facebooklogin fl=new Facebooklogin();
		WebElement username2 = fl.getUsername();
		fl.passValue(username2, user);
		WebElement password2 = fl.getPassword();
		fl.passValue(password2, pass);
		WebElement login2 = fl.getLogin();
		fl.clickBtnJs(login2);
	}
		
	
	
	

}
