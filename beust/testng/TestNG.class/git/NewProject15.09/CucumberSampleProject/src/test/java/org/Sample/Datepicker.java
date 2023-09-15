package org.Sample;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Datepicker {
public static void main(String[] args) throws InterruptedException{
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  WebDriverWait wait=new WebDriverWait(driver, 30);


	  
	
    driver.get("https://dequeuniversity.com/library/aria/date-picker");
    WebElement pickbtn = driver.findElement(By.xpath("//img[@title='Calendar View']"));
     pickbtn.click();


     WebElement btn = driver.findElement(By.id("datepicker"));btn.click();
     
     WebElement monthname = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
	String text = monthname.getText();
	System.out.println(text);


while(!(text.equals("may 2024")))
	{ 

    //	  WebElement nextmonth = driver.findElement(By.xpath("//span[text()='Next Month, October 2023']"));
    	//  nextmonth.click();
    	 
    	  WebElement monthname2= driver.findElement(By.xpath("//a[@title='Next']"));

    	  WebElement monthname1 = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
    	  monthname1. click();



     //WebElement monthname1 = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));


     

    // WebElement monthname2= driver.findElement(By.xpath("//a[@title='Next']"));
     String text3= monthname1.getText();
     System.out.println(text3);
     


	}
      WebElement date = driver.findElement(By.xpath("//a[text()='1']"));
      date.click();
}
}

