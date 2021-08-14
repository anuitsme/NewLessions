package BeginTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.SignUpPage;
import pages.HomePage;
public class SignUpTest {
	WebDriver driver;
	
	@DataProvider(name="SignUpData")
	public Iterator<Object[]> getSignUpData() {
		
		ArrayList<Object[]> data=util.ExcelProvider.getSignUpData("SignUp");
		
		return data.iterator();
	}
	
	@BeforeMethod
	public void openWebPage() {
		driver=BrowserInitiation.createFirefoxDriver();
		driver.get("https://www.phptravels.net");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		Assert.assertEquals("PHPTRAVELS - PHPTRAVELS", driver.getTitle());
	}
	
	@Test(dataProvider = "SignUpData")
	public void SignUp(String fname,String lname,String phone,String email, String customer, String password) {
		HomePage.SignUpButton(driver).click();
		System.out.println(driver.getTitle());
		Assert.assertEquals( driver.getTitle(),"Signup - PHPTRAVELS");
		
		SignUpPage.FirstName(driver).sendKeys(fname);
		SignUpPage.Lastame(driver).sendKeys(lname);
		SignUpPage.email(driver).sendKeys(email);
		SignUpPage.phone(driver).sendKeys(phone);
		SignUpPage.accountType(driver).selectByVisibleText(customer);
		SignUpPage.password(driver).sendKeys(password);
		SignUpPage.SignUpButton(driver).click();
		Assert.assertEquals( driver.getTitle(),"Login - PHPTRAVELS");
	}

	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
}
