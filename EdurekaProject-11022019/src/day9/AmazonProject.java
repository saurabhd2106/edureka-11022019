package day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {

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

	public String searchProduct(String product, String category) {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select selCategory = new Select(dropdown);

		selCategory.selectByVisibleText(category);

		driver.findElement(By.xpath("//input[@value='Go' and @class='nav-input']")).click();

		String result = driver.findElement(By.id("s-result-count")).getText();

		return result;
	}

	public String getNthProduct(int itemNumber) {

		String productXpath = String.format("//div[@id='resultsCol']//ul[@id='s-results-list-atf']/li[%d]",
				(itemNumber));

		return driver.findElement(By.xpath(productXpath)).getText();
	}

	public void printAllProduct() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']/li"));

		System.out.println("---------------------------------------------------------");
		System.out.println(allProducts.get(8).getText());

		System.out.println("Showing result for " + allProducts.size() + "products");
		for (WebElement product : allProducts) {

			System.out.println("---------------------------------------------------------");
			System.out.println(product.getText());

		}
	}

	public void printAllProductViaScrollDown() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']/li"));
		Actions action = new Actions(driver);

		for (WebElement product : allProducts) {
			action.moveToElement(product).build().perform();
			System.out.println("---------------------------------------------------------");
			System.out.println(product.getText());

		}

	}

	public void printAllProductViaJsScrollDown() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']/li"));

		int x, y;
		for (WebElement product : allProducts) {
			x = product.getLocation().x;
			y = product.getLocation().y;
			
			scrollDown(x, y);
			
			System.out.println("---------------------------------------------------------");
			System.out.println(product.getText());

		}
	}

	private void scrollDown(int X, int Y) {
		JavascriptExecutor jsEngine = driver;

		String jsCommand = String.format("window.scrollBy(%d,%d)", X, Y);

		jsEngine.executeScript(jsCommand);
	}

}
