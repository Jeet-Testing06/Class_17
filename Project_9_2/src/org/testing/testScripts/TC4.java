package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Pages.Video_Play;

public class TC4 extends BaseClass {
	
	@Test
	public void test_case() throws InterruptedException
	{
		Login login = new Login(driver, pr);
		login.loggedin("jitenderahuja06@gmail.com", "@naukrijob");
		
		Video_Play video = new Video_Play(driver, pr);
		video.video_play();
		
		WebElement subscribe = driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-watch-flexy[1]/div[3]/div[1]/div[1]/div[7]/div[3]/ytd-video-secondary-info-renderer[1]/div[1]/div[2]/div[1]/ytd-subscribe-button-renderer[1]/paper-button[1]/yt-formatted-string[1]"));
		Thread.sleep(3000);
		subscribe.click();
			
	}
	
}