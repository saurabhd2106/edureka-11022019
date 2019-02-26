package day11;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Guru99Project {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/v4/");
	}
	
	@Test(priority=0)
	public void verifyTitleOfThePage(){
		String actualTitle  = driver.getTitle();
		
		String expectedTitle = "Guru99 Bank HomePage";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
@Test(enabled=false, priority=1000)
	public void verifyLoginWithCorrectCredentials(){
		
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}

}
