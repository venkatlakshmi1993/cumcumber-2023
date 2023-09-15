package org.Baseclass;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGenerate {
	
	    public  static void GenerationJVmREport(String html){


       File file =new File("C:\\Users\\MY\\workspace\\CucumberSampleProject\\target");
	 
       Configuration  Configuration= new   Configuration(file,"02-7");

	  Configuration.addClassifications("platform","win-10");
	
	  Configuration.addClassifications("place","salem"); 
	  Configuration.addClassifications("date","2-9-2023"); 
	  
	  
	  List<String> li=new ArrayList<String>();
	  li.add(html);
	  
	  
	  ReportBuilder bulider =new ReportBuilder(li, Configuration);
	   bulider.generateReports();
	  

}
   
	
	

}
