package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class GoogleSearchHome { 
	
//	public static WebElement textbox_Search(WebDriver driver) {
//		return  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));		
//	}
//	
//	public static WebElement button_Search(WebDriver driver) {
//		return  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
//	}
	
	WebDriver driver = null;
	By textBox_search = By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
	By button_search = By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]");
	
	private GoogleSearchHome(WebDriver driver) {
		this.driver = driver;
	}

	
}
