package com.providio.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.providio.pageObjects.CheckoutPage;
import com.providio.pageObjects.GuestLoginPage;
import com.providio.pageObjects.Navigationmenu;
import com.providio.pageObjects.ProductDescriptionPage;
import com.providio.pageObjects.ProductListingpage;

import com.providio.pageObjects.MiniCartPage;
import com.providio.pageObjects.PaymentPage;
import com.providio.pageObjects.ReviewOrderPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC__GuestLogin extends BaseClass {
	
	

	@Test
	public void guestlogin() throws InterruptedException {
		
		
	
		//hover on electronics

	
	//validation for television home page
	
	WebElement Televisions = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
    
    String ActualTitleofTelevisions = Televisions.getText();     
    String ExpectedTitleofTelevisions = "TELEVISIONS";
    logger.info(Televisions.getText());
    
	if (ActualTitleofTelevisions.equals(ExpectedTitleofTelevisions)) {
		
		test.log(LogStatus.PASS, "clicked on the electronics of Televisions");
		logger.info("click Success electronics of Televisions");
    }
	else {
		test.log(LogStatus.FAIL, "Click Failed");
		logger.info("Click failed");
	}
		

	//plp page
		ProductListingpage plp=new ProductListingpage(driver);
		
		plp.selectItemformPLP();
		logger.info("clicked on television product");
	
		ProductDescriptionPage pdp=new ProductDescriptionPage(driver);
		
		//add to cart
		pdp.clickcartbutton(driver);
		logger.info("click on the add to cart button");
	
			
	//pdp page
	
			//validation for product name 
			String actualProductName = driver.getTitle();
			String expectedProductName ="Samsung Series 7 52\" LCD High Definition Television";
			
	if (actualProductName.equals(expectedProductName)) {
					
					test.log(LogStatus.PASS, "Succesfully clicked on the Add to cart Button");
					logger.info("click Success on Add to cart Button");
		       }
				else {
					test.log(LogStatus.FAIL, "Click Failed");
					logger.info("Click failed");
				}
				

	

	//validation for add to cart
	//WebElement addToCart=driver.findElement(null)
	
	
	//minicart icon
		
	
	MiniCartPage miniCart=new MiniCartPage(driver);
	Thread.sleep(5000);
	miniCart.clickcartbutton();
	logger.info("clicked on minicart button");
	
	//checkout
	miniCart.clickCheckout();
	logger.info("clicked on checkout");
	
	//guest login
	GuestLoginPage guestLoginPage= new GuestLoginPage(driver);
	
	guestLoginPage.clickOnGuestMail(guestmail);
	logger.info("guest mail entry");
	
	//guest password
	guestLoginPage.clickOnGuestPassword(guestPassword);
	logger.info("guest password entry");
	
	//guest checkout
	guestLoginPage.clickOnGuestCheckOut();
	logger.info("guest checkout");
	
	// again mail
	guestLoginPage.clickOnEmail(reEnterMail);
	logger.info("guestmail again");
	
	
	// continue as guest
	guestLoginPage.clickOnContinueAsGuest();
	logger.info("guest continue as guest");
	
	
	Thread.sleep(5000);
	CheckoutPage cp = new CheckoutPage(driver);
	
	//cp.Expressdelivery();
	
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
		
	
	Thread.sleep(10000);
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
	
//	pp.unchecksavecard(driver);
//	logger.info("ckicked on the savecard checkbox");
//	Thread.sleep(5000);
	
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
	Thread.sleep(10000);
	rop.clickonplaceorderwithJsExuter(driver);
	logger.info("successfully place the order");
	Thread.sleep(10000);
	//validation of PlacetheOrder
	
	WebElement PlacetheOrder = driver.findElement(By.xpath("//h2[@class ='order-thank-you-msg']"));
	
      String ActualTitleofPlacetheOrder = PlacetheOrder.getText();  
       String ExpectedTitlePlacetheOrder = "Thank you for your order.";
       logger.info(PlacetheOrder.getText());

		if (ActualTitleofPlacetheOrder.equals(ExpectedTitlePlacetheOrder)) {
			
			test.log(LogStatus.PASS, "Succesfully Order is Placed");
			logger.info("click Success and Order is Placed");
       }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
	
	
	//rop.clickonplaceorder(driver);
	Thread.sleep(10000);
	}
}
