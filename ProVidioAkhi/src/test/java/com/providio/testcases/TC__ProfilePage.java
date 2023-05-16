package com.providio.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.providio.pageObjects.LoginPage;
import com.providio.pageObjects.ProfilePage;
import com.relevantcodes.extentreports.LogStatus;

public class TC__ProfilePage extends BaseClass{
	
	
	@Test
	public void ProfilePgae() throws InterruptedException{
			
		driver.get(baseURL);
		logger.info("enterd into url");
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
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
		logger.info("click on the submit");
		
		lp.clickOnLogo();
		Thread.sleep(10000);
		
		logger.info(driver.getTitle());
		
		String expectedTitle = "Sites-RefArch-Site";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			
			test.log(LogStatus.PASS, "Login successfully");
			logger.info("Login success");
        }
		else {
			test.log(LogStatus.FAIL, "Login Failed");
			logger.info("Login failed");
		}
		
		Thread.sleep(5000);
		
		//Hower profile
		
		ProfilePage pp = new ProfilePage(driver);
		
		pp.howeraccount(driver);
		logger.info("Hower the profile");
		
		pp.clickMyAccount();
		logger.info("Clicked on the My account");
		

		
		Thread.sleep(5000);
		
		pp.clickEditPage();
		logger.info("Clicked on the editprofile");
		Thread.sleep(5000);
		
		pp.scrolldown(driver);
		logger.info("Clicked on the Scrolldown");
		
		WebElement editProfile = driver.findElement(By.xpath("(//h2)[1]"));
	
		String expectedText = "Edit Profile";
		String actualText = editProfile.getText();
		logger.info(editProfile.getText());

		if (actualText.equals(expectedText)) {
			
			test.log(LogStatus.PASS, "successfully clicked on the edit profile");
			logger.info("Click success on the editProfile");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
		
		
		
		pp.setFisrtName(epfname);
		logger.info("Entered the firstName");
		
	    pp.setLastname(eplname);
	    logger.info("Entered the lastName");
	    
	    pp.scrolldown(driver);
		logger.info("Clicked on the Scrolldown");
		Thread.sleep(5000);
		
	    pp.setconfirmEmail(epconfirmEmail);
	    logger.info("Entered the Email");
	    
	    pp.setpassword(eppassword);
	    logger.info("Entered the password");
	    
//		pp.clickReturntomyAccount(driver);
//		logger.info("Clicked on the Returntomyaccount");
//		Thread.sleep(5000);
	    
	    pp.clickSaveButtoninEditpage(driver);
	    logger.info("Clicked on the savebutton in the edit page");
	    
	    //changepassword
	    
	    pp.clickChangePassword();
	    logger.info("Clicked on the changepassword");
	    
	    WebElement editPassword = driver.findElement(By.xpath("//h2[contains(text(),'Change Password')]"));
		
		String expectedPassword = "Change Password";
		String actualPassword = editPassword.getText();
		logger.info(editPassword.getText());

		if (actualPassword.equals(expectedPassword)) {
			
			test.log(LogStatus.PASS, "successfully clicked on the Change password");
			logger.info(" Click success on the Change password");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
	    
	    
	    pp.setcurrentPassword(epcurrentPassword);
	    logger.info("Enterd the currnet Password");
	    
	    pp.setnewPassword(epnewPassword);
	    logger.info("Entered the new password");
	    
	    pp.setnewPasswordConfirm(epnewPasswordConfirm);
	    logger.info("Enterd the newpassword conform");
	    
//		pp.clickReturntomyAccount(driver);
//		logger.info("Clicked on the Returntomyaccount");
//		Thread.sleep(5000);
	    
		pp.clicksavebuttonPasswordChange(driver);
		logger.info("Clicked on the save button on the change password page");

//		
//		pp.clickChangePassword();
//		logger.info("Clicked on the ChangePassword");
//		Thread.sleep(5000);
	
//		pp.clickReturntomyAccount(driver);
//		logger.info("Clicked on the Returntomyaccount");
//		Thread.sleep(5000);
//		
		pp.clickAddNewAddress();
		logger.info("Clicked on the AddnewAddress");
		Thread.sleep(5000);
		
	    WebElement editAddNewAddress = driver.findElement(By.xpath("//h2[contains(text(),'Add New Address')]"));
		
			String expectededitAddNewAddress = "Add New Address";
			String actualeditAddNewAddress = editAddNewAddress.getText();
			logger.info(editAddNewAddress.getText());

			if (actualeditAddNewAddress.equals(expectededitAddNewAddress)) {
				
				test.log(LogStatus.PASS, "successfully clicked on the Change password");
				logger.info("Click success on the Change password");
	        }
			else {
				test.log(LogStatus.FAIL, "Click Failed");
				logger.info("Click failed");
			}
		
		
		pp.scrolldown(driver);
		logger.info("Clicked on the Scrolldown");
		
		pp.clickReturntomyAccount(driver);
		logger.info("Clicked on the Returntomyaccount");
		Thread.sleep(5000);
		
		pp.scrolldown(driver);
		logger.info("Clicked on the Scrolldown");
		Thread.sleep(10000);
		
		pp.clickViewOrderHistory();
		logger.info("Clicked on the vieworderhistory");
		Thread.sleep(5000);
		
		pp.scrolldown(driver);
		logger.info("Clicked on the Scrolldown");
		Thread.sleep(10000);
		
		pp.clickReturntomyAccountinViewOrder(driver);
		logger.info("Clicked on the Returntomyaccount");
		Thread.sleep(5000);
		
   }

}
