package com.providio.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.providio.pageObjects.LoginPage;
import com.providio.pageObjects.Navigationmenu;
import com.providio.pageObjects.ProductListingpage;
import com.providio.pageObjects.QuickShoppage;
import com.relevantcodes.extentreports.LogStatus;

public class TC__QuickShopPage extends BaseClass{
	
	@Test
	public void QucikShop() throws InterruptedException{
		
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
	    
	    plp.selecttheResetButton();
	    logger.info("Cleard the filter");
	    
	    //plp.selectthesizes(driver);
	    logger.info("Select the sizes");
	    Thread.sleep(10000);
	    
	    plp.selectthePrice2(driver);
	    logger.info("Select the Pricerange");
	    //Thread.sleep(10000);
	    
	    plp.selectthequickshope(driver);
	    
		//Validation mens of pants
		
	       String ActualTitleofaddtothecart = driver.getTitle();  
	       String ExpectedTitleofaddtothecart = "Men's Pants Including Khakis, Cargos, Trousers, Jeans & More | RefArch";
	       logger.info(driver.getTitle());

	       
			if (ActualTitleofaddtothecart.equals(ExpectedTitleofaddtothecart)) {
				
				test.log(LogStatus.PASS, "clicked on the mens of qucickshop");
				logger.info("click Success mens of qucickshop");
	       }
			else {
				test.log(LogStatus.FAIL, "Click Failed");
				logger.info("Click failed");
			}
	    
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
		
		qs.clickPdpPageView();
		logger.info("Clicked on the view page");
		
//		qs.clickAddtocartbutton();
//		logger.info("clicked addtocart button");
		
		qs.clickAddtocartbuttoninplp();
		logger.info("clicked addtocart button");
		

	}

}
