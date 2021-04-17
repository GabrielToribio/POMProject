package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer extends BasePage{

	WebDriver driver;
	
	public AddCustomer(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div[1]/div/div[1]") WebElement HEADER_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"social-sidebar-menu\"]/li[5]/a") WebElement ACCOUNTS_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ACCOUNTS\"]/li[3]/a") WebElement CUSTOMERS_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@name='fname']") WebElement FIRST_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='lname']") WebElement LAST_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='email']") WebElement EMAIL_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='password']") WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='mobile']") WebElement MOBILE_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='address1']") WebElement ADDRESS1_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='address2']") WebElement ADDRESS2_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='newssub']") WebElement NEWS_SUB_CHECKBOX;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-block btn-lg']") WebElement SUBMIT_BUTTON;
	
	//Interactive Methods
	public void goToAddCustomerPage() {
		waitForElement(driver, 3, ACCOUNTS_BUTTON);
		ACCOUNTS_BUTTON.click();
		CUSTOMERS_BUTTON.click();
	}
	
	public void enterFullName(String firstName, String lastName) {
		FIRST_NAME_FIELD.sendKeys(firstName);
		LAST_NAME_FIELD.sendKeys(lastName);
	}
	
	public void loginInfo(String email, String password) {
		EMAIL_FIELD.sendKeys(email);
		PASSWORD_FIELD.sendKeys(password);
	}
	
	/*
	 * public void enterCountry(String country) { selectDropDown() }
	 * 
	 * public void selectDropDown(WebElement element, String visibleString) { Select
	 * sel = new Select(element); sel.selectByVisibleText(visibleString); }
	 */
	
	public void address(String line1, String line2) {
		ADDRESS1_FIELD.sendKeys(line1);
		ADDRESS1_FIELD.sendKeys(line2);
	}
	
	public void submit() {
		SUBMIT_BUTTON.click();
	}
	
}
