package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {

	public static WebElement AuthorLabel(WebDriver driver) {

		return driver.findElement(By.xpath("//h4[@class='author__title']/strong"));
	}

	public static WebElement BookingsLink(WebDriver driver) {


		return driver.findElement(By.linkText(" My Bookings"));
	}

	public static void ClickDashboardLink(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.querySelector('i[class*='la-shopping-cart mr-2']').click()");
		js.executeScript("document.querySelector(\"i[class*='la-shopping-cart mr-2']\").click()");
		//return driver.findElement(By.linkText("  Dashboard"));
	}

	public static void ClickProfileLink(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.querySelector('i[class*='la-user']').click()");
		js.executeScript("document.querySelector(\"i[class*='la-user']\").click()");
		//return driver.findElement(By.linkText(" My Profile"));
	}

	public static void ClickAddFundsLink(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.querySelector('i[class*='la-wallet']').click()");
		js.executeScript("document.querySelector(\"i[class*='la-wallet']\").click()");
		//return driver.findElement(By.linkText(" Add Funds"));
	}
	
	public static void ClickLogoutLink(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.querySelector('i[class*='la-power-off']').click()");
		js.executeScript("document.querySelector(\"i[class*='la-power-off']\").click()");
		//return driver.findElement(By.linkText("//a[text()=' Logout' and @class=' waves-effect']"));
	}
	public static WebElement WalletBalance(WebDriver driver) {


		return driver.findElement(By.xpath("//p[text()='Wallet Balance']//following-sibling::h4"));
	}
	public static WebElement TotalBooking(WebDriver driver) {


		return driver.findElement(By.xpath("//p[text()='Total Bookings']//following-sibling::h4"));
	}
	public static WebElement PendingInvoices(WebDriver driver) {


		return driver.findElement(By.xpath("//p[text()='Pending Invoices']//following-sibling::h4"));
	}
	public static WebElement Reviews(WebDriver driver) {


		return driver.findElement(By.xpath("//p[text()='Reviews']//following-sibling::h4"));
	}
	public static WebElement UserName(WebDriver driver) {


		return driver.findElement(By.xpath("//h2[contains(text(),'Hi')]//span"));
	}
	public static WebElement getTime(WebDriver driver) {


		return driver.findElement(By.xpath("//p[@id='ct']"));
	}
	

	
	


}
