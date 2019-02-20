package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");

		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frameElement);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
	//	action.dragAndDrop(source, target).build().perform();
		
		String colorBeforeDnD = target.getCssValue("color");
		
		action.moveToElement(source).clickAndHold(source).moveToElement(target).release().build().perform();
		
		String colorAfterDnD = target.getCssValue("color");
		
		System.out.println("Before : "+ colorBeforeDnD);
		
		System.out.println("After : "+ colorAfterDnD);
	}

}
