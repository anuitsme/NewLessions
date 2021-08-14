package BeginTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.Profile;
import util.BingeMethods;

public class VerifyProfileData {
	WebDriver driver;
	@DataProvider(name="SignUpData")
	public Iterator<Object[]> getSignUpData() {
		
		ArrayList<Object[]> data=util.ExcelProvider.getSignUpData("SignUp");
		
		return data.iterator();
	}
	
	@BeforeMethod
	public void Setup() {
		driver=BrowserInitiation.createFirefoxDriver();
		driver.get("https://www.phptravels.net");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		Assert.assertEquals("PHPTRAVELS - PHPTRAVELS", driver.getTitle());
	}

	
	@Test(dataProvider = "SignUpData")
	public void verifyUserData(String fname,String lname,String phone,String email, String customer, String password) {
		
		BingeMethods.Login(driver, email, password);
		Assert.assertEquals("Dashboard - PHPTRAVELS", driver.getTitle());
		String authorLabel=Dashboard.AuthorLabel(driver).getText();
		String UserName=Dashboard.UserName(driver).getText();
		Assert.assertEquals(authorLabel, fname);
		Assert.assertEquals(UserName, fname);
		Dashboard.ClickProfileLink(driver);
		Assert.assertEquals(Profile.FirstName(driver).getAttribute("value"), fname);
		Assert.assertEquals(Profile.LastName(driver).getAttribute("value"), lname);
		Assert.assertEquals(Profile.phone(driver).getAttribute("value"), phone);
		
		}
	
	
	
	@AfterMethod
	public void TearDwown() {
		Dashboard.ClickLogoutLink(driver);
		driver.quit();
	}
}
