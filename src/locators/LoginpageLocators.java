package locators;


import org.openqa.selenium.By;


public class LoginpageLocators {
	
	
public static final By username = By.id("username");
public static final By password = By.id("password");
public static final By loginbutton = By.xpath("//*[@id=\"signInForm\"]/div[7]/div/button");
public static final By forgotpassword = By.xpath("hh");
public static final By dashboardtitle = By.xpath("//*[@id=\"dashboardHeader\"]/h1/span");	
public static final By errorMsgemail = By.xpath("//*[@id=\"signInForm\"]/div[1]");
public static final By signinLink = By.xpath("//*[@id=\"logintab\"]/ul/li[1]/a");



}
