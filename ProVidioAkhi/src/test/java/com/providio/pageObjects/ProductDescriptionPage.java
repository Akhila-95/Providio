package com.providio.pageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.checkerframework.checker.i18nformatter.qual.I18nFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

public class ProductDescriptionPage {

	WebDriver ldriver;
	
	public ProductDescriptionPage(WebDriver rdriver ){	
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
//to  select product 1
@FindBy(xpath = "//img[@alt='Washable Wool Classic Straight Skirt']")
WebElement product1;

public void clickOnProduct1() throws InterruptedException{	
	
	Thread.sleep(2000);
	 product1.click();
	 Thread.sleep(2000);
	
}


    /* 
	//nvaigate through breadcrumbs
	//xapth for all breadcrumbs
	@FindBy(xpath ="(//ol[@class='breadcrumb mb-0']//a[ contains(text(),'Womens')])[1]" )
	WebElement allBreadCrumbs;
	
	
	public void clickOnBreadCrumbs(WebDriver driver) throws InterruptedException
	{
//		List<WebElement> breadcrumbItems = allBreadCrumbs.findElements(By.className( ".breadcrumb-item"));
//		Thread.sleep(2000);
		Actions actions =new Actions(driver);
		actions.moveToElement(allBreadCrumbs);
		allBreadCrumbs.click();
//		for (WebElement breadcrumbItem : breadcrumbItems) {
//		   
//		    breadcrumbItem.click(); // or perform other actions on the item
//		}
		
	}
	*/
	
	//count the images
//	int count = 0;
//	public int countElementsWithSameClassName(WebDriver driver, String className) {
//	    List<WebElement> elements = driver.findElements(By.className("slick-paging-image-container"));
//	    
//	    for (WebElement element : elements) {
//	        count++;
//			 System.out.println(count);
//
//	    }
//	    return count;
//	
//	}
	
	//forleftCarousel
			@FindBy(xpath = "//button[@class='slick-prev slick-arrow']")
			WebElement leftCarousel;
			
			public void clickOnLeftCarousel(WebDriver driver) throws InterruptedException
			{
					leftCarousel.click();
					Thread.sleep(2000);
					leftCarousel.click();
					Thread.sleep(2000);
			}	
			
		
	//forrightCarousel
			@FindBy(xpath = "//button[@class='slick-next slick-arrow']")
			WebElement rightCarousel;
			public void clickOnRightCarousel(WebDriver driver) throws InterruptedException {
				
					rightCarousel.click();
					Thread.sleep(2000);
					rightCarousel.click();
					Thread.sleep(2000);
			}
     //write a review at top
			@FindBy(xpath = "(//a[@class='pr-snippet-write-review-link pr-underline'])[1]")
			WebElement writeAReviewAtTop;
			public void clickOnWriteAReviewAtTop() throws InterruptedException {
				
				writeAReviewAtTop.click();
				Thread.sleep(3000);
			}
//in write a rwview page
			//for rating
			@FindBy(xpath = "//span[contains(@class, 'pr-accessible-text')]")
			WebElement rating1;
			public void clickOnRating(WebDriver driver) throws InterruptedException {
				
				if (rating1.isEnabled()) {
					JavascriptExecutor js = (JavascriptExecutor)driver;
					 js.executeScript("arguments[0].click();", rating1);
					
				} else {
				    System.out.println("Element is disabled");
				}
				 
				
			
				 
			}
			//for review headline
			@FindBy(xpath = "//input[@name='Review Headline']")
			WebElement reviewHeadline;
			
			public void clickOnReviewHeadline(WebDriver driver, String headline) throws InterruptedException {
				
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", reviewHeadline);
				 reviewHeadline.sendKeys( headline);
				 Thread.sleep(3000);
				
			}
			//for commemnts
			@FindBy(xpath = "//textarea[@id='pr-comments-input']")
			WebElement comments;
			public void clickOnComments(String comment) throws InterruptedException {
				comments.sendKeys(comment);
				Thread.sleep(3000);
			}
			//bottom line for yes
			@FindBy(xpath = "//label[text()='Yes, I would recommend this to a friend']")
			WebElement forYes;
			public void clickOnYes() throws InterruptedException {
				forYes.click();
				Thread.sleep(2000);
			}
			
			//bottom line for no
			@FindBy(xpath = "//input[@id='pr-plF1ZjMbk-PpfQ1jg06AR1']")
			WebElement forNo;
			public void clickOnNo() throws InterruptedException {
				forYes.click();
				Thread.sleep(2000);
			}
			//nickname
			@FindBy(xpath = "//input[@id='pr-name-input']")
			WebElement nickName;
			public void clicknickName(String name) throws InterruptedException {
				nickName.sendKeys(name);
				Thread.sleep(5000);
			}
			//location
			@FindBy(xpath = "//input[@id='pr-location-input']")
			WebElement location;
			public void clickOnLoc(String loc) throws InterruptedException  {
				location.sendKeys(loc);
				Thread.sleep(4000);
			}
			//submitreview
			@FindBy(xpath = "//button[@type='submit' and text()='Submit Review']")
			WebElement submitReview;
			
			public void clickOnSubmitReview(WebDriver driver) throws InterruptedException {
				
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();",submitReview);
				 Thread.sleep(4000);
				 driver.navigate().back();
			}
			
			
			
			  
			//to select size
			
		
			  
			public void clickOnSize(WebDriver driver) throws InterruptedException {
				if (driver.findElements(By.xpath ("//select[@id='size-null']" )).size()!=0) {
					System.out.println("size element is found");
					WebElement sizeDropDown=driver.findElement(By.xpath ("//select[@id='size-null']" ));
					Thread.sleep(2000);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click();", sizeDropDown);
					
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='size-null']/option")));
					
					List<WebElement> sizeOptions=driver.findElements(By.xpath("//select[@id='size-null']/option"));
					int sizeCount = sizeOptions.size();
					System.out.println("The avaible sizes count is" +sizeCount);
					int randomIndex = (int) (Math.random() * sizeOptions.size());
					//Random random = new Random();
					//int randomIndex = random.nextInt(sizeCount)+1;
					WebElement randomSize = sizeOptions.get(randomIndex);
				    randomSize.click();
				    System.out.println("size selected");
					
				}
				else {
					System.out.println(" No size element is  found");
				}
				
			}
			
			//to select width
			
		
			public void clickOnWidth(WebDriver driver) throws InterruptedException {
				
				
					if (driver.findElements(By.xpath ("//select[@id='width-null']" )).size()!=0) {
						System.out.println("width element is found");
						WebElement widthDropDown=driver.findElement(By.xpath ("//select[@id='width-null']" ));
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("arguments[0].click();",  widthDropDown);
						List<WebElement> widthOptions=driver.findElements(By.xpath("//select[@id='width-null']/option"));
						int sizeCount = widthOptions.size();
						Random random = new Random();
						int randomIndex = random.nextInt(sizeCount)+1;
						WebElement randomWidth= widthOptions.get(randomIndex);
						randomWidth.click();
					}
					else {
						System.out.println(" No width element is  found");
					}
				
			}
			
			// breadcrumbs
			public void clickOnBreadCrumbs(WebDriver driver)  {
				
			List<WebElement> breadcrumbs=driver.findElements(By.xpath("//div[@class='product-breadcrumb col-12 col-sm-8']/div/ol/li/a"));
			int countOfBreadCrumbs =breadcrumbs.size();
			//System.out.println("the no of breadcrumbs are "  +countOfBreadCrumbs);
			
			
				 WebElement eachBreadcrumb=	driver.findElement(By.xpath("(//div[@class='product-breadcrumb col-12 col-sm-8']/div/ol/li/a)[2]"));
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("arguments[0].click();",  eachBreadcrumb);
			}
			//increase the quantity
			@FindBy(xpath="//span[@class='qty-plus']")
			WebElement increaseTheQuantity;
			public void clickInIncreaseQuantity() throws InterruptedException {
				
						increaseTheQuantity.click();
						Thread.sleep(2000);
						increaseTheQuantity.click();
						Thread.sleep(2000);
			
			}		
			//decrease the qunatity
			@FindBy (xpath="//span[@class='qty-minus']")
			WebElement decreaseTheQunatity;
			public void clickOndecreaseTheQunatity() throws InterruptedException {
				
				decreaseTheQunatity.click();
				Thread.sleep(2000);
				decreaseTheQunatity.click();
				Thread.sleep(2000);
			}
			
		//wishlist from pdp
			@FindBy(xpath="//button[@type='submit' and span[text()='Wishlist']]")
			WebElement wishlist;
			public void clickOnWishlist() throws InterruptedException {
				Thread.sleep(2000);
				wishlist.click();
			}
			
			
		//to find the store
			@FindBy(xpath="//span[contains(text(),'Find a Store')]")
			WebElement findAStore;
			public void clickOnStore(WebDriver driver) throws InterruptedException {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", findAStore);
				 Thread.sleep(2000);
				
			}
		//zip code or postal code
			@FindBy(id = "store-postal-code")
			WebElement zipCodeInStore;
			public void clickOnZipCode(String zipcodeStore) {
				zipCodeInStore.sendKeys(zipcodeStore);
			}
			
		//radius in fina a store
			@FindBy(id="radius")
			WebElement radius;
			public void clickOnRadius() {
				Select selectRadius = new Select(radius);
				selectRadius.selectByIndex(1);
			}
		//click on find stores
			@FindBy(xpath="//button[contains(text(),'Find Stores')]")
			WebElement findStores;
			public void clickOnFindStores() throws InterruptedException {
				
				findStores.click();
				Thread.sleep(2000);
			}
		//close the find stores
		/*	@FindBy(xpath="(//span[@aria-hidden='true' and text()='×'])[1]")
			WebElement closeFindStore;
			public void clickOnCloseFindStore(WebDriver driver ) throws InterruptedException {
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();",  closeFindStore);
				
			}*/
			@FindBy(xpath = "//div[@id='findInStoreModal']")
			WebElement closeFindStore;
			
			public void clickOnCloseFindStore(WebDriver driver ) throws InterruptedException {
				Thread.sleep(2000);
				closeFindStore.click();
			}
		//social media
			//pin interest
			@FindBy(xpath="//i[@class='fa fa-pinterest']")
			WebElement pinterest;
			public void clickOnPinterest() throws InterruptedException {
				Thread.sleep(1000);
				pinterest.click();
			}
			
			//facebook
			@FindBy(xpath="//i[@class='fa fa-facebook-official']")
			WebElement facebook;
			public void clickOnFacebook() throws InterruptedException {
				Thread.sleep(1000);
				 facebook.click();
			}
			
			//twitter
			@FindBy(xpath="(//i[@class='fa fa-twitter'])[1]")
			WebElement twitter;
			public void clickOntwitter() throws InterruptedException {
				Thread.sleep(1000);
				twitter.click();
			}
			
			//link
			@FindBy(xpath="//i[@class='fa fa-link']")
			WebElement link;
			public void clickOnLink() throws InterruptedException {
				Thread.sleep(1000);
				link.click();
			}
			
			//write a review at bottom
			@FindBy(xpath="(//a[contains(text(),'Write the First Review')])[2]")
			WebElement writeAReviewAtBottom;
			public void clickOnwriteAReviewAtBottom() {
				writeAReviewAtBottom.click();
			}
			
	//to select addtocart
	//cartbutton
			public void clickcartbutton(WebDriver driver) throws InterruptedException{
			if (driver.findElements(By.xpath("//button[@class ='add-to-cart btn btn-primary flex-grow-1']")).size()!=0) {
				
				WebElement cartButtonElement =driver.findElement(By.xpath("//button[@class ='add-to-cart btn btn-primary flex-grow-1']"));
					 Thread.sleep(5000);
					 JavascriptExecutor js = (JavascriptExecutor)driver;
					 js.executeScript("arguments[0].click();",cartButtonElement);
					 Thread.sleep(2000);
					 if (cartButtonElement.isEnabled()) {
						 System.out.println("product added to cart");
					}
					
					 
			}
			//ADD ALL TO CART BUTTON
			else if (driver.findElements(By.xpath("//button[@class='add-to-cart-global btn btn-primary' ]")).size()!=0) {
				WebElement addAllToCartElement=driver.findElement(By.xpath("//button[@class='add-to-cart-global btn btn-primary' ]"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();",addAllToCartElement);
				 System.out.println("products added to cart");
			}
			else {
				System.out.println("cart button is disabled because is product is out of stock");
			}
			}
}
