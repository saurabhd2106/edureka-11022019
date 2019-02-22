package day10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkProject {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in");

	}

	public void closeBrowser() {
		driver.quit();
	}

	public int getLinkCount(){
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		return allLinks.size();
		
	}
	
	public void printLinkUrl(){
	WebElement amazonPayLink =	driver.findElement(By.linkText("Amazon Pay"));
	
	String attributeValue = amazonPayLink.getAttribute("href");
	
	System.out.println("URL :: "+ attributeValue);
	}
	
	public void printAllLinks(){
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLinks){
			System.out.println("Link Text :: "+ link.getText() + " URL :: "+link.getAttribute("href"));
		
			System.out.println("-------------------------------------------------------");
		}
	}
}
