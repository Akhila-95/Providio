package com.providio.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewOrderPage {
	
WebDriver lDriver;
	
	public ReviewOrderPage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath ="//button[contains(text(), 'Place Order')]")
	WebElement placetheorder;
    public void clickonplaceorder(WebDriver driver) throws InterruptedException {	 
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	WebElement clikconplace = wait.until(ExpectedConditions.elementToBeClickable(placetheorder));		
    	clikconplace.click();
    }
    
	@FindBy(xpath ="//button[contains(text(), 'Place Order')]")
	WebElement placetheorderwithJsExuter;
    public void clickonplaceorderwithJsExuter(WebDriver driver) throws InterruptedException {	 
    	JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", placetheorderwithJsExuter);
    }


    //to track the order id
    @FindBy(xpath="//span[contains(@class, 'summary-details order-number')]")
    WebElement orderID;
    public void trackTheOrderId() {
		
    	System.out.println("Thank you for your order");
    	System.out.println("Order Number "+orderID);
    	
	}
}
