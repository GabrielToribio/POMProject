package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage extends BasePage{

	WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link go-text-right']") WebElement MY_PROFILE_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@name='state']") WebElement STATE_REGION_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"profilefrm\"]/div/div/div[4]/div[2]/div/div[2]/a") WebElement COUNTRY_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//input[@class='chosen-search-input']") WebElement COUNTRY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-block updateprofile btn-primary']") WebElement SUBMIT_BUTTON_LOCATOR;
	
	public void goToMyProfile() {
		MY_PROFILE_BUTTON.click();
	}
	
	public void enterStateRegion(String location) {
		STATE_REGION_FIELD.sendKeys(location);
	}
	
	public void selectCountry(String country) {
		COUNTRY_DROPDOWN.click();
		COUNTRY_FIELD_LOCATOR.sendKeys("United States");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void submit() {
		SUBMIT_BUTTON_LOCATOR.click();
	}
	/*
	 * public void selectCountry(String country) { selectDropDown(COUNTRY_DROPDOWN,
	 * country); }
	 */
}
