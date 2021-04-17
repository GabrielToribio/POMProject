package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AccountPage;
import page.AddCustomer;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	
	@Test
	public void validateAddingCustomer() {

		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName("user@phptravels.com");
		loginpage.enterPassword("demouser");
		loginpage.clickLoginButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage();
		
		AccountPage addcustomer = PageFactory.initElements(driver, AccountPage.class);
		addcustomer.goToMyProfile();
		addcustomer.enterStateRegion("Maine");
		addcustomer.selectCountry("United States");
		addcustomer.submit();
		
//		BrowserFactory.tearDown();
	}
}
