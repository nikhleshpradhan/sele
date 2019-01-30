package org.testing.utilities;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class Screnshot {
	
	public static void takeScreenshot(ChromeDriver driver)
	{
		
	File f = 	driver.getScreenshotAS(OutputType.FILE);
	
	FileUtils.copyFile(f,new File(path)));
	
	}

}
