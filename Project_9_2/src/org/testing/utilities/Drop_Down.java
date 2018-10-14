// This utility works with TC6 only just to understand


package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
	public static void drop_down(String VisibleText, WebElement drop)
	{
		
		Select s2 = new Select(drop);
		s2.selectByVisibleText(VisibleText);
		
		
	}
	

}