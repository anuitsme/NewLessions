package BeginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInitiation {
	private static WebDriver driver;
	private static String pathToFirefoxExecutable="D:\\z003sy8d\\Softwares_Updated\\SeleniumWorkspace\\geckodriver.exe";
	private static String pathToChromeExecutable="D:\\Education\\Selenium Workspace\\chromedriver.exe";
	private static String pathToIEExecutable="D:\\Education\\Selenium Workspace\\IEDriverServer.exe";
	
	
	
	public static WebDriver createFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", pathToFirefoxExecutable);
		
	driver= new FirefoxDriver();
	return driver;
	
		
	}
	
public static WebDriver createChromeDriver() {
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
