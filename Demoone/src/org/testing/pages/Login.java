package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	
	public void signin(String User, String password)
	{
		List <WebElement>  s = driver.findElements(By.xpath(pr.getProperty("signbutton")));
		
		System.out.println(s.size());
		
		s.get(2).click();
		
		
	}
}
