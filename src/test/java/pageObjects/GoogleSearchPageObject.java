package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject { 

	WebDriver driver = null;
	By textBox_search = By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
	By button_search = By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void setTextSearchBox(String text) {
		driver.findElement(textBox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).click();
	}
}
