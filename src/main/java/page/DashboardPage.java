package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//h3[@class='text-align-left']") WebElement DASHBOARD_ELEMENT_LOCATOR;
	
	//Interactive Methods
	public void validateDashboardPage() {
		Assert.assertEquals(DASHBOARD_ELEMENT_LOCATOR.getText(), "Hi, Demo User", "Wrong Page");
	}
}
