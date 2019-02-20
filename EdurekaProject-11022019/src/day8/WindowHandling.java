package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

		String parentWindow = driver.getWindowHandle();

		System.out.println(parentWindow);

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.tagName("button")).click();

		String childWindow = driver.getWindowHandles().toArray()[1].toString();

		driver.switchTo().window(childWindow);

		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindow);

		System.out.println(driver.getTitle());

	}

}
