package com.providio.testcases;


import java.util.List;

import org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.providio.pageObjects.LoginPage;
import com.relevantcodes.extentreports.LogStatus;


public class TC_Login extends BaseClass {
	

	
		@Test
		public void VerifyLoginWithInValidCredentials() throws InterruptedException {
			driver.get(baseURL);
			logger.info("enterd into url");
			LoginPage lp = new LoginPage(driver);
			lp.clickSign();
			logger.info("clicked on sign in");
			Thread.sleep(2000);
			lp.setEmail("akhila.m@etg.digitall");
			logger.info("entered email");
			Thread.sleep(2000);
			lp.setPassword("akhila@98");
			logger.info("entered password");
			Thread.sleep(2000);
			lp.clickSubmit();
			logger.info("clicked on login");
			logger.info("login failed");
			isLoggedIn=false;
			
			WebElement email =driver.findElement(By.name("loginEmail"));
			WebElement rpassword=driver.findElement(By.name("loginPassword"));
			email.clear();
			rpassword.clear();
			lp.setEmail(name);
			logger.info("entered email again");
			lp.setPassword(password);
			logger.info("entered password again ");
			lp.clickSubmit();
			logger.info("clicked on login");
			WebElement text =driver.findElement(By.xpath("//h1[@class='account-page-title']"));
			String expectedTitle =text.getText();
			logger.info(expectedTitle);
			String actualTitle = "Dashboard";
			if (expectedTitle.equals(actualTitle)) {
				test.log(LogStatus.PASS, "Login successful");
				System.out.println("Login successful");
			}
			else {
				test.log(LogStatus.PASS, "Login failed");
				System.out.println("Login failed");
			}
			isLoggedIn=true;
			logger.info(isLoggedIn);
		}
		@AfterTest
		public void tearDown() {
			//driver.quit();
		}
}

