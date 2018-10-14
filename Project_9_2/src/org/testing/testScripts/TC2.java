package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.utilities.Logs;

public class TC2 extends BaseClass {
	
	@Test
	public void test_case() throws InterruptedException
	{
		Login login = new Login(driver, pr);
		login.loggedin("jitenderahuja06@gmail.com", "@naukrijob");
		
		WebElement subscriptions = driver.findElement(By.xpath("//span[text()='Subscriptions']"));
		subscriptions.click();
		Thread.sleep(3000);
		
		Logs.take_logs("TC2", "Subscriptions tab clicked");
		
	}
	
}