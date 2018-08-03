package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	
	
	
	@BeforeGroups
	public void beforegroups() {
		
		Reporter.log("this will run before group");
	}
		
	@Test(priority = 0,enabled = true)
	public void secondTest() {
//  	driver = new ChromeDriver();
//		driver.get("https://www.gmail.com");
		Reporter.log("this is the first test of the second file ");
		Assert.assertTrue(true,"passed");
	}
	
	@Test(priority = 1,enabled = true)
	public void Testtwopointtwo(){
		Reporter.log("this is the second test of the second file ");
		Assert.assertFalse(false,"this is a failed test");
	}
	
	@Test(priority = 2,enabled = false)
	public void Testtwopointthree() {
		Reporter.log("this is the third test of the second file");
	}
	
	@Test(priority = 3,enabled = true)
	public void Testtwopointfour() {
		Reporter.log("this is the fourth test of the second file");
	}
	
	@Test(priority = 4,enabled = false)
	public void Testtwopointfive() {
		Reporter.log("this is the fifth test of the second file");
	}
	
	@Test(priority = 5,enabled = false)
	public void Testtwopointsix() {
		Reporter.log("this is the sixth test of the second file");
	}
	
	@AfterGroups
	public void aftergroups() {
		Reporter.log("this will run before group");
	}
	
}
