package Tescases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DataProvider.ConfigurationDataProvider;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.FbHomePage;

public class VerifyHomePage {
	
	
	WebDriver driver;
	
	ExtentReports report;
	ExtentTest Logger;
	
	
	
	@BeforeMethod
	public void SetUp() throws IOException{
		/*report=new ExtentReports("./Report/HomePageLo&Report.html");
	Logger=report.startTest("Home Page Verification Test case");

	
	
	//Open Browser 
	WebDriver driver=BrowserFactory.getBrwoser("firefox");
	

  driver.get(DataProviderFactory.getConfig().getApplicationUrl());
  Logger.log(LogStatus.INFO, "Started browser and nevigated to the URL,running app");
		*/
		
		
	           
	}
	
	
	@Test
	public void HomepageTest() throws InterruptedException, IOException {
		
		//*******
		report=new ExtentReports("./Report/HomePageLo&Report.html");
		Logger=report.startTest("Home Page Verification Test case");

		
		
		//Open Browser 
		WebDriver driver=BrowserFactory.getBrwoser("firefox");
		

	  driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	  Logger.log(LogStatus.INFO, "Started browser and nevigated to the URL,running app");
			//****
		

	FbHomePage home=PageFactory.initElements(driver, FbHomePage.class);
	String title= home.getApplicationTitle();
	String currentUrl=driver.getCurrentUrl();
	System.out.println(title);
	System.out.println(currentUrl);
		
	AssertJUnit.assertTrue(title.contains("Facebook"));
	AssertJUnit.assertEquals(currentUrl, "https://www.facebook.com/");
	
	Logger.log(LogStatus.PASS, "HOME PAGE VERIFIED");
	
	
	home.LogInAction("abc", "abc");
	Logger.log(LogStatus.PASS, "log in attempt VERIFIED");
	
	
		
		//driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("adsksk");
		Thread.sleep(50);
	
		}
	


	@AfterMethod
	public void tearDown(){

		BrowserFactory.CloseBrowser(driver);
		report.endTest(Logger);
		report.flush();
		
	}
}
