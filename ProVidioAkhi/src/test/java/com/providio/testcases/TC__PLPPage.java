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

public class TC__PLPPage extends BaseClass{
	
	@Test
	public void PlpPage() throws InterruptedException {
	
	driver.get(baseURL);
	logger.info("enterd into url");
	Thread.sleep(2000);
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
	
    
    //login validation
    
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

	
	//Navigation
	Navigationmenu NM = new Navigationmenu(driver);
	
	NM.clickwoMensMenubaritems(driver);
    logger.info("Howered womens menu");
    Thread.sleep(5000);
  //clothing
    NM.ClickwoMensofOutfits();
    logger.info("Clicked womens of outfits");
    Thread.sleep(5000);
    
  //Validation of Womens Outfits
    
    WebElement outfits = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
      
      String ActualTitleofoutfits = outfits.getText();     
      String ExpectedTitleofoutfits = "OUTFITS";
      logger.info(outfits.getText());
      
		if (ActualTitleofoutfits.equals(ExpectedTitleofoutfits)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of outfits");
			logger.info("click Success Womens of outfits");
      }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
	    
    
    ProductListingpage plp = new ProductListingpage(driver);
    
    plp.selecttheFilters(2);
    logger.info("Selected the Filter");
    
    plp.selecttheWishlist();
    logger.info("Add to the wishlist");
    Thread.sleep(10000);
    
    plp.selectthecolorBlack(driver);
    logger.info("Select the color Black");
    
    //plp.selectthesizes(driver);
    logger.info("Select the sizes");
    Thread.sleep(10000);
    
    plp.selectthePrice2(driver);
    logger.info("Select the PriceRange");
    
    plp.scrollmedium(driver);
    logger.info("Scroll medium down");
    Thread.sleep(10000);
    
    plp.selectthequickshope(driver);
    
    
    
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
	
	qs.clickCloseButton();
	logger.info("Close the item");
	
	
	plp.selectthequickshope(driver);
	
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
	
//	qs.clickAddtocartbutton();
//	logger.info("clicked addtocart button");
	
	qs.clickAddtocartbuttoninplp();
	logger.info("clicked addtocart button");
	

	
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
