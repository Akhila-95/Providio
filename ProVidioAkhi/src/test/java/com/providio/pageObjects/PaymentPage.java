package com.providio.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {
	
WebDriver lDriver;
	
	public PaymentPage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	       //newcarddropdown
			@FindBy(xpath ="//select[@id='braintreeCreditCardList']")
	        WebElement newcard;
			public void selectnewcardindropdown() throws InterruptedException {
	        Select newcardselect = new Select(newcard);
	        newcardselect.selectByIndex(0);
	        Thread.sleep(3000);
		    
			}
			//cardname
			@FindBy(xpath ="//input[@id = 'cardholder-name']")
			WebElement entercname;
		    public void setcardholdername(WebDriver driver) throws InterruptedException {	    	
		    	driver.switchTo().frame("braintree-hosted-field-cardholderName");
		    	entercname.sendKeys("Test123");
		    	driver.switchTo().defaultContent();
		    }
		    //cardnumber
			@FindBy(xpath ="//input[@id = 'credit-card-number']")
			WebElement entercnumber;
		    public void setcardnumber(WebDriver driver) throws InterruptedException {	    	
		    	driver.switchTo().frame("braintree-hosted-field-number");
		    	entercnumber.sendKeys("4111 1111 1111 1111");
		    	driver.switchTo().defaultContent();
		    }
		    //cvv
			@FindBy(xpath ="//input[@id = 'cvv']")
			WebElement entercvv;
		    public void setcardcvv(WebDriver driver) throws InterruptedException {	    	
		    	driver.switchTo().frame("braintree-hosted-field-cvv");
		    	entercvv.sendKeys("789");
		    	driver.switchTo().defaultContent();
		    }
		    //exp
			@FindBy(xpath ="//input[@id = 'expiration']")
			WebElement enterexp;
		    public void setcardexp(WebDriver driver) throws InterruptedException {	    	
		    	driver.switchTo().frame("braintree-hosted-field-expirationDate");
		    	enterexp.sendKeys("1230");
		    	driver.switchTo().defaultContent();
		    }
		    
		    //savecardbutton
			@FindBy(xpath ="//input[@id='braintreeSaveCreditCard']")
			WebElement savebutton;
		    public void unchecksavecard(WebDriver driver) throws InterruptedException {	    	
		    	JavascriptExecutor js = (JavascriptExecutor) driver;
		    	js.executeScript("arguments[0].click();", savebutton);	
		    }
		    //clickonrevieworder
		    @FindBy(xpath ="//button[@class = 'btn btn-primary btn-block submit-payment' and @name ='submit']")
			WebElement revieworder;
		    public void clickonrevieworder(WebDriver driver) throws InterruptedException {	    	
//		    	JavascriptExecutor js = (JavascriptExecutor) driver;
//		    	js.executeScript("arguments[0].click();", revieworder);
		    	
		    	revieworder.click();
		        Thread.sleep(3000);
		    	
		    }

}
