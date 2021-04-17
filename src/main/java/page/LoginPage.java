package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
//	WebElement USER_NAME = driver.findElement(By.xpath("//input[@name='email']"));
	
	@FindBy(how = How.XPATH, using = "//input[@type='email']") WebElement EMAIL_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@type='password']") WebElement PASSWORD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']") WebElement LOGIN_BUTTON_LOCATOR;
	
	//Interactive Methods
	public void enterUserName(String userName) {
		EMAIL_LOCATOR.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_LOCATOR.sendKeys(password);
	}
	
	public void clickLoginButton() {
		LOGIN_BUTTON_LOCATOR.click();
	}
	
	/*
	 * public void login(String userName, String password) {
	 * EMAIL_LOCATOR.sendKeys(userName); PASSWORD_LOCATOR.sendKeys(password);
	 * LOGIN_BUTTON_LOCATOR.click(); }
	 */
}
