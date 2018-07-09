package testRun;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.sun.java.util.jar.pack.Package.File;
import com.sun.jna.platform.FileUtils;

public class ScreenshotsUtility {

		public static String getScreenshot(WebDriver driver)
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			java.io.File src= ts.getScreenshotAs(OutputType.FILE);
		
			
			String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
			
			java.io.File destination=new java.io.File(path);
			
			try 
			{
				
				org.apache.commons.io.FileUtils.copyFile(src, destination);
			} catch (IOException e) 
			{
				System.out.println("Capture Failed "+e.getMessage());
			}
			
			return path;
		}
		
	}

