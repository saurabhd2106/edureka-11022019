package day7;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartAssignment {
	
ChromeDriver driver;
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
	}
	
	public void mouseHover(){
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(electronicsLink).build().perform();
		
		waitTillElementVisible(By.xpath("(//a[text()='Samsung'])[1]"), 10);
		
		WebElement samsungLink= driver.findElement(By.xpath("(//a[text()='Samsung'])[1]"));
		
		action.moveToElement(samsungLink).click().build().perform();
	}
	
	public void closeBrowser(){
		driver.close();
	}

	private void waitTillElementVisible(By by, int timeOutInSeconds){
	
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	
	private void waitTillElementVisibleUsingFluentWait(By by, int timeOutInSeconds, int pollingtime){
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOutInSeconds))
					.pollingEvery(Duration.ofSeconds(pollingtime))
					.ignoring(NoSuchElementException.class);
					
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
}
