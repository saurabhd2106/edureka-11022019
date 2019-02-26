package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99Project {

	WebDriver driver;

	@Parameters("browserType")
	@BeforeClass
	public void invokeBrowser(String browserType) {
		
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");

			driver = new ChromeDriver();
		}
		
		else if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();
		}
		
		else if(browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		}
		

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/v4/");
	}

	@Test(priority = 0)
	public void verifyTitleOfThePage() {
		String actualTitle = driver.getTitle();

		String expectedTitle = "Guru99 Bank HomePage";

		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Parameters({"userId","userPass"})
	@Test(enabled = true, priority = 1000)
	public void verifyLoginWithCorrectCredentials(String userId, String userpassword) {
		WebElement userIdbox = driver.findElement(By.name("uid"));

		userIdbox.sendKeys(userId);

		driver.findElement(By.name("password")).sendKeys(userpassword);

		driver.findElement(By.name("btnLogin")).click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
