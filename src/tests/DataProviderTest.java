package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelUtils;

public class DataProviderTest {
	String path;
	String sheet;
	
	@BeforeTest
	public void givePath() {
		path = "/home/qainfotech/eclipse-workspace/TestNgTest/src/testData/TestData.xlsx";
		sheet = "Sheet1";
	}
    
    @DataProvider 
    public Object[][] Authentication() throws Exception{
         Object[][] testObjArray = ExcelUtils.getTableArray(path,sheet);
         return (testObjArray);
    }
    
	@Test(dataProvider = "Authentication")
	public void test(String sUsername, String sPassword) {
		System.out.println(sUsername +" : " + sPassword);
	}
	
}
