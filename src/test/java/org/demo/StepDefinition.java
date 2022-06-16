package org.demo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.baseclass.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends HelperClass{

	
	@Given("to check the login function though chrome browser")
	public void to_check_the_login_function_though_chrome_browser() {
			launchChromeBrowser();
	}


	@Then("error occuried")
	public void error_occuried() {
	  System.out.println("dasfadsf");
	}

@When("to validate valid email and invalid  password")
public void toValidateValidEmailAndInvalidPassword(io.cucumber.datatable.DataTable d) {
	getUrl("https://www.facebook.com/");
	//2D-Map
	List<Map<String, String>> alldata = d.asMaps(String.class, String.class);	
	
		String user = alldata.get(2).get("phoneno");
				String pass = alldata.get(0).get("username");
	
	
	
	LoginPojo l= new LoginPojo();
	  
    fillText(l.getUserloginName(),user);
	fillText(l.getUserPassword(), pass);
}
@Given("open facebook url")
public void openFacebookUrl() {
	launchChromeBrowser();
	getUrl("https://www.facebook.com/");
}

@When("fill the all Details")
public void fillTheAllDetails() throws InterruptedException {
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sfdsffg");
   
}


@Then("Click new create  account  button")
public void clickNewCreateAccountButton() {
	driver.findElement(By.xpath("(//button[@type='submit'])[]")).click();
	}









	
	
	
	
}


