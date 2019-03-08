package day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("disable-infobars");
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://qatechhub.com");
		
		System.out.println(driver.getTitle());

	}

}
