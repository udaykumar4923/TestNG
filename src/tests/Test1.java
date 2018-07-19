package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
//		driver = new ChromeDriver();
//		driver.get("http://www.bing.com");
	System.out.println("starting suite");	
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("running before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("running before class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("running before method");
	}
	
	@Test
	public void onlyTest() {
		System.out.println("actual test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("running after method");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("running after class");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("running after Test");
	}
	

	@AfterSuite
	public void SecondTestOfFirstPAge() {
		System.out.println("ending suite");
	}
}
