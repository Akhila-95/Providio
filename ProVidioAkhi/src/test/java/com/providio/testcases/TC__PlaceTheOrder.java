package com.providio.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.providio.pageObjects.CheckoutPage;
import com.providio.pageObjects.LoginPage;
import com.providio.pageObjects.Logout;
import com.providio.pageObjects.Navigationmenu;
import com.providio.pageObjects.ProductListingpage;
import com.providio.pageObjects.ProfilePage;
import com.providio.pageObjects.QuickShoppage;
import com.providio.pageObjects.MiniCartPage;
import com.providio.pageObjects.PaymentPage;
import com.providio.pageObjects.ReviewOrderPage;
import com.providio.pageObjects.ViewCartPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC__PlaceTheOrder extends BaseClass{

	@Test
	public void Placetheorder() throws InterruptedException
	{
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
		Thread.sleep(5000);
		
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
		
      //Navigate to the mens menu
		
		Navigationmenu n = new Navigationmenu(driver);
		
		n.clickMensMenubaritems(driver);
		logger.info("clicked menus");
		
		n.ClickMensofPants();
		logger.info("clickd submenus");
		
		//Validation mens of pants
        
//        WebElement pants = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
//       
//       String ActualTitleofpants = pants.getText();     
//       String ExpectedTitleofpants = "PANTS";
//       logger.info(pants.getText());
//       
//		if (ActualTitleofpants.equals(ExpectedTitleofpants)) {
//			
//			test.log(LogStatus.PASS, "clicked on the mens of pants");
//			logger.info("click Success Womens of pants");
//       }
//		else {
//			test.log(LogStatus.FAIL, "Click Failed");
//			logger.info("Click failed");
//		}
		
		ProductListingpage plp = new ProductListingpage(driver);
		
		plp.selectthequickshope(driver);
		logger.info("selected the quick shop");
		
		//Validation mens of pants
		
//       WebElement Quickshop = driver.findElement(By.xpath("//button[@class ='add-to-cart-global btn btn-primary']"));
//
//       String ActualTitleofquickshop = Quickshop.getText();     
//       String ExpectedTitleofquickshop = "ADD TO CART";
//       logger.info(Quickshop.getText());
//       
//		if (ActualTitleofquickshop.equals(ExpectedTitleofquickshop)) {
//			
//			test.log(LogStatus.PASS, "clicked on the mens of qucickshop");
//			logger.info("click Success mens of qucickshop");
//       }
//		else {
//			test.log(LogStatus.FAIL, "Click Failed");
//			logger.info("Click failed");
//		}
		
		QuickShoppage qs = new QuickShoppage(driver);
		
		qs.selectthesize();
		logger.info("Selected the size");
		
//		pto.selectwidthDropdown();
//		logger.info("selected the width");
		
		qs.clickAddtocartbutton();
		logger.info("clicked addtocart button");
		
//		//Validation mens of pants
//		
//	       String ActualTitleofaddtothecart = driver.getTitle();  
//	       String ExpectedTitleofaddtothecart = "Men's Pants Including Khakis, Cargos, Trousers, Jeans & More | RefArch";
//	       logger.info(driver.getTitle());
//
//	       
//			if (ActualTitleofaddtothecart.equals(ExpectedTitleofaddtothecart)) {
//				
//				test.log(LogStatus.PASS, "clicked on the mens of qucickshop");
//				logger.info("click Success mens of qucickshop");
//	       }
//			else {
//				test.log(LogStatus.FAIL, "Click Failed");
//				logger.info("Click failed");
//			}
//
//		
		//minicart
		
		MiniCartPage mc = new MiniCartPage(driver);
		
		mc.clickcartbutton();
		logger.info("clicked the cart button");
		
		mc.clickviewCartButton();
		logger.info("clicked the view cart button in the minicart");
		
		//viewcart
		
		ViewCartPage vcp = new ViewCartPage(driver);
		
		Thread.sleep(10000);
		//vcp.clickCancelItem(driver);
		logger.info("Removed one item");
		Thread.sleep(10000);
		
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
			       String ExpectedTitlepaymentPage = "Customer";
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
	       String ExpectedTitlePlacetheOrder = "Customer";
	       logger.info(PlacetheOrder.getText());

			if (ActualTitleofPlacetheOrder.equals(ExpectedTitlePlacetheOrder)) {
				
				test.log(LogStatus.PASS, "Succesfully Order is Placed");
				logger.info("click Success and Order is Placed");
	       }
			else {
				test.log(LogStatus.FAIL, "Click Failed");
				logger.info("Click failed");
			}
		
		
		rop.clickonplaceorder(driver);
		Thread.sleep(10000);
		
		
		//Logoutscript
		ProfilePage pp1 = new ProfilePage(driver);
		pp1.howeraccount(driver);
		
		Logout l = new Logout(driver);
		
		
		
		logger.info("Hovered the myaccout");
		Thread.sleep(3000);
		
		l.clicklogout();
		logger.info("clicked  the logout buttton and successfully logout");
		
		
	}
	
}
