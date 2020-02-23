import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/abraartishan/desktop/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");

	}

}
