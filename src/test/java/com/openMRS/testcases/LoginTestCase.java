package com.openMRS.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.openMRS.base.TestBase;




public class LoginTestCase extends TestBase{
	
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		
		driver.findElement(By.xpath(OR.getProperty("location"))).click();;
		Thread.sleep(2000);
		
		
	}
	

}
