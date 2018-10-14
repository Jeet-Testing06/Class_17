// TC5 - This test case is only to understand ReadFromExcel utility


package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.ReadFromExcel;

import jxl.read.biff.BiffException;

public class TC5 {
	
	public static void main(String[] args) throws BiffException, IOException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys(ReadFromExcel.read_excel(0, 0));
	
	driver.close();
	

}
}