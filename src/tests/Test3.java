package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	@Test
	public void ThirdTest() {
		driver = new ChromeDriver();
		System.out.println("first test of third page");
	}
}
