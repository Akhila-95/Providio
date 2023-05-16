package com.providio.testcases;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.providio.pageObjects.CheckoutPage;
import com.providio.pageObjects.LoginPage;
import com.providio.pageObjects.Logout;
import com.providio.pageObjects.Navigationmenu;
import com.providio.pageObjects.ProductDescriptionPage;
import com.providio.pageObjects.ProfilePage;
import com.providio.pageObjects.MiniCartPage;
import com.providio.pageObjects.PaymentPage;
import com.providio.pageObjects.ReviewOrderPage;
import com.providio.pageObjects.ViewCartPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC_PDPPage extends BaseClass {

	@Test
	public void PDPpage() throws InterruptedException {
		
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
		logger.info("clicked on submit button");
		Thread.sleep(5000);
		

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
		
		//navigation
		Navigationmenu navMenu =new Navigationmenu(driver);
		
		navMenu.clicknewarrivalssMenu(driver);
		logger.info("hovered on new arrival menu");
		
		navMenu.ClicknewarrivalofWomens();
		logger.info("clicked on womens category");
		
		//pdp page
		 ProductDescriptionPage pdp=new  ProductDescriptionPage(driver);
		 
		 pdp.clickOnProduct1();
		 logger.info("clciked on product");
		 
		 pdp.clickOnLeftCarousel(driver);
		 logger.info("clciked on left carousel");
		 
		 pdp.clickOnRightCarousel(driver);
		 logger.info("clciked on right carousel");
		 
		 pdp.clickOnWriteAReviewAtTop();
		 logger.info("clciked on write a review");
		 
		 pdp.clickOnRating(driver);
		 logger.info("clciked on rating");
		 
		 pdp.clickOnReviewHeadline(driver, headline);
		 logger.info("entered review");
		 
		 pdp.clickOnComments(comment);
		 logger.info("given comment");
		 
		 pdp.clickOnYes();
		 logger.info("clciked on yes");
		 
		 pdp.clicknickName(nickName);
		 logger.info("given nickaname");
		 
		 pdp.clickOnLoc(location);
		 logger.info("entered the location");
		 
		 pdp.clickOnSubmitReview(driver);
		 logger.info("clciked on write a review");
		 
		 pdp.clickOnSize(driver);
		 logger.info("clicked on size");
	
		 pdp.clickInIncreaseQuantity();
		 logger.info("increased  qunatity");
		 
		 pdp.clickOndecreaseTheQunatity();
		 logger.info("decreased  qunatity");
		 
		// pdp.clickOnWishlist();
		 logger.info("clciked on wishlist");
		 
		 pdp.clickOnStore(driver);
		 logger.info("clicked on find a store");
		 
		 
		 pdp.clickOnZipCode(zipcodeStore);
		 logger.info(" entered zipcode in store");
		 
		 pdp.clickOnRadius();
		 
		 pdp.clickOnFindStores();
		 
		 pdp.clickOnCloseFindStore(driver);
		 
		 pdp.clickOnPinterest();
		 logger.info("clicked on pinteerst");
			
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> iterator = handles.iterator();
			String oldTab = iterator.next();
			driver.switchTo().window(oldTab);
			
			
				//facebook
		  pdp.clickOnFacebook();
		  logger.info("clicked on facebook");
				Set<String> handles1 = driver.getWindowHandles();
				Iterator<String> iterator1 = handles1.iterator();
				String oldTab1 = iterator1.next();
				driver.switchTo().window(oldTab1);
				
				//twitter
		  pdp.clickOntwitter();
		  logger.info("clicked on twitter");
				Set<String> handles2 = driver.getWindowHandles();
				Iterator<String> iterator2 = handles2.iterator();
				String oldTab2 = iterator2.next();
				driver.switchTo().window(oldTab2);
			
				
		//add to cart
				
			ProductDescriptionPage productDescriptionPage= new ProductDescriptionPage(driver);
			productDescriptionPage.clickcartbutton(driver);
			logger.info("clicked on add tocart button");
			
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

