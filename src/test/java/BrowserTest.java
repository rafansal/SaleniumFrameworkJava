import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\Geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromediver\\chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.selenium.dev/");
		
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(ByXPath.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("google");
		System.out.println("Typed in search box");
		driver.findElement(ByXPath.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).click();
		System.out.println("clicked on search botton");
		String string = driver.findElement(ByXPath.xpath("/html[1]/body[1]/div[7]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]")).getText();
		System.out.println(string);
		
//		driver.close();
//		driver.quit();
	}

}
