package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
public ChromeDriver driver;
public Properties pr;
	
	@BeforeTest()
	
	public void openBrowser() throws Exception
	{
		
		
			System.setProperty("webdriver.chrome.driver","\\TravelMint\\Demoone\\chromedriver.exe");//for locate driver path
			System.out.println("Driver Path Found");
		   	driver= new ChromeDriver();
		   	driver.get("https://www.youtube.com/");
            Thread.sleep(10000);
            Thread.sleep(10000);
		  File f = new File ("D:\\TravelMint\\Demoone\\src\\org\\testing\\Object\\OR.properties");
		  FileInputStream fi = new FileInputStream(f);
		  pr = new Properties();
		  pr.load(fi);
}
}
