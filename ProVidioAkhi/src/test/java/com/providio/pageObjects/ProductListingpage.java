package com.providio.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingpage {
WebDriver lDriver;


	public ProductListingpage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	
	 
	  //color
	  //beige
		@FindBy(xpath ="//span[@id ='swatch-circle-beige-assistive']")
		WebElement colorBeige;
		public void selectthecolorBeige(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
	        js.executeScript("arguments[0].click();", colorBeige);
			//colorBeige.click();
	    	Thread.sleep(3000);
		}
		//black
		@FindBy(xpath ="//span[@id ='swatch-circle-black-assistive']")
		WebElement colorblack;
		public void selectthecolorBlack(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
	        js.executeScript("arguments[0].click();", colorblack);
	    	Thread.sleep(3000);
		}
		//blue
		@FindBy(xpath ="//span[@id ='swatch-circle-blue-assistive']")
		WebElement colorblue;
		public void selectthecolorBlue(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorblue);
	    	Thread.sleep(3000);
		}
		//navy
		@FindBy(xpath ="//span[@id ='swatch-circle-navy-assistive']")
		WebElement colornavy;
		public void selectthecolorBavy(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colornavy);
	    	Thread.sleep(3000);
		}
		//brown
		@FindBy(xpath ="//span[@id ='swatch-circle-brown-assistive']")
		WebElement colorbrown;
		public void selectthecolorbrown(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorbrown);
	    	Thread.sleep(3000);
		}
		//green
		@FindBy(xpath ="//span[@id ='swatch-circle-green-assistive']")
		WebElement colorgreen;
		public void selectthecolorgreen(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorgreen);
	    	Thread.sleep(3000);
		}
		//grey
		@FindBy(xpath ="//span[@id ='swatch-circle-grey-assistive']")
		WebElement colorgrey;
		public void selectthecolorgrey(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorgrey);
	    	Thread.sleep(3000);
		}
		//orange
		@FindBy(xpath ="//span[@id ='swatch-circle-orange-assistive']")
		WebElement colororange;
		public void selectthecolororange(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colororange);

	    	Thread.sleep(3000);
		}
		//orange
		@FindBy(xpath ="//span[@id ='swatch-circle-pink-assistive']")
		WebElement colorpink;
		public void selectthecolorpink(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorpink);
	    	Thread.sleep(3000);
		}
		//purple
		@FindBy(xpath ="//span[@id ='swatch-circle-purple-assistive']")
		WebElement colorpurple;
		public void selectthecolorpurple(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorpurple);
	    	Thread.sleep(3000);
		}
		//red
		@FindBy(xpath ="//span[@id ='swatch-circle-red-assistive']")
		WebElement colorred;
		public void selectthecolorred(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorred);
	    	Thread.sleep(3000);
		}
		//white
		@FindBy(xpath ="//span[@id ='swatch-circle-white-assistive']")
		WebElement colorwhite;
		public void selectthecolorwhite(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorwhite);
	    	Thread.sleep(3000);
		}
		//yellow
		@FindBy(xpath ="//span[@id ='swatch-circle-yellow-assistivee']")
		WebElement coloryellow;
		public void selectthecoloryellow(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", coloryellow);

	    	Thread.sleep(3000);
		}
		//miscellaneous
		@FindBy(xpath ="//span[@id ='swatch-circle-miscellaneous-assistive']")
		WebElement colormiscellaneous;
		public void selectthecolormiscellaneous(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", colorblack);
			colormiscellaneous.click();
	    	Thread.sleep(3000);
		}
		
		//newArrival
		@FindBy(xpath ="//span[@class = 'refinement-value ' and contains(text(), 'New Arrival')]")
		WebElement NewArrivals;
		public void selecttheNewArrivals() throws InterruptedException{
			NewArrivals.click();
	    	Thread.sleep(3000);
		}
		
		//Sizes
		@FindBy(xpath ="(//span[@class='size-btn'])[3]")
		WebElement sizes;
		public void selectthesizes(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
	        js.executeScript("arguments[0].click();", sizes);
	    	Thread.sleep(3000);
		}
		
		//price1
		@FindBy(xpath ="//input[@id ='priceRefinement-1']")
		WebElement Price1;
		public void selectthePrice1(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", Price1);	
	    	Thread.sleep(3000);
		}
		//price2
		@FindBy(xpath ="//input[@id ='priceRefinement-2']")
		WebElement Price2;
		public void selectthePrice2(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", Price2);
	    	Thread.sleep(3000);
		}
		//price3
		@FindBy(xpath ="//input[@id ='priceRefinement-3']")
		WebElement Price3;
		public void selectthePrice3(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", Price3);
	    	Thread.sleep(3000);
		}
		//price4
		@FindBy(xpath ="//input[@id ='priceRefinement-4']")
		WebElement Price4;
		public void selectthePrice4(WebDriver driver) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].click();", Price4);
	    	Thread.sleep(3000);
		}
		
		//filters
		@FindBy(xpath ="//select[@name = 'sort-order']")
		WebElement Filters;
		public void selecttheFilters(int i) throws InterruptedException{		
			Select countrySelect = new Select(Filters);
	        countrySelect.selectByIndex(i);
	        Thread.sleep(1000);
			Filters.click();
	    	Thread.sleep(3000);
		}
		
		//FilterResetButton
		@FindBy(xpath ="//button[@class = 'reset btn p-0']")
		WebElement ResetButton;
		public void selecttheResetButton() throws InterruptedException{
			ResetButton.click();
	    	Thread.sleep(3000);
		}
		
		//WishList
		@FindBy(xpath ="(//a[@title= 'Wishlist'])[1]")
		WebElement WishlistPlp;
		public void selecttheWishlist() throws InterruptedException{
			WishlistPlp.click();
	    	Thread.sleep(3000);
		}
		
		//quickshop
				@FindBy(xpath ="(//a[@title='Quick Shop'])[1]")
				WebElement Quickshop;
				public void selectthequickshope(WebDriver driver) throws InterruptedException{
					Actions action = new Actions(driver);
					action.moveToElement(Quickshop).perform();
			    	Quickshop.click();
			    	Thread.sleep(3000);
				}
				
				//select one item
		
				@FindBy(xpath ="(//a[@class = 'link'])[1]")
				WebElement selectItem;
				public void selectItemformPLP() throws InterruptedException{
					selectItem.click();
					Thread.sleep(3000);
				}
				
				//Scroll downfull 
				public void scrolldownfull(WebDriver driver) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
			        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
				}
				
				//Scroll downmedium
				public void scrollmedium(WebDriver driver) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					Long windowHeight = (Long) js.executeScript("return window.innerHeight;");
					js.executeScript("window.scrollTo(0, " + (windowHeight / 2) + ");");
				}
				//Scroll upmedium 
				public void scrollupmedium(WebDriver driver) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					Long windowHeight = (Long) js.executeScript("return window.innerHeight;");
					js.executeScript("window.scrollTo(0, -" + (windowHeight / 2) + ");");
				}
				//Scroll upfull 
				public void scrollupfull(WebDriver driver) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollTo(0, 0);");
				}
		//add to cart
				
}
