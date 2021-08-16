package DumpData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.HomePage_HotelsTab;

public class TestBrowser {
	@Test
	public void BrowserTest() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		HomePage_HotelsTab.selectCityFromDropdown(driver, "Delhi");
	}

}
