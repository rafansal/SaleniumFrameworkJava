package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TutorComLoginPageObject {
	WebDriver driver = null;
	By textBox_username = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
	By textBox_password = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]");
	By button_login= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]");

	public TutorComLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void setTextUserName(String text) {
		driver.findElement(textBox_username).sendKeys(text);
	}
	
	public void setTextPassword(String text) {
		driver.findElement(textBox_password).sendKeys(text);
	}

	public void clickLoginButton() {
		driver.findElement(button_login).click();
	}
}
