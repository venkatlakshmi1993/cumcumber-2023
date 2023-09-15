package org.adactin;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchHotel extends BaseClass {
	public  SearchHotel()
	{
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//select[@id='location']")
     private WebElement location;
	 
	 @FindBy(xpath="(//select[@class='search_combobox'])[2]")
     private WebElement hotel;
	 
	 @FindBy(xpath="//select[@id='room_type']")
     private WebElement room;
	 
	 @FindBy(xpath="(//select[@class='search_combobox'])[4]" )
     private WebElement number;
	 
	 @FindBy(xpath="(//select[@class='search_combobox'])[6]" )
	 private WebElement child;
	 
	 @FindBy(xpath="(//select[@class='search_combobox'])[5]")
     private WebElement adult;
	 
	 @FindBy(xpath="(//input[@id=\"Submit\"])[1]")
     private WebElement  search;
     
     
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNumber() {
		return number;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getSearch() {
		return search;
	}
	
	public void doSearchHotel(int loc,int ho,int ad, int ch,int num,int ro)
	{
		SearchHotel s=new 	SearchHotel();
	    WebElement location = s.getLocation();
	    selByIndex(location, loc);
		WebElement hotel = s.getHotel();
		selByIndex(hotel, ho);
		WebElement adult = s.getAdult();
		selByIndex(adult, ad);
		WebElement child = s.getChild();
		selByIndex(child, ch);
		WebElement number = s.getNumber();
		selByIndex(number, num);
		WebElement room = s.getRoom();
		selByIndex(room,ro);
		WebElement search = s.getSearch();
		submit(search);
	}	
	}
	
	


