package com.providio.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;
import com.providio.pageObjects.LoginPage;
import com.providio.pageObjects.Logout;
import com.providio.pageObjects.ProfilePage;
import com.relevantcodes.extentreports.LogStatus;

public class TC_Logout extends BaseClass{

	@Test
	public void logoutTest() throws InterruptedException  {
	
	test.log(LogStatus.INFO, "Test case for the Login Page");
	
	
	LoginPage lp = new LoginPage(driver);
	
	lp.clickSign();
	logger.info("clicked on sign in");
	Thread.sleep(2000);
	lp.setEmail(name);
	logger.info("entered email");
	Thread.sleep(2000);
	lp.setPassword(password);
	logger.info("entered password");
	Thread.sleep(2000);
	lp.clickSubmit();
	logger.info("clicked on login");
	
	//validation for login
	
//	lp.login(name, password);
	
	 
		 String actualTitle ="Home Page | RefArch";
		 String expectedTitle =driver.getTitle(); 
		 logger.info(expectedTitle );
		
		 Verify.verify(true, expectedTitle, actualTitle);
		 Thread.sleep(5000);

		//Logoutscript
		ProfilePage pp1 = new ProfilePage(driver);
		pp1.howeraccount(driver);
		
		Logout l = new Logout(driver);
		logger.info("Hovered the myaccout");
		Thread.sleep(3000);
		
		l.clicklogout();
		logger.info("clicked  the logout buttton and successfully logout");
	
			String actualUrl= driver.getCurrentUrl();
			String expectedUrl ="https://zzqi-002.dx.commercecloud.salesforce.com/s/RefArch/home?lang=en_US";
			// Assert.verify.assert(actualUrl, expectedUrl);
			 
			 Verify.verify(true, expectedUrl, actualUrl);
		
		
	}
}
