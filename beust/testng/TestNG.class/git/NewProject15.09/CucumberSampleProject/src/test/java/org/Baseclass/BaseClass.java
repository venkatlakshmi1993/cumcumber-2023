package org.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BaseClass {
 public static WebDriver driver;
	
	public void  openDriver(String browser) {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	     }
		else if(browser.equals("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		else if(browser.equals("Egde"))
		{
		WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
		System.out.println("Invalid Browser name");
	}}

	   public void max_Win()
	   {
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   }
		
     public void openUrl(String url) {
		driver.get(url);}
	
	 
	
	  public  static WebElement  locatingElement(String locator,String value){
		if(locator.equals("id")) {
			WebElement element = driver.findElement(By.id(value));
		return element;}
			else if(locator.equals("name"))	{
				WebElement element = driver.findElement(By.name(value));
				return element;}
				else if(locator.equals("classname"))
				{
					WebElement element = driver.findElement(By.className(value));
					return element;}
				else if(locator.equals("tagname"))
				{
					WebElement element = driver.findElement(By.tagName(value));
					return element;}
		
				else if(locator.equals("xpath"))
				{
					WebElement element = driver.findElement(By.xpath(value));
					return element;}
		
			else {
    
				return null;
			}
	}
	  public String passValue(WebElement username, String value) {
			username.sendKeys(value);
			return value;
		
			}
		
	
	   public List<WebElement> findAll (String locator1, String value1)
	   { 
		 
		 if(locator1.equals("classname")) {
			 List<WebElement> list = driver.findElements(By.className(value1));
		     return list;
		 }else if(locator1.equals("tagname")) {
			 List<WebElement> list = driver.findElements(By.tagName(value1));
			
			 return list;
		 }else if(locator1.equals("xpath")) {
			 List<WebElement> list = driver.findElements(By.xpath(value1));
			return list;
			
		 }else if(locator1.equals("text")) {
			 List<WebElement> list = driver.findElements(By.partialLinkText(value1));
			
			 return list;
		 }
          else{
			    return null;
		}
	}
	
	       public  static void takeScreenShot(File file) throws IOException
	       {		
            TakesScreenshot ts=(TakesScreenshot)driver;
		    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshotAs ,file);
	        }
	
        	public WebElement clickButton(WebElement login) 
        	{
            WebElement btn1 = driver.findElement(By.id("login"));
            btn1.click();
			return login;
       }
        	
        	public  static void buttonclk(WebElement ref)
        	{
        		ref.click();
        	}
        	
        public void submit(WebElement window) 
	         {
         	 window.submit();
               }
	
	         public String getAttributeValue(WebElement values)
	          {
		          String attribute = values.getAttribute("data");
		            return attribute;
	           }
	         
	         public String getTextValue(WebElement values)
	         {
	        	 String text = values.getText();
	        	 return text;
	         }
	         
	         public boolean display(WebElement data)
	         {
	          boolean displayed = data.isDisplayed();
	          return displayed;
	         }
	         
	         
	         public boolean enable(WebElement data)
	         {
	        	 boolean enabled = data.isEnabled();
	        	 return   enabled;
	         }
	         
	         public  static boolean Selected(WebElement data)
	         {
	        	boolean selected = data.isSelected(); 
	        	return selected;
	         }
	         
	         public  static void mouseOverAction(WebElement data) {
	        	 Actions action=new Actions(driver);
	        		action.moveToElement(data).perform();
	         }
	         
	         public  static void  rightClick(WebElement data) {
	        	 Actions action = new Actions(driver);
	        	 action.contextClick(data).perform();
	         }
	         
	         public void dragAndDrop(WebElement source,WebElement destination)
	         {
	        	 Actions action=new Actions(driver);
	         action.dragAndDrop(source,destination ).perform();
	         }
	         public void  doubleClick(WebElement data) {
	        	 Actions action =new Actions(driver);
	        	 action.doubleClick(data);
	         }
	         
	         public void  keyDownAc(WebElement data) {
	        	 Actions action =new Actions(driver);
	        	 action.keyDown(Keys.SHIFT).sendKeys(data,"").perform();
	        	 
	          }
	         
	         public void  keyUpAc(WebElement data) {
	        	 Actions action =new Actions(driver);
	        	 action.keyUp(Keys.SHIFT).sendKeys(data,"").perform();
	        	 
	         }
	         
	         public void keyPressDown() throws AWTException
	         {
	        	 Robot rb=new Robot();
	        	 rb.keyPress(KeyEvent.VK_DOWN);
	         }
	         
	         public void keyReleaseDown() throws AWTException
	         {
	        	 Robot rb=new Robot();
	        	 rb.keyRelease(KeyEvent.VK_DOWN);
	         }
	         
	         public void  keyPressControlA() throws AWTException
	         {
	        	 Robot rb=new Robot();
	        	 rb.keyPress(KeyEvent.VK_CONTROL);
	        	 rb.keyPress(KeyEvent.VK_A);
	        }
	         
	         public void  keyReleaseControlA() throws AWTException
	         {
	        	 Robot rb=new Robot();
	        	 rb.keyRelease(KeyEvent.VK_A);
	        	 rb.keyRelease(KeyEvent.VK_CONTROL);
	        }
	         
	         public void navigateopenUrl(String url) {
	     		driver.navigate().to(url);
	     		}
	     	
	         public void navigateForward() {
		     		driver.navigate().forward();
		     		}

	         public void navigateRefresh() {
		     		driver.navigate().refresh();
		     		}
	         public void navigateBackward() {
		     		driver.navigate().back();
		     		}
	         public void handleWindow(String url)
	         {
	        	 driver.switchTo().window(url);
	         }
	         public void handleWindowTitle(String titlename)
	         {
	        	 driver.switchTo().window(titlename);
	         }
	         
	         public void handleWindowid(String id)
	         {
	        	 driver.switchTo().window(id);
	         }
	         
	         public String getParentWindow(WebElement parwindow)
	         {
	        	 String parid = driver.getWindowHandle();
	        	 return parid;
	         }
	         
	         public Set<String> getAllWindow(WebElement allwindow)
	         {
	        	  Set<String> Allwin = driver.getWindowHandles();
	        	  return Allwin;
	         }
	         
	         public void quit()
	         {
	        	driver.quit(); 
	         }
	         
	         public void close()
	         {
	        	driver.close();
	         }
	        
	        
	         public void alert()
	         {
	        	driver.switchTo().alert(); 
	         }
	         
	         public void acceptAlert()
	         {
	        	 Alert alert = driver.switchTo().alert();
	        	 alert.accept();
	         }
	         
	         public void dismissAlert(WebElement ele)
	         {
	        	 WebElement element = driver.findElement(By.xpath("ele"));
	        	 element.click();
	        	 Alert alert = driver.switchTo().alert();
	        	 alert.dismiss();
	         }
	         
	         public void comfirmAlert(WebElement ele)
	         {
	        	 WebElement element = driver.findElement(By.xpath("ele"));
	        	 element.click();
	         }
	         
	         public void promptAlert(WebElement ele,String value)
	         {
	        	 WebElement promptelement1 = driver.findElement(By.xpath("ele"));
	        	 promptelement1.click();
	        	 WebElement promptElement2 = driver.findElement(By.xpath("ele"));
	        	 promptElement2.click();
	        	 Alert alert = driver.switchTo().alert();
	        	 alert.sendKeys(value);
	        	 alert.accept();
	        	 }
	         
	         public void passTextJs(WebElement ref,String data)
	         {
	        	 JavascriptExecutor js=(JavascriptExecutor)driver;
	        	 js.executeScript("arguments[0].setAttribute('value','"+data+"')", ref);
	         }
	         
	         public void clickBtnJs(WebElement re)
	         {
	        	 JavascriptExecutor js= (JavascriptExecutor)driver;
	        	 js.executeScript("arguments[0].click()", re);
	         }
	         public void scrollDownJs(WebElement ref)
	         {
	        	 JavascriptExecutor js= (JavascriptExecutor)driver;
	        	 js.executeScript("arguments[0].ScrollintoView(true))", ref);
	         }
	         
	         public void scrollUpJs(WebElement ref)
	         {
	        	 JavascriptExecutor js= (JavascriptExecutor)driver;
	        	 js.executeScript("arguments[0].ScrollintoView(false))", ref);
	         }
	         
	         public int frameByIndex(int index)
	         {
	        	 driver.switchTo().frame(index);
	        	 return index;
	         }
	         
	         public String frameByString(String id)
	         {
	         driver.switchTo().frame(id);
	         return id;
	         }
	         public void frameByRef(WebElement Refname)
	         {
	        	 driver.switchTo().frame(Refname);
	         }
	         
	         public int selByIndex( WebElement name,int index)
	         {
	        	 Select s=new Select(name);
	        	 s.selectByIndex(index);
	        	 return index;
	         }
	         
	         public String selByValue( WebElement name,String value)
	         {
	        	 Select s=new Select(name);
	        	 s.selectByValue(value);
	        	 return value;
	         }
	         
	         public String selByVisibleText( WebElement name,String text)
	        		 {
                 Select s=new Select(name);
	        	 s.selectByVisibleText(text);
	        	 return text;
	         }
	        	
	         public boolean isMultiSelect(WebElement name)
	         {
	        	 Select s=new Select(name);
	        	 boolean multiple = s.isMultiple();
	        	  return multiple;
	         }

	         public List<WebElement> printAlloptions(WebElement name)
	        	  {
	        	  Select s=new Select(name);
	        	  WebElement findElement = driver.findElement(By.xpath("name"));
	        	  List<WebElement> options = s.getOptions();
	        	  return options ;
	        	  }
	         
	         public void deselectAll(WebElement name)
       	     {
       	    Select s=new Select(name);
              s.deselectAll();
       	     }
	         
	         public WebElement getFstSelect(WebElement name)
	         {
	        	 Select s=new Select(name); 
	        	 WebElement firstSelectedOption = s.getFirstSelectedOption();
	        	 return firstSelectedOption;
	         }
	         public int deselectByindex(WebElement name,int index)
	         {
	        	 Select s=new Select(name);
	        	 s.deselectByIndex(index);
	        	 return index;
	         }
	      public  String getFormateData(int rownum,int colnum) throws IOException
	
          	{
	     	 File file=new File("C:\\Users\\MY\\eclipse-workspace\\second\\src\\test\\resources\\Book1.xlsx");
		     FileInputStream stream =new FileInputStream (file);
    	     Workbook workbook=new XSSFWorkbook(stream);
    	     Sheet sheet = workbook.getSheet("sheet2");
    	     Row row = sheet.getRow(rownum);
    	     Cell cell = row.getCell(colnum);
    	     DataFormatter dataformatter =new DataFormatter();
    	     String username= dataformatter.formatCellValue(cell);
             workbook.close();
    	     return username;
          	}
	
	      
	    	 
         
         
         
          
         
         
         
         
}