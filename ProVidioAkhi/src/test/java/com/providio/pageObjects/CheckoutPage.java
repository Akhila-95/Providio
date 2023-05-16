package com.providio.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
WebDriver lDriver;
	
	public CheckoutPage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	//Express delivery
	
	@FindBy(xpath ="(//span[contains(text(), 'Express')])[1]")
	WebElement Expressdelivery;
	
	public void Expressdelivery() throws InterruptedException{
		Expressdelivery.click();	
		Thread.sleep(7000);
	}
	
	//ShippingDetails
	//FirstName
	@FindBy(xpath="//input[@id='shippingFirstNamedefault']")
	WebElement FirstName;
	public void setFisrtName(String fname ){		
		FirstName.sendKeys(fname);
        
	}

	//LastName
	@FindBy(xpath="//input[@id='shippingLastNamedefault']")
	WebElement LastName;
	public void setLastname(String lname ){
		LastName.sendKeys(lname);
	}
	//Address1
	@FindBy(xpath="//input[@id='shippingAddressOnedefault']")
	WebElement Address1;
	public void setAddress1(String address ){
		Address1.sendKeys(address);
	}
	
	//city
	@FindBy(xpath="//input[@id ='shippingAddressCitydefault']")
	WebElement city;
	public void setcity(String cityname ){
		city.sendKeys(cityname);
	}	
	//Country
	@FindBy(xpath="//select[@id='shippingCountrydefault']")
	WebElement Country;
	public void setCountry() throws InterruptedException{
		 Select countrySelect = new Select(Country);
	        countrySelect.selectByIndex(1);
	        Thread.sleep(1000);
	}
	
	//Province
	@FindBy(xpath="//select[@id='shippingStatedefault']")
	WebElement Province;
	public void setProvince(){
		Select ProvinceSelect = new Select(Province);
        ProvinceSelect.selectByIndex(5);
	}
	
	//zipCode
	@FindBy(xpath="//input[@id='shippingZipCodedefault']")
	WebElement zipCode;
	public void setzipCode(String zipcode){	
		zipCode.sendKeys(zipcode);
	}
	
	//Phone
	@FindBy(xpath="//input[@id='shippingPhoneNumberdefault']")
	WebElement Phone;
	public void setPhone(String phonenumber ){
		 Phone.sendKeys(phonenumber);
	}
	
	//buttonforthepaymentpage
	@FindBy(xpath ="//button[@name ='submit' and @class ='btn btn-primary btn-block submit-shipping']")
	WebElement paymentbutton;
    public void clickpaymentbutton(WebDriver driver) throws InterruptedException {
    	
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", paymentbutton);
        Thread.sleep(5000);
    }
    
    

}
