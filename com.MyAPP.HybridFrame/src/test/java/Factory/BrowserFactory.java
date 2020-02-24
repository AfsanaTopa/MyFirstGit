package Factory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataProvider.ConfigurationDataProvider;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrwoser(String BrowserName) throws IOException{
		if (BrowserName.equalsIgnoreCase("firefox")){
// 		webdriver.firefox.marionette
			System.setProperty("webdriver.gecko.driver",DataProviderFactory.getConfig().getFirefoxPath());
			driver =(WebDriver) new FirefoxDriver();
		}
		else if (BrowserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromePath());
			driver = (WebDriver) new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("chromeHeadless")){
			ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("disable-gpu");
//      chromeOptions.addArguments("window-size=1400,2100"); // Linux should be activate
        System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromeHeadlessPath());
        driver = new ChromeDriver(chromeOptions);
		}
		
		return driver;
		
		}
	
	public static void CloseBrowser(WebDriver Idriver){
		driver.quit();
	}

}
