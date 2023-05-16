package com.providio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuickShoppage {
	
WebDriver lDriver;
	
	public QuickShoppage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	//Select size
	@FindBy(xpath="//select[@class='custom-select form-control select-size']")
	WebElement sizeDropdown;	
	public void selectthesize() throws InterruptedException{
		Select sizeSelect = new Select(sizeDropdown);
        sizeSelect.selectByIndex(1);
        Thread.sleep(3000);
	}
	
	//selectwidth
	@FindBy(xpath="//select[@id='width-null']")
	WebElement widthDropdown;		
	public void selectwidthDropdown() throws InterruptedException{
        Select widthSelect = new Select(widthDropdown);
        widthSelect.selectByIndex(1);
        Thread.sleep(3000);
	}
	
	//Addtocartbutton
	@FindBy(xpath="//button[@class ='add-to-cart-global btn btn-primary']")
	WebElement Addtocartbutton;
	public void clickAddtocartbutton() throws InterruptedException{
		
		 Addtocartbutton.click();	
	     Thread.sleep(5000);
	}
	
	
			
	//Addtocartbutton
	@FindBy(xpath="(//button[@class = 'add-to-cart btn btn-primary flex-grow-1'])[1]")
	WebElement AddtocartButtoninPlp;
	public void clickAddtocartbuttoninplp() throws InterruptedException{
		
		AddtocartButtoninPlp.click();	
	     Thread.sleep(5000);
	}
	//BackCarosoul
	@FindBy(xpath="//button[@class ='slick-prev slick-arrow']")
	WebElement BCarasol;
	public void clickBCarasol() throws InterruptedException{
		BCarasol.click();	
	    Thread.sleep(2000);
	    BCarasol.click();	
	    Thread.sleep(2000);
	}
	//ForwardCarosoul
	@FindBy(xpath="//button[@class ='slick-next slick-arrow']")
	WebElement FCarasol;
	public void clickFCarasol() throws InterruptedException{
		FCarasol.click();	
	    Thread.sleep(2000);
	    FCarasol.click();	
	    Thread.sleep(2000);
	}
	//PlusQuantity
	@FindBy(xpath="//span[@class ='qty-plus']")
	WebElement inCreaseQuantity;
	public void clickIncQuantity() throws InterruptedException{
		inCreaseQuantity.click();	
	    Thread.sleep(2000);
	    inCreaseQuantity.click();		
	    Thread.sleep(2000);
	}
	
	//MinusQuantity
	@FindBy(xpath="//span[@class ='qty-minus']")
	WebElement MinusQuantity;
	public void clickMinusQuantity() throws InterruptedException{
		MinusQuantity.click();	
	    Thread.sleep(2000);
//	    MinusQuantity.click();		
//	    Thread.sleep(2000);
	}
	
	//CloseButton
	@FindBy(xpath="//button[@class ='close pull-right' and @type ='button']")
	WebElement CloseButton;
	public void clickCloseButton() throws InterruptedException{
		CloseButton.click();	
	    Thread.sleep(2000);

	}
	
	//PDP page view
	@FindBy(xpath="//a[@class ='full-pdp-link']")
	WebElement PdpPageView;
	public void clickPdpPageView() throws InterruptedException{
		PdpPageView.click();	
	    Thread.sleep(2000);

	}
	
	
}
