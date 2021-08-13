package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement LoginButton(WebDriver driver) {
		
		return driver.findElement(By.linkText("Login"));
		
		
	}
	
	
	public static WebElement SignUpButton(WebDriver driver) {
		
		return driver.findElement(By.linkText("SignUp"));
	}

}
