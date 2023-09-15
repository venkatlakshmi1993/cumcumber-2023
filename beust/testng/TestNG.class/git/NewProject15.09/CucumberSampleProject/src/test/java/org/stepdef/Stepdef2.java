package org.stepdef;

import java.util.Map;

import org.Baseclass.BaseClass;
import org.adactin.Bookeditenerary;
import org.adactin.LoginPage;
import org.adactin.SearchHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef2 extends BaseClass{
	BaseClass base=new BaseClass();
	@Given("user is in adactin loginpage with firefox browser")
	public void user_is_in_adactin_loginpage_with_firefox_browser() {
		
		base.openDriver("firefox");
		base.openUrl("https://adactinhotelapp.com/");
				}
     
        @When("user enter username as {string} password as {string} and click login")
        public void user_enter_username_as_password_as_and_click_login(String string, String string2) {
        	LoginPage l= new LoginPage();
			l.doLogin(string, string2);
		
        }@When("user go to search hotels")
			public void user_go_to_search_hotels() throws InterruptedException {
				SearchHotel s=new 	SearchHotel();
				Thread.sleep(2000);
			     s.doSearchHotel(3,4,2,1,1,2);
			}
       @When("user select the hotel")
			public void user_select_the_hotel() throws InterruptedException
			
			{
				Thread.sleep(2000);
				WebElement button = driver.findElement(By.id("radiobutton_0"));
				button.click();
				WebElement continoue = driver.findElement(By.name("continue"));
				continoue.click();
			 }
       
    

       @When("Booked hotels as {string},{string},{string},{string},{string},{string},{string}")
       public void booked_hotels_as(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
       
    	   Bookeditenerary book=new Bookeditenerary();
           book.booking(string, string2, string3, string4, string5, 0, string7);

      
       }
         
       @When("again enters ccv data in booked itenary")
       public void again_enters_ccv_data_in_booked_itenary(io.cucumber.datatable.DataTable dataTable) {
    	   Map<String, String> asMap = dataTable.asMap(String.class,String.class);
    	   String string = asMap.get("ccv");
    	   System.out.println(string);
    	   
        
       }
       @Then("user logout")
       public void user_logout() {
         
       }

}

       
       
    
				
			/*	Bookeditenerary book=new Bookeditenerary();
				
				
				Thread.sleep(2000);
				WebElement myitenary = driver.findElement(By.id("my_itinerary"));
				myitenary.click();
				Thread.sleep(2000);
				WebElement orderid = driver.findElement(By.xpath("//input[@id='order_id_902062']"));
				 String attribute = orderid.getAttribute("value");
				System.out.println("orderid is " +attribute);
				
				*/
		
		
       	
	    


