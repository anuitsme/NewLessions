package pages;


import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.poi.util.ArrayUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import exceptions.DatePickerException;

public class HomePage_HotelsTab {
	
	
	public static WebElement CityInput(WebDriver driver) {
		
		driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']")).click();
		return driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	}
	
	public static void selectCityFromDropdown(WebDriver driver,String cityName) {
		
			String searchString=cityName.substring(0,3);
			
			CityInput(driver).sendKeys(searchString);
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			List<WebElement> results=driver.findElements(By.xpath("//ul[@id='select2-hotels_city-results']//li"));
			
			for(WebElement el: results) {
				
				try {
					if((el.getAttribute("innerText")).contains(cityName)) {
						try {
							el.click();
						} catch (StaleElementReferenceException e) {
							String xpath="//ul[@id='select2-hotels_city-results']//li[text()='"+el.getAttribute("innerText")+"']";
							System.out.println(xpath);
							driver.findElement(By.xpath(xpath)).click();
							
						}
					}
				} catch (StaleElementReferenceException e) {
					
				}
				
			}
		
	}
  
	
	public static void selectDate(String day/*in 01 02 mode*/  , String Month /*in August September mode*/, int Year /*in YYYY mode mode*/, WebDriver driver) {
		driver.findElement(By.id("checkin")).click();
		
		try {
			
			Thread.currentThread();
			Thread.sleep(3000);
			
		}catch (InterruptedException e) {}
		
		//String monthYear=driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu' and contains(@style,'display: block;')]//div[@class='datepicker-days']//table//thead//tr[1]//th[@class='switch']")).getText();
		// String month=monthYear.split(" ")[0];
		// int year= Integer.parseInt(monthYear.split(" ")[1]);
		 
		adjustYear(driver, Year); 
		try {
		adjustMonth(Month, driver);}
		catch(DatePickerException e) {e.printStackTrace();}
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='datepicker dropdown-menu' and contains(@style,'display: block;')]//div[@class='datepicker-days']//table//tbody//tr//td[@class='day ']"));
		
		for(WebElement el:dates) {
			System.out.println(el.getText());
			if(el.getText().equalsIgnoreCase(day)) {
				el.click();
			}
			
		}
	}
	
	public static  void goBackDate(WebDriver driver) {
		WebElement el=driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu' and contains(@style,'display: block;')]//div[@class='datepicker-days']//table//thead//tr[1]//th[@class='switch']"));
		el.click();
	}
	
	public static void goForwardDate(WebDriver driver) {
		WebElement el=driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu' and contains(@style,'display: block;')]//div[@class='datepicker-days']//table//thead//tr[1]//th[@class='next']"));
		el.click();
	}
	
	public static void adjustYear(WebDriver driver, int year) {
		String xpath="//div[@class='datepicker dropdown-menu' and contains(@style,'display: block;')]//div[@class='datepicker-days']//table//thead//tr[1]//th[@class='switch']";
		String monthYear=driver.findElement(By.xpath(xpath)).getText();	
		 int yearOr= Integer.parseInt(monthYear.split(" ")[1]);
		 
		 while(yearOr!=year) {
			 
			 if(yearOr>year) 
				 goBackDate(driver);
			 if(yearOr<year)
				 goForwardDate(driver);
			 monthYear=driver.findElement(By.xpath(xpath)).getText();
			 yearOr= Integer.parseInt(monthYear.split(" ")[1]);
		 }
		
	}

	public static void adjustMonth(String month,WebDriver driver) throws DatePickerException {
		String s="January;February;March;April;May;June;July;August;September;October;November;December";
		List<String> Months=Arrays.asList(s.split(";"));
		String xpath="//div[@class='datepicker dropdown-menu' and contains(@style,'display: block;')]//div[@class='datepicker-days']//table//thead//tr[1]//th[@class='switch']";
		String monthOr=(driver.findElement(By.xpath(xpath)).getText()).split(" ")[0].trim();
		if(!s.contains(monthOr)) {
			throw new DatePickerException("Month:"+month+" Not found in user inputs");
		}
		while (!(month.equalsIgnoreCase(monthOr))) {
			if (Months.indexOf(monthOr) < Months.indexOf(month))
				goForwardDate(driver);
			if (Months.indexOf(monthOr) > Months.indexOf(month))
				goBackDate(driver);
			monthOr=(driver.findElement(By.xpath(xpath)).getText()).split(" ")[0].trim();
			//System.out.println(month+"=Month Given;;;;;Month Original"+monthOr);
		}
		
		
		
	}
}
