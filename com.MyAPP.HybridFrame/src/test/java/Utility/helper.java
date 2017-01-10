package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class helper {
	
	
	public static String captureScreenshot(WebDriver driver,String screenshotName){
		
		//1.CREATE TakesScreenshot instance OBJECT
		TakesScreenshot ts=(TakesScreenshot)driver;
		//2.Take screen shot and define file type with a File Class:MAKE IT SOURCE FILE
		File src=ts.getScreenshotAs(OutputType.FILE);
		//3.DEFINE where the taken screen shot will be save as FILE
		String destFilePath=("\\Users\\metootopa\\Desktop\\ECLIPSE_TEST\\com.MyAPP.HybridFrame\\ScreenShots\\");
		String destFile=destFilePath+ screenshotName+ System.currentTimeMillis()+".png";
		//4.set src file to destinatoion folder
		try {
			FileUtils.copyFile(src, new File(destFile));
		} catch (IOException e) {
			System.out.println("Screenshot was not Successfull"+e.getMessage());
		}
		
		return destFile;
		
		
		
	}
	
	

}
