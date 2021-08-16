package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_HotelsTab {
	
	
	public static WebElement CityInput(WebDriver driver) {
		
		
		return driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	}
	
	public static void selectCityFromDropdown(WebDriver driver,String cityName) {
		
			String searchString=cityName.substring(0,3);
			
			CityInput(driver).sendKeys(searchString);
			
			List<WebElement> results=driver.findElements(By.xpath("//ul[@id='select2-hotels_city-results']//li"));
			
			for(WebElement el: results) {
				System.out.println(el.getAttribute("innerText"));
				
			}
		
	}
	
	
}
