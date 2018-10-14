package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_Play {
	
	ChromeDriver driver;
	Properties pr;
	
	public Video_Play(ChromeDriver driver, Properties pr) {
		
	 this.driver = driver;
	 this.pr = pr;
		
	}
	
	
	public void video_play() throws InterruptedException
	{
		List <WebElement> ls1 = driver.findElements(By.id("video-title"));
		ls1.get(0).click();
		Thread.sleep(12000);
	}
	
}