package com.ani.login;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		//strict=false,
    monochrome=true,
		features= {"src/test/resources/com/ani/login"}
)
public class LoginRunner {
	
}
