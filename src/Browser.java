import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.Helper;

public class Browser {
	static WebDriver driver;
	
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
