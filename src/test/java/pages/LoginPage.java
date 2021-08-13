package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static WebElement username(WebDriver driver) {

		return driver.findElement(By.name("email"));
	}

	public static WebElement password(WebDriver driver) {

		return driver.findElement(By.name("password"));
	}
	public static WebElement RememeberMe(WebDriver driver) {

		return driver.findElement(By.id("rememberchb"));
	}

	public static WebElement Login(WebDriver driver) {

		return driver.findElement(By.xpath("//span[text()='Login']"));
	}
	public static WebElement SignUp(WebDriver driver) {

		return driver.findElement(By.xpath("//span[text()='Signup']"));
	}
	public static WebElement ResetPassword(WebDriver driver) {

		return driver.findElement(By.xpath("//label[text()='Reset Password']']"));
	}



}
