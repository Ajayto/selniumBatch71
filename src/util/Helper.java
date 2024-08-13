package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Helper {
	static Properties prop= null;
 public static Properties readProperty() throws IOException{
	  System.out.println("*****"+System.getProperty("user.dir"));
		FileInputStream propFile=new FileInputStream(System.getProperty("user.dir")+"/src/config/config.properties");
		Properties prop= new Properties();
		prop.load(propFile);
	
	return prop;
 }

}
