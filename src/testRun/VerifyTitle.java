package testRun;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sun.org.apache.xerces.internal.util.Status;
//import com.aventstack.extentreports;


public class VerifyTitle 
{
 
	@Test
	public void loginTest() throws IOException
	{    
            // Create Object of ExtentHtmlReporter and provide the path where you want to generate the report 
            // I used (.) in path where represent the current working directory
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/learn_automation1.html");
		
            // Create object of ExtentReports class- This is main class which will create report
	    com.aventstack.extentreports.ExtentReports extent = new com.aventstack.extentreports.ExtentReports();
	    
            // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
            // call createTest method and pass the name of TestCase- Based on your requirement
	    com.aventstack.extentreports.ExtentTest logger=extent.createTest("LoginTest");
	    
            // log method will add logs in report and provide the log steps which will come in report
	    logger.log(com.aventstack.extentreports.Status.INFO, "Login to amazon");
	   
	   
	    logger.log(com.aventstack.extentreports.Status.PASS, "Title verified");
	   
            // Flush method will write the test in report- This is mandatory step  
	    extent.flush();
		
            // You can call createTest method multiple times depends on your requirement
            // In our case we are calling twice which will add 2 testcases in our report
	    ExtentTest logger2=extent.createTest("Logoff Test");
	    
	    logger2.log(com.aventstack.extentreports.Status.FAIL, "Title verified");
	    
	    logger2.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("/Users/mukeshotwani/Desktop/cashback.png").build());
        
	    logger2.pass("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/neha1.jain/Desktop/cashback.png").build());
 
            // This will add another test in report
	    extent.flush();
	    	
	}
	
}
