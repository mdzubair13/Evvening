package org.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {

	public static void generateJvmReport(String name) {
		//1
			File f= new File("C:\\Users\\zubee\\ClassWorkSpace\\Cucumber4Pm\\reports\\JVM");
			//2	
			Configuration c =new Configuration(f, "mk");
			c.addClassifications("OS", "Windowa");
			c.addClassifications("Tool", "Eclipse");
			
			//3
			List<String> l = new ArrayList<String>();
			l.add(name);
			//4
			ReportBuilder r= new ReportBuilder(l, c);
			r.generateReports();
			

			}

}
