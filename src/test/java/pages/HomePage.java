package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement LoginButton(WebDriver driver) {

		return driver.findElement(By.linkText("Login"));
	}


	public static WebElement SignUpButton(WebDriver driver) {

		return driver.findElement(By.linkText("Signup"));
	}
	
	public static void NavigateToHome(WebDriver driver) {
		driver.findElement(By.linkText("Home")).click();
	}
	
	public static void NavigateToHotels(WebDriver driver) {
		driver.findElement(By.linkText("Hotels")).click();
	}
	public static void NavigateToFlights(WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='flights' and @title='home']")).click();
	}
	public static void NavigateToTours(WebDriver driver) {
		driver.findElement(By.linkText("Tours")).click();
	}
	public static void NavigateToVisa(WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='visa' and @title='home']")).click();
	}
	public static void NavigateToBlog(WebDriver driver) {
		driver.findElement(By.linkText("Blog")).click();
	}
	public static void NavigateToOffers(WebDriver driver) {
		driver.findElement(By.linkText("Offers")).click();
	}
	
	public static void SelectHotelsTab(WebDriver driver) {
		driver.findElement(By.xpath("//button[@id='hotels-tab' and @data-bs-target='#hotels']")).click();
	}
	public static void SelectFlightsTab(WebDriver driver) {
		driver.findElement(By.xpath("//button[@id='hotels-tab' and @data-bs-target='#flights']")).click();
	}
	public static void SelectToursTab(WebDriver driver) {
		driver.findElement(By.id("tours-tab")).click();
	}
	public static void SelectVisaTab(WebDriver driver) {
		driver.findElement(By.id("visa-tab")).click();
	}

}
