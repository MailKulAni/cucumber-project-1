package com.ani.login;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		//strict=false,
		monochrome=true,
		features= {"src/test/resources/com/ani/login"},
		//glue = {"src/test/java"},
		plugin = {
				"pretty",
				"html:target/site/html-report.html",
				"json:target/cucumber1.json"
		}
)
public class LoginRunner {
	
}
