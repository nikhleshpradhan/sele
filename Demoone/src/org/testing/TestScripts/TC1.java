package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.pages.Login;
import org.testng.annotations.Test;

public class TC1 extends BaseClass {
	
	
	
	@Test()
	public void tranding()
	{ 
		
	Login l = new Login(driver, pr);
	l.signin("anuragsharma", "123456");
//	
	
		System.out.println("TC1");
List<WebElement> t =	driver.findElements(By.id(pr.getProperty("tranding")));
System.out.println(t.size()); 
t.get(1).click();
		
	}

}
