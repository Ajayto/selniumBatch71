import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Helper;

public class firstTest {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop=Helper.readProperty();
		UIoprator browser=new UIoprator();
		browser.launchBrowser(prop.getProperty("RunOnBrowser"));
	   
		UIoprator.driver.manage().window().maximize();
		
		UIoprator.driver.findElement(By.id("timerAlertButton")).click();
		
		//accept alert
		WebDriverWait wait= new WebDriverWait(UIoprator.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		UIoprator.driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		//UIoprator.driver.navigate().to(UIoprator.driver.getCurrentUrl());
		
		
		//UIoprator.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		
//		UIoprator.driver.findElement(By.id("reveal")).click();
//		WebDriverWait wait= new WebDriverWait(UIoprator.driver, Duration.ofSeconds(50));
//		
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("revealed")));// element is in dom or not
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed"))); // 2 sec
//		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("revealed")));
//		
//		
//		UIoprator.driver.findElement(By.id("revealed")).sendKeys("abcd");
		
		
		
		
		
		
		//
		
		
		
//		 UIoprator.driver.findElement(By.id("adder")).click();
//		 System.out.println(UIoprator.driver.findElement(By.id("box0")).isDisplayed());
//		 UIoprator.driver.findElement(By.id("adder")).click();
//		 System.out.println(UIoprator.driver.findElement(By.id("box1")).isDisplayed());
//		 UIoprator.driver.findElement(By.id("adder")).click();
//		 System.out.println(UIoprator.driver.findElement(By.id("box2")).isDisplayed());
		 
		 
		 //
		 //  System.out.println(UIoprator.driver.findElement(By.cssSelector("#revealed")).isDisplayed());
		
//	   UIoprator.driver.findElement(By.id("adder")).click();
//	   System.out.println(UIoprator.driver.findElement(By.id("box0")).isDisplayed());
//	   
//	   UIoprator.driver.findElement(By.id("adder")).click();
//	   System.out.println(UIoprator.driver.findElement(By.id("box1")).isDisplayed());
//	   
//	   UIoprator.driver.findElement(By.id("adder")).click();
//	   System.out.println(UIoprator.driver.findElement(By.id("box2")).isDisplayed());
	   
	  
	   
		
		//UIoprator.driver.findElement(By.xpath("//span[text()='FLIGHTS']")).click();
		
		
		//System.out.println(UIoprator.driver.findElement(By.cssSelector(".emt_logo")).isDisplayed());
		
		
		
		

		//UIoprator.driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
//		JavascriptExecutor js=(JavascriptExecutor)UIoprator.driver;
//		js.executeScript("window.scrollBy(100,600)");
//		
//		String Color="Red";
//		
//		UIoprator.driver.findElement(By.xpath("//div[text()='Select...']")).click();
//		UIoprator.driver.findElement(By.xpath("//div[text()='Blue']")).click();
//		UIoprator.driver.findElement(By.xpath("//div[text()='Black']")).click();
//		UIoprator.driver.findElement(By.xpath("//div[text()='"+Color+"']")).click();
//		
//		Thread.sleep(5000);
//		
//		UIoprator.driver.findElement(By.xpath("//div[text()='Black']/following-sibling::div")).click();
//		Thread.sleep(5000);
//		UIoprator.driver.findElement(By.xpath("//b[text()='Multiselect drop down']/parent::p/following-sibling::div/div/div[2]/div[1]")).click();
//		
		
		
		
		
		
//		WebElement list=driver.findElement(By.id("cars"));
//		Select sel=new Select(list);
//		Thread.sleep(5000);
//		sel.selectByIndex(0);
//		sel.selectByValue("opel");
//		sel.selectByVisibleText("Audi");
//		Thread.sleep(5000);
//		
//		List<WebElement> AllSelectedOptions=sel.getAllSelectedOptions();
//		System.out.println(AllSelectedOptions.size());
//		
//		for(WebElement eachElement:AllSelectedOptions) {
//			System.out.println(eachElement.getText());
//		}
//		
//		
		
		
		
		//sel.deselectAll();
		
		
		
//		sel.deselectByIndex(0);
//		sel.deselectByValue("opel");
//		sel.deselectByVisibleText("Audi");
		
		
		
		
		
//		 sel.selectByVisibleText("Green");
//		
//		 WebElement selectedOption=sel.getFirstSelectedOption();
//		 System.out.println(selectedOption.getText());
		
		
		
		
		
		
//		List<WebElement> allOptions=sel.getOptions();
//		System.out.println(allOptions.size());
//		for(WebElement eachElemnt:allOptions) {
//			System.out.println(eachElemnt.getAttribute("value"));
//		}
		
		
		
		//sel.selectByValue("4");
		
		//sel.selectByVisibleText("Aqua");
		
		//select.selectByIndex(5);
		
	
		
		
		
		
		
		
		
		//String tagName=driver.findElement(By.name("username")).getTagName();
	//	System.out.println(tagName);
		
		
		
		
		
		
		
		
		
//	  String value=driver.findElement(By.name("username")).getAttribute("class");
//		System.out.println("value="+value);
		
		
		
		
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		////driver.findElement(By.xpath("//button[text()=' Login ']")).submit();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement eleCheckBox=driver.findElement(By.id("hobbies-checkbox-1"));
//		WebElement lblSport=driver.findElement(By.xpath("//label[text()='Sports']"));
//		Thread.sleep(2000);
//		//lblSport.click();
//		Thread.sleep(2000);
		//System.out.println(eleCheckBox.isSelected());
		
		
		
		
		
		
		
		
		
		
//		WebElement noRadioButton=driver.findElement(By.id("noRadio"));
//		
//		System.out.println(noRadioButton.isEnabled());
//		
//		WebElement yesRadioButton=driver.findElement(By.id("yesRadio"));
//		System.out.println("yes radio= "+yesRadioButton.isEnabled());
		
		
		
		
		
//		WebElement userNameText=driver.findElement(By.id("userName"));
//		System.out.println(userNameText.isDisplayed());
		
		
		//driver.findElement(By.linkText("Home")).click();
		
		
		
		
		
		
		
//		WebElement userNameText=driver.findElement(By.id("userName"));
//		userNameText.sendKeys("Abc pqr");
//		Thread.sleep(3000);
//		userNameText.clear();
		
		
		
		
		
		
		
		
		//driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		//driver.navigate().back();
		
		
		
		
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
		UIoprator.driver.quit();

	}
	
	//lunchBrowser(String BrowserName )
	
	

}
