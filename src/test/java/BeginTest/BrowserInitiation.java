package BeginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInitiation {
	private static WebDriver driver;
	private static String pathToFirefoxExecutable="D:\\Education\\Selenium Workspace\\geckodriver.exe";
	private static String pathToChromeExecutable="D:\\Education\\Selenium Workspace\\chromedriver.exe";
	private static String pathToIEExecutable="D:\\Education\\Selenium Workspace\\IEDriverServer.exe";



	public static WebDriver createFirefoxDriver() {
		//System.setProperty("webdriver.gecko.driver", pathToFirefoxExecutable);
		WebDriverManager.firefoxdriver().setup();


		driver= new FirefoxDriver();
		return driver;


	}

	public static WebDriver createChromeDriver() {
		//System.setProperty("webdriver.chrome.driver", pathToChromeExecutable);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		return driver;
	}

	public static WebDriver createIEriver() {
		//System.setProperty("webdriver.IE.driver", pathToIEExecutable);
		WebDriverManager.iedriver().setup();
		driver= new InternetExplorerDriver();
		return driver;
	}

	public static WebDriver createEdgeDriver() {
		WebDriverManager.edgedriver().setup();
		return driver;
	}

	public static WebDriver createChromiumriver() {
		WebDriverManager.chromiumdriver().setup();
		return driver;
	}

	public static void main(String[] args) {

	}
}
