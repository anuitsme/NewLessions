package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Profile {

	public static WebElement FirstName(WebDriver driver) {

		return driver.findElement(By.name("firstname"));

	}
	public static WebElement LastName(WebDriver driver) {

		return driver.findElement(By.name("lastname"));

	}
	public static WebElement phone(WebDriver driver) {

		return driver.findElement(By.name("phone"));

	}
	public static WebElement email(WebDriver driver) {

		return driver.findElement(By.name("email"));

	}
	public static Select country(WebDriver driver) {
		Select obj=new Select(driver.findElement(By.id("'from_country")));
		return obj;

	}
	public static WebElement state(WebDriver driver) {

		return driver.findElement(By.name("state"));

	}
	public static WebElement city(WebDriver driver) {

		return driver.findElement(By.name("city"));

	}
	public static WebElement Fax(WebDriver driver) {

		return driver.findElement(By.name("fax"));

	}
	public static WebElement zip(WebDriver driver) {

		return driver.findElement(By.name("zip"));

	}
	public static WebElement address1(WebDriver driver) {

		return driver.findElement(By.name("address1"));

	}
	public static WebElement address2(WebDriver driver) {

		return driver.findElement(By.name("address2"));

	}
	public static WebElement UpdateProfile(WebDriver driver) {

		return driver.findElement(By.xpath("//button[text()='Update Profile']"));

	}


}
