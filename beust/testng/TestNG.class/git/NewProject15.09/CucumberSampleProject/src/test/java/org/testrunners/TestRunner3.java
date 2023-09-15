package org.testrunners;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//login.feature",glue="org.stepdef",dryRun=false,
plugin={"html:target\\cucumber-html-reports\\sample1.html"})

public class TestRunner3 {
	


}
