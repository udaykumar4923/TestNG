package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	
	@BeforeSuite
	public void firstTest() {
		Reporter.log("starting suite");	
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("running before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("running before class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("running before method");
	}
	
	 @Test
	 public void test() {
		 Reporter.log("hello world");
	  }
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("running after method");
	}
	
	
	@AfterClass
	public void afterClass() {
		Reporter.log("running after class");
	}
	
	
	@AfterTest
	public void afterTest() {
		Reporter.log("running after Test");
	}
	

	@AfterSuite
	public void SecondTestOfFirstPAge() {
		Reporter.log("ending suite");
	}
}
