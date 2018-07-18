package helpers;


import locators.LoginpageLocators;
import finalpac.CommonMe;

public class Login extends CommonMe{
	
	public static  Login ob= new Login();
	
	
	
	public void setup() {
		
		ob.OpenBrowser("chrome");
		ob.impwait(20);
		ob.OpenUrl("https://stage.meethook.com");
		ob.maximize(driver);
	}
	
	//Valid Data test
	public String loginTest(String user, String password) throws InterruptedException {
		ob.impwait(20);
		ob.EnterText(LoginpageLocators.username,user);
		ob.EnterText(LoginpageLocators.password, password);
	  Thread.sleep(1000);
		ob.ClickEle(LoginpageLocators.loginbutton);
		return ob.gettext(LoginpageLocators.dashboardtitle);
	}
	
	
	//Invalid Data
	
	public boolean invalidLogin() {
		ob.impwait(20);
		ob.EnterText(LoginpageLocators.username, "user101@mailor.com");
		ob.EnterText(LoginpageLocators.password, "abc1256");
		ob.ClickEle(LoginpageLocators.loginbutton);
		return ob.display(LoginpageLocators.signinLink);
	}
	
	
	
	
	public void cleardata() {
		ob.impwait(50);
		ob.clear(LoginpageLocators.username);
		ob.clear(LoginpageLocators.password);
	}
	
	public void close() {
		ob.close(driver);
	}

}