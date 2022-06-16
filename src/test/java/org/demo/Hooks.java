package org.demo;


import org.baseclass.HelperClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class Hooks extends HelperClass {
	
	@After(order=3)
	public void afts() {
		driver.close();
		
		

	}
	
	
	@After(order=2)
	public void aft(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot t=(TakesScreenshot)driver;
			byte[] b = t.getScreenshotAs(OutputType.BYTES);
			s.embed(b, "image/png");
			
		}
		
		
		
	}
	
	

}
