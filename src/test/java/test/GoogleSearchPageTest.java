package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public static void Setup() {
		System.out.println("Test init started ");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromediver\\chromedriver.exe");
		//driver initialized
		driver = new ChromeDriver();
		googleSearchTest();
	}
	@Test
	private static void googleSearchTest() {
		System.out.println("Test 1 Started");
		GoogleSearchPageObject googleSearchPageObject = new GoogleSearchPageObject(driver);
		driver.get("https://www.google.com/");
		googleSearchPageObject.setTextSearchBox("Hello, How are you?");
		googleSearchPageObject.clickSearchButton();
		System.out.println("Test 1 Ended");
	}
	
	@AfterTest
	public static void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test tearDown Complete ");
		}
	
	
}
