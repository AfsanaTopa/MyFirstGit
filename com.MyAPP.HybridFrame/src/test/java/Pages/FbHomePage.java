package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbHomePage {
	
	WebDriver driver;
	//constructor
	public FbHomePage(WebDriver Idriver){
		this.driver=Idriver;
	}
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='email']")
	WebElement SignInLink;
	
	@FindBy(how=How.XPATH,using=".//*[@id='pass']")
	WebElement PasswordLink;
	
	@FindBy(how=How.XPATH,using=".//*[@id='u_0_n']")
	WebElement LogInButton;
	
	


	public String getApplicationTitle(){
		 String actualtitle=driver.getTitle();
		 return actualtitle;
	}
	public void LogInAction(String EmailId,String Password ){
		SignInLink.clear();
		SignInLink.sendKeys(EmailId);
		
		PasswordLink.clear();
		PasswordLink.sendKeys(Password);
		LogInButton.click();
		
		
	}
	
	
	
}
