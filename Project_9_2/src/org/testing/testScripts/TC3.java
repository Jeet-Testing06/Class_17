package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Pages.Video_Play;

public class TC3 extends BaseClass {
	
	@Test
	public void test_case() throws InterruptedException
	{
		Login login = new Login(driver, pr);
		login.loggedin("jitenderahuja06@gmail.com", "@naukrijob");
		
		Video_Play video = new Video_Play(driver, pr);
		video.video_play();
		
		WebElement like = driver.findElement(By.xpath("//button[contains(@aria-label,'like this video')]"));
		like.click();
		Thread.sleep(3000);
		
	}
	
}