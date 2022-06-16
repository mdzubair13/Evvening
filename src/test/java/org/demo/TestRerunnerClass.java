package org.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Rerun\\a.txt",
glue="org.demo",dryRun=false,monochrome=true,snippets=SnippetType.CAMELCASE,

plugin= {
		"rerun:\\src\\test\\resources\\Rerun\\a.txt"})
public class TestRerunnerClass {

	
	
}
