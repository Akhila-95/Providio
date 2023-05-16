package com.providio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestLoginPage {

WebDriver lDriver;
	
	public GuestLoginPage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	//guest login  email
	@FindBy(xpath = "//input[@id='email']")
	WebElement guestmail;
	public void clickOnGuestMail(String mail) throws InterruptedException {
		guestmail.sendKeys(mail);
		Thread.sleep(2000);
	}
	//pwd
	@FindBy(xpath = "//input[@id='password']")
	WebElement guestPassword;
	public void clickOnGuestPassword( String password) throws InterruptedException {
		guestPassword.sendKeys(password);
		Thread.sleep(2000);
	}
	
	
	//click on guest checkout
	@FindBy(xpath = "//button[contains(text(),'Guest Checkout')]")
	WebElement guestCheckOut;
	public void clickOnGuestCheckOut() {
		guestCheckOut.click();
	}
	
	//click on email
	@FindBy(xpath = "//input[@id='email-guest']")
	WebElement  reEnterMailInGuest;
	public void clickOnEmail(String reEnterMail) {
		reEnterMailInGuest.sendKeys(reEnterMail);
	}
	
	//continue as guest
	@FindBy(xpath = "//button[contains(text(),' Continue as guest')]")
	WebElement continueAsGuest;
	public void clickOnContinueAsGuest() {
		continueAsGuest.click();
	}
}
