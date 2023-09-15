package org.stepdef;

import org.Baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	
	@Before
	public void beforeScenario()
	{
		
	openDriver("firefox");
    openUrl("https://www.facebook.com/");
	}
	
	
	@After
	public void afterScenario()
	{
		quit();
	}
	
	

}
