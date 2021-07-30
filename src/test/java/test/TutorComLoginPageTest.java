package test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.TutorComLoginPageObject;

public class TutorComLoginPageTest {
	
	static WebDriver driver = null;
	static Wait<WebDriver> wait = null;
	
	@BeforeClass
	public static void Setup() {
		System.out.println("Test init started ");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromediver\\chromedriver.exe");
		//driver initialized
		driver = new ChromeDriver();
		
		//wait initializedc
		wait = new FluentWait<WebDriver>(driver)
		  .withTimeout(5,TimeUnit.SECONDS)
		  .pollingEvery(1,TimeUnit.SECONDS);
	}
	@Test
	private static void adminLoginTest() throws InterruptedException {
		System.out.println("Test 1 Started");
		TutorComLoginPageObject tutorComLoginPageObject = new TutorComLoginPageObject(driver);
		driver.get("http://192.168.88.1:9090/springmvcTutorcomp/login");
		tutorComLoginPageObject.setTextUserName("admin");
		tutorComLoginPageObject.setTextPassword("admin");
		tutorComLoginPageObject.clickLoginButton();
		
		wait.until(new Function<WebDriver, WebElement>() {
			  public WebElement apply(WebDriver driver) {
			    return driver.findElement(By.linkText("Logout"));
			  }
			});
		
		Boolean result= (!driver.findElements(By.linkText("Logout")).isEmpty());
		assertTrue(result);
		System.out.println("Test 1 Ended");
	}
	
	@Test
	private static void nonUserLoginTest() throws InterruptedException {
		System.out.println("Test 2 Started");
		TutorComLoginPageObject tutorComLoginPageObject = new TutorComLoginPageObject(driver);
		driver.get("http://192.168.88.1:9090/springmvcTutorcomp/login");
		tutorComLoginPageObject.setTextUserName("abcd");
		tutorComLoginPageObject.setTextPassword("abcd");
		tutorComLoginPageObject.clickLoginButton();
		
		Thread.sleep(1000);
		
		Boolean result= (driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText().equals("Login Failed Try Again"));
		assertTrue(result);
		System.out.println("Test 2 Ended");
	}
	
	@AfterClass
	public static void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test tearDown Complete ");
		}
	
	
}
