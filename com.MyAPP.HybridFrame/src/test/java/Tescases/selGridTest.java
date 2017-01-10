package Tescases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class selGridTest {
	
	
	
	
	@Test
	public void gridTest() throws MalformedURLException{
	
	//1.CREATE DESIRED CAPABILITY OBJECT TO SPECIFY DEVICE OS AND BROWSER
		//HANDLE FOR SET CAPABILITY
		DesiredCapabilities capabilities=new DesiredCapabilities();
		//2.SET PLATFORM OF OS OR MACHINE
		capabilities.setPlatform(Platform.MAC);
		//3.CREATE REMOTE WEBDRIVER
		//4.STORE HUB/NODE URL
		//5.URL url=new URL("http://169.254.16.137:4444/wd/hub");
		//5.ON CLOUDE HOST
		URL url=new URL("https://topa2:nGWppTtDcKFnUkZqrpbo@hub-cloud.browserstack.com/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,capabilities);
		driver.get("http://www.facebook.com");
		//PRINT THE TITLE
		System.out.println("Title is "+driver.getTitle());
		driver.quit();
		
		
	}
		

}
