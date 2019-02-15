package day4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver-2.46/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		Dimension dim = new Dimension(512, 1024);
		
		driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://facebook.com");
	}
	
	public void closeBrowser(){
		//Closes current active window
		//driver.close();
		
		//Closes all the opened window
		driver.quit();
	}
	
	public String getTitle(){
		
		return driver.getTitle();
	}
	
	public void navigateCommands(){
		driver.navigate().to("http://qatechhub.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	}

}
