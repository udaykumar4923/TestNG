package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ImplicitWaitTest {
	WebDriver driver;
	
	@Test
	public void test1() {
		System.out.println("this is implicit wait");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
