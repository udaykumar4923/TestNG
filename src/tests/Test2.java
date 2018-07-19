package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	
	@Test
	public void secondTest() {
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	}
	
	@Test
	public void Testtwopointtwo(){
		System.out.println("this is the second test of the second file ");
	}
}
