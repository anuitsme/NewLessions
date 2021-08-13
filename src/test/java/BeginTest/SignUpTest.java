package BeginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignUpPage;
import pages.HomePage;
public class SignUpTest {
	WebDriver driver;
	
	@BeforeTest
	public void openWebPage() {
		driver=BrowserInitiation.createFirefoxDriver();
		driver.get("https://www.phptravels.net");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Assert.assertEquals("PHPTRAVELS - PHPTRAVELS", driver.getTitle());
	}
	
	@Test
	public void SignUp() {
		HomePage.SignUpButton(driver).click();
		Assert.assertEquals("Signup - PHPTRAVELS", driver.getTitle());
		SignUpPage.FirstName(driver).sendKeys("Anurag");
		SignUpPage.Lastame(driver).sendKeys("Yadav");
		SignUpPage.email(driver).sendKeys("anuragyadav05@gmail.com");
		SignUpPage.phone(driver).sendKeys("9125185579");
		SignUpPage.accountType(driver).selectByVisibleText("Customer");
		SignUpPage.password(driver).sendKeys("TestPass");
	}

	
}
