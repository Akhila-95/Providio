package com.providio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
WebDriver lDriver;
	
	public Logout(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
		//logout
		@FindBy(xpath="(//a[contains(text(), 'Logout')])[1]")
		WebElement logout;
		public void clicklogout(){
			logout.click();
		}
		
		
}
