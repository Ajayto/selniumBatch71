import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.Helper;

public class firstTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop=Helper.readProperty();
		firstTest t= new firstTest();
		t.launchBrowser(prop.getProperty("RunOnBrowser"));
	   
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		
		//WebElement userNameText=driver.findElement(By.className("form-control"));
		//userNameText.sendKeys("Abc");
		
//	  List<WebElement> allElement=driver.findElements(By.className("Ajay_001"));
//	  System.out.println("list size="+allElement.size());
//	  
//	  
//	  driver.findElements(By.partialLinkText("dsg"));
		
		
		
		
		
		
//		driver.findElement(By.name("username"));
//		driver.findElement(By.tagName("input"));
//		driver.findElement(By.className("oxd-button"));
//		driver.findElement(By.linkText("OrangeHRM, Inc"));
//		driver.findElement(By.partialLinkText("OrangeHRM"));
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//		driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
		
		
		
		
		
		
		
		///driver.navigate().forward();
		
		
		//1
//		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		
		
		
		
		
		
		
		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
//		driver.findElement(By.id("tabButton")).click();
//		driver.findElement(By.id("tabButton")).click();
//		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		//driver.close();
		driver.quit();

	}
	
	//lunchBrowser(String BrowserName )
	
	void launchBrowser(String BrowserName) throws IOException{
		Properties prop=Helper.readProperty();
		if(BrowserName.equalsIgnoreCase("FF")) {
			 driver=new FirefoxDriver();
		}else if(BrowserName.equalsIgnoreCase("GC")) {
			 driver=new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("ME")) {
			 driver=new EdgeDriver();
		}
		
		driver.navigate().to(prop.getProperty("QA_url"));
	}

}
