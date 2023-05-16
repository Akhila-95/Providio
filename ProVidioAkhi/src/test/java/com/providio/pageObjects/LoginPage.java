package com.providio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver lDriver;
	
	public LoginPage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
		@FindBy(xpath="//span[contains(text(), 'Sign In')]")
		WebElement signIn;
		public void clickSign() 
		{
			signIn.click();
		}
		
		@FindBy(name="loginEmail")
		WebElement email;
		public void setEmail(String name )
		{
			email.sendKeys(name);
		}
		
		@FindBy(name="loginPassword")
		WebElement Password;
		public void setPassword(String password )
		{
			Password.sendKeys(password);
		}
		
		@FindBy(xpath="//button [contains(text(), 'Login')]")
		WebElement btnLogin;
		public void clickSubmit( ) throws InterruptedException
		{
			btnLogin.click();
			Thread.sleep(10000);
		}
        //Home page return
		@FindBy(xpath = "//img[@class='logo']")
		WebElement forHomePage;
		public void clickOnLogo() throws InterruptedException {
			Thread.sleep(5000);
			forHomePage.click();
			
		}
		
}	