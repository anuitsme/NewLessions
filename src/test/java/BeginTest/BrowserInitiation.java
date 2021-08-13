package BeginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInitiation {
	 WebDriver driver;
	String pathToFirefoxExecutable="D:\\Education\\Selenium Workspace\\geckodriver.exe";
	String pathToChromeExecutable="D:\\Education\\Selenium Workspace\\chromedriver.exe";
	String pathToIEExecutable="D:\\Education\\Selenium Workspace\\IEDriverServer.exe";
	
	
	
	public WebDriver createFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", pathToFirefoxExecutable);
		
	driver= new FirefoxDriver();
	return driver;
	
		
	}
	
public WebDriver createChromeDriver() {
	System.setProperty("webdriver.chrome.driver", pathToChromeExecutable);
		driver= new ChromeDriver();
		return driver;
	}

public WebDriver createIEriver() {
	System.setProperty("webdriver.IE.driver", pathToIEExecutable);
	
	driver= new InternetExplorerDriver();
	return driver;
}
	
public static void main(String[] args) {
	
}
}