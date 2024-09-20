import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Helper;

public class firstTest {


	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop=Helper.readProperty();
		UIoprator browser=new UIoprator();
		browser.launchBrowser(prop.getProperty("RunOnBrowser"));
		

		UIoprator.driver.manage().window().maximize();
		Thread.sleep(5000);
	
		
		// Step1
		JavascriptExecutor js=(JavascriptExecutor)UIoprator.driver;
		//Step2
		js.executeScript("document.querySelector('div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input').value='Admin'");
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(UIoprator.driver.manage().getCookieNamed("abc"));
		
//		//step1:
//		Cookie myCookie=new Cookie("mycookie", "1234567");
//		
//		Step2:
//		UIoprator.driver.manage().addCookie(myCookie);
//		
//		UIoprator.driver.manage().deleteCookieNamed("__gads");
//		
//		UIoprator.driver.manage().deleteCookie(myCookie);
//		
//		UIoprator.driver.manage().deleteAllCookies();
//		
//		
//		Set<Cookie> allCookie=UIoprator.driver.manage().getCookies();
//		System.out.println("number of cookie="+allCookie.size());
//		for(Cookie eachCookie:allCookie) {
//		    System.out.println(eachCookie);
//		}
		
		
		

		// WebElement mainItem2=UIoprator.driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		//step1: object of action class 
		//WebElement address= UIoprator.driver.findElement(By.id("currentAddress"));
		
		//address.sendKeys("\uE035");
//		Thread.sleep(5000);
//		UIoprator.driver.switchTo().window(UIoprator.driver.getWindowHandle());
//		Actions act= new Actions(UIoprator.driver);
//		
//		act.sendKeys(Keys.F5).build().perform();
//		
//		WebElement body = UIoprator.driver.findElement(By.tagName("body"));
        //body.sendKeys(Keys.F5);
		
//		//ctrl+a, ctrl+C
//		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL);
//		//tab
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB);
//		//ctl+v
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("v");
//		act.keyUp(Keys.CONTROL);
//		
//		act.sendKeys("\uE035");
		
		//act.perform();
		
		Thread.sleep(5000);
		
		UIoprator.driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement source=UIoprator.driver.findElement(By.id("draggable"));
//		WebElement target=UIoprator.driver.findElement(By.id("droppable"));
//		act.dragAndDrop(source,target).perform();
		
		
		
		
		
		
		
		
		
//		act.clickAndHold(UIoprator.driver.findElement(By.id("draggable")))
//		.moveToElement(UIoprator.driver.findElement(By.id("droppable")))
//		.release().perform();






		//		act.moveToElement(mainItem2);
		//		act.moveToElement(UIoprator.driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")))
		//		.moveToElement(UIoprator.driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")))
		//		.contextClick().perform();
		//		

		//act.



















		//
		//		String mainWindow=UIoprator.driver.getWindowHandle();
		//		
		//		UIoprator.driver.findElement(By.id("tabButton")).click();
		//		
		//		Set<String> allWindow=UIoprator.driver.getWindowHandles();
		//		
		//	    for(String eachWindow:allWindow) {
		//	    	UIoprator.driver.switchTo().window(eachWindow);
		//	    	if (UIoprator.driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {
		//				System.out.println("child window text"+UIoprator.driver.findElement(By.id("sampleHeading")).getText());
		//			}
		//	    	else if (UIoprator.driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/browser-windows")) {
		//	    		UIoprator.driver.findElement(By.id("tabButton")).click();
		//			}
		//	    }
		//	    
		//	    UIoprator.driver.switchTo().window(mainWindow);
























		// handle of main window
		//		String mainWindow=UIoprator.driver.getWindowHandle();
		//		
		//		//new tab is open
		//		UIoprator.driver.findElement(By.id("tabButton")).click();
		//		
		//		// store all window id
		//	    Set<String> allWindow=UIoprator.driver.getWindowHandles();
		//	    
		//	    //remove main window form all window
		//	    allWindow.remove(mainWindow);
		//	    
		//	    // convert arraylist
		//	    List<String> newWindow=new ArrayList<String>(allWindow);
		//	    
		//	    System.out.println("befor switch"+UIoprator.driver.getCurrentUrl());
		//	    
		//	    UIoprator.driver.switchTo().window(newWindow.get(0));	
		//	    
		//	    System.out.println("After switch"+UIoprator.driver.getCurrentUrl());
		//	    
		//	    System.out.println("new window text"+UIoprator.driver.findElement(By.id("sampleHeading")).getText());
		//	    
		//	    
		//	    UIoprator.driver.switchTo().window(mainWindow);
		//	    //new tab is open
		//	    UIoprator.driver.findElement(By.id("tabButton")).click();



		//  System.out.println(allWindow.size());











		//		System.out.println("Main text="+UIoprator.driver.findElement(By.xpath("//h1[@class='text-center']/following-sibling::div[1]")).getText());
		//		
		//		UIoprator.driver.switchTo().frame(2);
		//		
		//		System.out.println("parent text="+UIoprator.driver.findElement(By.xpath("//body")).getText());
		//		
		//		UIoprator.driver.switchTo().frame(0);
		//		
		//		System.out.println("child frame="+UIoprator.driver.findElement(By.xpath("//p")).getText());
		//		
		//		UIoprator.driver.switchTo().parentFrame();
		//		
		//		System.out.println("parent text1="+UIoprator.driver.findElement(By.xpath("//body")).getText());
		//		















		//		Thread.sleep(10000);
		//		UIoprator.driver.findElement(By.id("promtButton")).click();
		//		Thread.sleep(10000);
		//		Alert alert= UIoprator.driver.switchTo().alert();
		//		alert.sendKeys("handel pop up");
		//		alert.accept();
		//alert.dismiss();


























		//		//step-1
		//		FluentWait wait=new FluentWait(UIoprator.driver);
		//
		//		//step-2
		//		wait.withTimeout(Duration.ofMillis(60000));
		//		wait.ignoring(ElementClickInterceptedException.class);
		//		//step-3
		//		wait.until(ExpectedConditions.elementToBeClickable(By.id("timerAlertButton")));
		//		
		//
		//		UIoprator.driver.findElement(By.id("timerAlertButton")).click();
		//
		//		//wait.pollingEvery(Duration.ofSeconds(2));
		//		wait.ignoring(NoSuchElementException.class);
		//		//step-3
		//		wait.until(ExpectedConditions.alertIsPresent());
		//
		//		UIoprator.driver.switchTo().alert().accept();











		//Explicit wait :
		//		WebDriverWait wait= new WebDriverWait(UIoprator.driver, Duration.ofSeconds(20));
		//		wait.until(ExpectedConditions.alertIsPresent());


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
		//Thread.sleep(5000);












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
		//Thread.sleep(3000);
		//driver.close();
		//UIoprator.driver.quit();

	}

	//lunchBrowser(String BrowserName )



}
