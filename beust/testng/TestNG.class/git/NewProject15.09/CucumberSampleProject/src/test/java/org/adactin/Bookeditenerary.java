package org.adactin ;


import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookeditenerary extends BaseClass {
	public  Bookeditenerary() {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getSearchhotel() {
		return searchhotel;}
		
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCnum() {
		return cnum;
	}
	public WebElement getCtype() {
		return ctype;
	}
	public WebElement getCcmonth() {
		return ccmonth;
	}
	public WebElement getCcyear() {
		return ccyear;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBook() {
		return book;
	}
	@FindBy(id="search_hotel")
	private WebElement searchhotel;
	

        @FindBy(id="order_id_text")
        private WebElement Searchorderid;
	
	public WebElement getSearchorderid() {
			return Searchorderid;
		}
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	

	@FindBy(id="address")
	private WebElement address ;
	
	@FindBy(id="cc_num")
	private WebElement cnum;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccmonth;
	
	@FindBy(id="cc_exp_year")
    private WebElement ccyear;
	
	@FindBy(id="cc_cvv")
   private WebElement ccv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	public void booking(String fstname,String lstnme,String ad,String numb,String type, int month,String year){
			
		Bookeditenerary bi=new Bookeditenerary();
	
		WebElement f = bi.getFirstname();
		passValue(f, fstname);
		WebElement la = bi.getLastname();
		passValue(la,lstnme);
		WebElement addr= bi.getAddress();
	    passValue(addr,ad);
		WebElement cnum = bi.getCnum();
		passValue(cnum,numb);
		WebElement ctype = bi.getCtype();
		passValue(ctype,type);
		WebElement ccmonth = bi.getCcmonth();
		selByIndex(ccmonth,month);
		WebElement ccyear = bi.getCcyear();
		selByVisibleText(ccyear,year);
//	WebElement ccv = bi.getCcv();
	//  passValue(ccv,cv);
	    WebElement book = bi.getBook();
	    submit(book);
		}
	
	
	
	

}
