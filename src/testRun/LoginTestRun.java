package testRun;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import helpers.Login;


public class LoginTestRun extends Login{
	
	public  LoginTestRun obj;
	
	
	@BeforeTest
	  public void setup1() {
		obj = new LoginTestRun();
	obj.setup();
	  }
	  
 @Test(priority =2)
// @Parameters("browser")
  public void loginValidData() throws InterruptedException {
System.out.println("login test with valid test started");
	  

Assert.assertEquals(obj.loginTest("user110@mailinator.com", "abc123456"), "Dashboard");
System.out.println("test completed");

/*Assert.assertEquals(obj.creditcard(), true);
System.out.println("test 2");*/
	  
  }	
  
  
  @Test(priority = 1)
 // @Parameters("browser")
  public void loginInvalidData() {
	  System.out.println("login test with invalid test started");
	  
Assert.assertEquals(obj.invalidLogin(), true);
	
	  System.out.println("test completed");

	  
  }
  
 
  
  
  @BeforeMethod
  
  public void clearall() {
	obj.cleardata();
  }
  
  
 /*@AfterTest
  public void browserclose() {
	  obj.close();
  }*/
  
  
}