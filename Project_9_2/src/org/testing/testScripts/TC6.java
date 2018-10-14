// TC6 - This test case is only to understand Drop_Down utility


package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.Drop_Down;

public class TC6 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.id("day"));
		Drop_Down.drop_down("8", day);
		
		WebElement month = driver.findElement(By.id("month"));
		Drop_Down.drop_down("Nov", month);
		
		WebElement year = driver.findElement(By.id("year"));
		Drop_Down.drop_down("2000", year);

	}

}