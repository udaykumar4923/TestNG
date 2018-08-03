package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
	WebDriver driver;
	
	@Test
	public void explicitTest() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_name")));
	}
}
