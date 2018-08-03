package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
 
public class Test3 {
 
//	private static WebDriver driver;
	
//  @DataProvider(name = "important")
//  public static Object[][] credentials(){
//	  return new Object[][]{{ "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
//  }
// 
//  @Test 
//  public void test(String sUsername, String sPassword) {
// 
//	  driver = new ChromeDriver();
// 
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// 
//      driver.get("http://www.store.demoqa.com");
// 
//      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
// 
//      driver.findElement(By.id("log")).sendKeys(sUsername);
// 
//      driver.findElement(By.id("pwd")).sendKeys(sPassword);
// 
//      driver.findElement(By.id("login")).click();
// 
//      //driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
// 
//      driver.quit();
 
 // }
	
	@Test
	public void func1() {
		Reporter.log("this is first function of third class");
	}
 
}
