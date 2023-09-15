package org.adactin;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="(//input[@class='login_input'])[1]")	
	private WebElement username;
	
	
	@FindBy( xpath="(//input[@class='login_input'])[2]")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='login_button']")
	private  WebElement login;
	
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	public void doLogin(String user,String pass)
	{
		LoginPage l= new LoginPage();
		WebElement username2 = l.getUsername();
		l.passValue(username2, user);
		WebElement password2 = l.getPassword();
		l.passValue(password2, pass);
		WebElement login2 = l.getLogin();
		l.clickBtnJs(login2);
		
		
	}
	

}
