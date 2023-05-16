package com.providio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniCartPage {

WebDriver lDriver;
	
	public MiniCartPage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	//cartbutton
	@FindBy(xpath="//a[@class='minicart-link']")
	WebElement CartButton;
	public void clickcartbutton() throws InterruptedException{
		Thread.sleep(3000);
        CartButton.click();	
        Thread.sleep(5000);
	}
	
	//viewCartButton
	@FindBy(xpath="//a[@class='btn  btn-block checkout-btn btn-outline-primary ']")
	WebElement viewCartButton;
	public void clickviewCartButton() throws InterruptedException{	
		viewCartButton.click();	
        Thread.sleep(3000);
	}
	
	//Checkout
	@FindBy(xpath="//a[@class ='btn btn-primary btn-block checkout-btn ']")
	WebElement Checkout;
	public void clickCheckout() throws InterruptedException{
		
		Checkout.click();	
        Thread.sleep(5000);
	}
	
}
