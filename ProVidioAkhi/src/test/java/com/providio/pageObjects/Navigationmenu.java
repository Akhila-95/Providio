package com.providio.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.model.NavigatedWithinDocument;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Category;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.github.dockerjava.api.model.Driver;

import freemarker.log.Logger;

public class Navigationmenu {

WebDriver lDriver;
public Navigationmenu(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
}
	
		@FindBy(xpath="//a[@id = 'newarrivals']")
		WebElement newarrivalsMenu;
		public void clicknewarrivalssMenu(WebDriver driver) throws InterruptedException{
			
			Actions action = new Actions(driver);
	    	action.moveToElement(newarrivalsMenu).perform();
	    	Thread.sleep(5000);
		}
		
		//submensNewarrivals
		//womens
		@FindBy(xpath="//a[@id='newarrivals-womens']")
		WebElement newarrivalWomens;
		public void ClicknewarrivalofWomens() throws InterruptedException{
			Thread.sleep(1000);
			newarrivalWomens.click();
		}
		
		//mens
		@FindBy(xpath="//a[@id='newarrivals-mens']")
		WebElement newarrivalsMens;
		public void ClicknewarrivalofMens(){
			newarrivalsMens.click();
		}
			// all product in mens
//			@FindBy(css = "div.product")
//			List<WebElement> products ;
//			int numOfProducts = products.size();
//			Random rand = new Random();
//			int randomIndex = rand.nextInt(numOfProducts);
			
//			WebElement randomProduct = products.get(randomIndex);
//			public void randomProductInMens() {
//				randomProduct.click();
//				products.get(randomIndex).click();
//			}
//			
			
		

		
		//electronics
		@FindBy(xpath="//a[@id='newarrivals-electronics']")
		WebElement newarrivalElectronics;
		public void ClicknewarrivalofElectronics(){
			newarrivalElectronics.click();
		}
		
			
		//MenuWomens
		@FindBy(xpath="//a[@id = 'womens']")
		WebElement WomensMenu;
		public void clickwoMensMenubaritems(WebDriver driver) throws InterruptedException{
			
			Actions action = new Actions(driver);
	    	action.moveToElement(WomensMenu).perform();
	    	Thread.sleep(5000);
		}
		//submensWomens
		//outfilts
		@FindBy(xpath="//a[@id='womens-outfits']")
		WebElement womensOutfits;
		public void ClickwoMensofOutfits(){
			womensOutfits.click();
		}
		//clothing
		@FindBy(xpath="//a[@id='womens-clothing']")
		WebElement womensclothing;
		public void ClickwoMensofclothing(){
			womensclothing.click();
		}
		//jewelry  
		@FindBy(xpath="//a[@id='womens-jewelry']")
		WebElement womensjewelry;
		public void ClickwoMensofjewelry(){
			womensjewelry.click();
		}
		@FindBy(xpath="//a[@id='womens-accessories']")
		WebElement womensaccessories;
		public void ClickwoMensofaccessories(){
			womensaccessories.click();
		}
		//accessories
		//tops
		@FindBy(xpath="//a[@id='womens-clothing-tops']")
		WebElement womenstops;
		public void ClickwoMensofTops(){
			womenstops.click();
		}
		//dresses
		@FindBy(xpath="//a[@id='womens-clothing-dresses']")
		WebElement womenDresses;
		public void ClickwoMensofDresses(){
			womenDresses.click();
		}

		//womenjackets
		@FindBy(xpath="//a[@id='womens-clothing-jackets']")
		WebElement womensJackets;
		public void ClickwoMensofjackets(){
			womensJackets.click();
		}
		//red
		@FindBy(xpath="//a[@id='womens-clothing-feeling-red']")
		WebElement womensfeelingred;
		public void ClickwoMensofFeelingRed(){
			womensfeelingred.click();
		}
		//Earrings
		@FindBy(xpath="//a[@id='womens-jewelry-earrings']")
		WebElement womenEarrings;
		public void ClickwoMensofEarRings(){
			womenEarrings.click();
		}
		//Bracelets
		@FindBy(xpath="//a[@id='womens-jewelry-bracelets']")
		WebElement womenBracelets;
		public void ClickwoMensofBraceletss(){
			womenBracelets.click();
		}
		//necklaces
		@FindBy(xpath="//a[@id='womens-jewelry-necklaces']")
		WebElement womennecklaces;
		public void ClickwoMensofnecklaces(){
			womennecklaces.click();
		}
		//scarves
		@FindBy(xpath="//a[@id='womens-accessories-scarves']")
		WebElement womensscarves;
		public void ClickwoMensofscarves(){
			womensscarves.click();
		}
		//shoes
		@FindBy(xpath="//a[@id='womens-accessories-shoes']")
		WebElement womensshoes;
		public void ClickwoMensofshoes(){
			womensshoes.click();
		}
		//bottoms
		@FindBy(xpath="//a[@id='womens-clothing-bottoms']")
		WebElement womenbottoms;
		public void ClickwoMensofbottoms(){
			womenbottoms.click();
		}
		
        //menuMens
		@FindBy(xpath="//a[@id = 'mens']")
		WebElement Mensmenu;
		public void clickMensMenubaritems(WebDriver driver) throws InterruptedException{			
			Actions action = new Actions(driver);
	    	action.moveToElement(Mensmenu).perform();
	    	Thread.sleep(5000);
		}
	   //submenusMens
		//clothing
		@FindBy(xpath="//a[@id='mens-clothing']")
		WebElement Mensclothing;
		public void ClickMensofclothing(){
			Mensclothing.click();
		}
		//accessories
		@FindBy(xpath="//a[@id='mens-accessories']")
		WebElement Mensaccessories;
		public void ClickMensofaccessories(){
			Mensaccessories.click();
		}
		//suits
		@FindBy(xpath="//a[@id='mens-clothing-suits']")
		WebElement MensSuits;
		public void ClickMensofsuits(){
			MensSuits.click();
		}
		//jackets
		@FindBy(xpath="//a[@id='mens-clothing-jackets']")
		WebElement Mensjackets;
		public void ClickMensofJackets(){
			Mensjackets.click();
		}
		//dressShirts
		@FindBy(xpath="//a[@id='mens-clothing-dress-shirts']")
		WebElement MensShirts;
		public void ClickMensofShirts(){
			MensShirts.click();
		}
		//Shorts
		//dressShirts
		@FindBy(xpath="//a[@id='mens-clothing-shorts']")
		WebElement MensShorts;
		public void ClickMensofShorts(){
			MensShorts.click();
		}
		//pants
		//dressShirts
		@FindBy(xpath="//a[@id='mens-clothing-pants']")
		WebElement MensPants;
		public void ClickMensofPants(){
			MensPants.click();
		}
		//ties
		@FindBy(xpath="//a[@id='mens-accessories-ties']")
		WebElement Mensties;
		public void ClickMensofties(){
			Mensties.click();
		}
		
		//gloves
		@FindBy(xpath="//a[@id='mens-accessories-gloves']")
		WebElement Mensgloves;
		public void ClickMensofgloves(){
			Mensgloves.click();
		}
		//luggage
		@FindBy(xpath="//a[@id='mens-accessories-luggage']")
		WebElement Mensluggage;
		public void ClickMensofluggage(){
			Mensluggage.click();
		}
		
		
		
		//Menuelectronics
		@FindBy(xpath="//a[@id = 'electronics']")
		WebElement electronicsMenu;
		public void clickelectronicsMenu(WebDriver driver) throws InterruptedException{
			
			Actions action = new Actions(driver);
	    	action.moveToElement(electronicsMenu).perform();
	    	Thread.sleep(5000);
		}
		//submenselectronics
		//televisions
		@FindBy(xpath="//a[@id='electronics-televisions']")
		WebElement electronicsTelevisions;
		public void ClickelectronicsofTelevisions(){
			electronicsTelevisions.click();
		}
		//cameras
		@FindBy(xpath="//a[@id='electronics-digital-cameras']")
		WebElement electronicsdigitalcameras;
		public void Clickelectronicsofcameras(){
			electronicsdigitalcameras.click();
		}
		//media-players
		@FindBy(xpath="//a[@id='electronics-digital-media-players']")
		WebElement electronicsmediaplayers;
		public void Clickelectronicsofmediaplayers(){
			electronicsmediaplayers.click();
		}
		//gps-units
		@FindBy(xpath="//a[@id='electronics-gps-units']")
		WebElement electronicsGpsUnits;
		public void ClickelectronicsofGpsUnits(){
			electronicsGpsUnits.click();
		}
		//gaming
		@FindBy(xpath="//a[@id='electronics-gaming']")
		WebElement electronicsgaming;
		public void ClickelectronicsofGaming(){
			electronicsgaming.click();
		}
		
		
		//MenuTopseller
		@FindBy(xpath="//a[@id = 'top-seller']")
		WebElement Topseller;
		public void clickTopsellerMenu(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", Topseller);
	    	Thread.sleep(5000);
	    	//Topseller.click();
		}
		
		public void randomMenu(WebDriver driver) throws InterruptedException {
			
			//listing the navigation menu
			 List<WebElement>  navigationMenu = driver.findElements(By.xpath("//a[@class='nav-link dropdown-toggle text-uppercase font-weight-bold level-1']"));
			
			 int countNavigationCategory = navigationMenu.size();
			 
			 System.out.println(countNavigationCategory);
			 
			 Random random =new Random();
			 int randomNumbermenu = random.nextInt(countNavigationCategory) + 1;
			 System.out.println( "category count "+randomNumbermenu);
			 
			 List<WebElement> elementsofdrop = driver.findElements(By.xpath("//li[@class='nav-item dropdown']["+randomNumbermenu+"]//a[@class='dropdown-link']"));
			 int countdropdown = elementsofdrop.size();
			 System.out.println(countdropdown);
			 int randomNumberitem = random.nextInt(countdropdown) +1;
			 System.out.println(randomNumberitem);
			
			 //hovering the menu 
			 WebElement NavigationRandomMenu = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle text-uppercase font-weight-bold level-1'])["+randomNumbermenu+"]"));

			 Thread.sleep(5000);

			 Actions action = new Actions(driver);

			action.moveToElement(NavigationRandomMenu).perform();

			 Thread.sleep(5000);
		
			//select one item

			 

			  WebElement NavigationRandomMenuitem = driver.findElement(By.xpath("(//a[@class='dropdown-link'])["+randomNumberitem+"]"));

			  JavascriptExecutor js = (JavascriptExecutor) driver;

			  js.executeScript("arguments[0].click();", NavigationRandomMenuitem);

			  Thread.sleep(5000);

			
			  List<WebElement> randomProducts=driver.findElements(By.xpath("//div[@class='product']"));
			  
			  int countProduct =randomProducts.size();
			  System.out.println("nO OF PRODUCTS " +countProduct);
			  int randomProductCount = random.nextInt(countProduct) + 1;
			  System.out.println("the index value OF product " +randomProductCount);
			  Thread.sleep(5000);
			
			   WebElement element = randomProducts.get(randomProductCount);
			 
			  js.executeScript("arguments[0].click();", element);
			
			  
		}
	
		public void NavigatingToAllCategories(WebDriver driver) throws InterruptedException {
			
			 List<WebElement>  navigationMenu = driver.findElements(By.xpath("//a[@class='nav-link dropdown-toggle text-uppercase font-weight-bold level-1']"));
		
			 int countNavigationMenu =navigationMenu.size();
			 System.out.println("Total num of main menus "+countNavigationMenu);
			 for(int i=1;i<=countNavigationMenu;i++) {
				 
				 Thread.sleep(2000);
				 WebElement EachNavigationMenu = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle text-uppercase font-weight-bold level-1'])["+i+"]"));
				 String textOfEachMainCategory=EachNavigationMenu.getText();
				 System.out.println("Entered into "+textOfEachMainCategory);
				 Thread.sleep(5000);
				 Actions action = new Actions(driver);
				 action.moveToElement(EachNavigationMenu).perform();
				 Thread.sleep(5000);
					 List<WebElement> elementsofdrop = driver.findElements(By.xpath("//li[@class='nav-item dropdown']["+i+"]//a[@class='dropdown-link']"));
					
					 int countOfSubMenu =elementsofdrop.size();
					 System.out.println("count of sub menu "+countOfSubMenu);
					//select one sub category
					 for(int j=1;j<=countOfSubMenu;j++) {
					  WebElement navigation = driver.findElement(By.xpath("(//a[@class='dropdown-link'])["+j+"]"));
					  String textOfEachSubCategory =navigation.getText();
					  System.out.println(textOfEachSubCategory);

					  JavascriptExecutor js = (JavascriptExecutor) driver;

					  js.executeScript("arguments[0].click();", navigation);

					  Thread.sleep(5000);
						 //product in plp
						 WebElement parentElement = driver.findElement(By.xpath("//div[@itemid='#product']"));
						 List<WebElement> randomProducts= parentElement.findElements(By.xpath("//div[@class='product']"));
						 int countProduct =randomProducts.size();
						 System.out.println("nO OF PRODUCTS " +countProduct);
						 
						for(int k=1;k<=3;k++) {
							Thread.sleep(3000);	
							WebElement	eachProductInPlp =driver.findElement(By.xpath("//div[@class='product'] ["+k+"]"));
							System.out.println("clicked on product " +k);
							((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",eachProductInPlp);	
							//if (driver.findElement(By.xpath("//div[@class='product'] ["+i+"]")).equals(eachProductInPlp)) {
							Thread.sleep(3000);
							eachProductInPlp.click();
										WebElement LocatorOfProductName=driver.findElement(By.xpath("//h1[@class='product-name hidden-sm-down']"));
										String productName=LocatorOfProductName.getText();
										System.out.println("clicked on " +productName+"named product");
										
										
										ProductDescriptionPage pdp=new ProductDescriptionPage(driver);
										Thread.sleep(1000);
										//out of stock :for message as item not avaialble
										if (driver.findElements(By.xpath ("//div[text()='This item is currently not available']" )).size()!=0) {
								 			WebElement itemNotAvailablElement= driver.findElement(By.xpath("//div[text()='This item is currently not available']"));
											String itemNotAvailablElementText =itemNotAvailablElement.getText();
											System.out.println("The product is out of stock so it showing "  +itemNotAvailablElementText);
								 			
											pdp.clickOnBreadCrumbs(driver);
											System.out.println("clicked on breadcrumbs");
											
										}
										else {
											pdp.clickOnSize(driver);
											
											pdp.clickOnWidth(driver);
								
											pdp.clickcartbutton(driver);
										//	driver.navigate().back();
											pdp.clickOnBreadCrumbs(driver);
											System.out.println(" clicked on breadcrumbs");
											Thread.sleep(2000);
										}
										
										}
					
			 }
					
		}
			 
			
			
			 
		
				}
			
			
			
		
	
}


