package com.providio.testcases;

import java.util.Iterator;
import java.util.List;

import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.pageObjects.CheckoutPage;
import com.providio.pageObjects.LoginPage;
import com.providio.pageObjects.MiniCartPage;
import com.providio.pageObjects.Navigationmenu;
import com.providio.pageObjects.PaymentPage;
import com.providio.pageObjects.ProductDescriptionPage;
import com.providio.pageObjects.ReviewOrderPage;
import com.providio.pageObjects.ViewCartPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC__NavigationMenusAll extends BaseClass{
	Navigationmenu NM = new Navigationmenu(driver);
	@Test(dependsOnMethods = "com.providio.testcases.TC_Login.VerifyLoginWithInValidCredentials")
	public void Navigation() throws InterruptedException {
	
	if (isLoggedIn=true) {
	
		NM.NavigatingToAllCategories(driver);
		
		//minicart
		 MiniCartPage miniCartPage= new  MiniCartPage(driver);
		 miniCartPage.clickcartbutton();
		 miniCartPage.clickviewCartButton();
		 
		 //view cart
		 ViewCartPage viewCartPage =new ViewCartPage(driver);
		 viewCartPage.totalPrice();
		 logger.info("total price of all produts");
		 viewCartPage.subTotal();
		 logger.info("subtotal pf all products ");
		 viewCartPage.clickCheckout();
		 
		//validation for cost of products
		
		 
		//span[@class='sub-total']
	
		 //checkout
		 CheckoutPage checkoutPage =new CheckoutPage(driver);
			//shipping details
		 checkoutPage.setFisrtName(fname);
			logger.info("entered fname");
			
			checkoutPage.setLastname(lname);
			logger.info("entered lname");
			
			checkoutPage.setAddress1(address);
			logger.info("entered address");
			
			checkoutPage.setCountry();
			logger.info("entered country");
			
			checkoutPage.setProvince();
			logger.info("entered state");
			
			checkoutPage.setcity(cityname);
			logger.info("entered cityname");
			
			checkoutPage.setzipCode(zipcode);
			logger.info("entered zipcode");
			
			checkoutPage.setPhone(phonenumber);
			logger.info("entered phone number");
				
			checkoutPage.clickpaymentbutton(driver);
			logger.info("Clicked on the payment button");
			
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
			
			pp.clickonrevieworder(driver);
			logger.info("ckicked on the review oreder");
			
			//revieworderpage
			
			ReviewOrderPage rop = new ReviewOrderPage(driver);
			Thread.sleep(10000);
			rop.clickonplaceorderwithJsExuter(driver);
			logger.info("successfully place the order");
			Thread.sleep(10000);
			
			rop.clickonplaceorder(driver);
			Thread.sleep(10000);
		}
	
	
		

		NM.clicknewarrivalssMenu(driver);
		logger.info("Howered Newarrival menu");
		Thread.sleep(5000);
        
        NM.ClicknewarrivalofMens();
        logger.info("Clicked on the NewArrival mens");
        Thread.sleep(5000);
        
    
        ///validation for new arrival mens
        
        WebElement NewMens = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofMens = NewMens.getText();     
        String ExpectedTitleofMens = "MENS";
        logger.info(NewMens.getText());
        
		if (ActualTitleofMens.equals(ExpectedTitleofMens)) {
			
			test.log(LogStatus.PASS, "clicked on the NewArrival of Mens");
			logger.info("click Success New arrival mens");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
       	
		
		
		
        NM.clicknewarrivalssMenu(driver);
		logger.info("Howered Newarrival menu");
		
        NM.ClicknewarrivalofWomens();
        logger.info("Clicked on the NewArrival womens");
        Thread.sleep(15000);
        
      ///validation for new arrival womens
        
        WebElement NewwoMens = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofwoMens = NewwoMens.getText();     
        String ExpectedTitleofwoMens = "WOMEN";
        logger.info(NewwoMens.getText());
        
		if (ActualTitleofwoMens.equals(ExpectedTitleofwoMens)) {
			
			test.log(LogStatus.PASS, "clicked on the NewArrival of Mens");
			logger.info("click Success New arrival womens");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
        
        NM.clicknewarrivalssMenu(driver);
		logger.info("Howered Newarrival menu");
		
        NM.ClicknewarrivalofElectronics();
        logger.info("Clicked on the NewArrival electronics");
        Thread.sleep(5000);
        
        ///validation for new arrival Electronics
        
        WebElement NewElectronics = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofElectronics = NewElectronics.getText();     
        String ExpectedTitleofElectronics = "ELECTRONICS";
        logger.info(NewElectronics.getText());
        
		if (ActualTitleofElectronics.equals(ExpectedTitleofElectronics)) {
			
			test.log(LogStatus.PASS, "clicked on the NewArrival of Electronics");
			logger.info("click Success New arrival Electronics");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
        
        //Womens
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        Thread.sleep(5000);
        //clothing
        NM.ClickwoMensofOutfits();
        logger.info("Clicked womens of outfits");
        Thread.sleep(5000);
        
       ///validation for  womens outfits
        
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
        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        NM.ClickwoMensofTops();
        logger.info("Clicked womens of tops");
        Thread.sleep(5000);
        
        //Validation womens of Tops
         WebElement tops = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleoftops = tops.getText();     
        String ExpectedTitleoftops = "TOPS";
        logger.info(tops.getText());
        
		if (ActualTitleoftops.equals(ExpectedTitleoftops)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of tops");
			logger.info("click Success Womens of tops");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        NM.ClickwoMensofDresses();
        logger.info("Clicked womens of dresses");
        Thread.sleep(5000);

     //Validation womens of Dresses
         WebElement Dresses = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofDresses = Dresses.getText();     
        String ExpectedTitleofDresses = "DRESSES";
        logger.info(Dresses.getText());
        
		if (ActualTitleofDresses.equals(ExpectedTitleofDresses)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of Dresses");
			logger.info("click Success Womens of Dresses");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        NM.ClickwoMensofbottoms();
        logger.info("Clicked womens of bottoms");
        Thread.sleep(5000);

    //Validation womens of bottoms
         WebElement bottoms = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofbottoms = bottoms.getText();     
        String ExpectedTitleofbottoms = "BOTTOMS";
        logger.info(bottoms.getText());
        
		if (ActualTitleofbottoms.equals(ExpectedTitleofbottoms)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of bottoms");
			logger.info("click Success Womens of bottoms");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
        

        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        NM.ClickwoMensofjackets();
        logger.info("Clicked womens of jackets");
        Thread.sleep(5000);
        
      //Validation womens of Jackets
         WebElement Jackets = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofJackets = Jackets.getText();     
        String ExpectedTitleofJackets = "JACKETS & COAT";
        logger.info(Jackets.getText());
        
		if (ActualTitleofJackets.equals(ExpectedTitleofJackets)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of Jackets");
			logger.info("click Success Womens of Jackets");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        NM.ClickwoMensofFeelingRed();
        logger.info("Clicked womens of red");
        Thread.sleep(5000);
     //Validation womens of FeelingRed
         WebElement FeelingRed = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofFeelingRed = FeelingRed.getText();     
        String ExpectedTitleofFeelingRed = "FEELING REDS";
        logger.info(FeelingRed.getText());
        
		if (ActualTitleofFeelingRed.equals(ExpectedTitleofFeelingRed)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of FeelingRed");
			logger.info("click Success Womens of FeelingRed");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        //Jwellary
        NM.ClickwoMensofEarRings();
        logger.info("Clicked womens of earrings");
        Thread.sleep(5000);

 //Validation womens of earrings
         WebElement earrings = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofearrings = earrings.getText();     
        String ExpectedTitleofearrings = "EARRINGS";
        logger.info(earrings.getText());
        
		if (ActualTitleofearrings.equals(ExpectedTitleofearrings)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of earrings");
			logger.info("click Success Womens of earrings");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        NM.ClickwoMensofnecklaces();
        logger.info("Clicked womens of neckless");
        Thread.sleep(5000);

 //Validation womens of neckless
         WebElement neckless = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofneckless = neckless.getText();     
        String ExpectedTitleofneckless = "NECKLACES";
        logger.info(neckless.getText());
        
		if (ActualTitleofneckless.equals(ExpectedTitleofneckless)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of neckless");
			logger.info("click Success Womens of neckless");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        NM.ClickwoMensofBraceletss();
        logger.info("Clicked womens of braceletss");
        Thread.sleep(5000);

 //Validation womens of braceletss
        
         WebElement braceletss = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofbraceletss = braceletss.getText();     
        String ExpectedTitleofbraceletss = "BRACELETS";
        logger.info(braceletss.getText());
        
		if (ActualTitleofbraceletss.equals(ExpectedTitleofbraceletss)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of braceletss");
			logger.info("click Success Womens of braceletss");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        //Acceries
        NM.ClickwoMensofscarves();
        logger.info("Clicked womens of scarves");
        Thread.sleep(5000);

 //Validation womens of scarves
        
         WebElement scarves = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofscarves = scarves.getText();     
        String ExpectedTitleofscarves = "SCARVES";
        logger.info(scarves.getText());
        
		if (ActualTitleofscarves.equals(ExpectedTitleofscarves)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of scarves");
			logger.info("click Success Womens of scarves");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickwoMensMenubaritems(driver);
        logger.info("Howered womens menu");
        
        NM.ClickwoMensofshoes();
        logger.info("Clicked womens of shoes");
        Thread.sleep(5000);

 //Validation womens of shoes
        
         WebElement shoes = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofshoes = shoes.getText();     
        String ExpectedTitleofshoes = "SHOES";
        logger.info(shoes.getText());
        
		if (ActualTitleofshoes.equals(ExpectedTitleofshoes)) {
			
			test.log(LogStatus.PASS, "clicked on the Womens of shoes");
			logger.info("click Success Womens of shoes");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        //Mens
        NM.clickMensMenubaritems(driver);
        logger.info("Howered mens menu");
        Thread.sleep(5000);
        
        NM.ClickMensofsuits();
        logger.info("Clicked mens of suits");
        Thread.sleep(5000);
        
  //Validation mens of suits
        
        WebElement suits = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofsuits = suits.getText();     
        String ExpectedTitleofsuits = "SUITS";
        logger.info(suits.getText());
        
		if (ActualTitleofsuits.equals(ExpectedTitleofsuits)) {
			
			test.log(LogStatus.PASS, "clicked on the mens of suits");
			logger.info("click Success mens of suits");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickMensMenubaritems(driver);
        logger.info("Howered mens menu");
        
        NM.ClickMensofPants();
        logger.info("Clicked mens of pants");
        Thread.sleep(5000);
        
  //Validation mens of pants
        
         WebElement pants = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofpants = pants.getText();     
        String ExpectedTitleofpants = "PANTS";
        logger.info(pants.getText());
        
		if (ActualTitleofpants.equals(ExpectedTitleofpants)) {
			
			test.log(LogStatus.PASS, "clicked on the mens of pants");
			logger.info("click Success Womens of pants");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
 
        
        NM.clickMensMenubaritems(driver);
        logger.info("Howered mens menu");
        
        NM.ClickMensofShirts();
        logger.info("Clicked mens of shirts");
        Thread.sleep(5000);
        
   //Validation mens of pants
        
         WebElement shirts = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofshirts = shirts.getText();     
        String ExpectedTitleofshirts = "DRESS SHIRTS";
        logger.info(shirts.getText());
        
		if (ActualTitleofshirts.equals(ExpectedTitleofshirts)) {
			
			test.log(LogStatus.PASS, "clicked on the mens of pants");
			logger.info("click Success mens of pants");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
 
        
        NM.clickMensMenubaritems(driver);
        logger.info("Howered mens menu");
        
        NM.ClickMensofJackets();
        logger.info("Clicked mens of jackets");
        Thread.sleep(5000);
        
    //Validation mens of shirts
        
         WebElement mensjackets = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofmensjackets = mensjackets.getText();     
        String ExpectedTitleofmensjackets = "JACKETS & COATS";
        logger.info(mensjackets.getText());
        
		if (ActualTitleofmensjackets.equals(ExpectedTitleofmensjackets)) {
			
			test.log(LogStatus.PASS, "clicked on the mens of jackets");
			logger.info("click Success mens of jackets");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
 
        
        NM.clickMensMenubaritems(driver);
        logger.info("Howered mens menu");
        
        NM.ClickMensofShorts();
        logger.info("Clicked mens of shortss");
        Thread.sleep(5000);

//Validation womens of shortss
        
         WebElement shortss = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofshortss = shortss.getText();     
        String ExpectedTitleofshortss = "SHORTS";
        logger.info(shortss.getText());
        
		if (ActualTitleofshortss.equals(ExpectedTitleofshortss)) {
			
			test.log(LogStatus.PASS, "clicked on the mens of shortss");
			logger.info("click Success mens of shortss");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickMensMenubaritems(driver);
        logger.info("Howered mens menu");
        
        NM.ClickMensofties();
        logger.info("Clicked mens of Ties");
        Thread.sleep(5000);

  //Validation mens of shirts
        
         WebElement Ties = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofTies = Ties.getText();     
        String ExpectedTitleofTies = "TIES";
        logger.info(Ties.getText());
        
		if (ActualTitleofTies.equals(ExpectedTitleofTies)) {
			
			test.log(LogStatus.PASS, "clicked on the mens of Ties");
			logger.info("click Success mens of Ties");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
 

         
        NM.clickMensMenubaritems(driver);
        logger.info("Howered mens menu");
        
        NM.ClickMensofgloves();
        logger.info("Clicked mens of gloves");
        Thread.sleep(5000);

//Validation womens of gloves
         WebElement gloves = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofgloves = gloves.getText();     
        String ExpectedTitleofgloves = "GLOVES";
        logger.info(gloves.getText());
        
		if (ActualTitleofgloves.equals(ExpectedTitleofgloves)) {
			
			test.log(LogStatus.PASS, "clicked on the mens of gloves");
			logger.info("click Success mens of gloves");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
 
       
        
        NM.clickMensMenubaritems(driver);
        logger.info("Howered mens menu");
        
        NM.ClickMensofluggage();
        logger.info("Clicked mens of luggage");
        Thread.sleep(5000);
        
  //Validation mens of luggage
         WebElement luggage = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofluggage = luggage.getText();     
        String ExpectedTitleofluggage = "LUGGAGE";
        logger.info(luggage.getText());
        
		if (ActualTitleofluggage.equals(ExpectedTitleofluggage)) {
			
			test.log(LogStatus.PASS, "clicked on the mens of luggage");
			logger.info("click Success mens of luggage");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
 
        
        //electronics
        NM.clickelectronicsMenu(driver);
        logger.info("Howered electronics menu");
        
        NM.Clickelectronicsofcameras();
        logger.info("Clicked electronics of cameras");
        Thread.sleep(5000);
        
        
  //Validation electronics of cameras
         WebElement cameras = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofcameras = cameras.getText();     
        String ExpectedTitleofcameras = "DIGITAL CAMERAS";
        logger.info(cameras.getText());
        
		if (ActualTitleofcameras.equals(ExpectedTitleofcameras)) {
			
			test.log(LogStatus.PASS, "clicked on the electronics of cameras");
			logger.info("click Success electronics of cameras");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}
 
        
        NM.clickelectronicsMenu(driver);
        logger.info("Howered electronics menu");
        
        NM.ClickelectronicsofGaming();
        logger.info("Clicked electronics of gaming");
        Thread.sleep(5000);
        
   //Validation electronics of gaming
         WebElement gaming = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofgaming = gaming.getText();     
        String ExpectedTitleofgaming = "GAMING";
        logger.info(gaming.getText());
        
		if (ActualTitleofgaming.equals(ExpectedTitleofgaming)) {
			
			test.log(LogStatus.PASS, "clicked on the electronics of gaming");
			logger.info("click Success electronics of gaming");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickelectronicsMenu(driver);
        logger.info("Howered electronics menu");
        
        NM.ClickelectronicsofGpsUnits();
        logger.info("Clicked electronics of gpsunits");
        Thread.sleep(5000);
  //Validation electronics of gpsunits
         WebElement gpsunits = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofgpsunits = gpsunits.getText();     
        String ExpectedTitleofgpsunits = "GPS NAVIGATION";
        logger.info(gpsunits.getText());
        
		if (ActualTitleofgpsunits.equals(ExpectedTitleofgpsunits)) {
			
			test.log(LogStatus.PASS, "clicked on the electronics of gpsunits");
			logger.info("click Success electronics of gpsunits");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickelectronicsMenu(driver);
        logger.info("Howered electronics menu");
        
        NM.Clickelectronicsofmediaplayers();
        logger.info("Clicked electronics of mediaplayers");
        Thread.sleep(5000);
  //Validation electronics of mediaplayers
        
         WebElement mediaplayers = driver.findElement(By.xpath("//h1[@class ='header page-title text-uppercase m-0 p-0']"));
        
        String ActualTitleofmediaplayers = mediaplayers.getText();     
        String ExpectedTitleofmediaplayers = "IPOD & MP3 PLAYERS";
        logger.info(mediaplayers.getText());
        
		if (ActualTitleofmediaplayers.equals(ExpectedTitleofmediaplayers)) {
			
			test.log(LogStatus.PASS, "clicked on the electronics of mediaplayers");
			logger.info("click Success electronics of mediaplayers");
        }
		else {
			test.log(LogStatus.FAIL, "Click Failed");
			logger.info("Click failed");
		}

        
        NM.clickelectronicsMenu(driver);
        logger.info("Howered electronics menu");
        
        NM.ClickelectronicsofTelevisions();
        logger.info("Clicked electronics of Televisions");
        Thread.sleep(5000);

   //Validation electronics of Televisions
        
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
        
        NM.clickTopsellerMenu(driver);
        logger.info("Howered Topsellers menu");
     
            
	
}

	private Object WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	
