package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<WebElement> results=driver.findElements(By.xpath("//ul[@id='select2-hotels_city-results']//li"));
			//System.out.println(results.size());
			for(WebElement el: results) {
				//System.out.println(el.getAttribute("innerText"));
				//String attr=el.getAttribute("innerText");
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
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				
			}
		
	}
	
	
}
