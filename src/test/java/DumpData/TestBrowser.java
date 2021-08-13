package DumpData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBrowser {
	@Test
	public void BrowserTest() {
		String pathTOExecutable="D:\\Education\\Selenium Workspace\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", pathTOExecutable);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}

}
