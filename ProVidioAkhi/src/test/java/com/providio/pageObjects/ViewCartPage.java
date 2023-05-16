package com.providio.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ViewCartPage {
	
WebDriver lDriver;
	
	public ViewCartPage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	//Checkout
	@FindBy(xpath="//a[@class ='btn btn-primary btn-block checkout-btn ']")
	WebElement Checkout;
	public void clickCheckout() throws InterruptedException{
		
		Checkout.click();	
        Thread.sleep(5000);
	}
	
	//Removeitem	
	@FindBy(xpath="(//button[@class ='remove-btn-lg cart-delete-confirmation-btn btn btn-light'])[1]")
	WebElement CancelItem;
	public void clickCancelItem(WebDriver driver) throws InterruptedException{	
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", CancelItem);
        Thread.sleep(5000);
	}
			

	
	//total price
	 double totalPrice = 0;
	 @FindBy(xpath ="//div[contains(@class, 'pricing line-item-total-price-amount item-total-')]")
	 List<WebElement> totalPriceText;
	 
	 public void totalPrice() {
	 for (WebElement priceElement :  totalPriceText) {
		 String priceText =priceElement.getText();
		 String[] parts = priceText.split("\\$");
		 String priceValue = parts[1];
		 totalPrice += Double.parseDouble(priceValue);
		 
	 }
	 	System.out.println("total price of all product "+ totalPrice);
	 }
	 @FindBy(xpath = "//span[@class='sub-total']")
	 WebElement subTotalLocator;
	
	 
	 public void subTotal () {
		 
		 String subTotal=subTotalLocator.getText();
		 System.out.println(subTotal);
		 String[] subTotalParts = subTotal.split("\\$");
		  double subTotalValue = Double.parseDouble(subTotalParts[1]);
		  if (totalPrice==subTotalValue) {
			
			  System.out.println("Total price reflected in subtotal ");
		}
		  else {
			System.err.println("Total price not reflected to sub total");
		}
		
	 }
	 
}

