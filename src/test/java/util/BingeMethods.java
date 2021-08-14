package util;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;

public class BingeMethods {
	
	public static void Login(WebDriver driver,String username,String password) {
		HomePage.LoginButton(driver).click();
		LoginPage.username(driver).sendKeys(username);
		LoginPage.password(driver).sendKeys(password);
		LoginPage.Login(driver).click();
	}
	

}
