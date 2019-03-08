package day19;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadImage {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://images.google.com/");
		
		driver.findElement(By.className("S3Wjs")).click();
		
		driver.findElement(By.linkText("Upload an image")).click();
		
		driver.findElement(By.id("qbfile")).click();

		Runtime.getRuntime().exec("C:/Users/Saurabh Dhingra/git/edureka-11022019/EdurekaProject-11022019/scripts/uploadImage.exe");
	}

}
