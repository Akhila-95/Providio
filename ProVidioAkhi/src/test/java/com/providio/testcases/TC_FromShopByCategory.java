package com.providio.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.providio.pageObjects.CheckoutPage;
import com.providio.pageObjects.HomePage;
import com.providio.pageObjects.LoginPage;
import com.providio.pageObjects.Logout;
import com.providio.pageObjects.ProductListingpage;
import com.providio.pageObjects.ProfilePage;
import com.providio.pageObjects.QuickShoppage;
import com.providio.pageObjects.MiniCartPage;
import com.providio.pageObjects.PaymentPage;
import com.providio.pageObjects.ReviewOrderPage;
import com.providio.pageObjects.ViewCartPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC_FromShopByCategory  extends BaseClass{

	@Test
	public void fromShopByCategory() throws InterruptedException {
		
		test.log(LogStatus.INFO, "Test case for the Login Page");
		driver.get(baseURL);
		logger.info("enterd into url");
		
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
		logger.info("Click on the submit button");
	
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
		
		//home page -shop by category
		 HomePage homepage= new  HomePage(driver);
		 homepage.clickOnMens();
		 logger.info("clicked on memns category in shop by category");
		 
		 homepage.clickOnJacketsAndCoats();
		 logger.info("clciked on JacketsAndCoats");
		 
		 
		  ProductListingpage plp = new ProductListingpage(driver);
		  
		  plp.selectthequickshope(driver);
		  logger.info("clciked on quick shop");
		 
		 QuickShoppage qs = new QuickShoppage(driver);
		    
		    qs.clickFCarasol();
		    logger.info("Click on the fCarosal");
		    
		    qs.clickBCarasol();
		    logger.info("Click on the bCarosal");
		    
			qs.selectthesize();
			logger.info("Selected the size");
			
			qs.clickIncQuantity();
			logger.info("Clicked on the Increase");
			
			qs.clickMinusQuantity();
			logger.info("Clicked on the minus");
			
			qs.clickAddtocartbutton();
			logger.info("clicked addtocart button");
			
			//qs.clickCloseButton();
		//	logger.info("Close the item");
		
		
		//minicart
		
		MiniCartPage mc = new MiniCartPage(driver);
		
		mc.clickcartbutton();
		logger.info("clicked the cart button");
		
		mc.clickviewCartButton();
		logger.info("clicked the view cart button in the minicart");
		
		//viewcart
		
		ViewCartPage vcp = new ViewCartPage(driver);
		
		//Validation viewcart 
		
				WebElement viewcart = driver.findElement(By.xpath("//h4[@class ='text-center']"));
				
			      String ActualTitleofviewcart = viewcart.getText();  
			       String ExpectedTitleofviewcart = "Order Summary";
			       logger.info(viewcart.getText());
		 
					if (ActualTitleofviewcart.equals(ExpectedTitleofviewcart)) {
						
						test.log(LogStatus.PASS, "Succesfully cart is viewed");
						logger.info("click Success on view cart");
			       }
					else {
						test.log(LogStatus.FAIL, "Click Failed");
						logger.info("Click failed");
					}
		
		vcp.clickCheckout();
		logger.info("clicked the checkout button in  the viewcart page");
		
		
		
		
		
		//checkoutpage
		
		CheckoutPage cp = new CheckoutPage(driver);
		
		//shipping details
		cp.setFisrtName(fname);
		logger.info("entered fname");
		
		cp.setLastname(lname);
		logger.info("entered lname");
		
		cp.setAddress1(address);
		logger.info("entered address");
		
		cp.setCountry();
		logger.info("entered country");
		
		cp.setProvince();
		logger.info("entered state");
		
		cp.setcity(cityname);
		logger.info("entered cityname");
		
		cp.setzipCode(zipcode);
		logger.info("entered zipcode");
		
		cp.setPhone(phonenumber);
		logger.info("entered phone number");
			
		cp.clickpaymentbutton(driver);
		logger.info("Clicked on the payment button");
		
		//Validation checkout 
		
				WebElement checkOut = driver.findElement(By.xpath("//h2[text()='Customer']"));
						
					      String ActualTitleofcheckOut = checkOut.getText();  
					       String ExpectedTitlecheckOut = "Customer";
					       logger.info(checkOut.getText());
				 
							if (ActualTitleofcheckOut.equals(ExpectedTitlecheckOut)) {
								
								test.log(LogStatus.PASS, "Succesfully clicked on the checkout Button");
								logger.info("click Success on checkout Button");
					       }
							else {
								test.log(LogStatus.FAIL, "Click Failed");
								logger.info("Click failed");
							}
							
				
		
		//payment page
		
		PaymentPage pp = new PaymentPage(driver);
		
		
		pp.selectnewcardindropdown();
		logger.info("Selectd the new card");
		
		pp.setcardholdername(driver);
		logger.info("entered card name");
		
		pp.setcardnumber(driver);
		logger.info("entered card number");
		
		pp.setcardcvv(driver);
		logger.info("entered cvv");
		
		pp.setcardexp(driver);
		logger.info("entered exp");
		
		pp.unchecksavecard(driver);
		logger.info("ckicked on the savecard checkbox");
		Thread.sleep(5000);
		
		//Validation payment page 

				WebElement paymentPage = driver.findElement(By.xpath("//label[contains(text(), 'Payment Method')]"));
						
					      String ActualTitleofpaymentPage = paymentPage.getText();  
					       String ExpectedTitlepaymentPage = "Payment Method";
					       logger.info(paymentPage.getText());
				 
							if (ActualTitleofpaymentPage.equals(ExpectedTitlepaymentPage)) {
								
								test.log(LogStatus.PASS, "Succesfully clicked on the Next:Payment button");
								logger.info("click Success on Next:Payment button");
					       }
							else {
								test.log(LogStatus.FAIL, "Click Failed");
								logger.info("Click failed");
							}
		
		pp.clickonrevieworder(driver);
		logger.info("ckicked on the review oreder");
		
		//revieworderpage
		
		ReviewOrderPage rop = new ReviewOrderPage(driver);
		
		rop.clickonplaceorderwithJsExuter(driver);
		Thread.sleep(10000);
		//validation of PlacetheOrder
		
				WebElement PlacetheOrder = driver.findElement(By.xpath("//h2[@class ='order-thank-you-msg']"));
				
			      String ActualTitleofPlacetheOrder = PlacetheOrder.getText();  
			       String ExpectedTitlePlacetheOrder = "Thank you for your order.";
			       logger.info(PlacetheOrder.getText());

					if (ActualTitleofPlacetheOrder.equals(ExpectedTitlePlacetheOrder)) {
						
						test.log(LogStatus.PASS, "Succesfully Order is Placed");
						logger.info("click Success on Order is Placed");
			       }
					else {
						test.log(LogStatus.FAIL, "Click Failed");
						logger.info("Click failed");
					}
		
		Thread.sleep(10000);
		
		
		//Logoutscript
		
		ProfilePage ppH = new ProfilePage(driver);
		ppH.howeraccount(driver);
		
		Logout l = new Logout(driver);
		
		
		
		logger.info("Hovered the myaccout");
		Thread.sleep(3000);
		
		l.clicklogout();
		logger.info("clicked  the logout buttton and successfully logout");
		
		}
		
	}
	

