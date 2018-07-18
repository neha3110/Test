package finalpac;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class CommonMe {
	
			public static WebDriver driver;
			public static  Select d;
			public static WebDriverWait obje;
			
			
			public void OpenBrowser(String obj1) {
				if (obj1.equalsIgnoreCase("Chrome")) {
					System.setProperty("WebDriver Chrome Driver", "D:\\Appiums-Jars-Training\\chromedriver_win32 (1)\\chromedriver.exe");
					 driver = new ChromeDriver();
				}
				
				
				else if(obj1.equalsIgnoreCase("Firefox")) {
					System.setProperty("Webdriver.gecko.driver", "D:\\Appiums-Jars-Training\\ff\\geckodriver.exe");
					
					driver = new FirefoxDriver();
				}
				
				else if(obj1.equalsIgnoreCase("InternetExplorer")) {
					System.setProperty("webdriver.ie.driver", "D:\\Appiums-Jars-Training\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
					 driver = new InternetExplorerDriver();
				}
				
				else {
					System.out.println("You have enetred invalid browser name");
				}
				
			}
			
			
			public WebElement fe(By object)
			{
				
			
				return driver.findElement(object);
				
				
			}
			
			public void OpenUrl(String obj) {
				driver.get(obj);
			}
			
			
			public void ClickEle(By obj) {
				fe(obj).click();
			}
			
			public void EnterText(By object, String s) {
				fe(object).sendKeys(s);
			}
			
			
			public boolean display(By object) {
				return fe(object).isDisplayed();
			}
			
			
			public boolean enable(By object) {
				return fe(object).isEnabled();
			}
			
			
			public String textget(By object) {
				return fe(object).getText();
				
			}
			
			public void cleartext(By object) {
				fe(object).clear();
			}
			
			
			public void clickHold(WebDriver dr, WebElement object) {
			Actions act = new Actions(dr);
				act.clickAndHold(object);
			}
			
			
			public void expWait(WebDriver dr1, long obj) {
				 obje = new WebDriverWait(dr1,obj);
		}
			
			
			public void maximize(WebDriver dr) {
				dr.manage().window().maximize();
			}
			
			public void close(WebDriver dr) {
				dr.close();
			}
			
			public void navigateToURL(WebDriver dr, String url){
				dr.navigate().to(url);
			}
			
			public void refereshPage(WebDriver dr){
				dr.navigate().refresh();
			}
			
			public void back(WebDriver dr){
				 dr.navigate().back();
			}
			public void forward(WebDriver dr) {
				dr.navigate().forward();
			}
			
			public String getTitleOfPage(WebDriver dr){
				return dr.getTitle();
			}
			
			public String getURLOfPage(WebDriver dr){
				return dr.getCurrentUrl();
			}
			
			public void clear(By by){
				fe(by).clear();
			}
			
			
			public void selectvalue(By obj, String s) {
				
				 d = new Select(fe(obj)); 
				  d.selectByValue(s);
			}
			
			public void selectbyvistext(By obj, String s) {
				 d = new Select(fe(obj)); 
				  d.selectByVisibleText(s);	
			}
			
			public void selectbyidex(By obj, int s) {
				 d = new Select(fe(obj)); 
				  d.selectByIndex(s);	
			}
			
		public void impwait(long a) {
			driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);	
		}
			
		public String gettext(By obj) {
			return fe(obj).getText();
					}
			

		public void verticalScroll(WebElement obj) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", obj);
		}

		public void scrollByArg() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,100)");
		}
			
			public void listEle(By obj) {
				java.util.List<WebElement> test = driver.findElements(obj);
				
				Iterator<WebElement> it = test.iterator();
				while(it.hasNext()) {
					WebElement element1 = it.next();
				//System.out.println(element1.getText());
				}
		}
public void findEleWithWait(By obj, long a) {
	impwait(a);
	
	driver.findElement(obj);
}


public  void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)driver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);


}

	

}