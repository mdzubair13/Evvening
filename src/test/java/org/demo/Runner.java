package org.demo;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
glue="org.demo",dryRun=false,monochrome=true,snippets=SnippetType.CAMELCASE,

plugin= {"html:C:\\Users\\zubee\\ClassWorkSpace\\Cucumber4Pm\\reports\\htmlreports",
		"json:C:\\Users\\zubee\\ClassWorkSpace\\Cucumber4Pm\\reports\\json\\facebook.json",
		"junit:C:\\Users\\zubee\\ClassWorkSpace\\Cucumber4Pm\\reports\\junit\\fb.xml",
		"rerun:\\src\\test\\resources\\Rerun\\a.txt"})
	
public class Runner {

	@AfterClass
	public static void report() {
		JVMreport.generateJvmReport("C:\\Users\\zubee\\ClassWorkSpace\\Cucumber4Pm\\"
				+ "reports\\json\\facebook.json");

	}
	
	
}
