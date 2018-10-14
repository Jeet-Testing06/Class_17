package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver, Properties pr) {
		
	 this.driver = driver;
	 this.pr = pr;
		
	}
	
	public void loggedin(String emailvalue, String passwordvalue) throws InterruptedException
	{
		
		WebElement signin = driver.findElement(By.xpath(pr.getProperty("signin")));
		signin.click();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(emailvalue);
		Thread.sleep(3000);
		
		WebElement nextemail = driver.findElement(By.xpath(pr.getProperty("nextemail")));
		nextemail.click();
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath(pr.getProperty("password")));
		password.sendKeys(passwordvalue);
		Thread.sleep(3000);
		
		WebElement nextpwd = driver.findElement(By.xpath(pr.getProperty("nextpwd")));
		nextpwd.click();
		Thread.sleep(6000);
		
	}

}