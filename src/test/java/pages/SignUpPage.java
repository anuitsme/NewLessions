package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

	public static WebElement FirstName(WebDriver driver) {

		return driver.findElement(By.name("first_name"));
	}

	public static WebElement Lastame(WebDriver driver) {

		return driver.findElement(By.name("last_name"));
	}

	public static WebElement phone(WebDriver driver) {

		return driver.findElement(By.name("phone"));
	}
	public static WebElement email(WebDriver driver) {

		return driver.findElement(By.name("email"));
	}
	public static WebElement password(WebDriver driver) {

		return driver.findElement(By.name("password"));
	}
	public static Select accountType(WebDriver driver) {
		Select obj=new Select(driver.findElement(By.id("account_type")));
		return obj;
	}

	public static WebElement SignUpButton(WebDriver driver) {

		return driver.findElement(By.linkText("Signup"));
	}
	public static WebElement LoginButton(WebDriver driver) {

		return driver.findElement(By.linkText("Login"));
	}
}
