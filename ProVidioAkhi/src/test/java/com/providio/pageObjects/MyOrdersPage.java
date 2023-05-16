package com.providio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {

	WebDriver lDriver;
	public MyOrdersPage(WebDriver rDriver ){
			
			lDriver=rDriver;
			PageFactory.initElements(rDriver, this);
	}
	
	
}
