package day19;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExplaination {

	public static void main(String[] args) throws MalformedURLException {

		URL nodeUrl = new URL("http://192.168.1.5:4444/wd/hub");

		WebDriver driver;

		ChromeOptions options = new ChromeOptions();

		options.setCapability("browsername", "chrome");

		driver = new RemoteWebDriver(options);

		/*
		 * DesiredCapabilities cap = DesiredCapabilities.chrome();
		 * 
		 * driver = new RemoteWebDriver(cap);
		 */

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://qatechhub.com");

	}

}
