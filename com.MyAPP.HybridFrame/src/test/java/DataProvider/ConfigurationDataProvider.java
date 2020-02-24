package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationDataProvider {
	
	//Global Property
	Properties pro;
	
	//1.Define Config File..Constructor
	public ConfigurationDataProvider() throws IOException
	{//File path
		File src=new File("./ConfigurationData/config.properties");
		
		//ACCESS FILE
		try {
			FileInputStream fis=new FileInputStream (src);
			
			//Load file
			pro= new Properties();
			pro.load(fis);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("EXCEPTION IS"+e.getMessage());
		}
		
		
		
		}
	
	
	//B.Custom method to pul data
	public String getApplicationUrl(){
		String url=pro.getProperty("url");
		return url;
		}
	public String getFirefoxPath(){
		String firefoxpath=pro.getProperty("FirefoxPath");
		return firefoxpath;
		}
	public String getChromePath(){
		String chromepath=pro.getProperty("ChromePath");
		return chromepath;
		}
	public String getChromeHeadlessPath(){
		String chromeHeadlesspath=pro.getProperty("ChromeHeadlessPath");
		return chromeHeadlesspath;
	}

}
