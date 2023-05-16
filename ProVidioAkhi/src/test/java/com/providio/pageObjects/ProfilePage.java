package com.providio.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage {
	
WebDriver lDriver;
	
	public ProfilePage(WebDriver rDriver ){
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	 //hower
	@FindBy(xpath="(//a[@id='myaccount' and @aria-label ='My Account'])[1]")
	WebElement myaccount;
	public void howeraccount(WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
    	action.moveToElement(myaccount).perform();
    	Thread.sleep(1000);
	}
	
	//EditButtonMyAccout
		@FindBy(xpath="(//a[contains(text(), 'My Account')])[1]")
		WebElement myAccount;
		public void clickMyAccount() throws InterruptedException{	
			myAccount.click();	
	        Thread.sleep(5000);
		}
	
	//EditButtonMyAccout
	@FindBy(xpath="//a[@class = 'btn btn-primary pull-right' and @aria-label ='Edit Profile']")
	WebElement EditPage;
	public void clickEditPage() throws InterruptedException{	
		EditPage.click();	
        Thread.sleep(5000);
	}
	
	//EditProfileInfomation
	//FirstName
	@FindBy(xpath="//input[@id='firstName']")
	WebElement FirstName;
	public void setFisrtName(String epfname ){	
		FirstName.clear();
		FirstName.sendKeys(epfname); 
	}
	//LastName
	@FindBy(xpath="//input[@id='lastName']")
	WebElement LastName;
	public void setLastname(String eplname ){
		LastName.clear();
		LastName.sendKeys(eplname);
	}
	//conformMail
	@FindBy(xpath="//input[@id='confirmEmail']")
	WebElement ConfirmEmail;
	public void setconfirmEmail(String epconfirmEmail ){
		ConfirmEmail.sendKeys(epconfirmEmail);
	}
	//Password
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public void setpassword(String eppassword){
		password.sendKeys(eppassword);
	}
	//SaveButtoninEditpage
	@FindBy(xpath="//button[@name ='save']")
	WebElement SaveButtoninEditpage;
	public void clickSaveButtoninEditpage(WebDriver driver) throws InterruptedException{	
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", SaveButtoninEditpage);	
        Thread.sleep(5000);
	}
	//CancelButtoninEditPage
	@FindBy(xpath="//a[@class = 'btn btn-block btn-outline-primary']")
	WebElement cancelButtonInEditPage;
	public void clickcancelButtonInEditPage(WebDriver driver) throws InterruptedException{
		cancelButtonInEditPage.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("arguments[0].click();", cancelButtonInEditPage);	
		
        Thread.sleep(5000);
	}
	
	
	//ChangePasswordpageDetails
	//ChangePassword
	@FindBy(xpath="//a[@class = 'pull-right btn btn-primary' and @aria-label ='Change Password']")
	WebElement ChangePassword;
	public void clickChangePassword() throws InterruptedException{	
		ChangePassword.click();	
        Thread.sleep(5000);
	}
	//currentPassword
	@FindBy(xpath="//input[@id='currentPassword']")
	WebElement currentPassword;
	public void setcurrentPassword(String epcurrentPassword){
		currentPassword.sendKeys(epcurrentPassword);
	}
	//newpw
	@FindBy(xpath="//input[@id='newPassword']")
	WebElement newPassword;
	public void setnewPassword(String epnewPassword){
		newPassword.sendKeys(epnewPassword);
	}
	//conformNewPassword
	@FindBy(xpath="//input[@id='newPasswordConfirm']")
	WebElement newPasswordConfirm;
	public void setnewPasswordConfirm(String epnewPasswordConfirm){
		newPasswordConfirm.sendKeys(epnewPasswordConfirm);
	}
    //savebuttonPasswordChange
	@FindBy(xpath="//button[@name ='save']")
	WebElement savebuttonPasswordChange;
	public void clicksavebuttonPasswordChange(WebDriver driver) throws InterruptedException{	
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", savebuttonPasswordChange);	
        Thread.sleep(5000);
	}
	//cancelButtoninPasswordChangePage
	@FindBy(xpath="//a[@class = 'btn btn-block btn-outline-primary']")
	WebElement cancelButtonInPCP;
	public void clickcancelButtonInPCP(WebDriver driver) throws InterruptedException{	
		cancelButtonInPCP.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("arguments[0].click();", cancelButtonInPCP);	
        Thread.sleep(5000);
	}
	
	
	
	//AddNewAddress
	@FindBy(xpath = "//a[@class = 'pull-right btn btn-primary' and @aria-label ='Add New Address']")
	WebElement AddNewAddress;
	public void clickAddNewAddress() throws InterruptedException{	
		AddNewAddress.click();	
        Thread.sleep(5000);
	}
	   //AddressTitle
    @FindBy(xpath="//input[@id='addressId']")
	WebElement AddressTitle;
	public void setAddressTitle(String NewAddressTitle ){
		AddressTitle.sendKeys(NewAddressTitle);
	}
	//FirstName
    @FindBy(xpath="//input[@id='firstName']")
	WebElement FirstNameofAddress;
	public void setFirstNameofAddress(String NAFirstName ){
		FirstNameofAddress.sendKeys(NAFirstName);
	}
	//LastName
    @FindBy(xpath="//input[@id='lastName']")
	WebElement LastNameofAddress;
	public void setLastNameofAddress(String NALastName ){
		LastNameofAddress.sendKeys(NALastName);
	}
	//Address1
    @FindBy(xpath="//input[@id='address1']")
	WebElement Address1NewAddress;
	public void setAddress1NewAddress(String Address1 ){
		Address1NewAddress.sendKeys(Address1);
	}
	//country
    @FindBy(xpath="//select[@id='country']")
	WebElement SelectCountry;
	public void SelectCountry() throws InterruptedException{
	 Select countrySelect = new Select(SelectCountry);
		countrySelect.selectByIndex(1);
		Thread.sleep(1000);
	}
	//state
	@FindBy(xpath="//select[@id='state']")
	WebElement SelectState;
	public void SelectState(){
	 	Select StateSelect = new Select(SelectState);
        StateSelect.selectByIndex(5);
	}
	
	
	//ViewOrderHistory
	@FindBy(xpath = "//a[@class = 'btn btn-outline-primary' and @aria-label ='View Order History']")
	WebElement ViewOrderHistory;
	public void clickViewOrderHistory() throws InterruptedException{	
		ViewOrderHistory.click();	
        Thread.sleep(5000);
	}
	//ReturntomyAccount
	@FindBy(xpath = "//a[@class ='profile-back-to-account-link']")
	WebElement ReturntomyAccount;
	public void clickReturntomyAccount(WebDriver driver) throws InterruptedException{	
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", ReturntomyAccount);
		//ReturntomyAccount.click();	
        Thread.sleep(5000);
	}
	
	//ReturntomyAccountinViewOrder
	@FindBy(xpath = "//a[@class ='normal']")
	WebElement ReturntomyAccountinViewOrder;
	public void clickReturntomyAccountinViewOrder(WebDriver driver) throws InterruptedException{	
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", ReturntomyAccountinViewOrder);
		//ReturntomyAccount.click();	
        Thread.sleep(5000);
	}
	
	//Scroll down
	public void scrolldown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
}
