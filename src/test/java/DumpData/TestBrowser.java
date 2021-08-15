package DumpData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class TestBrowser {
	@Test
	public void BrowserTest() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		HomePage.NavigateToBlog(driver);
		HomePage.NavigateToFlights(driver);
		HomePage.NavigateToHome(driver);
		HomePage.NavigateToHotels(driver);
		HomePage.NavigateToOffers(driver);
		HomePage.NavigateToTours(driver);
		HomePage.NavigateToVisa(driver);
		HomePage.NavigateToHome(driver);
		HomePage.SelectFlightsTab(driver);
		HomePage.SelectToursTab(driver);
		HomePage.SelectVisaTab(driver);
		HomePage.SelectHotelsTab(driver);
	}

}
