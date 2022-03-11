package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.base_class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",monochrome = true,dryRun = false,strict = true,
tags = ("@smokeTest,@sanityTest,@WhiteboxTest,@blackboxTest,@RegressionTest"),plugin= {"html:Report/Cucumber_Report","pretty","json:Reports/Cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"})
public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		String Browser = File_Reader_Manager.getinstance().getinstanceCR().getbrowser();
		driver = Base_Class.getBrowser(Browser);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
