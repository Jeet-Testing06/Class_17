package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public ChromeDriver driver;	
	public Properties pr;
	

	@BeforeMethod
	public void browser_launch() throws IOException
	{
		File f = new File("C:\\Users\\jitender.ahuja\\git\\Class_17\\Project_9_2\\OR.properties");
		FileInputStream fis = new FileInputStream(f);
		pr = new Properties();
		pr.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void browser_close()
	{
		driver.close();
	}
	

}