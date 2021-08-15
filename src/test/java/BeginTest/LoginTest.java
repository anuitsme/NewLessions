package BeginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	String url="https://www.phptravels.net/";
	String username="user@phptravels.com";
	String password="demouser";
	
	
	@BeforeTest
	public void openHomePage() {
		
		driver=BrowserInitiation.createChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Assert.assertEquals("PHPTRAVELS - PHPTRAVELS", driver.getTitle());
	}
	@Test
	public void Login() {
		HomePage.LoginButton(driver).click();
		Assert.assertEquals("Login - PHPTRAVELS", driver.getTitle());
		LoginPage.username(driver).sendKeys(username);
		LoginPage.password(driver).sendKeys(password);
		LoginPage.Login(driver).click();
		Assert.assertEquals("Dashboard - PHPTRAVELS", driver.getTitle());
		String authorLabel=Dashboard.AuthorLabel(driver).getText();
		String UserName=Dashboard.UserName(driver).getText();
		Assert.assertEquals(authorLabel, "Lionel");
		Assert.assertEquals(UserName, "Lionel");
	}
	@AfterTest
	public void LogoutAndKill() {
		Dashboard.ClickLogoutLink(driver);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.querySelector(\"i[class='la la-power-off mr-2 text-color-6']\").click()");
		driver.quit();
	}
		
		
		
	
	
}
